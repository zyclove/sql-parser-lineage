package com.sql.parser.lineage.starRocks;

import com.sql.parser.lineage.context.SqlContextCopycat;
import com.sql.parser.lineage.schema.TableSchemaFinder;
import com.sql.parser.lineage.utils.SqlContextBuilderHelper;
import starRcoks.StarRocksBaseVisitor;
import starRcoks.StarRocksParser;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class StarRocksSqlVisitor extends StarRocksBaseVisitor<SqlContext> {

    private String currentDb;
    private StarRocksSqlContextBuildHelper buildHelper;

    class StarRocksSqlContextBuildHelper extends SqlContextBuilderHelper {
        public StarRocksSqlContextBuildHelper(TableSchemaFinder schemaFinder) {
            super(schemaFinder);
        }

        private List<String> findColNameFromColumnAliases(StarRocksParser.ColumnAliasesContext ctx) {
            if (ctx == null)
                return null;
            List<String> result = ctx.identifier().stream().map(col -> unescapeIdentifier(col)).collect(toList());
            return result;
        }
    }

    public StarRocksSqlVisitor(TableSchemaFinder schemaFinder, String currentDb) {
        buildHelper = new StarRocksSqlContextBuildHelper(schemaFinder);
        this.currentDb = currentDb;
    }

    @Override
    public SqlContext visitSingleStatement(StarRocksParser.SingleStatementContext ctx) {
        SqlContext sqlContext = new SqlContextCopycat().copy(ctx, visit(ctx.statement()));
        return sqlContext;
    }


}
