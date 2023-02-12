// Generated from java-escape by ANTLR 4.11.1
package doris;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DorisParser}.
 */
public interface DorisParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DorisParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleStatement(DorisParser.SingleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleStatement(DorisParser.SingleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSingleExpression(DorisParser.SingleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSingleExpression(DorisParser.SingleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#singleTableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterSingleTableIdentifier(DorisParser.SingleTableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#singleTableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitSingleTableIdentifier(DorisParser.SingleTableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#singleMultipartIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterSingleMultipartIdentifier(DorisParser.SingleMultipartIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#singleMultipartIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitSingleMultipartIdentifier(DorisParser.SingleMultipartIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#singleFunctionIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterSingleFunctionIdentifier(DorisParser.SingleFunctionIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#singleFunctionIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitSingleFunctionIdentifier(DorisParser.SingleFunctionIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#singleDataType}.
	 * @param ctx the parse tree
	 */
	void enterSingleDataType(DorisParser.SingleDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#singleDataType}.
	 * @param ctx the parse tree
	 */
	void exitSingleDataType(DorisParser.SingleDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#singleTableSchema}.
	 * @param ctx the parse tree
	 */
	void enterSingleTableSchema(DorisParser.SingleTableSchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#singleTableSchema}.
	 * @param ctx the parse tree
	 */
	void exitSingleTableSchema(DorisParser.SingleTableSchemaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementDefault(DorisParser.StatementDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementDefault(DorisParser.StatementDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dmlStatement}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDmlStatement(DorisParser.DmlStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dmlStatement}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDmlStatement(DorisParser.DmlStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code use}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUse(DorisParser.UseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code use}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUse(DorisParser.UseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code useNamespace}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUseNamespace(DorisParser.UseNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code useNamespace}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUseNamespace(DorisParser.UseNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setCatalog}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetCatalog(DorisParser.SetCatalogContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setCatalog}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetCatalog(DorisParser.SetCatalogContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createNamespace}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateNamespace(DorisParser.CreateNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createNamespace}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateNamespace(DorisParser.CreateNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setNamespaceProperties}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetNamespaceProperties(DorisParser.SetNamespacePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setNamespaceProperties}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetNamespaceProperties(DorisParser.SetNamespacePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setNamespaceLocation}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetNamespaceLocation(DorisParser.SetNamespaceLocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setNamespaceLocation}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetNamespaceLocation(DorisParser.SetNamespaceLocationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropNamespace}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropNamespace(DorisParser.DropNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropNamespace}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropNamespace(DorisParser.DropNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showNamespaces}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowNamespaces(DorisParser.ShowNamespacesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showNamespaces}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowNamespaces(DorisParser.ShowNamespacesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(DorisParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(DorisParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTableLike}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableLike(DorisParser.CreateTableLikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTableLike}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableLike(DorisParser.CreateTableLikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code replaceTable}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReplaceTable(DorisParser.ReplaceTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code replaceTable}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReplaceTable(DorisParser.ReplaceTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code analyze}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAnalyze(DorisParser.AnalyzeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code analyze}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAnalyze(DorisParser.AnalyzeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code analyzeTables}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAnalyzeTables(DorisParser.AnalyzeTablesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code analyzeTables}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAnalyzeTables(DorisParser.AnalyzeTablesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addTableColumns}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAddTableColumns(DorisParser.AddTableColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addTableColumns}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAddTableColumns(DorisParser.AddTableColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameTableColumn}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRenameTableColumn(DorisParser.RenameTableColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameTableColumn}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRenameTableColumn(DorisParser.RenameTableColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropTableColumns}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropTableColumns(DorisParser.DropTableColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropTableColumns}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropTableColumns(DorisParser.DropTableColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRenameTable(DorisParser.RenameTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRenameTable(DorisParser.RenameTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTableProperties}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTableProperties(DorisParser.SetTablePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTableProperties}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTableProperties(DorisParser.SetTablePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unsetTableProperties}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUnsetTableProperties(DorisParser.UnsetTablePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unsetTableProperties}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUnsetTableProperties(DorisParser.UnsetTablePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterTableAlterColumn}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableAlterColumn(DorisParser.AlterTableAlterColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterTableAlterColumn}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableAlterColumn(DorisParser.AlterTableAlterColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hiveChangeColumn}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterHiveChangeColumn(DorisParser.HiveChangeColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hiveChangeColumn}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitHiveChangeColumn(DorisParser.HiveChangeColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hiveReplaceColumns}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterHiveReplaceColumns(DorisParser.HiveReplaceColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hiveReplaceColumns}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitHiveReplaceColumns(DorisParser.HiveReplaceColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTableSerDe}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTableSerDe(DorisParser.SetTableSerDeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTableSerDe}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTableSerDe(DorisParser.SetTableSerDeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addTablePartition}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAddTablePartition(DorisParser.AddTablePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addTablePartition}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAddTablePartition(DorisParser.AddTablePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameTablePartition}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRenameTablePartition(DorisParser.RenameTablePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameTablePartition}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRenameTablePartition(DorisParser.RenameTablePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropTablePartitions}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropTablePartitions(DorisParser.DropTablePartitionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropTablePartitions}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropTablePartitions(DorisParser.DropTablePartitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTableLocation}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTableLocation(DorisParser.SetTableLocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTableLocation}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTableLocation(DorisParser.SetTableLocationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code recoverPartitions}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRecoverPartitions(DorisParser.RecoverPartitionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code recoverPartitions}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRecoverPartitions(DorisParser.RecoverPartitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(DorisParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(DorisParser.DropTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropView}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropView(DorisParser.DropViewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropView}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropView(DorisParser.DropViewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createView}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateView(DorisParser.CreateViewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createView}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateView(DorisParser.CreateViewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTempViewUsing}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTempViewUsing(DorisParser.CreateTempViewUsingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTempViewUsing}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTempViewUsing(DorisParser.CreateTempViewUsingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterViewQuery}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAlterViewQuery(DorisParser.AlterViewQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterViewQuery}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAlterViewQuery(DorisParser.AlterViewQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createFunction}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunction(DorisParser.CreateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createFunction}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunction(DorisParser.CreateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropFunction}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropFunction(DorisParser.DropFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropFunction}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropFunction(DorisParser.DropFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explain}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExplain(DorisParser.ExplainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code explain}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExplain(DorisParser.ExplainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowTables(DorisParser.ShowTablesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowTables(DorisParser.ShowTablesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTableExtended}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowTableExtended(DorisParser.ShowTableExtendedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTableExtended}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowTableExtended(DorisParser.ShowTableExtendedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTblProperties}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowTblProperties(DorisParser.ShowTblPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTblProperties}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowTblProperties(DorisParser.ShowTblPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowColumns(DorisParser.ShowColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowColumns(DorisParser.ShowColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showViews}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowViews(DorisParser.ShowViewsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showViews}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowViews(DorisParser.ShowViewsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showPartitions}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowPartitions(DorisParser.ShowPartitionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showPartitions}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowPartitions(DorisParser.ShowPartitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showFunctions}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowFunctions(DorisParser.ShowFunctionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showFunctions}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowFunctions(DorisParser.ShowFunctionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCreateTable}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateTable(DorisParser.ShowCreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCreateTable}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateTable(DorisParser.ShowCreateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCurrentNamespace}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowCurrentNamespace(DorisParser.ShowCurrentNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCurrentNamespace}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowCurrentNamespace(DorisParser.ShowCurrentNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCatalogs}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowCatalogs(DorisParser.ShowCatalogsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCatalogs}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowCatalogs(DorisParser.ShowCatalogsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeFunction}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeFunction(DorisParser.DescribeFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeFunction}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeFunction(DorisParser.DescribeFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeNamespace}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeNamespace(DorisParser.DescribeNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeNamespace}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeNamespace(DorisParser.DescribeNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeRelation}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeRelation(DorisParser.DescribeRelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeRelation}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeRelation(DorisParser.DescribeRelationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeQuery}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeQuery(DorisParser.DescribeQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeQuery}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeQuery(DorisParser.DescribeQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commentNamespace}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCommentNamespace(DorisParser.CommentNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commentNamespace}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCommentNamespace(DorisParser.CommentNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commentTable}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCommentTable(DorisParser.CommentTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commentTable}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCommentTable(DorisParser.CommentTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code refreshTable}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRefreshTable(DorisParser.RefreshTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code refreshTable}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRefreshTable(DorisParser.RefreshTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code refreshFunction}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRefreshFunction(DorisParser.RefreshFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code refreshFunction}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRefreshFunction(DorisParser.RefreshFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code refreshResource}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRefreshResource(DorisParser.RefreshResourceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code refreshResource}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRefreshResource(DorisParser.RefreshResourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cacheTable}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCacheTable(DorisParser.CacheTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cacheTable}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCacheTable(DorisParser.CacheTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code uncacheTable}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUncacheTable(DorisParser.UncacheTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code uncacheTable}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUncacheTable(DorisParser.UncacheTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code clearCache}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterClearCache(DorisParser.ClearCacheContext ctx);
	/**
	 * Exit a parse tree produced by the {@code clearCache}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitClearCache(DorisParser.ClearCacheContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loadData}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLoadData(DorisParser.LoadDataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loadData}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLoadData(DorisParser.LoadDataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code truncateTable}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTruncateTable(DorisParser.TruncateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code truncateTable}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTruncateTable(DorisParser.TruncateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code repairTable}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRepairTable(DorisParser.RepairTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code repairTable}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRepairTable(DorisParser.RepairTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code manageResource}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterManageResource(DorisParser.ManageResourceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code manageResource}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitManageResource(DorisParser.ManageResourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code failNativeCommand}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFailNativeCommand(DorisParser.FailNativeCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code failNativeCommand}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFailNativeCommand(DorisParser.FailNativeCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTimeZone}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTimeZone(DorisParser.SetTimeZoneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTimeZone}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTimeZone(DorisParser.SetTimeZoneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setQuotedConfiguration}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetQuotedConfiguration(DorisParser.SetQuotedConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setQuotedConfiguration}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetQuotedConfiguration(DorisParser.SetQuotedConfigurationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setConfiguration}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetConfiguration(DorisParser.SetConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setConfiguration}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetConfiguration(DorisParser.SetConfigurationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code resetQuotedConfiguration}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterResetQuotedConfiguration(DorisParser.ResetQuotedConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code resetQuotedConfiguration}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitResetQuotedConfiguration(DorisParser.ResetQuotedConfigurationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code resetConfiguration}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterResetConfiguration(DorisParser.ResetConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code resetConfiguration}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitResetConfiguration(DorisParser.ResetConfigurationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createIndex}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateIndex(DorisParser.CreateIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createIndex}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateIndex(DorisParser.CreateIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropIndex}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropIndex(DorisParser.DropIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropIndex}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropIndex(DorisParser.DropIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#timezone}.
	 * @param ctx the parse tree
	 */
	void enterTimezone(DorisParser.TimezoneContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#timezone}.
	 * @param ctx the parse tree
	 */
	void exitTimezone(DorisParser.TimezoneContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#configKey}.
	 * @param ctx the parse tree
	 */
	void enterConfigKey(DorisParser.ConfigKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#configKey}.
	 * @param ctx the parse tree
	 */
	void exitConfigKey(DorisParser.ConfigKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#configValue}.
	 * @param ctx the parse tree
	 */
	void enterConfigValue(DorisParser.ConfigValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#configValue}.
	 * @param ctx the parse tree
	 */
	void exitConfigValue(DorisParser.ConfigValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#unsupportedHiveNativeCommands}.
	 * @param ctx the parse tree
	 */
	void enterUnsupportedHiveNativeCommands(DorisParser.UnsupportedHiveNativeCommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#unsupportedHiveNativeCommands}.
	 * @param ctx the parse tree
	 */
	void exitUnsupportedHiveNativeCommands(DorisParser.UnsupportedHiveNativeCommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#createTableHeader}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableHeader(DorisParser.CreateTableHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#createTableHeader}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableHeader(DorisParser.CreateTableHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#replaceTableHeader}.
	 * @param ctx the parse tree
	 */
	void enterReplaceTableHeader(DorisParser.ReplaceTableHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#replaceTableHeader}.
	 * @param ctx the parse tree
	 */
	void exitReplaceTableHeader(DorisParser.ReplaceTableHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#bucketSpec}.
	 * @param ctx the parse tree
	 */
	void enterBucketSpec(DorisParser.BucketSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#bucketSpec}.
	 * @param ctx the parse tree
	 */
	void exitBucketSpec(DorisParser.BucketSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#skewSpec}.
	 * @param ctx the parse tree
	 */
	void enterSkewSpec(DorisParser.SkewSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#skewSpec}.
	 * @param ctx the parse tree
	 */
	void exitSkewSpec(DorisParser.SkewSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#locationSpec}.
	 * @param ctx the parse tree
	 */
	void enterLocationSpec(DorisParser.LocationSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#locationSpec}.
	 * @param ctx the parse tree
	 */
	void exitLocationSpec(DorisParser.LocationSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#commentSpec}.
	 * @param ctx the parse tree
	 */
	void enterCommentSpec(DorisParser.CommentSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#commentSpec}.
	 * @param ctx the parse tree
	 */
	void exitCommentSpec(DorisParser.CommentSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(DorisParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(DorisParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertOverwriteTable}
	 * labeled alternative in {@link DorisParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertOverwriteTable(DorisParser.InsertOverwriteTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertOverwriteTable}
	 * labeled alternative in {@link DorisParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertOverwriteTable(DorisParser.InsertOverwriteTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertIntoTable}
	 * labeled alternative in {@link DorisParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertIntoTable(DorisParser.InsertIntoTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertIntoTable}
	 * labeled alternative in {@link DorisParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertIntoTable(DorisParser.InsertIntoTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertIntoReplaceWhere}
	 * labeled alternative in {@link DorisParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertIntoReplaceWhere(DorisParser.InsertIntoReplaceWhereContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertIntoReplaceWhere}
	 * labeled alternative in {@link DorisParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertIntoReplaceWhere(DorisParser.InsertIntoReplaceWhereContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertOverwriteHiveDir}
	 * labeled alternative in {@link DorisParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertOverwriteHiveDir(DorisParser.InsertOverwriteHiveDirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertOverwriteHiveDir}
	 * labeled alternative in {@link DorisParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertOverwriteHiveDir(DorisParser.InsertOverwriteHiveDirContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertOverwriteDir}
	 * labeled alternative in {@link DorisParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertOverwriteDir(DorisParser.InsertOverwriteDirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertOverwriteDir}
	 * labeled alternative in {@link DorisParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertOverwriteDir(DorisParser.InsertOverwriteDirContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#partitionSpecLocation}.
	 * @param ctx the parse tree
	 */
	void enterPartitionSpecLocation(DorisParser.PartitionSpecLocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#partitionSpecLocation}.
	 * @param ctx the parse tree
	 */
	void exitPartitionSpecLocation(DorisParser.PartitionSpecLocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#partitionSpec}.
	 * @param ctx the parse tree
	 */
	void enterPartitionSpec(DorisParser.PartitionSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#partitionSpec}.
	 * @param ctx the parse tree
	 */
	void exitPartitionSpec(DorisParser.PartitionSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#partitionVal}.
	 * @param ctx the parse tree
	 */
	void enterPartitionVal(DorisParser.PartitionValContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#partitionVal}.
	 * @param ctx the parse tree
	 */
	void exitPartitionVal(DorisParser.PartitionValContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#namespace}.
	 * @param ctx the parse tree
	 */
	void enterNamespace(DorisParser.NamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#namespace}.
	 * @param ctx the parse tree
	 */
	void exitNamespace(DorisParser.NamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#namespaces}.
	 * @param ctx the parse tree
	 */
	void enterNamespaces(DorisParser.NamespacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#namespaces}.
	 * @param ctx the parse tree
	 */
	void exitNamespaces(DorisParser.NamespacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#describeFuncName}.
	 * @param ctx the parse tree
	 */
	void enterDescribeFuncName(DorisParser.DescribeFuncNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#describeFuncName}.
	 * @param ctx the parse tree
	 */
	void exitDescribeFuncName(DorisParser.DescribeFuncNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#describeColName}.
	 * @param ctx the parse tree
	 */
	void enterDescribeColName(DorisParser.DescribeColNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#describeColName}.
	 * @param ctx the parse tree
	 */
	void exitDescribeColName(DorisParser.DescribeColNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code with}
	 * labeled alternative in {@link DorisParser#ctes}.
	 * @param ctx the parse tree
	 */
	void enterWith(DorisParser.WithContext ctx);
	/**
	 * Exit a parse tree produced by the {@code with}
	 * labeled alternative in {@link DorisParser#ctes}.
	 * @param ctx the parse tree
	 */
	void exitWith(DorisParser.WithContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#namedQuery}.
	 * @param ctx the parse tree
	 */
	void enterNamedQuery(DorisParser.NamedQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#namedQuery}.
	 * @param ctx the parse tree
	 */
	void exitNamedQuery(DorisParser.NamedQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#tableProvider}.
	 * @param ctx the parse tree
	 */
	void enterTableProvider(DorisParser.TableProviderContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#tableProvider}.
	 * @param ctx the parse tree
	 */
	void exitTableProvider(DorisParser.TableProviderContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#createTableClauses}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableClauses(DorisParser.CreateTableClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#createTableClauses}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableClauses(DorisParser.CreateTableClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#propertyList}.
	 * @param ctx the parse tree
	 */
	void enterPropertyList(DorisParser.PropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#propertyList}.
	 * @param ctx the parse tree
	 */
	void exitPropertyList(DorisParser.PropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(DorisParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(DorisParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#propertyKey}.
	 * @param ctx the parse tree
	 */
	void enterPropertyKey(DorisParser.PropertyKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#propertyKey}.
	 * @param ctx the parse tree
	 */
	void exitPropertyKey(DorisParser.PropertyKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#propertyValue}.
	 * @param ctx the parse tree
	 */
	void enterPropertyValue(DorisParser.PropertyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#propertyValue}.
	 * @param ctx the parse tree
	 */
	void exitPropertyValue(DorisParser.PropertyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#constantList}.
	 * @param ctx the parse tree
	 */
	void enterConstantList(DorisParser.ConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#constantList}.
	 * @param ctx the parse tree
	 */
	void exitConstantList(DorisParser.ConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#nestedConstantList}.
	 * @param ctx the parse tree
	 */
	void enterNestedConstantList(DorisParser.NestedConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#nestedConstantList}.
	 * @param ctx the parse tree
	 */
	void exitNestedConstantList(DorisParser.NestedConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#createFileFormat}.
	 * @param ctx the parse tree
	 */
	void enterCreateFileFormat(DorisParser.CreateFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#createFileFormat}.
	 * @param ctx the parse tree
	 */
	void exitCreateFileFormat(DorisParser.CreateFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link DorisParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void enterTableFileFormat(DorisParser.TableFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link DorisParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void exitTableFileFormat(DorisParser.TableFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link DorisParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void enterGenericFileFormat(DorisParser.GenericFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link DorisParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void exitGenericFileFormat(DorisParser.GenericFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#storageHandler}.
	 * @param ctx the parse tree
	 */
	void enterStorageHandler(DorisParser.StorageHandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#storageHandler}.
	 * @param ctx the parse tree
	 */
	void exitStorageHandler(DorisParser.StorageHandlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(DorisParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(DorisParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link DorisParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void enterSingleInsertQuery(DorisParser.SingleInsertQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link DorisParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void exitSingleInsertQuery(DorisParser.SingleInsertQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link DorisParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void enterMultiInsertQuery(DorisParser.MultiInsertQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link DorisParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void exitMultiInsertQuery(DorisParser.MultiInsertQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code deleteFromTable}
	 * labeled alternative in {@link DorisParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void enterDeleteFromTable(DorisParser.DeleteFromTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code deleteFromTable}
	 * labeled alternative in {@link DorisParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void exitDeleteFromTable(DorisParser.DeleteFromTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code updateTable}
	 * labeled alternative in {@link DorisParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void enterUpdateTable(DorisParser.UpdateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code updateTable}
	 * labeled alternative in {@link DorisParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void exitUpdateTable(DorisParser.UpdateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mergeIntoTable}
	 * labeled alternative in {@link DorisParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void enterMergeIntoTable(DorisParser.MergeIntoTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mergeIntoTable}
	 * labeled alternative in {@link DorisParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void exitMergeIntoTable(DorisParser.MergeIntoTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#queryOrganization}.
	 * @param ctx the parse tree
	 */
	void enterQueryOrganization(DorisParser.QueryOrganizationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#queryOrganization}.
	 * @param ctx the parse tree
	 */
	void exitQueryOrganization(DorisParser.QueryOrganizationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 */
	void enterMultiInsertQueryBody(DorisParser.MultiInsertQueryBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 */
	void exitMultiInsertQueryBody(DorisParser.MultiInsertQueryBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link DorisParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void enterQueryTermDefault(DorisParser.QueryTermDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link DorisParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void exitQueryTermDefault(DorisParser.QueryTermDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link DorisParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void enterSetOperation(DorisParser.SetOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link DorisParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void exitSetOperation(DorisParser.SetOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link DorisParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterQueryPrimaryDefault(DorisParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link DorisParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitQueryPrimaryDefault(DorisParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fromStmt}
	 * labeled alternative in {@link DorisParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterFromStmt(DorisParser.FromStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fromStmt}
	 * labeled alternative in {@link DorisParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitFromStmt(DorisParser.FromStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code table}
	 * labeled alternative in {@link DorisParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTable(DorisParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code table}
	 * labeled alternative in {@link DorisParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTable(DorisParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inlineTableDefault1}
	 * labeled alternative in {@link DorisParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterInlineTableDefault1(DorisParser.InlineTableDefault1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code inlineTableDefault1}
	 * labeled alternative in {@link DorisParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitInlineTableDefault1(DorisParser.InlineTableDefault1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link DorisParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(DorisParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link DorisParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(DorisParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void enterSortItem(DorisParser.SortItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void exitSortItem(DorisParser.SortItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#fromStatement}.
	 * @param ctx the parse tree
	 */
	void enterFromStatement(DorisParser.FromStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#fromStatement}.
	 * @param ctx the parse tree
	 */
	void exitFromStatement(DorisParser.FromStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#fromStatementBody}.
	 * @param ctx the parse tree
	 */
	void enterFromStatementBody(DorisParser.FromStatementBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#fromStatementBody}.
	 * @param ctx the parse tree
	 */
	void exitFromStatementBody(DorisParser.FromStatementBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code transformQuerySpecification}
	 * labeled alternative in {@link DorisParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void enterTransformQuerySpecification(DorisParser.TransformQuerySpecificationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code transformQuerySpecification}
	 * labeled alternative in {@link DorisParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void exitTransformQuerySpecification(DorisParser.TransformQuerySpecificationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code regularQuerySpecification}
	 * labeled alternative in {@link DorisParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void enterRegularQuerySpecification(DorisParser.RegularQuerySpecificationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code regularQuerySpecification}
	 * labeled alternative in {@link DorisParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void exitRegularQuerySpecification(DorisParser.RegularQuerySpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#transformClause}.
	 * @param ctx the parse tree
	 */
	void enterTransformClause(DorisParser.TransformClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#transformClause}.
	 * @param ctx the parse tree
	 */
	void exitTransformClause(DorisParser.TransformClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void enterSelectClause(DorisParser.SelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void exitSelectClause(DorisParser.SelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#setClause}.
	 * @param ctx the parse tree
	 */
	void enterSetClause(DorisParser.SetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#setClause}.
	 * @param ctx the parse tree
	 */
	void exitSetClause(DorisParser.SetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#matchedClause}.
	 * @param ctx the parse tree
	 */
	void enterMatchedClause(DorisParser.MatchedClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#matchedClause}.
	 * @param ctx the parse tree
	 */
	void exitMatchedClause(DorisParser.MatchedClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#notMatchedClause}.
	 * @param ctx the parse tree
	 */
	void enterNotMatchedClause(DorisParser.NotMatchedClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#notMatchedClause}.
	 * @param ctx the parse tree
	 */
	void exitNotMatchedClause(DorisParser.NotMatchedClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#notMatchedBySourceClause}.
	 * @param ctx the parse tree
	 */
	void enterNotMatchedBySourceClause(DorisParser.NotMatchedBySourceClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#notMatchedBySourceClause}.
	 * @param ctx the parse tree
	 */
	void exitNotMatchedBySourceClause(DorisParser.NotMatchedBySourceClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#matchedAction}.
	 * @param ctx the parse tree
	 */
	void enterMatchedAction(DorisParser.MatchedActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#matchedAction}.
	 * @param ctx the parse tree
	 */
	void exitMatchedAction(DorisParser.MatchedActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#notMatchedAction}.
	 * @param ctx the parse tree
	 */
	void enterNotMatchedAction(DorisParser.NotMatchedActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#notMatchedAction}.
	 * @param ctx the parse tree
	 */
	void exitNotMatchedAction(DorisParser.NotMatchedActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#notMatchedBySourceAction}.
	 * @param ctx the parse tree
	 */
	void enterNotMatchedBySourceAction(DorisParser.NotMatchedBySourceActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#notMatchedBySourceAction}.
	 * @param ctx the parse tree
	 */
	void exitNotMatchedBySourceAction(DorisParser.NotMatchedBySourceActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentList(DorisParser.AssignmentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentList(DorisParser.AssignmentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(DorisParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(DorisParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(DorisParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(DorisParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(DorisParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(DorisParser.HavingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#hint}.
	 * @param ctx the parse tree
	 */
	void enterHint(DorisParser.HintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#hint}.
	 * @param ctx the parse tree
	 */
	void exitHint(DorisParser.HintContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#hintStatement}.
	 * @param ctx the parse tree
	 */
	void enterHintStatement(DorisParser.HintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#hintStatement}.
	 * @param ctx the parse tree
	 */
	void exitHintStatement(DorisParser.HintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(DorisParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(DorisParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#temporalClause}.
	 * @param ctx the parse tree
	 */
	void enterTemporalClause(DorisParser.TemporalClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#temporalClause}.
	 * @param ctx the parse tree
	 */
	void exitTemporalClause(DorisParser.TemporalClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#aggregationClause}.
	 * @param ctx the parse tree
	 */
	void enterAggregationClause(DorisParser.AggregationClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#aggregationClause}.
	 * @param ctx the parse tree
	 */
	void exitAggregationClause(DorisParser.AggregationClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(DorisParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(DorisParser.GroupByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#groupingAnalytics}.
	 * @param ctx the parse tree
	 */
	void enterGroupingAnalytics(DorisParser.GroupingAnalyticsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#groupingAnalytics}.
	 * @param ctx the parse tree
	 */
	void exitGroupingAnalytics(DorisParser.GroupingAnalyticsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#groupingElement}.
	 * @param ctx the parse tree
	 */
	void enterGroupingElement(DorisParser.GroupingElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#groupingElement}.
	 * @param ctx the parse tree
	 */
	void exitGroupingElement(DorisParser.GroupingElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#groupingSet}.
	 * @param ctx the parse tree
	 */
	void enterGroupingSet(DorisParser.GroupingSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#groupingSet}.
	 * @param ctx the parse tree
	 */
	void exitGroupingSet(DorisParser.GroupingSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#pivotClause}.
	 * @param ctx the parse tree
	 */
	void enterPivotClause(DorisParser.PivotClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#pivotClause}.
	 * @param ctx the parse tree
	 */
	void exitPivotClause(DorisParser.PivotClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#pivotColumn}.
	 * @param ctx the parse tree
	 */
	void enterPivotColumn(DorisParser.PivotColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#pivotColumn}.
	 * @param ctx the parse tree
	 */
	void exitPivotColumn(DorisParser.PivotColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#pivotValue}.
	 * @param ctx the parse tree
	 */
	void enterPivotValue(DorisParser.PivotValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#pivotValue}.
	 * @param ctx the parse tree
	 */
	void exitPivotValue(DorisParser.PivotValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#unpivotClause}.
	 * @param ctx the parse tree
	 */
	void enterUnpivotClause(DorisParser.UnpivotClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#unpivotClause}.
	 * @param ctx the parse tree
	 */
	void exitUnpivotClause(DorisParser.UnpivotClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#unpivotNullClause}.
	 * @param ctx the parse tree
	 */
	void enterUnpivotNullClause(DorisParser.UnpivotNullClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#unpivotNullClause}.
	 * @param ctx the parse tree
	 */
	void exitUnpivotNullClause(DorisParser.UnpivotNullClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#unpivotOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnpivotOperator(DorisParser.UnpivotOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#unpivotOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnpivotOperator(DorisParser.UnpivotOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#unpivotSingleValueColumnClause}.
	 * @param ctx the parse tree
	 */
	void enterUnpivotSingleValueColumnClause(DorisParser.UnpivotSingleValueColumnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#unpivotSingleValueColumnClause}.
	 * @param ctx the parse tree
	 */
	void exitUnpivotSingleValueColumnClause(DorisParser.UnpivotSingleValueColumnClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#unpivotMultiValueColumnClause}.
	 * @param ctx the parse tree
	 */
	void enterUnpivotMultiValueColumnClause(DorisParser.UnpivotMultiValueColumnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#unpivotMultiValueColumnClause}.
	 * @param ctx the parse tree
	 */
	void exitUnpivotMultiValueColumnClause(DorisParser.UnpivotMultiValueColumnClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#unpivotColumnSet}.
	 * @param ctx the parse tree
	 */
	void enterUnpivotColumnSet(DorisParser.UnpivotColumnSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#unpivotColumnSet}.
	 * @param ctx the parse tree
	 */
	void exitUnpivotColumnSet(DorisParser.UnpivotColumnSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#unpivotValueColumn}.
	 * @param ctx the parse tree
	 */
	void enterUnpivotValueColumn(DorisParser.UnpivotValueColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#unpivotValueColumn}.
	 * @param ctx the parse tree
	 */
	void exitUnpivotValueColumn(DorisParser.UnpivotValueColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#unpivotNameColumn}.
	 * @param ctx the parse tree
	 */
	void enterUnpivotNameColumn(DorisParser.UnpivotNameColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#unpivotNameColumn}.
	 * @param ctx the parse tree
	 */
	void exitUnpivotNameColumn(DorisParser.UnpivotNameColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#unpivotColumnAndAlias}.
	 * @param ctx the parse tree
	 */
	void enterUnpivotColumnAndAlias(DorisParser.UnpivotColumnAndAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#unpivotColumnAndAlias}.
	 * @param ctx the parse tree
	 */
	void exitUnpivotColumnAndAlias(DorisParser.UnpivotColumnAndAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#unpivotColumn}.
	 * @param ctx the parse tree
	 */
	void enterUnpivotColumn(DorisParser.UnpivotColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#unpivotColumn}.
	 * @param ctx the parse tree
	 */
	void exitUnpivotColumn(DorisParser.UnpivotColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#unpivotAlias}.
	 * @param ctx the parse tree
	 */
	void enterUnpivotAlias(DorisParser.UnpivotAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#unpivotAlias}.
	 * @param ctx the parse tree
	 */
	void exitUnpivotAlias(DorisParser.UnpivotAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#lateralView}.
	 * @param ctx the parse tree
	 */
	void enterLateralView(DorisParser.LateralViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#lateralView}.
	 * @param ctx the parse tree
	 */
	void exitLateralView(DorisParser.LateralViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void enterSetQuantifier(DorisParser.SetQuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void exitSetQuantifier(DorisParser.SetQuantifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(DorisParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(DorisParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#relationExtension}.
	 * @param ctx the parse tree
	 */
	void enterRelationExtension(DorisParser.RelationExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#relationExtension}.
	 * @param ctx the parse tree
	 */
	void exitRelationExtension(DorisParser.RelationExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#joinRelation}.
	 * @param ctx the parse tree
	 */
	void enterJoinRelation(DorisParser.JoinRelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#joinRelation}.
	 * @param ctx the parse tree
	 */
	void exitJoinRelation(DorisParser.JoinRelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#joinType}.
	 * @param ctx the parse tree
	 */
	void enterJoinType(DorisParser.JoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#joinType}.
	 * @param ctx the parse tree
	 */
	void exitJoinType(DorisParser.JoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#joinCriteria}.
	 * @param ctx the parse tree
	 */
	void enterJoinCriteria(DorisParser.JoinCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#joinCriteria}.
	 * @param ctx the parse tree
	 */
	void exitJoinCriteria(DorisParser.JoinCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#sample}.
	 * @param ctx the parse tree
	 */
	void enterSample(DorisParser.SampleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#sample}.
	 * @param ctx the parse tree
	 */
	void exitSample(DorisParser.SampleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sampleByPercentile}
	 * labeled alternative in {@link DorisParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void enterSampleByPercentile(DorisParser.SampleByPercentileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sampleByPercentile}
	 * labeled alternative in {@link DorisParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void exitSampleByPercentile(DorisParser.SampleByPercentileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sampleByRows}
	 * labeled alternative in {@link DorisParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void enterSampleByRows(DorisParser.SampleByRowsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sampleByRows}
	 * labeled alternative in {@link DorisParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void exitSampleByRows(DorisParser.SampleByRowsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sampleByBucket}
	 * labeled alternative in {@link DorisParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void enterSampleByBucket(DorisParser.SampleByBucketContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sampleByBucket}
	 * labeled alternative in {@link DorisParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void exitSampleByBucket(DorisParser.SampleByBucketContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sampleByBytes}
	 * labeled alternative in {@link DorisParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void enterSampleByBytes(DorisParser.SampleByBytesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sampleByBytes}
	 * labeled alternative in {@link DorisParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void exitSampleByBytes(DorisParser.SampleByBytesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(DorisParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(DorisParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#identifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierSeq(DorisParser.IdentifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#identifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierSeq(DorisParser.IdentifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#orderedIdentifierList}.
	 * @param ctx the parse tree
	 */
	void enterOrderedIdentifierList(DorisParser.OrderedIdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#orderedIdentifierList}.
	 * @param ctx the parse tree
	 */
	void exitOrderedIdentifierList(DorisParser.OrderedIdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#orderedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterOrderedIdentifier(DorisParser.OrderedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#orderedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitOrderedIdentifier(DorisParser.OrderedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#identifierCommentList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierCommentList(DorisParser.IdentifierCommentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#identifierCommentList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierCommentList(DorisParser.IdentifierCommentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#identifierComment}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierComment(DorisParser.IdentifierCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#identifierComment}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierComment(DorisParser.IdentifierCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link DorisParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTableName(DorisParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link DorisParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTableName(DorisParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link DorisParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterAliasedQuery(DorisParser.AliasedQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link DorisParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitAliasedQuery(DorisParser.AliasedQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link DorisParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterAliasedRelation(DorisParser.AliasedRelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link DorisParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitAliasedRelation(DorisParser.AliasedRelationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inlineTableDefault2}
	 * labeled alternative in {@link DorisParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterInlineTableDefault2(DorisParser.InlineTableDefault2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code inlineTableDefault2}
	 * labeled alternative in {@link DorisParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitInlineTableDefault2(DorisParser.InlineTableDefault2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code tableValuedFunction}
	 * labeled alternative in {@link DorisParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTableValuedFunction(DorisParser.TableValuedFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableValuedFunction}
	 * labeled alternative in {@link DorisParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTableValuedFunction(DorisParser.TableValuedFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#inlineTable}.
	 * @param ctx the parse tree
	 */
	void enterInlineTable(DorisParser.InlineTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#inlineTable}.
	 * @param ctx the parse tree
	 */
	void exitInlineTable(DorisParser.InlineTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#functionTable}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTable(DorisParser.FunctionTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#functionTable}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTable(DorisParser.FunctionTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#tableAlias}.
	 * @param ctx the parse tree
	 */
	void enterTableAlias(DorisParser.TableAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#tableAlias}.
	 * @param ctx the parse tree
	 */
	void exitTableAlias(DorisParser.TableAliasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link DorisParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void enterRowFormatSerde(DorisParser.RowFormatSerdeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link DorisParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void exitRowFormatSerde(DorisParser.RowFormatSerdeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link DorisParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void enterRowFormatDelimited(DorisParser.RowFormatDelimitedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link DorisParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void exitRowFormatDelimited(DorisParser.RowFormatDelimitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#multipartIdentifierList}.
	 * @param ctx the parse tree
	 */
	void enterMultipartIdentifierList(DorisParser.MultipartIdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#multipartIdentifierList}.
	 * @param ctx the parse tree
	 */
	void exitMultipartIdentifierList(DorisParser.MultipartIdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#multipartIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterMultipartIdentifier(DorisParser.MultipartIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#multipartIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitMultipartIdentifier(DorisParser.MultipartIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#multipartIdentifierPropertyList}.
	 * @param ctx the parse tree
	 */
	void enterMultipartIdentifierPropertyList(DorisParser.MultipartIdentifierPropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#multipartIdentifierPropertyList}.
	 * @param ctx the parse tree
	 */
	void exitMultipartIdentifierPropertyList(DorisParser.MultipartIdentifierPropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#multipartIdentifierProperty}.
	 * @param ctx the parse tree
	 */
	void enterMultipartIdentifierProperty(DorisParser.MultipartIdentifierPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#multipartIdentifierProperty}.
	 * @param ctx the parse tree
	 */
	void exitMultipartIdentifierProperty(DorisParser.MultipartIdentifierPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTableIdentifier(DorisParser.TableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTableIdentifier(DorisParser.TableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#functionIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionIdentifier(DorisParser.FunctionIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#functionIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionIdentifier(DorisParser.FunctionIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#namedExpression}.
	 * @param ctx the parse tree
	 */
	void enterNamedExpression(DorisParser.NamedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#namedExpression}.
	 * @param ctx the parse tree
	 */
	void exitNamedExpression(DorisParser.NamedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 */
	void enterNamedExpressionSeq(DorisParser.NamedExpressionSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 */
	void exitNamedExpressionSeq(DorisParser.NamedExpressionSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#partitionFieldList}.
	 * @param ctx the parse tree
	 */
	void enterPartitionFieldList(DorisParser.PartitionFieldListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#partitionFieldList}.
	 * @param ctx the parse tree
	 */
	void exitPartitionFieldList(DorisParser.PartitionFieldListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionTransform}
	 * labeled alternative in {@link DorisParser#partitionField}.
	 * @param ctx the parse tree
	 */
	void enterPartitionTransform(DorisParser.PartitionTransformContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionTransform}
	 * labeled alternative in {@link DorisParser#partitionField}.
	 * @param ctx the parse tree
	 */
	void exitPartitionTransform(DorisParser.PartitionTransformContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionColumn}
	 * labeled alternative in {@link DorisParser#partitionField}.
	 * @param ctx the parse tree
	 */
	void enterPartitionColumn(DorisParser.PartitionColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionColumn}
	 * labeled alternative in {@link DorisParser#partitionField}.
	 * @param ctx the parse tree
	 */
	void exitPartitionColumn(DorisParser.PartitionColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identityTransform}
	 * labeled alternative in {@link DorisParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterIdentityTransform(DorisParser.IdentityTransformContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identityTransform}
	 * labeled alternative in {@link DorisParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitIdentityTransform(DorisParser.IdentityTransformContext ctx);
	/**
	 * Enter a parse tree produced by the {@code applyTransform}
	 * labeled alternative in {@link DorisParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterApplyTransform(DorisParser.ApplyTransformContext ctx);
	/**
	 * Exit a parse tree produced by the {@code applyTransform}
	 * labeled alternative in {@link DorisParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitApplyTransform(DorisParser.ApplyTransformContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#transformArgument}.
	 * @param ctx the parse tree
	 */
	void enterTransformArgument(DorisParser.TransformArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#transformArgument}.
	 * @param ctx the parse tree
	 */
	void exitTransformArgument(DorisParser.TransformArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(DorisParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(DorisParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#expressionSeq}.
	 * @param ctx the parse tree
	 */
	void enterExpressionSeq(DorisParser.ExpressionSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#expressionSeq}.
	 * @param ctx the parse tree
	 */
	void exitExpressionSeq(DorisParser.ExpressionSeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link DorisParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNot(DorisParser.LogicalNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link DorisParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNot(DorisParser.LogicalNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code predicated}
	 * labeled alternative in {@link DorisParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterPredicated(DorisParser.PredicatedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code predicated}
	 * labeled alternative in {@link DorisParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitPredicated(DorisParser.PredicatedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exists}
	 * labeled alternative in {@link DorisParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterExists(DorisParser.ExistsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exists}
	 * labeled alternative in {@link DorisParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitExists(DorisParser.ExistsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link DorisParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalBinary(DorisParser.LogicalBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link DorisParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalBinary(DorisParser.LogicalBinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(DorisParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(DorisParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link DorisParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpressionDefault(DorisParser.ValueExpressionDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link DorisParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpressionDefault(DorisParser.ValueExpressionDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link DorisParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparison(DorisParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link DorisParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparison(DorisParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link DorisParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticBinary(DorisParser.ArithmeticBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link DorisParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticBinary(DorisParser.ArithmeticBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link DorisParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticUnary(DorisParser.ArithmeticUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link DorisParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticUnary(DorisParser.ArithmeticUnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#datetimeUnit}.
	 * @param ctx the parse tree
	 */
	void enterDatetimeUnit(DorisParser.DatetimeUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#datetimeUnit}.
	 * @param ctx the parse tree
	 */
	void exitDatetimeUnit(DorisParser.DatetimeUnitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code struct}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStruct(DorisParser.StructContext ctx);
	/**
	 * Exit a parse tree produced by the {@code struct}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStruct(DorisParser.StructContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterDereference(DorisParser.DereferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitDereference(DorisParser.DereferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code timestampadd}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTimestampadd(DorisParser.TimestampaddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code timestampadd}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTimestampadd(DorisParser.TimestampaddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code substring}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubstring(DorisParser.SubstringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code substring}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubstring(DorisParser.SubstringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cast}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCast(DorisParser.CastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCast(DorisParser.CastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambda(DorisParser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambda(DorisParser.LambdaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(DorisParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(DorisParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code any_value}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterAny_value(DorisParser.Any_valueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code any_value}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitAny_value(DorisParser.Any_valueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trim}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTrim(DorisParser.TrimContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trim}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTrim(DorisParser.TrimContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCase(DorisParser.SimpleCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCase(DorisParser.SimpleCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code currentLike}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCurrentLike(DorisParser.CurrentLikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code currentLike}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCurrentLike(DorisParser.CurrentLikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterColumnReference(DorisParser.ColumnReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitColumnReference(DorisParser.ColumnReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterRowConstructor(DorisParser.RowConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitRowConstructor(DorisParser.RowConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code last}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterLast(DorisParser.LastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code last}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitLast(DorisParser.LastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code star}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStar(DorisParser.StarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code star}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStar(DorisParser.StarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code overlay}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterOverlay(DorisParser.OverlayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code overlay}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitOverlay(DorisParser.OverlayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(DorisParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(DorisParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code timestampdiff}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTimestampdiff(DorisParser.TimestampdiffContext ctx);
	/**
	 * Exit a parse tree produced by the {@code timestampdiff}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTimestampdiff(DorisParser.TimestampdiffContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryExpression(DorisParser.SubqueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryExpression(DorisParser.SubqueryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefault(DorisParser.ConstantDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefault(DorisParser.ConstantDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code extract}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterExtract(DorisParser.ExtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code extract}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitExtract(DorisParser.ExtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code percentile}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPercentile(DorisParser.PercentileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code percentile}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPercentile(DorisParser.PercentileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(DorisParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(DorisParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSearchedCase(DorisParser.SearchedCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSearchedCase(DorisParser.SearchedCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code position}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPosition(DorisParser.PositionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code position}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPosition(DorisParser.PositionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code first}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterFirst(DorisParser.FirstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code first}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitFirst(DorisParser.FirstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link DorisParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(DorisParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link DorisParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(DorisParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link DorisParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterIntervalLiteral(DorisParser.IntervalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link DorisParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitIntervalLiteral(DorisParser.IntervalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link DorisParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterTypeConstructor(DorisParser.TypeConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link DorisParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitTypeConstructor(DorisParser.TypeConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link DorisParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(DorisParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link DorisParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(DorisParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link DorisParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(DorisParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link DorisParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(DorisParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link DorisParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(DorisParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link DorisParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(DorisParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(DorisParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(DorisParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticOperator(DorisParser.ArithmeticOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticOperator(DorisParser.ArithmeticOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#predicateOperator}.
	 * @param ctx the parse tree
	 */
	void enterPredicateOperator(DorisParser.PredicateOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#predicateOperator}.
	 * @param ctx the parse tree
	 */
	void exitPredicateOperator(DorisParser.PredicateOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(DorisParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(DorisParser.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(DorisParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(DorisParser.IntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#errorCapturingMultiUnitsInterval}.
	 * @param ctx the parse tree
	 */
	void enterErrorCapturingMultiUnitsInterval(DorisParser.ErrorCapturingMultiUnitsIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#errorCapturingMultiUnitsInterval}.
	 * @param ctx the parse tree
	 */
	void exitErrorCapturingMultiUnitsInterval(DorisParser.ErrorCapturingMultiUnitsIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#multiUnitsInterval}.
	 * @param ctx the parse tree
	 */
	void enterMultiUnitsInterval(DorisParser.MultiUnitsIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#multiUnitsInterval}.
	 * @param ctx the parse tree
	 */
	void exitMultiUnitsInterval(DorisParser.MultiUnitsIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#errorCapturingUnitToUnitInterval}.
	 * @param ctx the parse tree
	 */
	void enterErrorCapturingUnitToUnitInterval(DorisParser.ErrorCapturingUnitToUnitIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#errorCapturingUnitToUnitInterval}.
	 * @param ctx the parse tree
	 */
	void exitErrorCapturingUnitToUnitInterval(DorisParser.ErrorCapturingUnitToUnitIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#unitToUnitInterval}.
	 * @param ctx the parse tree
	 */
	void enterUnitToUnitInterval(DorisParser.UnitToUnitIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#unitToUnitInterval}.
	 * @param ctx the parse tree
	 */
	void exitUnitToUnitInterval(DorisParser.UnitToUnitIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void enterIntervalValue(DorisParser.IntervalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void exitIntervalValue(DorisParser.IntervalValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#unitInMultiUnits}.
	 * @param ctx the parse tree
	 */
	void enterUnitInMultiUnits(DorisParser.UnitInMultiUnitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#unitInMultiUnits}.
	 * @param ctx the parse tree
	 */
	void exitUnitInMultiUnits(DorisParser.UnitInMultiUnitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#unitInUnitToUnit}.
	 * @param ctx the parse tree
	 */
	void enterUnitInUnitToUnit(DorisParser.UnitInUnitToUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#unitInUnitToUnit}.
	 * @param ctx the parse tree
	 */
	void exitUnitInUnitToUnit(DorisParser.UnitInUnitToUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#colPosition}.
	 * @param ctx the parse tree
	 */
	void enterColPosition(DorisParser.ColPositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#colPosition}.
	 * @param ctx the parse tree
	 */
	void exitColPosition(DorisParser.ColPositionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link DorisParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterComplexDataType(DorisParser.ComplexDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link DorisParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitComplexDataType(DorisParser.ComplexDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code yearMonthIntervalDataType}
	 * labeled alternative in {@link DorisParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterYearMonthIntervalDataType(DorisParser.YearMonthIntervalDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code yearMonthIntervalDataType}
	 * labeled alternative in {@link DorisParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitYearMonthIntervalDataType(DorisParser.YearMonthIntervalDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dayTimeIntervalDataType}
	 * labeled alternative in {@link DorisParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDayTimeIntervalDataType(DorisParser.DayTimeIntervalDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dayTimeIntervalDataType}
	 * labeled alternative in {@link DorisParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDayTimeIntervalDataType(DorisParser.DayTimeIntervalDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link DorisParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveDataType(DorisParser.PrimitiveDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link DorisParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveDataType(DorisParser.PrimitiveDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#qualifiedColTypeWithPositionList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedColTypeWithPositionList(DorisParser.QualifiedColTypeWithPositionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#qualifiedColTypeWithPositionList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedColTypeWithPositionList(DorisParser.QualifiedColTypeWithPositionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#qualifiedColTypeWithPosition}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedColTypeWithPosition(DorisParser.QualifiedColTypeWithPositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#qualifiedColTypeWithPosition}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedColTypeWithPosition(DorisParser.QualifiedColTypeWithPositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#defaultExpression}.
	 * @param ctx the parse tree
	 */
	void enterDefaultExpression(DorisParser.DefaultExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#defaultExpression}.
	 * @param ctx the parse tree
	 */
	void exitDefaultExpression(DorisParser.DefaultExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#colTypeList}.
	 * @param ctx the parse tree
	 */
	void enterColTypeList(DorisParser.ColTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#colTypeList}.
	 * @param ctx the parse tree
	 */
	void exitColTypeList(DorisParser.ColTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#colType}.
	 * @param ctx the parse tree
	 */
	void enterColType(DorisParser.ColTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#colType}.
	 * @param ctx the parse tree
	 */
	void exitColType(DorisParser.ColTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#createOrReplaceTableColTypeList}.
	 * @param ctx the parse tree
	 */
	void enterCreateOrReplaceTableColTypeList(DorisParser.CreateOrReplaceTableColTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#createOrReplaceTableColTypeList}.
	 * @param ctx the parse tree
	 */
	void exitCreateOrReplaceTableColTypeList(DorisParser.CreateOrReplaceTableColTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#createOrReplaceTableColType}.
	 * @param ctx the parse tree
	 */
	void enterCreateOrReplaceTableColType(DorisParser.CreateOrReplaceTableColTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#createOrReplaceTableColType}.
	 * @param ctx the parse tree
	 */
	void exitCreateOrReplaceTableColType(DorisParser.CreateOrReplaceTableColTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#colDefinitionOption}.
	 * @param ctx the parse tree
	 */
	void enterColDefinitionOption(DorisParser.ColDefinitionOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#colDefinitionOption}.
	 * @param ctx the parse tree
	 */
	void exitColDefinitionOption(DorisParser.ColDefinitionOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#complexColTypeList}.
	 * @param ctx the parse tree
	 */
	void enterComplexColTypeList(DorisParser.ComplexColTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#complexColTypeList}.
	 * @param ctx the parse tree
	 */
	void exitComplexColTypeList(DorisParser.ComplexColTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#complexColType}.
	 * @param ctx the parse tree
	 */
	void enterComplexColType(DorisParser.ComplexColTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#complexColType}.
	 * @param ctx the parse tree
	 */
	void exitComplexColType(DorisParser.ComplexColTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void enterWhenClause(DorisParser.WhenClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void exitWhenClause(DorisParser.WhenClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#windowClause}.
	 * @param ctx the parse tree
	 */
	void enterWindowClause(DorisParser.WindowClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#windowClause}.
	 * @param ctx the parse tree
	 */
	void exitWindowClause(DorisParser.WindowClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#namedWindow}.
	 * @param ctx the parse tree
	 */
	void enterNamedWindow(DorisParser.NamedWindowContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#namedWindow}.
	 * @param ctx the parse tree
	 */
	void exitNamedWindow(DorisParser.NamedWindowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link DorisParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void enterWindowRef(DorisParser.WindowRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link DorisParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void exitWindowRef(DorisParser.WindowRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link DorisParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void enterWindowDef(DorisParser.WindowDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link DorisParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void exitWindowDef(DorisParser.WindowDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#windowFrame}.
	 * @param ctx the parse tree
	 */
	void enterWindowFrame(DorisParser.WindowFrameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#windowFrame}.
	 * @param ctx the parse tree
	 */
	void exitWindowFrame(DorisParser.WindowFrameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void enterFrameBound(DorisParser.FrameBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void exitFrameBound(DorisParser.FrameBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(DorisParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(DorisParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(DorisParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(DorisParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(DorisParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(DorisParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#errorCapturingIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterErrorCapturingIdentifier(DorisParser.ErrorCapturingIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#errorCapturingIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitErrorCapturingIdentifier(DorisParser.ErrorCapturingIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code errorIdent}
	 * labeled alternative in {@link DorisParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 */
	void enterErrorIdent(DorisParser.ErrorIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code errorIdent}
	 * labeled alternative in {@link DorisParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 */
	void exitErrorIdent(DorisParser.ErrorIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code realIdent}
	 * labeled alternative in {@link DorisParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 */
	void enterRealIdent(DorisParser.RealIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code realIdent}
	 * labeled alternative in {@link DorisParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 */
	void exitRealIdent(DorisParser.RealIdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(DorisParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(DorisParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link DorisParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterUnquotedIdentifier(DorisParser.UnquotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link DorisParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitUnquotedIdentifier(DorisParser.UnquotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link DorisParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifierAlternative(DorisParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link DorisParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifierAlternative(DorisParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifier(DorisParser.QuotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifier(DorisParser.QuotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#backQuotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterBackQuotedIdentifier(DorisParser.BackQuotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#backQuotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitBackQuotedIdentifier(DorisParser.BackQuotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exponentLiteral}
	 * labeled alternative in {@link DorisParser#number}.
	 * @param ctx the parse tree
	 */
	void enterExponentLiteral(DorisParser.ExponentLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exponentLiteral}
	 * labeled alternative in {@link DorisParser#number}.
	 * @param ctx the parse tree
	 */
	void exitExponentLiteral(DorisParser.ExponentLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link DorisParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(DorisParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link DorisParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(DorisParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code legacyDecimalLiteral}
	 * labeled alternative in {@link DorisParser#number}.
	 * @param ctx the parse tree
	 */
	void enterLegacyDecimalLiteral(DorisParser.LegacyDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code legacyDecimalLiteral}
	 * labeled alternative in {@link DorisParser#number}.
	 * @param ctx the parse tree
	 */
	void exitLegacyDecimalLiteral(DorisParser.LegacyDecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link DorisParser#number}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(DorisParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link DorisParser#number}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(DorisParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link DorisParser#number}.
	 * @param ctx the parse tree
	 */
	void enterBigIntLiteral(DorisParser.BigIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link DorisParser#number}.
	 * @param ctx the parse tree
	 */
	void exitBigIntLiteral(DorisParser.BigIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link DorisParser#number}.
	 * @param ctx the parse tree
	 */
	void enterSmallIntLiteral(DorisParser.SmallIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link DorisParser#number}.
	 * @param ctx the parse tree
	 */
	void exitSmallIntLiteral(DorisParser.SmallIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link DorisParser#number}.
	 * @param ctx the parse tree
	 */
	void enterTinyIntLiteral(DorisParser.TinyIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link DorisParser#number}.
	 * @param ctx the parse tree
	 */
	void exitTinyIntLiteral(DorisParser.TinyIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link DorisParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDoubleLiteral(DorisParser.DoubleLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link DorisParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDoubleLiteral(DorisParser.DoubleLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatLiteral}
	 * labeled alternative in {@link DorisParser#number}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(DorisParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatLiteral}
	 * labeled alternative in {@link DorisParser#number}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(DorisParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bigDecimalLiteral}
	 * labeled alternative in {@link DorisParser#number}.
	 * @param ctx the parse tree
	 */
	void enterBigDecimalLiteral(DorisParser.BigDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bigDecimalLiteral}
	 * labeled alternative in {@link DorisParser#number}.
	 * @param ctx the parse tree
	 */
	void exitBigDecimalLiteral(DorisParser.BigDecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#alterColumnAction}.
	 * @param ctx the parse tree
	 */
	void enterAlterColumnAction(DorisParser.AlterColumnActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#alterColumnAction}.
	 * @param ctx the parse tree
	 */
	void exitAlterColumnAction(DorisParser.AlterColumnActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#stringLit}.
	 * @param ctx the parse tree
	 */
	void enterStringLit(DorisParser.StringLitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#stringLit}.
	 * @param ctx the parse tree
	 */
	void exitStringLit(DorisParser.StringLitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(DorisParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(DorisParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#version}.
	 * @param ctx the parse tree
	 */
	void enterVersion(DorisParser.VersionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#version}.
	 * @param ctx the parse tree
	 */
	void exitVersion(DorisParser.VersionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#ansiNonReserved}.
	 * @param ctx the parse tree
	 */
	void enterAnsiNonReserved(DorisParser.AnsiNonReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#ansiNonReserved}.
	 * @param ctx the parse tree
	 */
	void exitAnsiNonReserved(DorisParser.AnsiNonReservedContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#strictNonReserved}.
	 * @param ctx the parse tree
	 */
	void enterStrictNonReserved(DorisParser.StrictNonReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#strictNonReserved}.
	 * @param ctx the parse tree
	 */
	void exitStrictNonReserved(DorisParser.StrictNonReservedContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void enterNonReserved(DorisParser.NonReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void exitNonReserved(DorisParser.NonReservedContext ctx);
}