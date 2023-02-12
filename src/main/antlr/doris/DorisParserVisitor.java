// Generated from java-escape by ANTLR 4.11.1
package doris;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DorisParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DorisParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DorisParser#singleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStatement(DorisParser.SingleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleExpression(DorisParser.SingleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#singleTableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTableIdentifier(DorisParser.SingleTableIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#singleMultipartIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleMultipartIdentifier(DorisParser.SingleMultipartIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#singleFunctionIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleFunctionIdentifier(DorisParser.SingleFunctionIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#singleDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleDataType(DorisParser.SingleDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#singleTableSchema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTableSchema(DorisParser.SingleTableSchemaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementDefault(DorisParser.StatementDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dmlStatement}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDmlStatement(DorisParser.DmlStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code use}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse(DorisParser.UseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code useNamespace}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseNamespace(DorisParser.UseNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setCatalog}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetCatalog(DorisParser.SetCatalogContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createNamespace}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateNamespace(DorisParser.CreateNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setNamespaceProperties}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetNamespaceProperties(DorisParser.SetNamespacePropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setNamespaceLocation}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetNamespaceLocation(DorisParser.SetNamespaceLocationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropNamespace}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropNamespace(DorisParser.DropNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showNamespaces}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowNamespaces(DorisParser.ShowNamespacesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTable(DorisParser.CreateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTableLike}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableLike(DorisParser.CreateTableLikeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code replaceTable}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplaceTable(DorisParser.ReplaceTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code analyze}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyze(DorisParser.AnalyzeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code analyzeTables}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyzeTables(DorisParser.AnalyzeTablesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addTableColumns}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddTableColumns(DorisParser.AddTableColumnsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameTableColumn}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameTableColumn(DorisParser.RenameTableColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropTableColumns}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTableColumns(DorisParser.DropTableColumnsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameTable(DorisParser.RenameTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTableProperties}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTableProperties(DorisParser.SetTablePropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unsetTableProperties}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsetTableProperties(DorisParser.UnsetTablePropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterTableAlterColumn}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableAlterColumn(DorisParser.AlterTableAlterColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hiveChangeColumn}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHiveChangeColumn(DorisParser.HiveChangeColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hiveReplaceColumns}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHiveReplaceColumns(DorisParser.HiveReplaceColumnsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTableSerDe}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTableSerDe(DorisParser.SetTableSerDeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addTablePartition}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddTablePartition(DorisParser.AddTablePartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameTablePartition}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameTablePartition(DorisParser.RenameTablePartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropTablePartitions}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTablePartitions(DorisParser.DropTablePartitionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTableLocation}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTableLocation(DorisParser.SetTableLocationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code recoverPartitions}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecoverPartitions(DorisParser.RecoverPartitionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTable(DorisParser.DropTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropView}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropView(DorisParser.DropViewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createView}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateView(DorisParser.CreateViewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTempViewUsing}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTempViewUsing(DorisParser.CreateTempViewUsingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterViewQuery}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterViewQuery(DorisParser.AlterViewQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createFunction}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFunction(DorisParser.CreateFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropFunction}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropFunction(DorisParser.DropFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code explain}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain(DorisParser.ExplainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTables(DorisParser.ShowTablesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showTableExtended}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTableExtended(DorisParser.ShowTableExtendedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showTblProperties}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTblProperties(DorisParser.ShowTblPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowColumns(DorisParser.ShowColumnsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showViews}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowViews(DorisParser.ShowViewsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showPartitions}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowPartitions(DorisParser.ShowPartitionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showFunctions}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowFunctions(DorisParser.ShowFunctionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showCreateTable}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateTable(DorisParser.ShowCreateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showCurrentNamespace}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCurrentNamespace(DorisParser.ShowCurrentNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showCatalogs}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCatalogs(DorisParser.ShowCatalogsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeFunction}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeFunction(DorisParser.DescribeFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeNamespace}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeNamespace(DorisParser.DescribeNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeRelation}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeRelation(DorisParser.DescribeRelationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeQuery}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeQuery(DorisParser.DescribeQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commentNamespace}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentNamespace(DorisParser.CommentNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commentTable}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentTable(DorisParser.CommentTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code refreshTable}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshTable(DorisParser.RefreshTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code refreshFunction}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshFunction(DorisParser.RefreshFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code refreshResource}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshResource(DorisParser.RefreshResourceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cacheTable}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCacheTable(DorisParser.CacheTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code uncacheTable}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUncacheTable(DorisParser.UncacheTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code clearCache}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClearCache(DorisParser.ClearCacheContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loadData}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadData(DorisParser.LoadDataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code truncateTable}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncateTable(DorisParser.TruncateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code repairTable}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepairTable(DorisParser.RepairTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code manageResource}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitManageResource(DorisParser.ManageResourceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code failNativeCommand}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFailNativeCommand(DorisParser.FailNativeCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTimeZone}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTimeZone(DorisParser.SetTimeZoneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setQuotedConfiguration}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetQuotedConfiguration(DorisParser.SetQuotedConfigurationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setConfiguration}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetConfiguration(DorisParser.SetConfigurationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code resetQuotedConfiguration}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetQuotedConfiguration(DorisParser.ResetQuotedConfigurationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code resetConfiguration}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetConfiguration(DorisParser.ResetConfigurationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createIndex}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateIndex(DorisParser.CreateIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropIndex}
	 * labeled alternative in {@link DorisParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropIndex(DorisParser.DropIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#timezone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimezone(DorisParser.TimezoneContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#configKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfigKey(DorisParser.ConfigKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#configValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfigValue(DorisParser.ConfigValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#unsupportedHiveNativeCommands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsupportedHiveNativeCommands(DorisParser.UnsupportedHiveNativeCommandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#createTableHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableHeader(DorisParser.CreateTableHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#replaceTableHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplaceTableHeader(DorisParser.ReplaceTableHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#bucketSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucketSpec(DorisParser.BucketSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#skewSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkewSpec(DorisParser.SkewSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#locationSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocationSpec(DorisParser.LocationSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#commentSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentSpec(DorisParser.CommentSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(DorisParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insertOverwriteTable}
	 * labeled alternative in {@link DorisParser#insertInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertOverwriteTable(DorisParser.InsertOverwriteTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insertIntoTable}
	 * labeled alternative in {@link DorisParser#insertInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertIntoTable(DorisParser.InsertIntoTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insertIntoReplaceWhere}
	 * labeled alternative in {@link DorisParser#insertInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertIntoReplaceWhere(DorisParser.InsertIntoReplaceWhereContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insertOverwriteHiveDir}
	 * labeled alternative in {@link DorisParser#insertInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertOverwriteHiveDir(DorisParser.InsertOverwriteHiveDirContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insertOverwriteDir}
	 * labeled alternative in {@link DorisParser#insertInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertOverwriteDir(DorisParser.InsertOverwriteDirContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#partitionSpecLocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionSpecLocation(DorisParser.PartitionSpecLocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#partitionSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionSpec(DorisParser.PartitionSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#partitionVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionVal(DorisParser.PartitionValContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#namespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespace(DorisParser.NamespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#namespaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaces(DorisParser.NamespacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#describeFuncName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeFuncName(DorisParser.DescribeFuncNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#describeColName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeColName(DorisParser.DescribeColNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code with}
	 * labeled alternative in {@link DorisParser#ctes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith(DorisParser.WithContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#namedQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedQuery(DorisParser.NamedQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#tableProvider}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableProvider(DorisParser.TableProviderContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#createTableClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableClauses(DorisParser.CreateTableClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#propertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyList(DorisParser.PropertyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(DorisParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#propertyKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyKey(DorisParser.PropertyKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#propertyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyValue(DorisParser.PropertyValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#constantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantList(DorisParser.ConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#nestedConstantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedConstantList(DorisParser.NestedConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#createFileFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFileFormat(DorisParser.CreateFileFormatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link DorisParser#fileFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFileFormat(DorisParser.TableFileFormatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link DorisParser#fileFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericFileFormat(DorisParser.GenericFileFormatContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#storageHandler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageHandler(DorisParser.StorageHandlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(DorisParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link DorisParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleInsertQuery(DorisParser.SingleInsertQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link DorisParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiInsertQuery(DorisParser.MultiInsertQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code deleteFromTable}
	 * labeled alternative in {@link DorisParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteFromTable(DorisParser.DeleteFromTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code updateTable}
	 * labeled alternative in {@link DorisParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateTable(DorisParser.UpdateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mergeIntoTable}
	 * labeled alternative in {@link DorisParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeIntoTable(DorisParser.MergeIntoTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#queryOrganization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryOrganization(DorisParser.QueryOrganizationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiInsertQueryBody(DorisParser.MultiInsertQueryBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link DorisParser#queryTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryTermDefault(DorisParser.QueryTermDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link DorisParser#queryTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetOperation(DorisParser.SetOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link DorisParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryPrimaryDefault(DorisParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fromStmt}
	 * labeled alternative in {@link DorisParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromStmt(DorisParser.FromStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code table}
	 * labeled alternative in {@link DorisParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(DorisParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inlineTableDefault1}
	 * labeled alternative in {@link DorisParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTableDefault1(DorisParser.InlineTableDefault1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link DorisParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(DorisParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#sortItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortItem(DorisParser.SortItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#fromStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromStatement(DorisParser.FromStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#fromStatementBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromStatementBody(DorisParser.FromStatementBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code transformQuerySpecification}
	 * labeled alternative in {@link DorisParser#querySpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransformQuerySpecification(DorisParser.TransformQuerySpecificationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code regularQuerySpecification}
	 * labeled alternative in {@link DorisParser#querySpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularQuerySpecification(DorisParser.RegularQuerySpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#transformClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransformClause(DorisParser.TransformClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#selectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectClause(DorisParser.SelectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#setClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetClause(DorisParser.SetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#matchedClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchedClause(DorisParser.MatchedClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#notMatchedClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotMatchedClause(DorisParser.NotMatchedClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#notMatchedBySourceClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotMatchedBySourceClause(DorisParser.NotMatchedBySourceClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#matchedAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchedAction(DorisParser.MatchedActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#notMatchedAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotMatchedAction(DorisParser.NotMatchedActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#notMatchedBySourceAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotMatchedBySourceAction(DorisParser.NotMatchedBySourceActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#assignmentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentList(DorisParser.AssignmentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(DorisParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(DorisParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#havingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingClause(DorisParser.HavingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#hint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHint(DorisParser.HintContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#hintStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHintStatement(DorisParser.HintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(DorisParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#temporalClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemporalClause(DorisParser.TemporalClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#aggregationClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationClause(DorisParser.AggregationClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#groupByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByClause(DorisParser.GroupByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#groupingAnalytics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupingAnalytics(DorisParser.GroupingAnalyticsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#groupingElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupingElement(DorisParser.GroupingElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#groupingSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupingSet(DorisParser.GroupingSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#pivotClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivotClause(DorisParser.PivotClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#pivotColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivotColumn(DorisParser.PivotColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#pivotValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivotValue(DorisParser.PivotValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#unpivotClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivotClause(DorisParser.UnpivotClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#unpivotNullClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivotNullClause(DorisParser.UnpivotNullClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#unpivotOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivotOperator(DorisParser.UnpivotOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#unpivotSingleValueColumnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivotSingleValueColumnClause(DorisParser.UnpivotSingleValueColumnClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#unpivotMultiValueColumnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivotMultiValueColumnClause(DorisParser.UnpivotMultiValueColumnClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#unpivotColumnSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivotColumnSet(DorisParser.UnpivotColumnSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#unpivotValueColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivotValueColumn(DorisParser.UnpivotValueColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#unpivotNameColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivotNameColumn(DorisParser.UnpivotNameColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#unpivotColumnAndAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivotColumnAndAlias(DorisParser.UnpivotColumnAndAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#unpivotColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivotColumn(DorisParser.UnpivotColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#unpivotAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivotAlias(DorisParser.UnpivotAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#lateralView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLateralView(DorisParser.LateralViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#setQuantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetQuantifier(DorisParser.SetQuantifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation(DorisParser.RelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#relationExtension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationExtension(DorisParser.RelationExtensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#joinRelation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinRelation(DorisParser.JoinRelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#joinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinType(DorisParser.JoinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#joinCriteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinCriteria(DorisParser.JoinCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#sample}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSample(DorisParser.SampleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sampleByPercentile}
	 * labeled alternative in {@link DorisParser#sampleMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSampleByPercentile(DorisParser.SampleByPercentileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sampleByRows}
	 * labeled alternative in {@link DorisParser#sampleMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSampleByRows(DorisParser.SampleByRowsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sampleByBucket}
	 * labeled alternative in {@link DorisParser#sampleMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSampleByBucket(DorisParser.SampleByBucketContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sampleByBytes}
	 * labeled alternative in {@link DorisParser#sampleMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSampleByBytes(DorisParser.SampleByBytesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(DorisParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#identifierSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierSeq(DorisParser.IdentifierSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#orderedIdentifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderedIdentifierList(DorisParser.OrderedIdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#orderedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderedIdentifier(DorisParser.OrderedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#identifierCommentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierCommentList(DorisParser.IdentifierCommentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#identifierComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierComment(DorisParser.IdentifierCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link DorisParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(DorisParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link DorisParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasedQuery(DorisParser.AliasedQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link DorisParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasedRelation(DorisParser.AliasedRelationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inlineTableDefault2}
	 * labeled alternative in {@link DorisParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTableDefault2(DorisParser.InlineTableDefault2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code tableValuedFunction}
	 * labeled alternative in {@link DorisParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableValuedFunction(DorisParser.TableValuedFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#inlineTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTable(DorisParser.InlineTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#functionTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTable(DorisParser.FunctionTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#tableAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableAlias(DorisParser.TableAliasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link DorisParser#rowFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowFormatSerde(DorisParser.RowFormatSerdeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link DorisParser#rowFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowFormatDelimited(DorisParser.RowFormatDelimitedContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#multipartIdentifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipartIdentifierList(DorisParser.MultipartIdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#multipartIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipartIdentifier(DorisParser.MultipartIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#multipartIdentifierPropertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipartIdentifierPropertyList(DorisParser.MultipartIdentifierPropertyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#multipartIdentifierProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipartIdentifierProperty(DorisParser.MultipartIdentifierPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#tableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableIdentifier(DorisParser.TableIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#functionIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionIdentifier(DorisParser.FunctionIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#namedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedExpression(DorisParser.NamedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedExpressionSeq(DorisParser.NamedExpressionSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#partitionFieldList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionFieldList(DorisParser.PartitionFieldListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionTransform}
	 * labeled alternative in {@link DorisParser#partitionField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionTransform(DorisParser.PartitionTransformContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionColumn}
	 * labeled alternative in {@link DorisParser#partitionField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionColumn(DorisParser.PartitionColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identityTransform}
	 * labeled alternative in {@link DorisParser#transform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentityTransform(DorisParser.IdentityTransformContext ctx);
	/**
	 * Visit a parse tree produced by the {@code applyTransform}
	 * labeled alternative in {@link DorisParser#transform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApplyTransform(DorisParser.ApplyTransformContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#transformArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransformArgument(DorisParser.TransformArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(DorisParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#expressionSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionSeq(DorisParser.ExpressionSeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link DorisParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalNot(DorisParser.LogicalNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code predicated}
	 * labeled alternative in {@link DorisParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicated(DorisParser.PredicatedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exists}
	 * labeled alternative in {@link DorisParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExists(DorisParser.ExistsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link DorisParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalBinary(DorisParser.LogicalBinaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(DorisParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link DorisParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpressionDefault(DorisParser.ValueExpressionDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link DorisParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(DorisParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link DorisParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticBinary(DorisParser.ArithmeticBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link DorisParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticUnary(DorisParser.ArithmeticUnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#datetimeUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatetimeUnit(DorisParser.DatetimeUnitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code struct}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct(DorisParser.StructContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDereference(DorisParser.DereferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code timestampadd}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimestampadd(DorisParser.TimestampaddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code substring}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstring(DorisParser.SubstringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast(DorisParser.CastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda(DorisParser.LambdaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(DorisParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code any_value}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_value(DorisParser.Any_valueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trim}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrim(DorisParser.TrimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCase(DorisParser.SimpleCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code currentLike}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentLike(DorisParser.CurrentLikeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnReference(DorisParser.ColumnReferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowConstructor(DorisParser.RowConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code last}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLast(DorisParser.LastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code star}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar(DorisParser.StarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code overlay}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverlay(DorisParser.OverlayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(DorisParser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code timestampdiff}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimestampdiff(DorisParser.TimestampdiffContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubqueryExpression(DorisParser.SubqueryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDefault(DorisParser.ConstantDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code extract}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtract(DorisParser.ExtractContext ctx);
	/**
	 * Visit a parse tree produced by the {@code percentile}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPercentile(DorisParser.PercentileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(DorisParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchedCase(DorisParser.SearchedCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code position}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosition(DorisParser.PositionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code first}
	 * labeled alternative in {@link DorisParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirst(DorisParser.FirstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link DorisParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(DorisParser.NullLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link DorisParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalLiteral(DorisParser.IntervalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link DorisParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeConstructor(DorisParser.TypeConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link DorisParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(DorisParser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link DorisParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(DorisParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link DorisParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(DorisParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(DorisParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticOperator(DorisParser.ArithmeticOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#predicateOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicateOperator(DorisParser.PredicateOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanValue(DorisParser.BooleanValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval(DorisParser.IntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#errorCapturingMultiUnitsInterval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorCapturingMultiUnitsInterval(DorisParser.ErrorCapturingMultiUnitsIntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#multiUnitsInterval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiUnitsInterval(DorisParser.MultiUnitsIntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#errorCapturingUnitToUnitInterval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorCapturingUnitToUnitInterval(DorisParser.ErrorCapturingUnitToUnitIntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#unitToUnitInterval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitToUnitInterval(DorisParser.UnitToUnitIntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#intervalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalValue(DorisParser.IntervalValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#unitInMultiUnits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitInMultiUnits(DorisParser.UnitInMultiUnitsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#unitInUnitToUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitInUnitToUnit(DorisParser.UnitInUnitToUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#colPosition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColPosition(DorisParser.ColPositionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link DorisParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexDataType(DorisParser.ComplexDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code yearMonthIntervalDataType}
	 * labeled alternative in {@link DorisParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYearMonthIntervalDataType(DorisParser.YearMonthIntervalDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dayTimeIntervalDataType}
	 * labeled alternative in {@link DorisParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDayTimeIntervalDataType(DorisParser.DayTimeIntervalDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link DorisParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveDataType(DorisParser.PrimitiveDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#qualifiedColTypeWithPositionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedColTypeWithPositionList(DorisParser.QualifiedColTypeWithPositionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#qualifiedColTypeWithPosition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedColTypeWithPosition(DorisParser.QualifiedColTypeWithPositionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#defaultExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultExpression(DorisParser.DefaultExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#colTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColTypeList(DorisParser.ColTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#colType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColType(DorisParser.ColTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#createOrReplaceTableColTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateOrReplaceTableColTypeList(DorisParser.CreateOrReplaceTableColTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#createOrReplaceTableColType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateOrReplaceTableColType(DorisParser.CreateOrReplaceTableColTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#colDefinitionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColDefinitionOption(DorisParser.ColDefinitionOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#complexColTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexColTypeList(DorisParser.ComplexColTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#complexColType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexColType(DorisParser.ComplexColTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#whenClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenClause(DorisParser.WhenClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#windowClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowClause(DorisParser.WindowClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#namedWindow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedWindow(DorisParser.NamedWindowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link DorisParser#windowSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowRef(DorisParser.WindowRefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link DorisParser#windowSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowDef(DorisParser.WindowDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#windowFrame}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowFrame(DorisParser.WindowFrameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#frameBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameBound(DorisParser.FrameBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(DorisParser.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(DorisParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(DorisParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#errorCapturingIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorCapturingIdentifier(DorisParser.ErrorCapturingIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code errorIdent}
	 * labeled alternative in {@link DorisParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorIdent(DorisParser.ErrorIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code realIdent}
	 * labeled alternative in {@link DorisParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealIdent(DorisParser.RealIdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(DorisParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link DorisParser#strictIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnquotedIdentifier(DorisParser.UnquotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link DorisParser#strictIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedIdentifierAlternative(DorisParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedIdentifier(DorisParser.QuotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#backQuotedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackQuotedIdentifier(DorisParser.BackQuotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exponentLiteral}
	 * labeled alternative in {@link DorisParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponentLiteral(DorisParser.ExponentLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link DorisParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(DorisParser.DecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code legacyDecimalLiteral}
	 * labeled alternative in {@link DorisParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLegacyDecimalLiteral(DorisParser.LegacyDecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link DorisParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(DorisParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link DorisParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBigIntLiteral(DorisParser.BigIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link DorisParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmallIntLiteral(DorisParser.SmallIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link DorisParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTinyIntLiteral(DorisParser.TinyIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link DorisParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleLiteral(DorisParser.DoubleLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatLiteral}
	 * labeled alternative in {@link DorisParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(DorisParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bigDecimalLiteral}
	 * labeled alternative in {@link DorisParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBigDecimalLiteral(DorisParser.BigDecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#alterColumnAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterColumnAction(DorisParser.AlterColumnActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#stringLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLit(DorisParser.StringLitContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(DorisParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#version}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVersion(DorisParser.VersionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#ansiNonReserved}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnsiNonReserved(DorisParser.AnsiNonReservedContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#strictNonReserved}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrictNonReserved(DorisParser.StrictNonReservedContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisParser#nonReserved}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonReserved(DorisParser.NonReservedContext ctx);
}