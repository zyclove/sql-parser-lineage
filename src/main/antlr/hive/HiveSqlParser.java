// Generated from java-escape by ANTLR 4.11.1
package hive;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class HiveSqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T_ACTION=6, T_ADD2=7, T_ALL=8, 
		T_ALLOCATE=9, T_ALTER=10, T_AND=11, T_ANSI_NULLS=12, T_ANSI_PADDING=13, 
		T_AS=14, T_ASC=15, T_ASSOCIATE=16, T_AT=17, T_AUTO_INCREMENT=18, T_AVG=19, 
		T_BATCHSIZE=20, T_BEGIN=21, T_BETWEEN=22, T_BIGINT=23, T_BINARY_DOUBLE=24, 
		T_BINARY_FLOAT=25, T_BINARY_INTEGER=26, T_BIT=27, T_BODY=28, T_BREAK=29, 
		T_BY=30, T_BYTE=31, T_CALL=32, T_CALLER=33, T_CASCADE=34, T_CASE=35, T_CASESPECIFIC=36, 
		T_CAST=37, T_CHAR=38, T_CHARACTER=39, T_CHARSET=40, T_CLIENT=41, T_CLOSE=42, 
		T_CLUSTERED=43, T_CMP=44, T_COLLECT=45, T_COLLECTION=46, T_COLUMN=47, 
		T_COMMENT=48, T_CONSTANT=49, T_COMMIT=50, T_COMPRESS=51, T_CONCAT=52, 
		T_CONDITION=53, T_CONSTRAINT=54, T_CONTINUE=55, T_COPY=56, T_COUNT=57, 
		T_COUNT_BIG=58, T_CREATE=59, T_CREATION=60, T_CREATOR=61, T_CS=62, T_CURRENT=63, 
		T_CURRENT_SCHEMA=64, T_CURSOR=65, T_DATABASE=66, T_DATA=67, T_DATE=68, 
		T_DATETIME=69, T_DAY=70, T_DAYS=71, T_DEC=72, T_DECIMAL=73, T_DECLARE=74, 
		T_DEFAULT=75, T_DEFERRED=76, T_DEFINED=77, T_DEFINER=78, T_DEFINITION=79, 
		T_DELETE=80, T_DELIMITED=81, T_DELIMITER=82, T_DESC=83, T_DESCRIBE=84, 
		T_DIAGNOSTICS=85, T_DIR=86, T_DIRECTORY=87, T_DISTINCT=88, T_DISTRIBUTE=89, 
		T_DO=90, T_DOUBLE=91, T_DROP=92, T_DYNAMIC=93, T_ELSE=94, T_ELSEIF=95, 
		T_ELSIF=96, T_ENABLE=97, T_END=98, T_ENGINE=99, T_ESCAPED=100, T_EXCEPT=101, 
		T_EXEC=102, T_EXECUTE=103, T_EXCEPTION=104, T_EXCLUSIVE=105, T_EXISTS=106, 
		T_EXIT=107, T_FALLBACK=108, T_FALSE=109, T_FETCH=110, T_FIELDS=111, T_FILE=112, 
		T_FILES=113, T_FLOAT=114, T_FOR=115, T_FOREIGN=116, T_FORMAT=117, T_FOUND=118, 
		T_FROM=119, T_FULL=120, T_FUNCTION=121, T_GET=122, T_GLOBAL=123, T_GO=124, 
		T_GRANT=125, T_GROUP=126, T_HANDLER=127, T_HASH=128, T_HAVING=129, T_HDFS=130, 
		T_HIVE=131, T_HOST=132, T_IDENTITY=133, T_IF=134, T_IGNORE=135, T_IMMEDIATE=136, 
		T_IN=137, T_INCLUDE=138, T_INDEX=139, T_INITRANS=140, T_INNER=141, T_INOUT=142, 
		T_INSERT=143, T_INT=144, T_INT2=145, T_INT4=146, T_INT8=147, T_INTEGER=148, 
		T_INTERSECT=149, T_INTERVAL=150, T_INTO=151, T_INVOKER=152, T_IS=153, 
		T_ISOPEN=154, T_ITEMS=155, T_JOIN=156, T_KEEP=157, T_KEY=158, T_KEYS=159, 
		T_LANGUAGE=160, T_LEAVE=161, T_LEFT=162, T_LIKE=163, T_LIMIT=164, T_LINES=165, 
		T_LOCAL=166, T_LOCATION=167, T_LOCATOR=168, T_LOCATORS=169, T_LOCKS=170, 
		T_LOG=171, T_LOGGED=172, T_LOGGING=173, T_LOOP=174, T_MAP=175, T_MATCHED=176, 
		T_MAX=177, T_MAXTRANS=178, T_MERGE=179, T_MESSAGE_TEXT=180, T_MICROSECOND=181, 
		T_MICROSECONDS=182, T_MIN=183, T_MULTISET=184, T_NCHAR=185, T_NEW=186, 
		T_NVARCHAR=187, T_NO=188, T_NOCOUNT=189, T_NOCOMPRESS=190, T_NOLOGGING=191, 
		T_NONE=192, T_NOT=193, T_NOTFOUND=194, T_NULL=195, T_NUMERIC=196, T_NUMBER=197, 
		T_OBJECT=198, T_OFF=199, T_ON=200, T_ONLY=201, T_OPEN=202, T_OR=203, T_ORDER=204, 
		T_OUT=205, T_OUTER=206, T_OVER=207, T_OVERWRITE=208, T_OWNER=209, T_PACKAGE=210, 
		T_PARTITION=211, T_PCTFREE=212, T_PCTUSED=213, T_PLS_INTEGER=214, T_PRECISION=215, 
		T_PRESERVE=216, T_PRIMARY=217, T_PRINT=218, T_PROC=219, T_PROCEDURE=220, 
		T_QUALIFY=221, T_QUERY_BAND=222, T_QUIT=223, T_QUOTED_IDENTIFIER=224, 
		T_RAISE=225, T_REAL=226, T_REFERENCES=227, T_REGEXP=228, T_REPLACE=229, 
		T_RESIGNAL=230, T_RESTRICT=231, T_RESULT=232, T_RESULT_SET_LOCATOR=233, 
		T_RETURN=234, T_RETURNS=235, T_REVERSE=236, T_RIGHT=237, T_RLIKE=238, 
		T_ROLE=239, T_ROLLBACK=240, T_ROW=241, T_ROWS=242, T_ROWTYPE=243, T_ROW_COUNT=244, 
		T_RR=245, T_RS=246, T_PWD=247, T_TRIM=248, T_SCHEMA=249, T_SECOND=250, 
		T_SECONDS=251, T_SECURITY=252, T_SEGMENT=253, T_SEL=254, T_SELECT=255, 
		T_SET=256, T_SESSION=257, T_SESSIONS=258, T_SETS=259, T_SHARE=260, T_SIGNAL=261, 
		T_SIMPLE_DOUBLE=262, T_SIMPLE_FLOAT=263, T_SIMPLE_INTEGER=264, T_SMALLDATETIME=265, 
		T_SMALLINT=266, T_SQL=267, T_SQLEXCEPTION=268, T_SQLINSERT=269, T_SQLSTATE=270, 
		T_SQLWARNING=271, T_STATS=272, T_STATISTICS=273, T_STEP=274, T_STORAGE=275, 
		T_STORED=276, T_STRING=277, T_SUBDIR=278, T_SUBSTRING=279, T_SUM=280, 
		T_SUMMARY=281, T_SYS_REFCURSOR=282, T_TABLE=283, T_TABLESPACE=284, T_TEMPORARY=285, 
		T_TERMINATED=286, T_TEXTIMAGE_ON=287, T_THEN=288, T_TIMESTAMP=289, T_TINYINT=290, 
		T_TITLE=291, T_TO=292, T_TOP=293, T_TRANSACTION=294, T_TRUE=295, T_TRUNCATE=296, 
		T_TYPE=297, T_UNION=298, T_UNIQUE=299, T_UPDATE=300, T_UR=301, T_USE=302, 
		T_USING=303, T_VALUE=304, T_VALUES=305, T_VAR=306, T_VARCHAR=307, T_VARCHAR2=308, 
		T_VARYING=309, T_VOLATILE=310, T_WHEN=311, T_WHERE=312, T_WHILE=313, T_WITH=314, 
		T_WITHOUT=315, T_WORK=316, T_XACT_ABORT=317, T_XML=318, T_YES=319, T_ACTIVITY_COUNT=320, 
		T_CUME_DIST=321, T_CURRENT_DATE=322, T_CURRENT_TIMESTAMP=323, T_CURRENT_USER=324, 
		T_DENSE_RANK=325, T_FIRST_VALUE=326, T_LAG=327, T_LAST_VALUE=328, T_LEAD=329, 
		T_MAX_PART_STRING=330, T_MIN_PART_STRING=331, T_MAX_PART_INT=332, T_MIN_PART_INT=333, 
		T_MAX_PART_DATE=334, T_MIN_PART_DATE=335, T_PART_COUNT=336, T_PART_LOC=337, 
		T_RANK=338, T_ROW_NUMBER=339, T_STDEV=340, T_SYSDATE=341, T_VARIANCE=342, 
		T_USER=343, T_ADD=344, T_COLON=345, T_COMMA=346, T_PIPE=347, T_DIV=348, 
		T_DOT2=349, T_EQUAL=350, T_EQUAL2=351, T_NOTEQUAL=352, T_NOTEQUAL2=353, 
		T_GREATER=354, T_GREATEREQUAL=355, T_LESS=356, T_LESSEQUAL=357, T_MUL=358, 
		T_OPEN_B=359, T_OPEN_P=360, T_OPEN_SB=361, T_CLOSE_B=362, T_CLOSE_P=363, 
		T_CLOSE_SB=364, T_SEMICOLON=365, T_SUB=366, L_ID=367, L_S_STRING=368, 
		L_D_STRING=369, L_INT=370, L_DEC=371, L_WS=372, L_M_COMMENT=373, L_S_COMMENT=374, 
		L_FILE=375, L_LABEL=376;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_begin_end_block = 2, RULE_single_block_stmt = 3, 
		RULE_block_end = 4, RULE_proc_block = 5, RULE_stmt = 6, RULE_semicolon_stmt = 7, 
		RULE_exception_block = 8, RULE_exception_block_item = 9, RULE_null_stmt = 10, 
		RULE_expr_stmt = 11, RULE_assignment_stmt = 12, RULE_assignment_stmt_item = 13, 
		RULE_assignment_stmt_single_item = 14, RULE_assignment_stmt_multiple_item = 15, 
		RULE_assignment_stmt_select_item = 16, RULE_allocate_cursor_stmt = 17, 
		RULE_associate_locator_stmt = 18, RULE_begin_transaction_stmt = 19, RULE_break_stmt = 20, 
		RULE_call_stmt = 21, RULE_declare_stmt = 22, RULE_declare_block = 23, 
		RULE_declare_block_inplace = 24, RULE_declare_stmt_item = 25, RULE_declare_var_item = 26, 
		RULE_declare_condition_item = 27, RULE_declare_cursor_item = 28, RULE_cursor_with_return = 29, 
		RULE_cursor_without_return = 30, RULE_declare_handler_item = 31, RULE_declare_temporary_table_item = 32, 
		RULE_create_table_stmt = 33, RULE_create_local_temp_table_stmt = 34, RULE_create_table_definition = 35, 
		RULE_create_table_columns = 36, RULE_create_table_columns_item = 37, RULE_column_comment = 38, 
		RULE_column_name = 39, RULE_create_table_column_inline_cons = 40, RULE_create_table_column_cons = 41, 
		RULE_create_table_fk_action = 42, RULE_create_table_preoptions = 43, RULE_create_table_preoptions_item = 44, 
		RULE_create_table_preoptions_td_item = 45, RULE_create_table_options = 46, 
		RULE_create_table_options_item = 47, RULE_create_table_options_ora_item = 48, 
		RULE_create_table_options_db2_item = 49, RULE_create_table_options_td_item = 50, 
		RULE_create_table_options_hive_item = 51, RULE_create_table_hive_row_format = 52, 
		RULE_create_table_hive_row_format_fields = 53, RULE_create_table_options_mssql_item = 54, 
		RULE_create_table_options_mysql_item = 55, RULE_alter_table_stmt = 56, 
		RULE_alter_table_item = 57, RULE_alter_table_add_constraint = 58, RULE_alter_table_add_constraint_item = 59, 
		RULE_dtype = 60, RULE_dtype_len = 61, RULE_dtype_attr = 62, RULE_dtype_default = 63, 
		RULE_create_database_stmt = 64, RULE_create_database_option = 65, RULE_create_function_stmt = 66, 
		RULE_create_function_return = 67, RULE_create_package_stmt = 68, RULE_package_spec = 69, 
		RULE_package_spec_item = 70, RULE_create_package_body_stmt = 71, RULE_package_body = 72, 
		RULE_package_body_item = 73, RULE_create_procedure_stmt = 74, RULE_create_routine_params = 75, 
		RULE_create_routine_param_item = 76, RULE_create_routine_options = 77, 
		RULE_create_routine_option = 78, RULE_drop_stmt = 79, RULE_end_transaction_stmt = 80, 
		RULE_exec_stmt = 81, RULE_if_stmt = 82, RULE_if_plsql_stmt = 83, RULE_if_tsql_stmt = 84, 
		RULE_if_bteq_stmt = 85, RULE_elseif_block = 86, RULE_else_block = 87, 
		RULE_include_stmt = 88, RULE_insert_stmt = 89, RULE_insert_stmt_cols = 90, 
		RULE_insert_stmt_rows = 91, RULE_insert_stmt_row = 92, RULE_insert_directory_stmt = 93, 
		RULE_exit_stmt = 94, RULE_get_diag_stmt = 95, RULE_get_diag_stmt_item = 96, 
		RULE_get_diag_stmt_exception_item = 97, RULE_get_diag_stmt_rowcount_item = 98, 
		RULE_grant_stmt = 99, RULE_grant_stmt_item = 100, RULE_leave_stmt = 101, 
		RULE_map_object_stmt = 102, RULE_open_stmt = 103, RULE_fetch_stmt = 104, 
		RULE_collect_stats_stmt = 105, RULE_collect_stats_clause = 106, RULE_close_stmt = 107, 
		RULE_cmp_stmt = 108, RULE_cmp_source = 109, RULE_copy_from_local_stmt = 110, 
		RULE_copy_stmt = 111, RULE_copy_source = 112, RULE_copy_target = 113, 
		RULE_copy_option = 114, RULE_copy_file_option = 115, RULE_commit_stmt = 116, 
		RULE_create_index_stmt = 117, RULE_create_index_col = 118, RULE_index_storage_clause = 119, 
		RULE_index_mssql_storage_clause = 120, RULE_print_stmt = 121, RULE_quit_stmt = 122, 
		RULE_raise_stmt = 123, RULE_resignal_stmt = 124, RULE_return_stmt = 125, 
		RULE_rollback_stmt = 126, RULE_set_session_option = 127, RULE_set_current_schema_option = 128, 
		RULE_set_mssql_session_option = 129, RULE_set_teradata_session_option = 130, 
		RULE_signal_stmt = 131, RULE_summary_stmt = 132, RULE_truncate_stmt = 133, 
		RULE_use_stmt = 134, RULE_values_into_stmt = 135, RULE_while_stmt = 136, 
		RULE_for_cursor_stmt = 137, RULE_for_range_stmt = 138, RULE_label = 139, 
		RULE_using_clause = 140, RULE_select_stmt = 141, RULE_cte_select_stmt = 142, 
		RULE_cte_select_stmt_item = 143, RULE_cte_select_cols = 144, RULE_fullselect_stmt = 145, 
		RULE_fullselect_stmt_item = 146, RULE_fullselect_set_clause = 147, RULE_subselect_stmt = 148, 
		RULE_select_list = 149, RULE_select_list_set = 150, RULE_select_list_limit = 151, 
		RULE_select_list_item = 152, RULE_select_list_alias = 153, RULE_select_list_asterisk = 154, 
		RULE_into_clause = 155, RULE_from_clause = 156, RULE_from_table_clause = 157, 
		RULE_from_table_name_clause = 158, RULE_from_subselect_clause = 159, RULE_from_join_clause = 160, 
		RULE_from_join_type_clause = 161, RULE_from_table_values_clause = 162, 
		RULE_from_table_values_row = 163, RULE_from_alias_clause = 164, RULE_table_name = 165, 
		RULE_where_clause = 166, RULE_group_by_clause = 167, RULE_having_clause = 168, 
		RULE_qualify_clause = 169, RULE_order_by_clause = 170, RULE_select_options = 171, 
		RULE_select_options_item = 172, RULE_update_stmt = 173, RULE_update_assignment = 174, 
		RULE_update_table = 175, RULE_update_upsert = 176, RULE_merge_stmt = 177, 
		RULE_merge_table = 178, RULE_merge_condition = 179, RULE_merge_action = 180, 
		RULE_delete_stmt = 181, RULE_delete_alias = 182, RULE_describe_stmt = 183, 
		RULE_bool_expr = 184, RULE_bool_expr_atom = 185, RULE_bool_expr_unary = 186, 
		RULE_bool_expr_single_in = 187, RULE_bool_expr_multi_in = 188, RULE_bool_expr_binary = 189, 
		RULE_bool_expr_logical_operator = 190, RULE_bool_expr_binary_operator = 191, 
		RULE_expr = 192, RULE_expr_atom = 193, RULE_expr_interval = 194, RULE_interval_item = 195, 
		RULE_expr_concat = 196, RULE_expr_concat_item = 197, RULE_expr_case = 198, 
		RULE_expr_case_simple = 199, RULE_expr_case_searched = 200, RULE_expr_cursor_attribute = 201, 
		RULE_expr_agg_window_func = 202, RULE_expr_func_all_distinct = 203, RULE_expr_func_over_clause = 204, 
		RULE_expr_func_partition_by_clause = 205, RULE_expr_spec_func = 206, RULE_expr_func = 207, 
		RULE_expr_func_params = 208, RULE_func_param = 209, RULE_expr_select = 210, 
		RULE_expr_file = 211, RULE_hive = 212, RULE_hive_item = 213, RULE_host = 214, 
		RULE_host_cmd = 215, RULE_host_stmt = 216, RULE_file_name = 217, RULE_date_literal = 218, 
		RULE_timestamp_literal = 219, RULE_ident = 220, RULE_string = 221, RULE_int_number = 222, 
		RULE_dec_number = 223, RULE_bool_literal = 224, RULE_null_const = 225, 
		RULE_non_reserved_words = 226;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "begin_end_block", "single_block_stmt", "block_end", 
			"proc_block", "stmt", "semicolon_stmt", "exception_block", "exception_block_item", 
			"null_stmt", "expr_stmt", "assignment_stmt", "assignment_stmt_item", 
			"assignment_stmt_single_item", "assignment_stmt_multiple_item", "assignment_stmt_select_item", 
			"allocate_cursor_stmt", "associate_locator_stmt", "begin_transaction_stmt", 
			"break_stmt", "call_stmt", "declare_stmt", "declare_block", "declare_block_inplace", 
			"declare_stmt_item", "declare_var_item", "declare_condition_item", "declare_cursor_item", 
			"cursor_with_return", "cursor_without_return", "declare_handler_item", 
			"declare_temporary_table_item", "create_table_stmt", "create_local_temp_table_stmt", 
			"create_table_definition", "create_table_columns", "create_table_columns_item", 
			"column_comment", "column_name", "create_table_column_inline_cons", "create_table_column_cons", 
			"create_table_fk_action", "create_table_preoptions", "create_table_preoptions_item", 
			"create_table_preoptions_td_item", "create_table_options", "create_table_options_item", 
			"create_table_options_ora_item", "create_table_options_db2_item", "create_table_options_td_item", 
			"create_table_options_hive_item", "create_table_hive_row_format", "create_table_hive_row_format_fields", 
			"create_table_options_mssql_item", "create_table_options_mysql_item", 
			"alter_table_stmt", "alter_table_item", "alter_table_add_constraint", 
			"alter_table_add_constraint_item", "dtype", "dtype_len", "dtype_attr", 
			"dtype_default", "create_database_stmt", "create_database_option", "create_function_stmt", 
			"create_function_return", "create_package_stmt", "package_spec", "package_spec_item", 
			"create_package_body_stmt", "package_body", "package_body_item", "create_procedure_stmt", 
			"create_routine_params", "create_routine_param_item", "create_routine_options", 
			"create_routine_option", "drop_stmt", "end_transaction_stmt", "exec_stmt", 
			"if_stmt", "if_plsql_stmt", "if_tsql_stmt", "if_bteq_stmt", "elseif_block", 
			"else_block", "include_stmt", "insert_stmt", "insert_stmt_cols", "insert_stmt_rows", 
			"insert_stmt_row", "insert_directory_stmt", "exit_stmt", "get_diag_stmt", 
			"get_diag_stmt_item", "get_diag_stmt_exception_item", "get_diag_stmt_rowcount_item", 
			"grant_stmt", "grant_stmt_item", "leave_stmt", "map_object_stmt", "open_stmt", 
			"fetch_stmt", "collect_stats_stmt", "collect_stats_clause", "close_stmt", 
			"cmp_stmt", "cmp_source", "copy_from_local_stmt", "copy_stmt", "copy_source", 
			"copy_target", "copy_option", "copy_file_option", "commit_stmt", "create_index_stmt", 
			"create_index_col", "index_storage_clause", "index_mssql_storage_clause", 
			"print_stmt", "quit_stmt", "raise_stmt", "resignal_stmt", "return_stmt", 
			"rollback_stmt", "set_session_option", "set_current_schema_option", "set_mssql_session_option", 
			"set_teradata_session_option", "signal_stmt", "summary_stmt", "truncate_stmt", 
			"use_stmt", "values_into_stmt", "while_stmt", "for_cursor_stmt", "for_range_stmt", 
			"label", "using_clause", "select_stmt", "cte_select_stmt", "cte_select_stmt_item", 
			"cte_select_cols", "fullselect_stmt", "fullselect_stmt_item", "fullselect_set_clause", 
			"subselect_stmt", "select_list", "select_list_set", "select_list_limit", 
			"select_list_item", "select_list_alias", "select_list_asterisk", "into_clause", 
			"from_clause", "from_table_clause", "from_table_name_clause", "from_subselect_clause", 
			"from_join_clause", "from_join_type_clause", "from_table_values_clause", 
			"from_table_values_row", "from_alias_clause", "table_name", "where_clause", 
			"group_by_clause", "having_clause", "qualify_clause", "order_by_clause", 
			"select_options", "select_options_item", "update_stmt", "update_assignment", 
			"update_table", "update_upsert", "merge_stmt", "merge_table", "merge_condition", 
			"merge_action", "delete_stmt", "delete_alias", "describe_stmt", "bool_expr", 
			"bool_expr_atom", "bool_expr_unary", "bool_expr_single_in", "bool_expr_multi_in", 
			"bool_expr_binary", "bool_expr_logical_operator", "bool_expr_binary_operator", 
			"expr", "expr_atom", "expr_interval", "interval_item", "expr_concat", 
			"expr_concat_item", "expr_case", "expr_case_simple", "expr_case_searched", 
			"expr_cursor_attribute", "expr_agg_window_func", "expr_func_all_distinct", 
			"expr_func_over_clause", "expr_func_partition_by_clause", "expr_spec_func", 
			"expr_func", "expr_func_params", "func_param", "expr_select", "expr_file", 
			"hive", "hive_item", "host", "host_cmd", "host_stmt", "file_name", "date_literal", 
			"timestamp_literal", "ident", "string", "int_number", "dec_number", "bool_literal", 
			"null_const", "non_reserved_words"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'@'", "'#'", "'%'", "'.'", "'!'", null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "'+'", "':'", "','", 
			"'||'", "'/'", "'..'", "'='", "'=='", "'<>'", "'!='", "'>'", "'>='", 
			"'<'", "'<='", "'*'", "'{'", "'('", "'['", "'}'", "')'", "']'", "';'", 
			"'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "T_ACTION", "T_ADD2", "T_ALL", "T_ALLOCATE", 
			"T_ALTER", "T_AND", "T_ANSI_NULLS", "T_ANSI_PADDING", "T_AS", "T_ASC", 
			"T_ASSOCIATE", "T_AT", "T_AUTO_INCREMENT", "T_AVG", "T_BATCHSIZE", "T_BEGIN", 
			"T_BETWEEN", "T_BIGINT", "T_BINARY_DOUBLE", "T_BINARY_FLOAT", "T_BINARY_INTEGER", 
			"T_BIT", "T_BODY", "T_BREAK", "T_BY", "T_BYTE", "T_CALL", "T_CALLER", 
			"T_CASCADE", "T_CASE", "T_CASESPECIFIC", "T_CAST", "T_CHAR", "T_CHARACTER", 
			"T_CHARSET", "T_CLIENT", "T_CLOSE", "T_CLUSTERED", "T_CMP", "T_COLLECT", 
			"T_COLLECTION", "T_COLUMN", "T_COMMENT", "T_CONSTANT", "T_COMMIT", "T_COMPRESS", 
			"T_CONCAT", "T_CONDITION", "T_CONSTRAINT", "T_CONTINUE", "T_COPY", "T_COUNT", 
			"T_COUNT_BIG", "T_CREATE", "T_CREATION", "T_CREATOR", "T_CS", "T_CURRENT", 
			"T_CURRENT_SCHEMA", "T_CURSOR", "T_DATABASE", "T_DATA", "T_DATE", "T_DATETIME", 
			"T_DAY", "T_DAYS", "T_DEC", "T_DECIMAL", "T_DECLARE", "T_DEFAULT", "T_DEFERRED", 
			"T_DEFINED", "T_DEFINER", "T_DEFINITION", "T_DELETE", "T_DELIMITED", 
			"T_DELIMITER", "T_DESC", "T_DESCRIBE", "T_DIAGNOSTICS", "T_DIR", "T_DIRECTORY", 
			"T_DISTINCT", "T_DISTRIBUTE", "T_DO", "T_DOUBLE", "T_DROP", "T_DYNAMIC", 
			"T_ELSE", "T_ELSEIF", "T_ELSIF", "T_ENABLE", "T_END", "T_ENGINE", "T_ESCAPED", 
			"T_EXCEPT", "T_EXEC", "T_EXECUTE", "T_EXCEPTION", "T_EXCLUSIVE", "T_EXISTS", 
			"T_EXIT", "T_FALLBACK", "T_FALSE", "T_FETCH", "T_FIELDS", "T_FILE", "T_FILES", 
			"T_FLOAT", "T_FOR", "T_FOREIGN", "T_FORMAT", "T_FOUND", "T_FROM", "T_FULL", 
			"T_FUNCTION", "T_GET", "T_GLOBAL", "T_GO", "T_GRANT", "T_GROUP", "T_HANDLER", 
			"T_HASH", "T_HAVING", "T_HDFS", "T_HIVE", "T_HOST", "T_IDENTITY", "T_IF", 
			"T_IGNORE", "T_IMMEDIATE", "T_IN", "T_INCLUDE", "T_INDEX", "T_INITRANS", 
			"T_INNER", "T_INOUT", "T_INSERT", "T_INT", "T_INT2", "T_INT4", "T_INT8", 
			"T_INTEGER", "T_INTERSECT", "T_INTERVAL", "T_INTO", "T_INVOKER", "T_IS", 
			"T_ISOPEN", "T_ITEMS", "T_JOIN", "T_KEEP", "T_KEY", "T_KEYS", "T_LANGUAGE", 
			"T_LEAVE", "T_LEFT", "T_LIKE", "T_LIMIT", "T_LINES", "T_LOCAL", "T_LOCATION", 
			"T_LOCATOR", "T_LOCATORS", "T_LOCKS", "T_LOG", "T_LOGGED", "T_LOGGING", 
			"T_LOOP", "T_MAP", "T_MATCHED", "T_MAX", "T_MAXTRANS", "T_MERGE", "T_MESSAGE_TEXT", 
			"T_MICROSECOND", "T_MICROSECONDS", "T_MIN", "T_MULTISET", "T_NCHAR", 
			"T_NEW", "T_NVARCHAR", "T_NO", "T_NOCOUNT", "T_NOCOMPRESS", "T_NOLOGGING", 
			"T_NONE", "T_NOT", "T_NOTFOUND", "T_NULL", "T_NUMERIC", "T_NUMBER", "T_OBJECT", 
			"T_OFF", "T_ON", "T_ONLY", "T_OPEN", "T_OR", "T_ORDER", "T_OUT", "T_OUTER", 
			"T_OVER", "T_OVERWRITE", "T_OWNER", "T_PACKAGE", "T_PARTITION", "T_PCTFREE", 
			"T_PCTUSED", "T_PLS_INTEGER", "T_PRECISION", "T_PRESERVE", "T_PRIMARY", 
			"T_PRINT", "T_PROC", "T_PROCEDURE", "T_QUALIFY", "T_QUERY_BAND", "T_QUIT", 
			"T_QUOTED_IDENTIFIER", "T_RAISE", "T_REAL", "T_REFERENCES", "T_REGEXP", 
			"T_REPLACE", "T_RESIGNAL", "T_RESTRICT", "T_RESULT", "T_RESULT_SET_LOCATOR", 
			"T_RETURN", "T_RETURNS", "T_REVERSE", "T_RIGHT", "T_RLIKE", "T_ROLE", 
			"T_ROLLBACK", "T_ROW", "T_ROWS", "T_ROWTYPE", "T_ROW_COUNT", "T_RR", 
			"T_RS", "T_PWD", "T_TRIM", "T_SCHEMA", "T_SECOND", "T_SECONDS", "T_SECURITY", 
			"T_SEGMENT", "T_SEL", "T_SELECT", "T_SET", "T_SESSION", "T_SESSIONS", 
			"T_SETS", "T_SHARE", "T_SIGNAL", "T_SIMPLE_DOUBLE", "T_SIMPLE_FLOAT", 
			"T_SIMPLE_INTEGER", "T_SMALLDATETIME", "T_SMALLINT", "T_SQL", "T_SQLEXCEPTION", 
			"T_SQLINSERT", "T_SQLSTATE", "T_SQLWARNING", "T_STATS", "T_STATISTICS", 
			"T_STEP", "T_STORAGE", "T_STORED", "T_STRING", "T_SUBDIR", "T_SUBSTRING", 
			"T_SUM", "T_SUMMARY", "T_SYS_REFCURSOR", "T_TABLE", "T_TABLESPACE", "T_TEMPORARY", 
			"T_TERMINATED", "T_TEXTIMAGE_ON", "T_THEN", "T_TIMESTAMP", "T_TINYINT", 
			"T_TITLE", "T_TO", "T_TOP", "T_TRANSACTION", "T_TRUE", "T_TRUNCATE", 
			"T_TYPE", "T_UNION", "T_UNIQUE", "T_UPDATE", "T_UR", "T_USE", "T_USING", 
			"T_VALUE", "T_VALUES", "T_VAR", "T_VARCHAR", "T_VARCHAR2", "T_VARYING", 
			"T_VOLATILE", "T_WHEN", "T_WHERE", "T_WHILE", "T_WITH", "T_WITHOUT", 
			"T_WORK", "T_XACT_ABORT", "T_XML", "T_YES", "T_ACTIVITY_COUNT", "T_CUME_DIST", 
			"T_CURRENT_DATE", "T_CURRENT_TIMESTAMP", "T_CURRENT_USER", "T_DENSE_RANK", 
			"T_FIRST_VALUE", "T_LAG", "T_LAST_VALUE", "T_LEAD", "T_MAX_PART_STRING", 
			"T_MIN_PART_STRING", "T_MAX_PART_INT", "T_MIN_PART_INT", "T_MAX_PART_DATE", 
			"T_MIN_PART_DATE", "T_PART_COUNT", "T_PART_LOC", "T_RANK", "T_ROW_NUMBER", 
			"T_STDEV", "T_SYSDATE", "T_VARIANCE", "T_USER", "T_ADD", "T_COLON", "T_COMMA", 
			"T_PIPE", "T_DIV", "T_DOT2", "T_EQUAL", "T_EQUAL2", "T_NOTEQUAL", "T_NOTEQUAL2", 
			"T_GREATER", "T_GREATEREQUAL", "T_LESS", "T_LESSEQUAL", "T_MUL", "T_OPEN_B", 
			"T_OPEN_P", "T_OPEN_SB", "T_CLOSE_B", "T_CLOSE_P", "T_CLOSE_SB", "T_SEMICOLON", 
			"T_SUB", "L_ID", "L_S_STRING", "L_D_STRING", "L_INT", "L_DEC", "L_WS", 
			"L_M_COMMENT", "L_S_COMMENT", "L_FILE", "L_LABEL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HiveSqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(HiveSqlParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			block();
			setState(455);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<Begin_end_blockContext> begin_end_block() {
			return getRuleContexts(Begin_end_blockContext.class);
		}
		public Begin_end_blockContext begin_end_block(int i) {
			return getRuleContext(Begin_end_blockContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> T_GO() { return getTokens(HiveSqlParser.T_GO); }
		public TerminalNode T_GO(int i) {
			return getToken(HiveSqlParser.T_GO, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(464); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(459);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(457);
						begin_end_block();
						}
						break;
					case 2:
						{
						setState(458);
						stmt();
						}
						break;
					}
					setState(462);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(461);
						match(T_GO);
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(466); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Begin_end_blockContext extends ParserRuleContext {
		public TerminalNode T_BEGIN() { return getToken(HiveSqlParser.T_BEGIN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Block_endContext block_end() {
			return getRuleContext(Block_endContext.class,0);
		}
		public Declare_blockContext declare_block() {
			return getRuleContext(Declare_blockContext.class,0);
		}
		public Exception_blockContext exception_block() {
			return getRuleContext(Exception_blockContext.class,0);
		}
		public Begin_end_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_end_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterBegin_end_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitBegin_end_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitBegin_end_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Begin_end_blockContext begin_end_block() throws RecognitionException {
		Begin_end_blockContext _localctx = new Begin_end_blockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_begin_end_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_DECLARE) {
				{
				setState(468);
				declare_block();
				}
			}

			setState(471);
			match(T_BEGIN);
			setState(472);
			block();
			setState(474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(473);
				exception_block();
				}
				break;
			}
			setState(476);
			block_end();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Single_block_stmtContext extends ParserRuleContext {
		public TerminalNode T_BEGIN() { return getToken(HiveSqlParser.T_BEGIN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Block_endContext block_end() {
			return getRuleContext(Block_endContext.class,0);
		}
		public Exception_blockContext exception_block() {
			return getRuleContext(Exception_blockContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode T_SEMICOLON() { return getToken(HiveSqlParser.T_SEMICOLON, 0); }
		public Single_block_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_block_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterSingle_block_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitSingle_block_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitSingle_block_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_block_stmtContext single_block_stmt() throws RecognitionException {
		Single_block_stmtContext _localctx = new Single_block_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_single_block_stmt);
		try {
			setState(489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(478);
				match(T_BEGIN);
				setState(479);
				block();
				setState(481);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(480);
					exception_block();
					}
					break;
				}
				setState(483);
				block_end();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				stmt();
				setState(487);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(486);
					match(T_SEMICOLON);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Block_endContext extends ParserRuleContext {
		public TerminalNode T_END() { return getToken(HiveSqlParser.T_END, 0); }
		public Block_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterBlock_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitBlock_end(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitBlock_end(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_endContext block_end() throws RecognitionException {
		Block_endContext _localctx = new Block_endContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			if (!(!_input.LT(2).getText().equalsIgnoreCase("TRANSACTION"))) throw new FailedPredicateException(this, "!_input.LT(2).getText().equalsIgnoreCase(\"TRANSACTION\")");
			setState(492);
			match(T_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Proc_blockContext extends ParserRuleContext {
		public Begin_end_blockContext begin_end_block() {
			return getRuleContext(Begin_end_blockContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode T_GO() { return getToken(HiveSqlParser.T_GO, 0); }
		public Proc_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterProc_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitProc_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitProc_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Proc_blockContext proc_block() throws RecognitionException {
		Proc_blockContext _localctx = new Proc_blockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_proc_block);
		try {
			int _alt;
			setState(503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(494);
				begin_end_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(496); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(495);
						stmt();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(498); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(501);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(500);
					match(T_GO);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public Assignment_stmtContext assignment_stmt() {
			return getRuleContext(Assignment_stmtContext.class,0);
		}
		public Allocate_cursor_stmtContext allocate_cursor_stmt() {
			return getRuleContext(Allocate_cursor_stmtContext.class,0);
		}
		public Alter_table_stmtContext alter_table_stmt() {
			return getRuleContext(Alter_table_stmtContext.class,0);
		}
		public Associate_locator_stmtContext associate_locator_stmt() {
			return getRuleContext(Associate_locator_stmtContext.class,0);
		}
		public Begin_transaction_stmtContext begin_transaction_stmt() {
			return getRuleContext(Begin_transaction_stmtContext.class,0);
		}
		public Break_stmtContext break_stmt() {
			return getRuleContext(Break_stmtContext.class,0);
		}
		public Call_stmtContext call_stmt() {
			return getRuleContext(Call_stmtContext.class,0);
		}
		public Collect_stats_stmtContext collect_stats_stmt() {
			return getRuleContext(Collect_stats_stmtContext.class,0);
		}
		public Close_stmtContext close_stmt() {
			return getRuleContext(Close_stmtContext.class,0);
		}
		public Cmp_stmtContext cmp_stmt() {
			return getRuleContext(Cmp_stmtContext.class,0);
		}
		public Copy_from_local_stmtContext copy_from_local_stmt() {
			return getRuleContext(Copy_from_local_stmtContext.class,0);
		}
		public Copy_stmtContext copy_stmt() {
			return getRuleContext(Copy_stmtContext.class,0);
		}
		public Commit_stmtContext commit_stmt() {
			return getRuleContext(Commit_stmtContext.class,0);
		}
		public Create_database_stmtContext create_database_stmt() {
			return getRuleContext(Create_database_stmtContext.class,0);
		}
		public Create_function_stmtContext create_function_stmt() {
			return getRuleContext(Create_function_stmtContext.class,0);
		}
		public Create_index_stmtContext create_index_stmt() {
			return getRuleContext(Create_index_stmtContext.class,0);
		}
		public Create_local_temp_table_stmtContext create_local_temp_table_stmt() {
			return getRuleContext(Create_local_temp_table_stmtContext.class,0);
		}
		public Create_package_stmtContext create_package_stmt() {
			return getRuleContext(Create_package_stmtContext.class,0);
		}
		public Create_package_body_stmtContext create_package_body_stmt() {
			return getRuleContext(Create_package_body_stmtContext.class,0);
		}
		public Create_procedure_stmtContext create_procedure_stmt() {
			return getRuleContext(Create_procedure_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Declare_stmtContext declare_stmt() {
			return getRuleContext(Declare_stmtContext.class,0);
		}
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
		}
		public Describe_stmtContext describe_stmt() {
			return getRuleContext(Describe_stmtContext.class,0);
		}
		public Drop_stmtContext drop_stmt() {
			return getRuleContext(Drop_stmtContext.class,0);
		}
		public End_transaction_stmtContext end_transaction_stmt() {
			return getRuleContext(End_transaction_stmtContext.class,0);
		}
		public Exec_stmtContext exec_stmt() {
			return getRuleContext(Exec_stmtContext.class,0);
		}
		public Exit_stmtContext exit_stmt() {
			return getRuleContext(Exit_stmtContext.class,0);
		}
		public Fetch_stmtContext fetch_stmt() {
			return getRuleContext(Fetch_stmtContext.class,0);
		}
		public For_cursor_stmtContext for_cursor_stmt() {
			return getRuleContext(For_cursor_stmtContext.class,0);
		}
		public For_range_stmtContext for_range_stmt() {
			return getRuleContext(For_range_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public Include_stmtContext include_stmt() {
			return getRuleContext(Include_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Insert_directory_stmtContext insert_directory_stmt() {
			return getRuleContext(Insert_directory_stmtContext.class,0);
		}
		public Get_diag_stmtContext get_diag_stmt() {
			return getRuleContext(Get_diag_stmtContext.class,0);
		}
		public Grant_stmtContext grant_stmt() {
			return getRuleContext(Grant_stmtContext.class,0);
		}
		public Leave_stmtContext leave_stmt() {
			return getRuleContext(Leave_stmtContext.class,0);
		}
		public Map_object_stmtContext map_object_stmt() {
			return getRuleContext(Map_object_stmtContext.class,0);
		}
		public Merge_stmtContext merge_stmt() {
			return getRuleContext(Merge_stmtContext.class,0);
		}
		public Open_stmtContext open_stmt() {
			return getRuleContext(Open_stmtContext.class,0);
		}
		public Print_stmtContext print_stmt() {
			return getRuleContext(Print_stmtContext.class,0);
		}
		public Quit_stmtContext quit_stmt() {
			return getRuleContext(Quit_stmtContext.class,0);
		}
		public Raise_stmtContext raise_stmt() {
			return getRuleContext(Raise_stmtContext.class,0);
		}
		public Resignal_stmtContext resignal_stmt() {
			return getRuleContext(Resignal_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Rollback_stmtContext rollback_stmt() {
			return getRuleContext(Rollback_stmtContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Signal_stmtContext signal_stmt() {
			return getRuleContext(Signal_stmtContext.class,0);
		}
		public Summary_stmtContext summary_stmt() {
			return getRuleContext(Summary_stmtContext.class,0);
		}
		public Update_stmtContext update_stmt() {
			return getRuleContext(Update_stmtContext.class,0);
		}
		public Use_stmtContext use_stmt() {
			return getRuleContext(Use_stmtContext.class,0);
		}
		public Truncate_stmtContext truncate_stmt() {
			return getRuleContext(Truncate_stmtContext.class,0);
		}
		public Values_into_stmtContext values_into_stmt() {
			return getRuleContext(Values_into_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public HiveContext hive() {
			return getRuleContext(HiveContext.class,0);
		}
		public HostContext host() {
			return getRuleContext(HostContext.class,0);
		}
		public Null_stmtContext null_stmt() {
			return getRuleContext(Null_stmtContext.class,0);
		}
		public Expr_stmtContext expr_stmt() {
			return getRuleContext(Expr_stmtContext.class,0);
		}
		public Semicolon_stmtContext semicolon_stmt() {
			return getRuleContext(Semicolon_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stmt);
		try {
			setState(566);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(505);
				assignment_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(506);
				allocate_cursor_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(507);
				alter_table_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(508);
				associate_locator_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(509);
				begin_transaction_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(510);
				break_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(511);
				call_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(512);
				collect_stats_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(513);
				close_stmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(514);
				cmp_stmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(515);
				copy_from_local_stmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(516);
				copy_stmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(517);
				commit_stmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(518);
				create_database_stmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(519);
				create_function_stmt();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(520);
				create_index_stmt();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(521);
				create_local_temp_table_stmt();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(522);
				create_package_stmt();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(523);
				create_package_body_stmt();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(524);
				create_procedure_stmt();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(525);
				create_table_stmt();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(526);
				declare_stmt();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(527);
				delete_stmt();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(528);
				describe_stmt();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(529);
				drop_stmt();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(530);
				end_transaction_stmt();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(531);
				exec_stmt();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(532);
				exit_stmt();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(533);
				fetch_stmt();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(534);
				for_cursor_stmt();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(535);
				for_range_stmt();
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(536);
				if_stmt();
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(537);
				include_stmt();
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(538);
				insert_stmt();
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(539);
				insert_directory_stmt();
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(540);
				get_diag_stmt();
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(541);
				grant_stmt();
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(542);
				leave_stmt();
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(543);
				map_object_stmt();
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(544);
				merge_stmt();
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(545);
				open_stmt();
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(546);
				print_stmt();
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(547);
				quit_stmt();
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(548);
				raise_stmt();
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(549);
				resignal_stmt();
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 46);
				{
				setState(550);
				return_stmt();
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 47);
				{
				setState(551);
				rollback_stmt();
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 48);
				{
				setState(552);
				select_stmt();
				}
				break;
			case 49:
				enterOuterAlt(_localctx, 49);
				{
				setState(553);
				signal_stmt();
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 50);
				{
				setState(554);
				summary_stmt();
				}
				break;
			case 51:
				enterOuterAlt(_localctx, 51);
				{
				setState(555);
				update_stmt();
				}
				break;
			case 52:
				enterOuterAlt(_localctx, 52);
				{
				setState(556);
				use_stmt();
				}
				break;
			case 53:
				enterOuterAlt(_localctx, 53);
				{
				setState(557);
				truncate_stmt();
				}
				break;
			case 54:
				enterOuterAlt(_localctx, 54);
				{
				setState(558);
				values_into_stmt();
				}
				break;
			case 55:
				enterOuterAlt(_localctx, 55);
				{
				setState(559);
				while_stmt();
				}
				break;
			case 56:
				enterOuterAlt(_localctx, 56);
				{
				setState(560);
				label();
				}
				break;
			case 57:
				enterOuterAlt(_localctx, 57);
				{
				setState(561);
				hive();
				}
				break;
			case 58:
				enterOuterAlt(_localctx, 58);
				{
				setState(562);
				host();
				}
				break;
			case 59:
				enterOuterAlt(_localctx, 59);
				{
				setState(563);
				null_stmt();
				}
				break;
			case 60:
				enterOuterAlt(_localctx, 60);
				{
				setState(564);
				expr_stmt();
				}
				break;
			case 61:
				enterOuterAlt(_localctx, 61);
				{
				setState(565);
				semicolon_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Semicolon_stmtContext extends ParserRuleContext {
		public TerminalNode T_SEMICOLON() { return getToken(HiveSqlParser.T_SEMICOLON, 0); }
		public TerminalNode T_DIV() { return getToken(HiveSqlParser.T_DIV, 0); }
		public Semicolon_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semicolon_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterSemicolon_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitSemicolon_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitSemicolon_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Semicolon_stmtContext semicolon_stmt() throws RecognitionException {
		Semicolon_stmtContext _localctx = new Semicolon_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_semicolon_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1 || _la==T_DIV || _la==T_SEMICOLON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exception_blockContext extends ParserRuleContext {
		public TerminalNode T_EXCEPTION() { return getToken(HiveSqlParser.T_EXCEPTION, 0); }
		public List<Exception_block_itemContext> exception_block_item() {
			return getRuleContexts(Exception_block_itemContext.class);
		}
		public Exception_block_itemContext exception_block_item(int i) {
			return getRuleContext(Exception_block_itemContext.class,i);
		}
		public Exception_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterException_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitException_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitException_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exception_blockContext exception_block() throws RecognitionException {
		Exception_blockContext _localctx = new Exception_blockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_exception_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			match(T_EXCEPTION);
			setState(572); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(571);
					exception_block_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(574); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exception_block_itemContext extends ParserRuleContext {
		public List<TerminalNode> T_WHEN() { return getTokens(HiveSqlParser.T_WHEN); }
		public TerminalNode T_WHEN(int i) {
			return getToken(HiveSqlParser.T_WHEN, i);
		}
		public TerminalNode L_ID() { return getToken(HiveSqlParser.L_ID, 0); }
		public TerminalNode T_THEN() { return getToken(HiveSqlParser.T_THEN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(HiveSqlParser.T_END, 0); }
		public Exception_block_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception_block_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterException_block_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitException_block_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitException_block_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exception_block_itemContext exception_block_item() throws RecognitionException {
		Exception_block_itemContext _localctx = new Exception_block_itemContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exception_block_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			match(T_WHEN);
			setState(577);
			match(L_ID);
			setState(578);
			match(T_THEN);
			setState(579);
			block();
			setState(580);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T_END || _la==T_WHEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Null_stmtContext extends ParserRuleContext {
		public TerminalNode T_NULL() { return getToken(HiveSqlParser.T_NULL, 0); }
		public Null_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterNull_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitNull_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitNull_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Null_stmtContext null_stmt() throws RecognitionException {
		Null_stmtContext _localctx = new Null_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_null_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			match(T_NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterExpr_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitExpr_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitExpr_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_stmtContext expr_stmt() throws RecognitionException {
		Expr_stmtContext _localctx = new Expr_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("GO"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"GO\")");
			setState(585);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assignment_stmtContext extends ParserRuleContext {
		public TerminalNode T_SET() { return getToken(HiveSqlParser.T_SET, 0); }
		public Set_session_optionContext set_session_option() {
			return getRuleContext(Set_session_optionContext.class,0);
		}
		public List<Assignment_stmt_itemContext> assignment_stmt_item() {
			return getRuleContexts(Assignment_stmt_itemContext.class);
		}
		public Assignment_stmt_itemContext assignment_stmt_item(int i) {
			return getRuleContext(Assignment_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HiveSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveSqlParser.T_COMMA, i);
		}
		public Assignment_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterAssignment_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitAssignment_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitAssignment_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmtContext assignment_stmt() throws RecognitionException {
		Assignment_stmtContext _localctx = new Assignment_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignment_stmt);
		try {
			int _alt;
			setState(600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(587);
				match(T_SET);
				setState(588);
				set_session_option();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(590);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(589);
					match(T_SET);
					}
					break;
				}
				setState(592);
				assignment_stmt_item();
				setState(597);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(593);
						match(T_COMMA);
						setState(594);
						assignment_stmt_item();
						}
						} 
					}
					setState(599);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assignment_stmt_itemContext extends ParserRuleContext {
		public Assignment_stmt_single_itemContext assignment_stmt_single_item() {
			return getRuleContext(Assignment_stmt_single_itemContext.class,0);
		}
		public Assignment_stmt_multiple_itemContext assignment_stmt_multiple_item() {
			return getRuleContext(Assignment_stmt_multiple_itemContext.class,0);
		}
		public Assignment_stmt_select_itemContext assignment_stmt_select_item() {
			return getRuleContext(Assignment_stmt_select_itemContext.class,0);
		}
		public Assignment_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterAssignment_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitAssignment_stmt_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitAssignment_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmt_itemContext assignment_stmt_item() throws RecognitionException {
		Assignment_stmt_itemContext _localctx = new Assignment_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignment_stmt_item);
		try {
			setState(605);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(602);
				assignment_stmt_single_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(603);
				assignment_stmt_multiple_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(604);
				assignment_stmt_select_item();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assignment_stmt_single_itemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(HiveSqlParser.T_EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_COLON() { return getToken(HiveSqlParser.T_COLON, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveSqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HiveSqlParser.T_CLOSE_P, 0); }
		public Assignment_stmt_single_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt_single_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterAssignment_stmt_single_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitAssignment_stmt_single_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitAssignment_stmt_single_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmt_single_itemContext assignment_stmt_single_item() throws RecognitionException {
		Assignment_stmt_single_itemContext _localctx = new Assignment_stmt_single_itemContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignment_stmt_single_item);
		int _la;
		try {
			setState(623);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case T_SUB:
			case L_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(607);
				ident();
				setState(609);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(608);
					match(T_COLON);
					}
				}

				setState(611);
				match(T_EQUAL);
				setState(612);
				expr(0);
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(614);
				match(T_OPEN_P);
				setState(615);
				ident();
				setState(616);
				match(T_CLOSE_P);
				setState(618);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(617);
					match(T_COLON);
					}
				}

				setState(620);
				match(T_EQUAL);
				setState(621);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assignment_stmt_multiple_itemContext extends ParserRuleContext {
		public List<TerminalNode> T_OPEN_P() { return getTokens(HiveSqlParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(HiveSqlParser.T_OPEN_P, i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(HiveSqlParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(HiveSqlParser.T_CLOSE_P, i);
		}
		public TerminalNode T_EQUAL() { return getToken(HiveSqlParser.T_EQUAL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HiveSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveSqlParser.T_COMMA, i);
		}
		public TerminalNode T_COLON() { return getToken(HiveSqlParser.T_COLON, 0); }
		public Assignment_stmt_multiple_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt_multiple_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterAssignment_stmt_multiple_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitAssignment_stmt_multiple_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitAssignment_stmt_multiple_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmt_multiple_itemContext assignment_stmt_multiple_item() throws RecognitionException {
		Assignment_stmt_multiple_itemContext _localctx = new Assignment_stmt_multiple_itemContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignment_stmt_multiple_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			match(T_OPEN_P);
			setState(626);
			ident();
			setState(631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(627);
				match(T_COMMA);
				setState(628);
				ident();
				}
				}
				setState(633);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(634);
			match(T_CLOSE_P);
			setState(636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COLON) {
				{
				setState(635);
				match(T_COLON);
				}
			}

			setState(638);
			match(T_EQUAL);
			setState(639);
			match(T_OPEN_P);
			setState(640);
			expr(0);
			setState(645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(641);
				match(T_COMMA);
				setState(642);
				expr(0);
				}
				}
				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(648);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assignment_stmt_select_itemContext extends ParserRuleContext {
		public TerminalNode T_EQUAL() { return getToken(HiveSqlParser.T_EQUAL, 0); }
		public List<TerminalNode> T_OPEN_P() { return getTokens(HiveSqlParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(HiveSqlParser.T_OPEN_P, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(HiveSqlParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(HiveSqlParser.T_CLOSE_P, i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_COLON() { return getToken(HiveSqlParser.T_COLON, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HiveSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveSqlParser.T_COMMA, i);
		}
		public Assignment_stmt_select_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt_select_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterAssignment_stmt_select_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitAssignment_stmt_select_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitAssignment_stmt_select_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmt_select_itemContext assignment_stmt_select_item() throws RecognitionException {
		Assignment_stmt_select_itemContext _localctx = new Assignment_stmt_select_itemContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignment_stmt_select_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case T_SUB:
			case L_ID:
				{
				setState(650);
				ident();
				}
				break;
			case T_OPEN_P:
				{
				{
				setState(651);
				match(T_OPEN_P);
				setState(652);
				ident();
				setState(657);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(653);
					match(T_COMMA);
					setState(654);
					ident();
					}
					}
					setState(659);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(660);
				match(T_CLOSE_P);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COLON) {
				{
				setState(664);
				match(T_COLON);
				}
			}

			setState(667);
			match(T_EQUAL);
			setState(668);
			match(T_OPEN_P);
			setState(669);
			select_stmt();
			setState(670);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Allocate_cursor_stmtContext extends ParserRuleContext {
		public TerminalNode T_ALLOCATE() { return getToken(HiveSqlParser.T_ALLOCATE, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_CURSOR() { return getToken(HiveSqlParser.T_CURSOR, 0); }
		public TerminalNode T_FOR() { return getToken(HiveSqlParser.T_FOR, 0); }
		public TerminalNode T_PROCEDURE() { return getToken(HiveSqlParser.T_PROCEDURE, 0); }
		public TerminalNode T_RESULT() { return getToken(HiveSqlParser.T_RESULT, 0); }
		public TerminalNode T_SET() { return getToken(HiveSqlParser.T_SET, 0); }
		public Allocate_cursor_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allocate_cursor_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterAllocate_cursor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitAllocate_cursor_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitAllocate_cursor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Allocate_cursor_stmtContext allocate_cursor_stmt() throws RecognitionException {
		Allocate_cursor_stmtContext _localctx = new Allocate_cursor_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_allocate_cursor_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			match(T_ALLOCATE);
			setState(673);
			ident();
			setState(674);
			match(T_CURSOR);
			setState(675);
			match(T_FOR);
			setState(679);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_RESULT:
				{
				{
				setState(676);
				match(T_RESULT);
				setState(677);
				match(T_SET);
				}
				}
				break;
			case T_PROCEDURE:
				{
				setState(678);
				match(T_PROCEDURE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(681);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Associate_locator_stmtContext extends ParserRuleContext {
		public TerminalNode T_ASSOCIATE() { return getToken(HiveSqlParser.T_ASSOCIATE, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveSqlParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveSqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_WITH() { return getToken(HiveSqlParser.T_WITH, 0); }
		public TerminalNode T_PROCEDURE() { return getToken(HiveSqlParser.T_PROCEDURE, 0); }
		public TerminalNode T_LOCATOR() { return getToken(HiveSqlParser.T_LOCATOR, 0); }
		public TerminalNode T_LOCATORS() { return getToken(HiveSqlParser.T_LOCATORS, 0); }
		public TerminalNode T_RESULT() { return getToken(HiveSqlParser.T_RESULT, 0); }
		public TerminalNode T_SET() { return getToken(HiveSqlParser.T_SET, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HiveSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveSqlParser.T_COMMA, i);
		}
		public Associate_locator_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associate_locator_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterAssociate_locator_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitAssociate_locator_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitAssociate_locator_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Associate_locator_stmtContext associate_locator_stmt() throws RecognitionException {
		Associate_locator_stmtContext _localctx = new Associate_locator_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_associate_locator_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			match(T_ASSOCIATE);
			setState(686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_RESULT) {
				{
				setState(684);
				match(T_RESULT);
				setState(685);
				match(T_SET);
				}
			}

			setState(688);
			_la = _input.LA(1);
			if ( !(_la==T_LOCATOR || _la==T_LOCATORS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(689);
			match(T_OPEN_P);
			setState(690);
			ident();
			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(691);
				match(T_COMMA);
				setState(692);
				ident();
				}
				}
				setState(697);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(698);
			match(T_CLOSE_P);
			setState(699);
			match(T_WITH);
			setState(700);
			match(T_PROCEDURE);
			setState(701);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Begin_transaction_stmtContext extends ParserRuleContext {
		public TerminalNode T_BEGIN() { return getToken(HiveSqlParser.T_BEGIN, 0); }
		public TerminalNode T_TRANSACTION() { return getToken(HiveSqlParser.T_TRANSACTION, 0); }
		public Begin_transaction_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_transaction_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterBegin_transaction_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitBegin_transaction_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitBegin_transaction_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Begin_transaction_stmtContext begin_transaction_stmt() throws RecognitionException {
		Begin_transaction_stmtContext _localctx = new Begin_transaction_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_begin_transaction_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			match(T_BEGIN);
			setState(704);
			match(T_TRANSACTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Break_stmtContext extends ParserRuleContext {
		public TerminalNode T_BREAK() { return getToken(HiveSqlParser.T_BREAK, 0); }
		public Break_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterBreak_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitBreak_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitBreak_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_stmtContext break_stmt() throws RecognitionException {
		Break_stmtContext _localctx = new Break_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_break_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			match(T_BREAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Call_stmtContext extends ParserRuleContext {
		public TerminalNode T_CALL() { return getToken(HiveSqlParser.T_CALL, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HiveSqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HiveSqlParser.T_CLOSE_P, 0); }
		public Expr_func_paramsContext expr_func_params() {
			return getRuleContext(Expr_func_paramsContext.class,0);
		}
		public Call_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCall_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCall_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCall_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_stmtContext call_stmt() throws RecognitionException {
		Call_stmtContext _localctx = new Call_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_call_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			match(T_CALL);
			setState(709);
			ident();
			setState(716);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(710);
				match(T_OPEN_P);
				setState(712);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(711);
					expr_func_params();
					}
					break;
				}
				setState(714);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(715);
				expr_func_params();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declare_stmtContext extends ParserRuleContext {
		public TerminalNode T_DECLARE() { return getToken(HiveSqlParser.T_DECLARE, 0); }
		public List<Declare_stmt_itemContext> declare_stmt_item() {
			return getRuleContexts(Declare_stmt_itemContext.class);
		}
		public Declare_stmt_itemContext declare_stmt_item(int i) {
			return getRuleContext(Declare_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HiveSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveSqlParser.T_COMMA, i);
		}
		public Declare_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterDeclare_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitDeclare_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitDeclare_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_stmtContext declare_stmt() throws RecognitionException {
		Declare_stmtContext _localctx = new Declare_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_declare_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			match(T_DECLARE);
			setState(719);
			declare_stmt_item();
			setState(724);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(720);
					match(T_COMMA);
					setState(721);
					declare_stmt_item();
					}
					} 
				}
				setState(726);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declare_blockContext extends ParserRuleContext {
		public TerminalNode T_DECLARE() { return getToken(HiveSqlParser.T_DECLARE, 0); }
		public List<Declare_stmt_itemContext> declare_stmt_item() {
			return getRuleContexts(Declare_stmt_itemContext.class);
		}
		public Declare_stmt_itemContext declare_stmt_item(int i) {
			return getRuleContext(Declare_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(HiveSqlParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(HiveSqlParser.T_SEMICOLON, i);
		}
		public Declare_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterDeclare_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitDeclare_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitDeclare_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_blockContext declare_block() throws RecognitionException {
		Declare_blockContext _localctx = new Declare_blockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_declare_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			match(T_DECLARE);
			setState(728);
			declare_stmt_item();
			setState(729);
			match(T_SEMICOLON);
			setState(735);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(730);
					declare_stmt_item();
					setState(731);
					match(T_SEMICOLON);
					}
					} 
				}
				setState(737);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declare_block_inplaceContext extends ParserRuleContext {
		public List<Declare_stmt_itemContext> declare_stmt_item() {
			return getRuleContexts(Declare_stmt_itemContext.class);
		}
		public Declare_stmt_itemContext declare_stmt_item(int i) {
			return getRuleContext(Declare_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(HiveSqlParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(HiveSqlParser.T_SEMICOLON, i);
		}
		public Declare_block_inplaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_block_inplace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterDeclare_block_inplace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitDeclare_block_inplace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitDeclare_block_inplace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_block_inplaceContext declare_block_inplace() throws RecognitionException {
		Declare_block_inplaceContext _localctx = new Declare_block_inplaceContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_declare_block_inplace);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			declare_stmt_item();
			setState(739);
			match(T_SEMICOLON);
			setState(745);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(740);
					declare_stmt_item();
					setState(741);
					match(T_SEMICOLON);
					}
					} 
				}
				setState(747);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declare_stmt_itemContext extends ParserRuleContext {
		public Declare_cursor_itemContext declare_cursor_item() {
			return getRuleContext(Declare_cursor_itemContext.class,0);
		}
		public Declare_condition_itemContext declare_condition_item() {
			return getRuleContext(Declare_condition_itemContext.class,0);
		}
		public Declare_handler_itemContext declare_handler_item() {
			return getRuleContext(Declare_handler_itemContext.class,0);
		}
		public Declare_var_itemContext declare_var_item() {
			return getRuleContext(Declare_var_itemContext.class,0);
		}
		public Declare_temporary_table_itemContext declare_temporary_table_item() {
			return getRuleContext(Declare_temporary_table_itemContext.class,0);
		}
		public Declare_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterDeclare_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitDeclare_stmt_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitDeclare_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_stmt_itemContext declare_stmt_item() throws RecognitionException {
		Declare_stmt_itemContext _localctx = new Declare_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_declare_stmt_item);
		try {
			setState(753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(748);
				declare_cursor_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(749);
				declare_condition_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(750);
				declare_handler_item();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(751);
				declare_var_item();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(752);
				declare_temporary_table_item();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declare_var_itemContext extends ParserRuleContext {
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HiveSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveSqlParser.T_COMMA, i);
		}
		public TerminalNode T_AS() { return getToken(HiveSqlParser.T_AS, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public List<Dtype_attrContext> dtype_attr() {
			return getRuleContexts(Dtype_attrContext.class);
		}
		public Dtype_attrContext dtype_attr(int i) {
			return getRuleContext(Dtype_attrContext.class,i);
		}
		public Dtype_defaultContext dtype_default() {
			return getRuleContext(Dtype_defaultContext.class,0);
		}
		public TerminalNode T_CONSTANT() { return getToken(HiveSqlParser.T_CONSTANT, 0); }
		public Declare_var_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_var_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterDeclare_var_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitDeclare_var_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitDeclare_var_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_var_itemContext declare_var_item() throws RecognitionException {
		Declare_var_itemContext _localctx = new Declare_var_itemContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_declare_var_item);
		int _la;
		try {
			int _alt;
			setState(790);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(755);
				ident();
				setState(760);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(756);
					match(T_COMMA);
					setState(757);
					ident();
					}
					}
					setState(762);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(764);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(763);
					match(T_AS);
					}
					break;
				}
				setState(766);
				dtype();
				setState(768);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(767);
					dtype_len();
					}
					break;
				}
				setState(773);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(770);
						dtype_attr();
						}
						} 
					}
					setState(775);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				setState(777);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(776);
					dtype_default();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(779);
				ident();
				setState(780);
				match(T_CONSTANT);
				setState(782);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(781);
					match(T_AS);
					}
					break;
				}
				setState(784);
				dtype();
				setState(786);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(785);
					dtype_len();
					}
				}

				setState(788);
				dtype_default();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declare_condition_itemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_CONDITION() { return getToken(HiveSqlParser.T_CONDITION, 0); }
		public Declare_condition_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_condition_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterDeclare_condition_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitDeclare_condition_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitDeclare_condition_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_condition_itemContext declare_condition_item() throws RecognitionException {
		Declare_condition_itemContext _localctx = new Declare_condition_itemContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_declare_condition_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(792);
			ident();
			setState(793);
			match(T_CONDITION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declare_cursor_itemContext extends ParserRuleContext {
		public TerminalNode T_IS() { return getToken(HiveSqlParser.T_IS, 0); }
		public TerminalNode T_AS() { return getToken(HiveSqlParser.T_AS, 0); }
		public TerminalNode T_FOR() { return getToken(HiveSqlParser.T_FOR, 0); }
		public TerminalNode T_CURSOR() { return getToken(HiveSqlParser.T_CURSOR, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Cursor_with_returnContext cursor_with_return() {
			return getRuleContext(Cursor_with_returnContext.class,0);
		}
		public Cursor_without_returnContext cursor_without_return() {
			return getRuleContext(Cursor_without_returnContext.class,0);
		}
		public Declare_cursor_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_cursor_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterDeclare_cursor_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitDeclare_cursor_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitDeclare_cursor_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_cursor_itemContext declare_cursor_item() throws RecognitionException {
		Declare_cursor_itemContext _localctx = new Declare_cursor_itemContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_declare_cursor_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(795);
				match(T_CURSOR);
				setState(796);
				ident();
				}
				break;
			case 2:
				{
				setState(797);
				ident();
				setState(798);
				match(T_CURSOR);
				}
				break;
			}
			setState(804);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_WITH:
				{
				setState(802);
				cursor_with_return();
				}
				break;
			case T_WITHOUT:
				{
				setState(803);
				cursor_without_return();
				}
				break;
			case T_AS:
			case T_FOR:
			case T_IS:
				break;
			default:
				break;
			}
			setState(806);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_FOR || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(809);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(807);
				select_stmt();
				}
				break;
			case 2:
				{
				setState(808);
				expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cursor_with_returnContext extends ParserRuleContext {
		public TerminalNode T_WITH() { return getToken(HiveSqlParser.T_WITH, 0); }
		public TerminalNode T_RETURN() { return getToken(HiveSqlParser.T_RETURN, 0); }
		public TerminalNode T_ONLY() { return getToken(HiveSqlParser.T_ONLY, 0); }
		public TerminalNode T_TO() { return getToken(HiveSqlParser.T_TO, 0); }
		public TerminalNode T_CALLER() { return getToken(HiveSqlParser.T_CALLER, 0); }
		public TerminalNode T_CLIENT() { return getToken(HiveSqlParser.T_CLIENT, 0); }
		public Cursor_with_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_with_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCursor_with_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCursor_with_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCursor_with_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cursor_with_returnContext cursor_with_return() throws RecognitionException {
		Cursor_with_returnContext _localctx = new Cursor_with_returnContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_cursor_with_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			match(T_WITH);
			setState(812);
			match(T_RETURN);
			setState(814);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ONLY) {
				{
				setState(813);
				match(T_ONLY);
				}
			}

			setState(818);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_TO) {
				{
				setState(816);
				match(T_TO);
				setState(817);
				_la = _input.LA(1);
				if ( !(_la==T_CALLER || _la==T_CLIENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cursor_without_returnContext extends ParserRuleContext {
		public TerminalNode T_WITHOUT() { return getToken(HiveSqlParser.T_WITHOUT, 0); }
		public TerminalNode T_RETURN() { return getToken(HiveSqlParser.T_RETURN, 0); }
		public Cursor_without_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_without_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCursor_without_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCursor_without_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCursor_without_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cursor_without_returnContext cursor_without_return() throws RecognitionException {
		Cursor_without_returnContext _localctx = new Cursor_without_returnContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_cursor_without_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
			match(T_WITHOUT);
			setState(821);
			match(T_RETURN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declare_handler_itemContext extends ParserRuleContext {
		public TerminalNode T_HANDLER() { return getToken(HiveSqlParser.T_HANDLER, 0); }
		public TerminalNode T_FOR() { return getToken(HiveSqlParser.T_FOR, 0); }
		public Single_block_stmtContext single_block_stmt() {
			return getRuleContext(Single_block_stmtContext.class,0);
		}
		public TerminalNode T_CONTINUE() { return getToken(HiveSqlParser.T_CONTINUE, 0); }
		public TerminalNode T_EXIT() { return getToken(HiveSqlParser.T_EXIT, 0); }
		public TerminalNode T_SQLEXCEPTION() { return getToken(HiveSqlParser.T_SQLEXCEPTION, 0); }
		public TerminalNode T_SQLWARNING() { return getToken(HiveSqlParser.T_SQLWARNING, 0); }
		public TerminalNode T_NOT() { return getToken(HiveSqlParser.T_NOT, 0); }
		public TerminalNode T_FOUND() { return getToken(HiveSqlParser.T_FOUND, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Declare_handler_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_handler_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterDeclare_handler_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitDeclare_handler_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitDeclare_handler_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_handler_itemContext declare_handler_item() throws RecognitionException {
		Declare_handler_itemContext _localctx = new Declare_handler_itemContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_declare_handler_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			_la = _input.LA(1);
			if ( !(_la==T_CONTINUE || _la==T_EXIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(824);
			match(T_HANDLER);
			setState(825);
			match(T_FOR);
			setState(831);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(826);
				match(T_SQLEXCEPTION);
				}
				break;
			case 2:
				{
				setState(827);
				match(T_SQLWARNING);
				}
				break;
			case 3:
				{
				setState(828);
				match(T_NOT);
				setState(829);
				match(T_FOUND);
				}
				break;
			case 4:
				{
				setState(830);
				ident();
				}
				break;
			}
			setState(833);
			single_block_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declare_temporary_table_itemContext extends ParserRuleContext {
		public TerminalNode T_TEMPORARY() { return getToken(HiveSqlParser.T_TEMPORARY, 0); }
		public TerminalNode T_TABLE() { return getToken(HiveSqlParser.T_TABLE, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_table_definitionContext create_table_definition() {
			return getRuleContext(Create_table_definitionContext.class,0);
		}
		public TerminalNode T_GLOBAL() { return getToken(HiveSqlParser.T_GLOBAL, 0); }
		public Create_table_preoptionsContext create_table_preoptions() {
			return getRuleContext(Create_table_preoptionsContext.class,0);
		}
		public Declare_temporary_table_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_temporary_table_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterDeclare_temporary_table_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitDeclare_temporary_table_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitDeclare_temporary_table_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_temporary_table_itemContext declare_temporary_table_item() throws RecognitionException {
		Declare_temporary_table_itemContext _localctx = new Declare_temporary_table_itemContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_declare_temporary_table_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_GLOBAL) {
				{
				setState(835);
				match(T_GLOBAL);
				}
			}

			setState(838);
			match(T_TEMPORARY);
			setState(839);
			match(T_TABLE);
			setState(840);
			ident();
			setState(842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(841);
				create_table_preoptions();
				}
			}

			setState(844);
			create_table_definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_table_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(HiveSqlParser.T_CREATE, 0); }
		public TerminalNode T_TABLE() { return getToken(HiveSqlParser.T_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Create_table_definitionContext create_table_definition() {
			return getRuleContext(Create_table_definitionContext.class,0);
		}
		public TerminalNode T_IF() { return getToken(HiveSqlParser.T_IF, 0); }
		public TerminalNode T_NOT() { return getToken(HiveSqlParser.T_NOT, 0); }
		public TerminalNode T_EXISTS() { return getToken(HiveSqlParser.T_EXISTS, 0); }
		public Create_table_preoptionsContext create_table_preoptions() {
			return getRuleContext(Create_table_preoptionsContext.class,0);
		}
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCreate_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCreate_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCreate_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			match(T_CREATE);
			setState(847);
			match(T_TABLE);
			setState(851);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(848);
				match(T_IF);
				setState(849);
				match(T_NOT);
				setState(850);
				match(T_EXISTS);
				}
				break;
			}
			setState(853);
			table_name();
			setState(855);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(854);
				create_table_preoptions();
				}
			}

			setState(857);
			create_table_definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_local_temp_table_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(HiveSqlParser.T_CREATE, 0); }
		public TerminalNode T_TABLE() { return getToken(HiveSqlParser.T_TABLE, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_table_definitionContext create_table_definition() {
			return getRuleContext(Create_table_definitionContext.class,0);
		}
		public TerminalNode T_LOCAL() { return getToken(HiveSqlParser.T_LOCAL, 0); }
		public TerminalNode T_TEMPORARY() { return getToken(HiveSqlParser.T_TEMPORARY, 0); }
		public TerminalNode T_VOLATILE() { return getToken(HiveSqlParser.T_VOLATILE, 0); }
		public Create_table_preoptionsContext create_table_preoptions() {
			return getRuleContext(Create_table_preoptionsContext.class,0);
		}
		public TerminalNode T_SET() { return getToken(HiveSqlParser.T_SET, 0); }
		public TerminalNode T_MULTISET() { return getToken(HiveSqlParser.T_MULTISET, 0); }
		public Create_local_temp_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_local_temp_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCreate_local_temp_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCreate_local_temp_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCreate_local_temp_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_local_temp_table_stmtContext create_local_temp_table_stmt() throws RecognitionException {
		Create_local_temp_table_stmtContext _localctx = new Create_local_temp_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_create_local_temp_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
			match(T_CREATE);
			setState(866);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LOCAL:
				{
				setState(860);
				match(T_LOCAL);
				setState(861);
				match(T_TEMPORARY);
				}
				break;
			case T_MULTISET:
			case T_SET:
			case T_VOLATILE:
				{
				setState(863);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_MULTISET || _la==T_SET) {
					{
					setState(862);
					_la = _input.LA(1);
					if ( !(_la==T_MULTISET || _la==T_SET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(865);
				match(T_VOLATILE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(868);
			match(T_TABLE);
			setState(869);
			ident();
			setState(871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(870);
				create_table_preoptions();
				}
			}

			setState(873);
			create_table_definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_table_definitionContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HiveSqlParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveSqlParser.T_CLOSE_P, 0); }
		public Create_table_columnsContext create_table_columns() {
			return getRuleContext(Create_table_columnsContext.class,0);
		}
		public TerminalNode T_LIKE() { return getToken(HiveSqlParser.T_LIKE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Create_table_optionsContext create_table_options() {
			return getRuleContext(Create_table_optionsContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HiveSqlParser.T_AS, 0); }
		public Create_table_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCreate_table_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCreate_table_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCreate_table_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_definitionContext create_table_definition() throws RecognitionException {
		Create_table_definitionContext _localctx = new Create_table_definitionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_create_table_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(892);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(876);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(875);
					match(T_AS);
					}
				}

				setState(878);
				match(T_OPEN_P);
				setState(879);
				select_stmt();
				setState(880);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(883);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(882);
					match(T_AS);
					}
				}

				setState(885);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(886);
				match(T_OPEN_P);
				setState(887);
				create_table_columns();
				setState(888);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				{
				setState(890);
				match(T_LIKE);
				setState(891);
				table_name();
				}
				break;
			}
			setState(895);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(894);
				create_table_options();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_table_columnsContext extends ParserRuleContext {
		public List<Create_table_columns_itemContext> create_table_columns_item() {
			return getRuleContexts(Create_table_columns_itemContext.class);
		}
		public Create_table_columns_itemContext create_table_columns_item(int i) {
			return getRuleContext(Create_table_columns_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HiveSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveSqlParser.T_COMMA, i);
		}
		public Create_table_columnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_columns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCreate_table_columns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCreate_table_columns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCreate_table_columns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_columnsContext create_table_columns() throws RecognitionException {
		Create_table_columnsContext _localctx = new Create_table_columnsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_create_table_columns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(897);
			create_table_columns_item();
			setState(902);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(898);
				match(T_COMMA);
				setState(899);
				create_table_columns_item();
				}
				}
				setState(904);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_table_columns_itemContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public List<Dtype_attrContext> dtype_attr() {
			return getRuleContexts(Dtype_attrContext.class);
		}
		public Dtype_attrContext dtype_attr(int i) {
			return getRuleContext(Dtype_attrContext.class,i);
		}
		public List<Create_table_column_inline_consContext> create_table_column_inline_cons() {
			return getRuleContexts(Create_table_column_inline_consContext.class);
		}
		public Create_table_column_inline_consContext create_table_column_inline_cons(int i) {
			return getRuleContext(Create_table_column_inline_consContext.class,i);
		}
		public TerminalNode T_COMMENT() { return getToken(HiveSqlParser.T_COMMENT, 0); }
		public Column_commentContext column_comment() {
			return getRuleContext(Column_commentContext.class,0);
		}
		public Create_table_column_consContext create_table_column_cons() {
			return getRuleContext(Create_table_column_consContext.class,0);
		}
		public TerminalNode T_CONSTRAINT() { return getToken(HiveSqlParser.T_CONSTRAINT, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_table_columns_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_columns_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCreate_table_columns_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCreate_table_columns_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCreate_table_columns_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_columns_itemContext create_table_columns_item() throws RecognitionException {
		Create_table_columns_itemContext _localctx = new Create_table_columns_itemContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_create_table_columns_item);
		int _la;
		try {
			int _alt;
			setState(931);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(905);
				column_name();
				setState(906);
				dtype();
				setState(908);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(907);
					dtype_len();
					}
				}

				setState(913);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(910);
						dtype_attr();
						}
						} 
					}
					setState(915);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				}
				setState(919);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_AUTO_INCREMENT || (((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 288230376155906049L) != 0 || (((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & 17196646405L) != 0 || (((_la - 299)) & ~0x3f) == 0 && ((1L << (_la - 299)) & 2322168557895681L) != 0) {
					{
					{
					setState(916);
					create_table_column_inline_cons();
					}
					}
					setState(921);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(924);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMENT) {
					{
					setState(922);
					match(T_COMMENT);
					setState(923);
					column_comment();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(928);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CONSTRAINT) {
					{
					setState(926);
					match(T_CONSTRAINT);
					setState(927);
					ident();
					}
				}

				setState(930);
				create_table_column_cons();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Column_commentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_commentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterColumn_comment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitColumn_comment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitColumn_comment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_commentContext column_comment() throws RecognitionException {
		Column_commentContext _localctx = new Column_commentContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_column_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(933);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Column_nameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(935);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_table_column_inline_consContext extends ParserRuleContext {
		public Dtype_defaultContext dtype_default() {
			return getRuleContext(Dtype_defaultContext.class,0);
		}
		public TerminalNode T_NULL() { return getToken(HiveSqlParser.T_NULL, 0); }
		public TerminalNode T_NOT() { return getToken(HiveSqlParser.T_NOT, 0); }
		public TerminalNode T_PRIMARY() { return getToken(HiveSqlParser.T_PRIMARY, 0); }
		public TerminalNode T_KEY() { return getToken(HiveSqlParser.T_KEY, 0); }
		public TerminalNode T_UNIQUE() { return getToken(HiveSqlParser.T_UNIQUE, 0); }
		public TerminalNode T_REFERENCES() { return getToken(HiveSqlParser.T_REFERENCES, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HiveSqlParser.T_OPEN_P, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveSqlParser.T_CLOSE_P, 0); }
		public List<Create_table_fk_actionContext> create_table_fk_action() {
			return getRuleContexts(Create_table_fk_actionContext.class);
		}
		public Create_table_fk_actionContext create_table_fk_action(int i) {
			return getRuleContext(Create_table_fk_actionContext.class,i);
		}
		public TerminalNode T_IDENTITY() { return getToken(HiveSqlParser.T_IDENTITY, 0); }
		public List<TerminalNode> L_INT() { return getTokens(HiveSqlParser.L_INT); }
		public TerminalNode L_INT(int i) {
			return getToken(HiveSqlParser.L_INT, i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HiveSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveSqlParser.T_COMMA, i);
		}
		public TerminalNode T_AUTO_INCREMENT() { return getToken(HiveSqlParser.T_AUTO_INCREMENT, 0); }
		public TerminalNode T_ENABLE() { return getToken(HiveSqlParser.T_ENABLE, 0); }
		public Create_table_column_inline_consContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_column_inline_cons; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCreate_table_column_inline_cons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCreate_table_column_inline_cons(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCreate_table_column_inline_cons(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_column_inline_consContext create_table_column_inline_cons() throws RecognitionException {
		Create_table_column_inline_consContext _localctx = new Create_table_column_inline_consContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_create_table_column_inline_cons);
		int _la;
		try {
			setState(969);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_DEFAULT:
			case T_WITH:
			case T_COLON:
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(937);
				dtype_default();
				}
				break;
			case T_NOT:
			case T_NULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(939);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(938);
					match(T_NOT);
					}
				}

				setState(941);
				match(T_NULL);
				}
				break;
			case T_PRIMARY:
				enterOuterAlt(_localctx, 3);
				{
				setState(942);
				match(T_PRIMARY);
				setState(943);
				match(T_KEY);
				}
				break;
			case T_UNIQUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(944);
				match(T_UNIQUE);
				}
				break;
			case T_REFERENCES:
				enterOuterAlt(_localctx, 5);
				{
				setState(945);
				match(T_REFERENCES);
				setState(946);
				table_name();
				setState(947);
				match(T_OPEN_P);
				setState(948);
				ident();
				setState(949);
				match(T_CLOSE_P);
				setState(953);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_ON) {
					{
					{
					setState(950);
					create_table_fk_action();
					}
					}
					setState(955);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T_IDENTITY:
				enterOuterAlt(_localctx, 6);
				{
				setState(956);
				match(T_IDENTITY);
				setState(957);
				match(T_OPEN_P);
				setState(958);
				match(L_INT);
				setState(963);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(959);
					match(T_COMMA);
					setState(960);
					match(L_INT);
					}
					}
					setState(965);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(966);
				match(T_CLOSE_P);
				}
				break;
			case T_AUTO_INCREMENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(967);
				match(T_AUTO_INCREMENT);
				}
				break;
			case T_ENABLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(968);
				match(T_ENABLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_table_column_consContext extends ParserRuleContext {
		public TerminalNode T_PRIMARY() { return getToken(HiveSqlParser.T_PRIMARY, 0); }
		public TerminalNode T_KEY() { return getToken(HiveSqlParser.T_KEY, 0); }
		public List<TerminalNode> T_OPEN_P() { return getTokens(HiveSqlParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(HiveSqlParser.T_OPEN_P, i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(HiveSqlParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(HiveSqlParser.T_CLOSE_P, i);
		}
		public TerminalNode T_CLUSTERED() { return getToken(HiveSqlParser.T_CLUSTERED, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HiveSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveSqlParser.T_COMMA, i);
		}
		public TerminalNode T_ENABLE() { return getToken(HiveSqlParser.T_ENABLE, 0); }
		public Index_storage_clauseContext index_storage_clause() {
			return getRuleContext(Index_storage_clauseContext.class,0);
		}
		public List<TerminalNode> T_ASC() { return getTokens(HiveSqlParser.T_ASC); }
		public TerminalNode T_ASC(int i) {
			return getToken(HiveSqlParser.T_ASC, i);
		}
		public List<TerminalNode> T_DESC() { return getTokens(HiveSqlParser.T_DESC); }
		public TerminalNode T_DESC(int i) {
			return getToken(HiveSqlParser.T_DESC, i);
		}
		public TerminalNode T_FOREIGN() { return getToken(HiveSqlParser.T_FOREIGN, 0); }
		public TerminalNode T_REFERENCES() { return getToken(HiveSqlParser.T_REFERENCES, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Create_table_fk_actionContext> create_table_fk_action() {
			return getRuleContexts(Create_table_fk_actionContext.class);
		}
		public Create_table_fk_actionContext create_table_fk_action(int i) {
			return getRuleContext(Create_table_fk_actionContext.class,i);
		}
		public Create_table_column_consContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_column_cons; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCreate_table_column_cons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCreate_table_column_cons(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCreate_table_column_cons(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_column_consContext create_table_column_cons() throws RecognitionException {
		Create_table_column_consContext _localctx = new Create_table_column_consContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_create_table_column_cons);
		int _la;
		try {
			setState(1028);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(971);
				match(T_PRIMARY);
				setState(972);
				match(T_KEY);
				setState(974);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CLUSTERED) {
					{
					setState(973);
					match(T_CLUSTERED);
					}
				}

				setState(976);
				match(T_OPEN_P);
				setState(977);
				ident();
				setState(979);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ASC || _la==T_DESC) {
					{
					setState(978);
					_la = _input.LA(1);
					if ( !(_la==T_ASC || _la==T_DESC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(988);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(981);
					match(T_COMMA);
					setState(982);
					ident();
					setState(984);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_ASC || _la==T_DESC) {
						{
						setState(983);
						_la = _input.LA(1);
						if ( !(_la==T_ASC || _la==T_DESC) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					}
					}
					setState(990);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(991);
				match(T_CLOSE_P);
				setState(993);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ENABLE) {
					{
					setState(992);
					match(T_ENABLE);
					}
				}

				setState(996);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_WITH) {
					{
					setState(995);
					index_storage_clause();
					}
				}

				}
				break;
			case T_FOREIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(998);
				match(T_FOREIGN);
				setState(999);
				match(T_KEY);
				setState(1000);
				match(T_OPEN_P);
				setState(1001);
				ident();
				setState(1006);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1002);
					match(T_COMMA);
					setState(1003);
					ident();
					}
					}
					setState(1008);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1009);
				match(T_CLOSE_P);
				setState(1010);
				match(T_REFERENCES);
				setState(1011);
				table_name();
				setState(1012);
				match(T_OPEN_P);
				setState(1013);
				ident();
				setState(1018);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1014);
					match(T_COMMA);
					setState(1015);
					ident();
					}
					}
					setState(1020);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1021);
				match(T_CLOSE_P);
				setState(1025);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_ON) {
					{
					{
					setState(1022);
					create_table_fk_action();
					}
					}
					setState(1027);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_table_fk_actionContext extends ParserRuleContext {
		public TerminalNode T_ON() { return getToken(HiveSqlParser.T_ON, 0); }
		public TerminalNode T_UPDATE() { return getToken(HiveSqlParser.T_UPDATE, 0); }
		public TerminalNode T_DELETE() { return getToken(HiveSqlParser.T_DELETE, 0); }
		public TerminalNode T_NO() { return getToken(HiveSqlParser.T_NO, 0); }
		public TerminalNode T_ACTION() { return getToken(HiveSqlParser.T_ACTION, 0); }
		public TerminalNode T_RESTRICT() { return getToken(HiveSqlParser.T_RESTRICT, 0); }
		public TerminalNode T_SET() { return getToken(HiveSqlParser.T_SET, 0); }
		public TerminalNode T_NULL() { return getToken(HiveSqlParser.T_NULL, 0); }
		public TerminalNode T_DEFAULT() { return getToken(HiveSqlParser.T_DEFAULT, 0); }
		public TerminalNode T_CASCADE() { return getToken(HiveSqlParser.T_CASCADE, 0); }
		public Create_table_fk_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_fk_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCreate_table_fk_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCreate_table_fk_action(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCreate_table_fk_action(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_fk_actionContext create_table_fk_action() throws RecognitionException {
		Create_table_fk_actionContext _localctx = new Create_table_fk_actionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_create_table_fk_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1030);
			match(T_ON);
			setState(1031);
			_la = _input.LA(1);
			if ( !(_la==T_DELETE || _la==T_UPDATE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1040);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(1032);
				match(T_NO);
				setState(1033);
				match(T_ACTION);
				}
				break;
			case 2:
				{
				setState(1034);
				match(T_RESTRICT);
				}
				break;
			case 3:
				{
				setState(1035);
				match(T_SET);
				setState(1036);
				match(T_NULL);
				}
				break;
			case 4:
				{
				setState(1037);
				match(T_SET);
				setState(1038);
				match(T_DEFAULT);
				}
				break;
			case 5:
				{
				setState(1039);
				match(T_CASCADE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_table_preoptionsContext extends ParserRuleContext {
		public List<Create_table_preoptions_itemContext> create_table_preoptions_item() {
			return getRuleContexts(Create_table_preoptions_itemContext.class);
		}
		public Create_table_preoptions_itemContext create_table_preoptions_item(int i) {
			return getRuleContext(Create_table_preoptions_itemContext.class,i);
		}
		public Create_table_preoptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_preoptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCreate_table_preoptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCreate_table_preoptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCreate_table_preoptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_preoptionsContext create_table_preoptions() throws RecognitionException {
		Create_table_preoptionsContext _localctx = new Create_table_preoptionsContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_create_table_preoptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1043); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1042);
				create_table_preoptions_item();
				}
				}
				setState(1045); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_ROW || _la==T_STORED || _la==T_COMMA );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_table_preoptions_itemContext extends ParserRuleContext {
		public TerminalNode T_COMMA() { return getToken(HiveSqlParser.T_COMMA, 0); }
		public Create_table_preoptions_td_itemContext create_table_preoptions_td_item() {
			return getRuleContext(Create_table_preoptions_td_itemContext.class,0);
		}
		public Create_table_options_hive_itemContext create_table_options_hive_item() {
			return getRuleContext(Create_table_options_hive_itemContext.class,0);
		}
		public Create_table_preoptions_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_preoptions_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCreate_table_preoptions_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCreate_table_preoptions_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCreate_table_preoptions_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_preoptions_itemContext create_table_preoptions_item() throws RecognitionException {
		Create_table_preoptions_itemContext _localctx = new Create_table_preoptions_itemContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_create_table_preoptions_item);
		try {
			setState(1050);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1047);
				match(T_COMMA);
				setState(1048);
				create_table_preoptions_td_item();
				}
				break;
			case T_ROW:
			case T_STORED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1049);
				create_table_options_hive_item();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_table_preoptions_td_itemContext extends ParserRuleContext {
		public TerminalNode T_LOG() { return getToken(HiveSqlParser.T_LOG, 0); }
		public TerminalNode T_FALLBACK() { return getToken(HiveSqlParser.T_FALLBACK, 0); }
		public TerminalNode T_NO() { return getToken(HiveSqlParser.T_NO, 0); }
		public Create_table_preoptions_td_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_preoptions_td_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCreate_table_preoptions_td_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCreate_table_preoptions_td_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCreate_table_preoptions_td_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_preoptions_td_itemContext create_table_preoptions_td_item() throws RecognitionException {
		Create_table_preoptions_td_itemContext _localctx = new Create_table_preoptions_td_itemContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_create_table_preoptions_td_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1053);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NO) {
				{
				setState(1052);
				match(T_NO);
				}
			}

			setState(1055);
			_la = _input.LA(1);
			if ( !(_la==T_FALLBACK || _la==T_LOG) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_table_optionsContext extends ParserRuleContext {
		public List<Create_table_options_itemContext> create_table_options_item() {
			return getRuleContexts(Create_table_options_itemContext.class);
		}
		public Create_table_options_itemContext create_table_options_item(int i) {
			return getRuleContext(Create_table_options_itemContext.class,i);
		}
		public Create_table_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCreate_table_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCreate_table_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCreate_table_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_optionsContext create_table_options() throws RecognitionException {
		Create_table_optionsContext _localctx = new Create_table_optionsContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_create_table_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1058); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1057);
					create_table_options_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1060); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_table_options_itemContext extends ParserRuleContext {
		public TerminalNode T_ON() { return getToken(HiveSqlParser.T_ON, 0); }
		public TerminalNode T_COMMIT() { return getToken(HiveSqlParser.T_COMMIT, 0); }
		public TerminalNode T_ROWS() { return getToken(HiveSqlParser.T_ROWS, 0); }
		public TerminalNode T_DELETE() { return getToken(HiveSqlParser.T_DELETE, 0); }
		public TerminalNode T_PRESERVE() { return getToken(HiveSqlParser.T_PRESERVE, 0); }
		public Create_table_options_ora_itemContext create_table_options_ora_item() {
			return getRuleContext(Create_table_options_ora_itemContext.class,0);
		}
		public Create_table_options_db2_itemContext create_table_options_db2_item() {
			return getRuleContext(Create_table_options_db2_itemContext.class,0);
		}
		public Create_table_options_td_itemContext create_table_options_td_item() {
			return getRuleContext(Create_table_options_td_itemContext.class,0);
		}
		public Create_table_options_hive_itemContext create_table_options_hive_item() {
			return getRuleContext(Create_table_options_hive_itemContext.class,0);
		}
		public Create_table_options_mssql_itemContext create_table_options_mssql_item() {
			return getRuleContext(Create_table_options_mssql_itemContext.class,0);
		}
		public Create_table_options_mysql_itemContext create_table_options_mysql_item() {
			return getRuleContext(Create_table_options_mysql_itemContext.class,0);
		}
		public Create_table_options_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCreate_table_options_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCreate_table_options_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCreate_table_options_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_itemContext create_table_options_item() throws RecognitionException {
		Create_table_options_itemContext _localctx = new Create_table_options_itemContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_create_table_options_item);
		int _la;
		try {
			setState(1072);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1062);
				match(T_ON);
				setState(1063);
				match(T_COMMIT);
				setState(1064);
				_la = _input.LA(1);
				if ( !(_la==T_DELETE || _la==T_PRESERVE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1065);
				match(T_ROWS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1066);
				create_table_options_ora_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1067);
				create_table_options_db2_item();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1068);
				create_table_options_td_item();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1069);
				create_table_options_hive_item();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1070);
				create_table_options_mssql_item();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1071);
				create_table_options_mysql_item();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_table_options_ora_itemContext extends ParserRuleContext {
		public TerminalNode T_SEGMENT() { return getToken(HiveSqlParser.T_SEGMENT, 0); }
		public TerminalNode T_CREATION() { return getToken(HiveSqlParser.T_CREATION, 0); }
		public TerminalNode T_IMMEDIATE() { return getToken(HiveSqlParser.T_IMMEDIATE, 0); }
		public TerminalNode T_DEFERRED() { return getToken(HiveSqlParser.T_DEFERRED, 0); }
		public List<TerminalNode> L_INT() { return getTokens(HiveSqlParser.L_INT); }
		public TerminalNode L_INT(int i) {
			return getToken(HiveSqlParser.L_INT, i);
		}
		public TerminalNode T_PCTFREE() { return getToken(HiveSqlParser.T_PCTFREE, 0); }
		public TerminalNode T_PCTUSED() { return getToken(HiveSqlParser.T_PCTUSED, 0); }
		public TerminalNode T_INITRANS() { return getToken(HiveSqlParser.T_INITRANS, 0); }
		public TerminalNode T_MAXTRANS() { return getToken(HiveSqlParser.T_MAXTRANS, 0); }
		public TerminalNode T_NOCOMPRESS() { return getToken(HiveSqlParser.T_NOCOMPRESS, 0); }
		public TerminalNode T_LOGGING() { return getToken(HiveSqlParser.T_LOGGING, 0); }
		public TerminalNode T_NOLOGGING() { return getToken(HiveSqlParser.T_NOLOGGING, 0); }
		public TerminalNode T_STORAGE() { return getToken(HiveSqlParser.T_STORAGE, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveSqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HiveSqlParser.T_CLOSE_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_TABLESPACE() { return getToken(HiveSqlParser.T_TABLESPACE, 0); }
		public Create_table_options_ora_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_ora_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCreate_table_options_ora_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCreate_table_options_ora_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCreate_table_options_ora_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_ora_itemContext create_table_options_ora_item() throws RecognitionException {
		Create_table_options_ora_itemContext _localctx = new Create_table_options_ora_itemContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_create_table_options_ora_item);
		int _la;
		try {
			setState(1092);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEGMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1074);
				match(T_SEGMENT);
				setState(1075);
				match(T_CREATION);
				setState(1076);
				_la = _input.LA(1);
				if ( !(_la==T_DEFERRED || _la==T_IMMEDIATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T_INITRANS:
			case T_MAXTRANS:
			case T_PCTFREE:
			case T_PCTUSED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1077);
				_la = _input.LA(1);
				if ( !(_la==T_INITRANS || _la==T_MAXTRANS || _la==T_PCTFREE || _la==T_PCTUSED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1078);
				match(L_INT);
				}
				break;
			case T_NOCOMPRESS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1079);
				match(T_NOCOMPRESS);
				}
				break;
			case T_LOGGING:
			case T_NOLOGGING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1080);
				_la = _input.LA(1);
				if ( !(_la==T_LOGGING || _la==T_NOLOGGING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T_STORAGE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1081);
				match(T_STORAGE);
				setState(1082);
				match(T_OPEN_P);
				setState(1085); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(1085);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T_ACTION:
					case T_ADD2:
					case T_ALL:
					case T_ALLOCATE:
					case T_ALTER:
					case T_AND:
					case T_ANSI_NULLS:
					case T_ANSI_PADDING:
					case T_AS:
					case T_ASC:
					case T_ASSOCIATE:
					case T_AT:
					case T_AUTO_INCREMENT:
					case T_AVG:
					case T_BATCHSIZE:
					case T_BEGIN:
					case T_BETWEEN:
					case T_BIGINT:
					case T_BINARY_DOUBLE:
					case T_BINARY_FLOAT:
					case T_BIT:
					case T_BODY:
					case T_BREAK:
					case T_BY:
					case T_BYTE:
					case T_CALL:
					case T_CALLER:
					case T_CASCADE:
					case T_CASE:
					case T_CASESPECIFIC:
					case T_CAST:
					case T_CHAR:
					case T_CHARACTER:
					case T_CHARSET:
					case T_CLIENT:
					case T_CLOSE:
					case T_CLUSTERED:
					case T_CMP:
					case T_COLLECT:
					case T_COLLECTION:
					case T_COLUMN:
					case T_COMMENT:
					case T_CONSTANT:
					case T_COMMIT:
					case T_COMPRESS:
					case T_CONCAT:
					case T_CONDITION:
					case T_CONSTRAINT:
					case T_CONTINUE:
					case T_COPY:
					case T_COUNT:
					case T_COUNT_BIG:
					case T_CREATE:
					case T_CREATION:
					case T_CREATOR:
					case T_CS:
					case T_CURRENT:
					case T_CURRENT_SCHEMA:
					case T_CURSOR:
					case T_DATABASE:
					case T_DATA:
					case T_DATE:
					case T_DATETIME:
					case T_DAY:
					case T_DAYS:
					case T_DEC:
					case T_DECIMAL:
					case T_DECLARE:
					case T_DEFAULT:
					case T_DEFERRED:
					case T_DEFINED:
					case T_DEFINER:
					case T_DEFINITION:
					case T_DELETE:
					case T_DELIMITED:
					case T_DELIMITER:
					case T_DESC:
					case T_DESCRIBE:
					case T_DIAGNOSTICS:
					case T_DIR:
					case T_DIRECTORY:
					case T_DISTINCT:
					case T_DISTRIBUTE:
					case T_DO:
					case T_DOUBLE:
					case T_DROP:
					case T_DYNAMIC:
					case T_ENABLE:
					case T_ENGINE:
					case T_ESCAPED:
					case T_EXCEPT:
					case T_EXEC:
					case T_EXECUTE:
					case T_EXCEPTION:
					case T_EXCLUSIVE:
					case T_EXISTS:
					case T_EXIT:
					case T_FALLBACK:
					case T_FALSE:
					case T_FETCH:
					case T_FIELDS:
					case T_FILE:
					case T_FILES:
					case T_FLOAT:
					case T_FOR:
					case T_FOREIGN:
					case T_FORMAT:
					case T_FOUND:
					case T_FROM:
					case T_FULL:
					case T_FUNCTION:
					case T_GET:
					case T_GLOBAL:
					case T_GO:
					case T_GRANT:
					case T_GROUP:
					case T_HANDLER:
					case T_HASH:
					case T_HAVING:
					case T_HDFS:
					case T_HIVE:
					case T_HOST:
					case T_IDENTITY:
					case T_IF:
					case T_IGNORE:
					case T_IMMEDIATE:
					case T_IN:
					case T_INCLUDE:
					case T_INDEX:
					case T_INITRANS:
					case T_INNER:
					case T_INOUT:
					case T_INSERT:
					case T_INT:
					case T_INT2:
					case T_INT4:
					case T_INT8:
					case T_INTEGER:
					case T_INTERSECT:
					case T_INTERVAL:
					case T_INTO:
					case T_INVOKER:
					case T_IS:
					case T_ISOPEN:
					case T_ITEMS:
					case T_JOIN:
					case T_KEEP:
					case T_KEY:
					case T_KEYS:
					case T_LANGUAGE:
					case T_LEAVE:
					case T_LEFT:
					case T_LIKE:
					case T_LIMIT:
					case T_LINES:
					case T_LOCAL:
					case T_LOCATION:
					case T_LOCATOR:
					case T_LOCATORS:
					case T_LOCKS:
					case T_LOG:
					case T_LOGGED:
					case T_LOGGING:
					case T_LOOP:
					case T_MAP:
					case T_MATCHED:
					case T_MAX:
					case T_MAXTRANS:
					case T_MERGE:
					case T_MESSAGE_TEXT:
					case T_MICROSECOND:
					case T_MICROSECONDS:
					case T_MIN:
					case T_MULTISET:
					case T_NCHAR:
					case T_NEW:
					case T_NVARCHAR:
					case T_NO:
					case T_NOCOUNT:
					case T_NOCOMPRESS:
					case T_NOLOGGING:
					case T_NONE:
					case T_NOT:
					case T_NOTFOUND:
					case T_NUMERIC:
					case T_NUMBER:
					case T_OBJECT:
					case T_OFF:
					case T_ON:
					case T_ONLY:
					case T_OPEN:
					case T_OR:
					case T_ORDER:
					case T_OUT:
					case T_OUTER:
					case T_OVER:
					case T_OVERWRITE:
					case T_OWNER:
					case T_PACKAGE:
					case T_PARTITION:
					case T_PCTFREE:
					case T_PCTUSED:
					case T_PRECISION:
					case T_PRESERVE:
					case T_PRIMARY:
					case T_PRINT:
					case T_PROC:
					case T_PROCEDURE:
					case T_QUALIFY:
					case T_QUERY_BAND:
					case T_QUIT:
					case T_QUOTED_IDENTIFIER:
					case T_RAISE:
					case T_REAL:
					case T_REFERENCES:
					case T_REGEXP:
					case T_REPLACE:
					case T_RESIGNAL:
					case T_RESTRICT:
					case T_RESULT:
					case T_RESULT_SET_LOCATOR:
					case T_RETURN:
					case T_RETURNS:
					case T_REVERSE:
					case T_RIGHT:
					case T_RLIKE:
					case T_ROLE:
					case T_ROLLBACK:
					case T_ROW:
					case T_ROWS:
					case T_ROW_COUNT:
					case T_RR:
					case T_RS:
					case T_PWD:
					case T_TRIM:
					case T_SCHEMA:
					case T_SECOND:
					case T_SECONDS:
					case T_SECURITY:
					case T_SEGMENT:
					case T_SEL:
					case T_SELECT:
					case T_SET:
					case T_SESSION:
					case T_SESSIONS:
					case T_SETS:
					case T_SHARE:
					case T_SIGNAL:
					case T_SIMPLE_DOUBLE:
					case T_SIMPLE_FLOAT:
					case T_SMALLDATETIME:
					case T_SMALLINT:
					case T_SQL:
					case T_SQLEXCEPTION:
					case T_SQLINSERT:
					case T_SQLSTATE:
					case T_SQLWARNING:
					case T_STATS:
					case T_STATISTICS:
					case T_STEP:
					case T_STORAGE:
					case T_STORED:
					case T_STRING:
					case T_SUBDIR:
					case T_SUBSTRING:
					case T_SUM:
					case T_SUMMARY:
					case T_SYS_REFCURSOR:
					case T_TABLE:
					case T_TABLESPACE:
					case T_TEMPORARY:
					case T_TERMINATED:
					case T_TEXTIMAGE_ON:
					case T_THEN:
					case T_TIMESTAMP:
					case T_TITLE:
					case T_TO:
					case T_TOP:
					case T_TRANSACTION:
					case T_TRUE:
					case T_TRUNCATE:
					case T_UNIQUE:
					case T_UPDATE:
					case T_UR:
					case T_USE:
					case T_USING:
					case T_VALUE:
					case T_VALUES:
					case T_VAR:
					case T_VARCHAR:
					case T_VARCHAR2:
					case T_VARYING:
					case T_VOLATILE:
					case T_WHILE:
					case T_WITH:
					case T_WITHOUT:
					case T_WORK:
					case T_XACT_ABORT:
					case T_XML:
					case T_YES:
					case T_ACTIVITY_COUNT:
					case T_CUME_DIST:
					case T_CURRENT_DATE:
					case T_CURRENT_TIMESTAMP:
					case T_CURRENT_USER:
					case T_DENSE_RANK:
					case T_FIRST_VALUE:
					case T_LAG:
					case T_LAST_VALUE:
					case T_LEAD:
					case T_PART_COUNT:
					case T_PART_LOC:
					case T_RANK:
					case T_ROW_NUMBER:
					case T_STDEV:
					case T_SYSDATE:
					case T_VARIANCE:
					case T_USER:
					case T_SUB:
					case L_ID:
						{
						setState(1083);
						ident();
						}
						break;
					case L_INT:
						{
						setState(1084);
						match(L_INT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(1087); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & -67108928L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -24696061953L) != 0 || (((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & -1L) != 0 || (((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & -2251799817879561L) != 0 || (((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & -108093005306528001L) != 0 || (((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & 1337006156088319L) != 0 );
				setState(1089);
				match(T_CLOSE_P);
				}
				break;
			case T_TABLESPACE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1090);
				match(T_TABLESPACE);
				setState(1091);
				ident();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_table_options_db2_itemContext extends ParserRuleContext {
		public TerminalNode T_IN() { return getToken(HiveSqlParser.T_IN, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_INDEX() { return getToken(HiveSqlParser.T_INDEX, 0); }
		public TerminalNode T_WITH() { return getToken(HiveSqlParser.T_WITH, 0); }
		public TerminalNode T_REPLACE() { return getToken(HiveSqlParser.T_REPLACE, 0); }
		public TerminalNode T_DISTRIBUTE() { return getToken(HiveSqlParser.T_DISTRIBUTE, 0); }
		public TerminalNode T_BY() { return getToken(HiveSqlParser.T_BY, 0); }
		public TerminalNode T_HASH() { return getToken(HiveSqlParser.T_HASH, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveSqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HiveSqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HiveSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveSqlParser.T_COMMA, i);
		}
		public TerminalNode T_LOGGED() { return getToken(HiveSqlParser.T_LOGGED, 0); }
		public TerminalNode T_NOT() { return getToken(HiveSqlParser.T_NOT, 0); }
		public TerminalNode T_COMPRESS() { return getToken(HiveSqlParser.T_COMPRESS, 0); }
		public TerminalNode T_YES() { return getToken(HiveSqlParser.T_YES, 0); }
		public TerminalNode T_NO() { return getToken(HiveSqlParser.T_NO, 0); }
		public TerminalNode T_DEFINITION() { return getToken(HiveSqlParser.T_DEFINITION, 0); }
		public TerminalNode T_ONLY() { return getToken(HiveSqlParser.T_ONLY, 0); }
		public TerminalNode T_RESTRICT() { return getToken(HiveSqlParser.T_RESTRICT, 0); }
		public TerminalNode T_ON() { return getToken(HiveSqlParser.T_ON, 0); }
		public TerminalNode T_DROP() { return getToken(HiveSqlParser.T_DROP, 0); }
		public Create_table_options_db2_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_db2_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCreate_table_options_db2_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCreate_table_options_db2_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCreate_table_options_db2_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_db2_itemContext create_table_options_db2_item() throws RecognitionException {
		Create_table_options_db2_itemContext _localctx = new Create_table_options_db2_itemContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_create_table_options_db2_item);
		int _la;
		try {
			setState(1127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1095);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INDEX) {
					{
					setState(1094);
					match(T_INDEX);
					}
				}

				setState(1097);
				match(T_IN);
				setState(1098);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1099);
				match(T_WITH);
				setState(1100);
				match(T_REPLACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1101);
				match(T_DISTRIBUTE);
				setState(1102);
				match(T_BY);
				setState(1103);
				match(T_HASH);
				setState(1104);
				match(T_OPEN_P);
				setState(1105);
				ident();
				setState(1110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1106);
					match(T_COMMA);
					setState(1107);
					ident();
					}
					}
					setState(1112);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1113);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1115);
					match(T_NOT);
					}
				}

				setState(1118);
				match(T_LOGGED);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1119);
				match(T_COMPRESS);
				setState(1120);
				_la = _input.LA(1);
				if ( !(_la==T_NO || _la==T_YES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1121);
				match(T_DEFINITION);
				setState(1122);
				match(T_ONLY);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1123);
				match(T_WITH);
				setState(1124);
				match(T_RESTRICT);
				setState(1125);
				match(T_ON);
				setState(1126);
				match(T_DROP);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_table_options_td_itemContext extends ParserRuleContext {
		public TerminalNode T_PRIMARY() { return getToken(HiveSqlParser.T_PRIMARY, 0); }
		public TerminalNode T_INDEX() { return getToken(HiveSqlParser.T_INDEX, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveSqlParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveSqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_UNIQUE() { return getToken(HiveSqlParser.T_UNIQUE, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HiveSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveSqlParser.T_COMMA, i);
		}
		public TerminalNode T_WITH() { return getToken(HiveSqlParser.T_WITH, 0); }
		public TerminalNode T_DATA() { return getToken(HiveSqlParser.T_DATA, 0); }
		public Create_table_options_td_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_td_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCreate_table_options_td_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCreate_table_options_td_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCreate_table_options_td_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_td_itemContext create_table_options_td_item() throws RecognitionException {
		Create_table_options_td_itemContext _localctx = new Create_table_options_td_itemContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_create_table_options_td_item);
		int _la;
		try {
			setState(1147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PRIMARY:
			case T_UNIQUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_UNIQUE) {
					{
					setState(1129);
					match(T_UNIQUE);
					}
				}

				setState(1132);
				match(T_PRIMARY);
				setState(1133);
				match(T_INDEX);
				setState(1134);
				match(T_OPEN_P);
				setState(1135);
				ident();
				setState(1140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1136);
					match(T_COMMA);
					setState(1137);
					ident();
					}
					}
					setState(1142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1143);
				match(T_CLOSE_P);
				}
				break;
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1145);
				match(T_WITH);
				setState(1146);
				match(T_DATA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_table_options_hive_itemContext extends ParserRuleContext {
		public Create_table_hive_row_formatContext create_table_hive_row_format() {
			return getRuleContext(Create_table_hive_row_formatContext.class,0);
		}
		public TerminalNode T_STORED() { return getToken(HiveSqlParser.T_STORED, 0); }
		public TerminalNode T_AS() { return getToken(HiveSqlParser.T_AS, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_table_options_hive_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_hive_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCreate_table_options_hive_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCreate_table_options_hive_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCreate_table_options_hive_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_hive_itemContext create_table_options_hive_item() throws RecognitionException {
		Create_table_options_hive_itemContext _localctx = new Create_table_options_hive_itemContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_create_table_options_hive_item);
		try {
			setState(1153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(1149);
				create_table_hive_row_format();
				}
				break;
			case T_STORED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1150);
				match(T_STORED);
				setState(1151);
				match(T_AS);
				setState(1152);
				ident();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_table_hive_row_formatContext extends ParserRuleContext {
		public TerminalNode T_ROW() { return getToken(HiveSqlParser.T_ROW, 0); }
		public TerminalNode T_FORMAT() { return getToken(HiveSqlParser.T_FORMAT, 0); }
		public TerminalNode T_DELIMITED() { return getToken(HiveSqlParser.T_DELIMITED, 0); }
		public List<Create_table_hive_row_format_fieldsContext> create_table_hive_row_format_fields() {
			return getRuleContexts(Create_table_hive_row_format_fieldsContext.class);
		}
		public Create_table_hive_row_format_fieldsContext create_table_hive_row_format_fields(int i) {
			return getRuleContext(Create_table_hive_row_format_fieldsContext.class,i);
		}
		public Create_table_hive_row_formatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_hive_row_format; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCreate_table_hive_row_format(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCreate_table_hive_row_format(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCreate_table_hive_row_format(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_hive_row_formatContext create_table_hive_row_format() throws RecognitionException {
		Create_table_hive_row_formatContext _localctx = new Create_table_hive_row_formatContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_create_table_hive_row_format);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1155);
			match(T_ROW);
			setState(1156);
			match(T_FORMAT);
			setState(1157);
			match(T_DELIMITED);
			setState(1161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1158);
					create_table_hive_row_format_fields();
					}
					} 
				}
				setState(1163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_table_hive_row_format_fieldsContext extends ParserRuleContext {
		public TerminalNode T_FIELDS() { return getToken(HiveSqlParser.T_FIELDS, 0); }
		public TerminalNode T_TERMINATED() { return getToken(HiveSqlParser.T_TERMINATED, 0); }
		public List<TerminalNode> T_BY() { return getTokens(HiveSqlParser.T_BY); }
		public TerminalNode T_BY(int i) {
			return getToken(HiveSqlParser.T_BY, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_ESCAPED() { return getToken(HiveSqlParser.T_ESCAPED, 0); }
		public TerminalNode T_COLLECTION() { return getToken(HiveSqlParser.T_COLLECTION, 0); }
		public TerminalNode T_ITEMS() { return getToken(HiveSqlParser.T_ITEMS, 0); }
		public TerminalNode T_MAP() { return getToken(HiveSqlParser.T_MAP, 0); }
		public TerminalNode T_KEYS() { return getToken(HiveSqlParser.T_KEYS, 0); }
		public TerminalNode T_LINES() { return getToken(HiveSqlParser.T_LINES, 0); }
		public TerminalNode T_NULL() { return getToken(HiveSqlParser.T_NULL, 0); }
		public TerminalNode T_DEFINED() { return getToken(HiveSqlParser.T_DEFINED, 0); }
		public TerminalNode T_AS() { return getToken(HiveSqlParser.T_AS, 0); }
		public Create_table_hive_row_format_fieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_hive_row_format_fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCreate_table_hive_row_format_fields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCreate_table_hive_row_format_fields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCreate_table_hive_row_format_fields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_hive_row_format_fieldsContext create_table_hive_row_format_fields() throws RecognitionException {
		Create_table_hive_row_format_fieldsContext _localctx = new Create_table_hive_row_format_fieldsContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_create_table_hive_row_format_fields);
		try {
			setState(1191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_FIELDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1164);
				match(T_FIELDS);
				setState(1165);
				match(T_TERMINATED);
				setState(1166);
				match(T_BY);
				setState(1167);
				expr(0);
				setState(1171);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(1168);
					match(T_ESCAPED);
					setState(1169);
					match(T_BY);
					setState(1170);
					expr(0);
					}
					break;
				}
				}
				break;
			case T_COLLECTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1173);
				match(T_COLLECTION);
				setState(1174);
				match(T_ITEMS);
				setState(1175);
				match(T_TERMINATED);
				setState(1176);
				match(T_BY);
				setState(1177);
				expr(0);
				}
				break;
			case T_MAP:
				enterOuterAlt(_localctx, 3);
				{
				setState(1178);
				match(T_MAP);
				setState(1179);
				match(T_KEYS);
				setState(1180);
				match(T_TERMINATED);
				setState(1181);
				match(T_BY);
				setState(1182);
				expr(0);
				}
				break;
			case T_LINES:
				enterOuterAlt(_localctx, 4);
				{
				setState(1183);
				match(T_LINES);
				setState(1184);
				match(T_TERMINATED);
				setState(1185);
				match(T_BY);
				setState(1186);
				expr(0);
				}
				break;
			case T_NULL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1187);
				match(T_NULL);
				setState(1188);
				match(T_DEFINED);
				setState(1189);
				match(T_AS);
				setState(1190);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_table_options_mssql_itemContext extends ParserRuleContext {
		public TerminalNode T_ON() { return getToken(HiveSqlParser.T_ON, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_TEXTIMAGE_ON() { return getToken(HiveSqlParser.T_TEXTIMAGE_ON, 0); }
		public Create_table_options_mssql_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_mssql_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCreate_table_options_mssql_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCreate_table_options_mssql_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCreate_table_options_mssql_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_mssql_itemContext create_table_options_mssql_item() throws RecognitionException {
		Create_table_options_mssql_itemContext _localctx = new Create_table_options_mssql_itemContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_create_table_options_mssql_item);
		try {
			setState(1197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1193);
				match(T_ON);
				setState(1194);
				ident();
				}
				break;
			case T_TEXTIMAGE_ON:
				enterOuterAlt(_localctx, 2);
				{
				setState(1195);
				match(T_TEXTIMAGE_ON);
				setState(1196);
				ident();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_table_options_mysql_itemContext extends ParserRuleContext {
		public TerminalNode T_AUTO_INCREMENT() { return getToken(HiveSqlParser.T_AUTO_INCREMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(HiveSqlParser.T_EQUAL, 0); }
		public TerminalNode T_COMMENT() { return getToken(HiveSqlParser.T_COMMENT, 0); }
		public TerminalNode T_CHARACTER() { return getToken(HiveSqlParser.T_CHARACTER, 0); }
		public TerminalNode T_SET() { return getToken(HiveSqlParser.T_SET, 0); }
		public TerminalNode T_CHARSET() { return getToken(HiveSqlParser.T_CHARSET, 0); }
		public TerminalNode T_DEFAULT() { return getToken(HiveSqlParser.T_DEFAULT, 0); }
		public TerminalNode T_ENGINE() { return getToken(HiveSqlParser.T_ENGINE, 0); }
		public Create_table_options_mysql_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_mysql_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCreate_table_options_mysql_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCreate_table_options_mysql_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCreate_table_options_mysql_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_mysql_itemContext create_table_options_mysql_item() throws RecognitionException {
		Create_table_options_mysql_itemContext _localctx = new Create_table_options_mysql_itemContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_create_table_options_mysql_item);
		int _la;
		try {
			setState(1226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AUTO_INCREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1199);
				match(T_AUTO_INCREMENT);
				setState(1201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1200);
					match(T_EQUAL);
					}
				}

				setState(1203);
				expr(0);
				}
				break;
			case T_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1204);
				match(T_COMMENT);
				setState(1206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1205);
					match(T_EQUAL);
					}
				}

				setState(1208);
				expr(0);
				}
				break;
			case T_CHARACTER:
			case T_CHARSET:
			case T_DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_DEFAULT) {
					{
					setState(1209);
					match(T_DEFAULT);
					}
				}

				setState(1215);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_CHARACTER:
					{
					setState(1212);
					match(T_CHARACTER);
					setState(1213);
					match(T_SET);
					}
					break;
				case T_CHARSET:
					{
					setState(1214);
					match(T_CHARSET);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1217);
					match(T_EQUAL);
					}
				}

				setState(1220);
				expr(0);
				}
				break;
			case T_ENGINE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1221);
				match(T_ENGINE);
				setState(1223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1222);
					match(T_EQUAL);
					}
				}

				setState(1225);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Alter_table_stmtContext extends ParserRuleContext {
		public TerminalNode T_ALTER() { return getToken(HiveSqlParser.T_ALTER, 0); }
		public TerminalNode T_TABLE() { return getToken(HiveSqlParser.T_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Alter_table_itemContext alter_table_item() {
			return getRuleContext(Alter_table_itemContext.class,0);
		}
		public Alter_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterAlter_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitAlter_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitAlter_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_stmtContext alter_table_stmt() throws RecognitionException {
		Alter_table_stmtContext _localctx = new Alter_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_alter_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1228);
			match(T_ALTER);
			setState(1229);
			match(T_TABLE);
			setState(1230);
			table_name();
			setState(1231);
			alter_table_item();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Alter_table_itemContext extends ParserRuleContext {
		public Alter_table_add_constraintContext alter_table_add_constraint() {
			return getRuleContext(Alter_table_add_constraintContext.class,0);
		}
		public Alter_table_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterAlter_table_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitAlter_table_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitAlter_table_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_itemContext alter_table_item() throws RecognitionException {
		Alter_table_itemContext _localctx = new Alter_table_itemContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_alter_table_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1233);
			alter_table_add_constraint();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Alter_table_add_constraintContext extends ParserRuleContext {
		public TerminalNode T_ADD2() { return getToken(HiveSqlParser.T_ADD2, 0); }
		public Alter_table_add_constraint_itemContext alter_table_add_constraint_item() {
			return getRuleContext(Alter_table_add_constraint_itemContext.class,0);
		}
		public TerminalNode T_CONSTRAINT() { return getToken(HiveSqlParser.T_CONSTRAINT, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Alter_table_add_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_add_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterAlter_table_add_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitAlter_table_add_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitAlter_table_add_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_add_constraintContext alter_table_add_constraint() throws RecognitionException {
		Alter_table_add_constraintContext _localctx = new Alter_table_add_constraintContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_alter_table_add_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1235);
			match(T_ADD2);
			setState(1238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_CONSTRAINT) {
				{
				setState(1236);
				match(T_CONSTRAINT);
				setState(1237);
				ident();
				}
			}

			setState(1240);
			alter_table_add_constraint_item();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Alter_table_add_constraint_itemContext extends ParserRuleContext {
		public TerminalNode T_PRIMARY() { return getToken(HiveSqlParser.T_PRIMARY, 0); }
		public TerminalNode T_KEY() { return getToken(HiveSqlParser.T_KEY, 0); }
		public List<TerminalNode> T_OPEN_P() { return getTokens(HiveSqlParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(HiveSqlParser.T_OPEN_P, i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(HiveSqlParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(HiveSqlParser.T_CLOSE_P, i);
		}
		public TerminalNode T_CLUSTERED() { return getToken(HiveSqlParser.T_CLUSTERED, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HiveSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveSqlParser.T_COMMA, i);
		}
		public TerminalNode T_ENABLE() { return getToken(HiveSqlParser.T_ENABLE, 0); }
		public Index_storage_clauseContext index_storage_clause() {
			return getRuleContext(Index_storage_clauseContext.class,0);
		}
		public List<TerminalNode> T_ASC() { return getTokens(HiveSqlParser.T_ASC); }
		public TerminalNode T_ASC(int i) {
			return getToken(HiveSqlParser.T_ASC, i);
		}
		public List<TerminalNode> T_DESC() { return getTokens(HiveSqlParser.T_DESC); }
		public TerminalNode T_DESC(int i) {
			return getToken(HiveSqlParser.T_DESC, i);
		}
		public TerminalNode T_FOREIGN() { return getToken(HiveSqlParser.T_FOREIGN, 0); }
		public TerminalNode T_REFERENCES() { return getToken(HiveSqlParser.T_REFERENCES, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Create_table_fk_actionContext> create_table_fk_action() {
			return getRuleContexts(Create_table_fk_actionContext.class);
		}
		public Create_table_fk_actionContext create_table_fk_action(int i) {
			return getRuleContext(Create_table_fk_actionContext.class,i);
		}
		public TerminalNode T_DEFAULT() { return getToken(HiveSqlParser.T_DEFAULT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_FOR() { return getToken(HiveSqlParser.T_FOR, 0); }
		public Alter_table_add_constraint_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_add_constraint_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterAlter_table_add_constraint_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitAlter_table_add_constraint_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitAlter_table_add_constraint_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_add_constraint_itemContext alter_table_add_constraint_item() throws RecognitionException {
		Alter_table_add_constraint_itemContext _localctx = new Alter_table_add_constraint_itemContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_alter_table_add_constraint_item);
		int _la;
		try {
			int _alt;
			setState(1304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1242);
				match(T_PRIMARY);
				setState(1243);
				match(T_KEY);
				setState(1245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CLUSTERED) {
					{
					setState(1244);
					match(T_CLUSTERED);
					}
				}

				setState(1247);
				match(T_OPEN_P);
				setState(1248);
				ident();
				setState(1250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ASC || _la==T_DESC) {
					{
					setState(1249);
					_la = _input.LA(1);
					if ( !(_la==T_ASC || _la==T_DESC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1252);
					match(T_COMMA);
					setState(1253);
					ident();
					setState(1255);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_ASC || _la==T_DESC) {
						{
						setState(1254);
						_la = _input.LA(1);
						if ( !(_la==T_ASC || _la==T_DESC) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					}
					}
					setState(1261);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1262);
				match(T_CLOSE_P);
				setState(1264);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(1263);
					match(T_ENABLE);
					}
					break;
				}
				setState(1267);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(1266);
					index_storage_clause();
					}
					break;
				}
				}
				break;
			case T_FOREIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1269);
				match(T_FOREIGN);
				setState(1270);
				match(T_KEY);
				setState(1271);
				match(T_OPEN_P);
				setState(1272);
				ident();
				setState(1277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1273);
					match(T_COMMA);
					setState(1274);
					ident();
					}
					}
					setState(1279);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1280);
				match(T_CLOSE_P);
				setState(1281);
				match(T_REFERENCES);
				setState(1282);
				table_name();
				setState(1283);
				match(T_OPEN_P);
				setState(1284);
				ident();
				setState(1289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1285);
					match(T_COMMA);
					setState(1286);
					ident();
					}
					}
					setState(1291);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1292);
				match(T_CLOSE_P);
				setState(1296);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1293);
						create_table_fk_action();
						}
						} 
					}
					setState(1298);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
				}
				}
				break;
			case T_DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1299);
				match(T_DEFAULT);
				setState(1300);
				expr(0);
				setState(1301);
				match(T_FOR);
				setState(1302);
				ident();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DtypeContext extends ParserRuleContext {
		public TerminalNode T_CHAR() { return getToken(HiveSqlParser.T_CHAR, 0); }
		public TerminalNode T_CHARACTER() { return getToken(HiveSqlParser.T_CHARACTER, 0); }
		public TerminalNode T_BIGINT() { return getToken(HiveSqlParser.T_BIGINT, 0); }
		public TerminalNode T_BINARY_DOUBLE() { return getToken(HiveSqlParser.T_BINARY_DOUBLE, 0); }
		public TerminalNode T_BINARY_FLOAT() { return getToken(HiveSqlParser.T_BINARY_FLOAT, 0); }
		public TerminalNode T_BINARY_INTEGER() { return getToken(HiveSqlParser.T_BINARY_INTEGER, 0); }
		public TerminalNode T_BIT() { return getToken(HiveSqlParser.T_BIT, 0); }
		public TerminalNode T_DATE() { return getToken(HiveSqlParser.T_DATE, 0); }
		public TerminalNode T_DATETIME() { return getToken(HiveSqlParser.T_DATETIME, 0); }
		public TerminalNode T_DEC() { return getToken(HiveSqlParser.T_DEC, 0); }
		public TerminalNode T_DECIMAL() { return getToken(HiveSqlParser.T_DECIMAL, 0); }
		public TerminalNode T_DOUBLE() { return getToken(HiveSqlParser.T_DOUBLE, 0); }
		public TerminalNode T_PRECISION() { return getToken(HiveSqlParser.T_PRECISION, 0); }
		public TerminalNode T_FLOAT() { return getToken(HiveSqlParser.T_FLOAT, 0); }
		public TerminalNode T_INT() { return getToken(HiveSqlParser.T_INT, 0); }
		public TerminalNode T_INT2() { return getToken(HiveSqlParser.T_INT2, 0); }
		public TerminalNode T_INT4() { return getToken(HiveSqlParser.T_INT4, 0); }
		public TerminalNode T_INT8() { return getToken(HiveSqlParser.T_INT8, 0); }
		public TerminalNode T_INTEGER() { return getToken(HiveSqlParser.T_INTEGER, 0); }
		public TerminalNode T_NCHAR() { return getToken(HiveSqlParser.T_NCHAR, 0); }
		public TerminalNode T_NVARCHAR() { return getToken(HiveSqlParser.T_NVARCHAR, 0); }
		public TerminalNode T_NUMBER() { return getToken(HiveSqlParser.T_NUMBER, 0); }
		public TerminalNode T_NUMERIC() { return getToken(HiveSqlParser.T_NUMERIC, 0); }
		public TerminalNode T_PLS_INTEGER() { return getToken(HiveSqlParser.T_PLS_INTEGER, 0); }
		public TerminalNode T_REAL() { return getToken(HiveSqlParser.T_REAL, 0); }
		public TerminalNode T_RESULT_SET_LOCATOR() { return getToken(HiveSqlParser.T_RESULT_SET_LOCATOR, 0); }
		public TerminalNode T_VARYING() { return getToken(HiveSqlParser.T_VARYING, 0); }
		public TerminalNode T_SIMPLE_FLOAT() { return getToken(HiveSqlParser.T_SIMPLE_FLOAT, 0); }
		public TerminalNode T_SIMPLE_DOUBLE() { return getToken(HiveSqlParser.T_SIMPLE_DOUBLE, 0); }
		public TerminalNode T_SIMPLE_INTEGER() { return getToken(HiveSqlParser.T_SIMPLE_INTEGER, 0); }
		public TerminalNode T_SMALLINT() { return getToken(HiveSqlParser.T_SMALLINT, 0); }
		public TerminalNode T_SMALLDATETIME() { return getToken(HiveSqlParser.T_SMALLDATETIME, 0); }
		public TerminalNode T_STRING() { return getToken(HiveSqlParser.T_STRING, 0); }
		public TerminalNode T_SYS_REFCURSOR() { return getToken(HiveSqlParser.T_SYS_REFCURSOR, 0); }
		public TerminalNode T_TIMESTAMP() { return getToken(HiveSqlParser.T_TIMESTAMP, 0); }
		public TerminalNode T_TINYINT() { return getToken(HiveSqlParser.T_TINYINT, 0); }
		public TerminalNode T_VARCHAR() { return getToken(HiveSqlParser.T_VARCHAR, 0); }
		public TerminalNode T_VARCHAR2() { return getToken(HiveSqlParser.T_VARCHAR2, 0); }
		public TerminalNode T_XML() { return getToken(HiveSqlParser.T_XML, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_TYPE() { return getToken(HiveSqlParser.T_TYPE, 0); }
		public TerminalNode T_ROWTYPE() { return getToken(HiveSqlParser.T_ROWTYPE, 0); }
		public DtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterDtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitDtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitDtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DtypeContext dtype() throws RecognitionException {
		DtypeContext _localctx = new DtypeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_dtype);
		int _la;
		try {
			setState(1352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1306);
				match(T_CHAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1307);
				match(T_CHARACTER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1308);
				match(T_BIGINT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1309);
				match(T_BINARY_DOUBLE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1310);
				match(T_BINARY_FLOAT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1311);
				match(T_BINARY_INTEGER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1312);
				match(T_BIT);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1313);
				match(T_DATE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1314);
				match(T_DATETIME);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1315);
				match(T_DEC);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1316);
				match(T_DECIMAL);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1317);
				match(T_DOUBLE);
				setState(1319);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
				case 1:
					{
					setState(1318);
					match(T_PRECISION);
					}
					break;
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1321);
				match(T_FLOAT);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1322);
				match(T_INT);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1323);
				match(T_INT2);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1324);
				match(T_INT4);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1325);
				match(T_INT8);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1326);
				match(T_INTEGER);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1327);
				match(T_NCHAR);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1328);
				match(T_NVARCHAR);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1329);
				match(T_NUMBER);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1330);
				match(T_NUMERIC);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1331);
				match(T_PLS_INTEGER);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1332);
				match(T_REAL);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1333);
				match(T_RESULT_SET_LOCATOR);
				setState(1334);
				match(T_VARYING);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1335);
				match(T_SIMPLE_FLOAT);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1336);
				match(T_SIMPLE_DOUBLE);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1337);
				match(T_SIMPLE_INTEGER);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1338);
				match(T_SMALLINT);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1339);
				match(T_SMALLDATETIME);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1340);
				match(T_STRING);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1341);
				match(T_SYS_REFCURSOR);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1342);
				match(T_TIMESTAMP);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1343);
				match(T_TINYINT);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1344);
				match(T_VARCHAR);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1345);
				match(T_VARCHAR2);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1346);
				match(T_XML);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(1347);
				ident();
				setState(1350);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					setState(1348);
					match(T__2);
					setState(1349);
					_la = _input.LA(1);
					if ( !(_la==T_ROWTYPE || _la==T_TYPE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dtype_lenContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HiveSqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HiveSqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> L_INT() { return getTokens(HiveSqlParser.L_INT); }
		public TerminalNode L_INT(int i) {
			return getToken(HiveSqlParser.L_INT, i);
		}
		public TerminalNode T_MAX() { return getToken(HiveSqlParser.T_MAX, 0); }
		public TerminalNode T_COMMA() { return getToken(HiveSqlParser.T_COMMA, 0); }
		public TerminalNode T_CHAR() { return getToken(HiveSqlParser.T_CHAR, 0); }
		public TerminalNode T_BYTE() { return getToken(HiveSqlParser.T_BYTE, 0); }
		public Dtype_lenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype_len; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterDtype_len(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitDtype_len(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitDtype_len(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dtype_lenContext dtype_len() throws RecognitionException {
		Dtype_lenContext _localctx = new Dtype_lenContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_dtype_len);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1354);
			match(T_OPEN_P);
			setState(1355);
			_la = _input.LA(1);
			if ( !(_la==T_MAX || _la==L_INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_BYTE || _la==T_CHAR) {
				{
				setState(1356);
				_la = _input.LA(1);
				if ( !(_la==T_BYTE || _la==T_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COMMA) {
				{
				setState(1359);
				match(T_COMMA);
				setState(1360);
				match(L_INT);
				}
			}

			setState(1363);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dtype_attrContext extends ParserRuleContext {
		public TerminalNode T_NULL() { return getToken(HiveSqlParser.T_NULL, 0); }
		public TerminalNode T_NOT() { return getToken(HiveSqlParser.T_NOT, 0); }
		public TerminalNode T_CHARACTER() { return getToken(HiveSqlParser.T_CHARACTER, 0); }
		public TerminalNode T_SET() { return getToken(HiveSqlParser.T_SET, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_CASESPECIFIC() { return getToken(HiveSqlParser.T_CASESPECIFIC, 0); }
		public TerminalNode T_CS() { return getToken(HiveSqlParser.T_CS, 0); }
		public Dtype_attrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterDtype_attr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitDtype_attr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitDtype_attr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dtype_attrContext dtype_attr() throws RecognitionException {
		Dtype_attrContext _localctx = new Dtype_attrContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_dtype_attr);
		int _la;
		try {
			setState(1376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1365);
					match(T_NOT);
					}
				}

				setState(1368);
				match(T_NULL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1369);
				match(T_CHARACTER);
				setState(1370);
				match(T_SET);
				setState(1371);
				ident();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1372);
					match(T_NOT);
					}
				}

				setState(1375);
				_la = _input.LA(1);
				if ( !(_la==T_CASESPECIFIC || _la==T_CS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dtype_defaultContext extends ParserRuleContext {
		public TerminalNode T_EQUAL() { return getToken(HiveSqlParser.T_EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_COLON() { return getToken(HiveSqlParser.T_COLON, 0); }
		public TerminalNode T_DEFAULT() { return getToken(HiveSqlParser.T_DEFAULT, 0); }
		public TerminalNode T_WITH() { return getToken(HiveSqlParser.T_WITH, 0); }
		public Dtype_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterDtype_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitDtype_default(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitDtype_default(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dtype_defaultContext dtype_default() throws RecognitionException {
		Dtype_defaultContext _localctx = new Dtype_defaultContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_dtype_default);
		int _la;
		try {
			setState(1390);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COLON:
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(1378);
					match(T_COLON);
					}
				}

				setState(1381);
				match(T_EQUAL);
				setState(1382);
				expr(0);
				}
				break;
			case T_DEFAULT:
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_WITH) {
					{
					setState(1383);
					match(T_WITH);
					}
				}

				setState(1386);
				match(T_DEFAULT);
				setState(1388);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
				case 1:
					{
					setState(1387);
					expr(0);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_database_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(HiveSqlParser.T_CREATE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_DATABASE() { return getToken(HiveSqlParser.T_DATABASE, 0); }
		public TerminalNode T_SCHEMA() { return getToken(HiveSqlParser.T_SCHEMA, 0); }
		public TerminalNode T_IF() { return getToken(HiveSqlParser.T_IF, 0); }
		public TerminalNode T_NOT() { return getToken(HiveSqlParser.T_NOT, 0); }
		public TerminalNode T_EXISTS() { return getToken(HiveSqlParser.T_EXISTS, 0); }
		public List<Create_database_optionContext> create_database_option() {
			return getRuleContexts(Create_database_optionContext.class);
		}
		public Create_database_optionContext create_database_option(int i) {
			return getRuleContext(Create_database_optionContext.class,i);
		}
		public Create_database_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_database_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCreate_database_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCreate_database_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCreate_database_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_database_stmtContext create_database_stmt() throws RecognitionException {
		Create_database_stmtContext _localctx = new Create_database_stmtContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_create_database_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1392);
			match(T_CREATE);
			setState(1393);
			_la = _input.LA(1);
			if ( !(_la==T_DATABASE || _la==T_SCHEMA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				{
				setState(1394);
				match(T_IF);
				setState(1395);
				match(T_NOT);
				setState(1396);
				match(T_EXISTS);
				}
				break;
			}
			setState(1399);
			expr(0);
			setState(1403);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1400);
					create_database_option();
					}
					} 
				}
				setState(1405);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_database_optionContext extends ParserRuleContext {
		public TerminalNode T_COMMENT() { return getToken(HiveSqlParser.T_COMMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_LOCATION() { return getToken(HiveSqlParser.T_LOCATION, 0); }
		public Create_database_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_database_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCreate_database_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCreate_database_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCreate_database_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_database_optionContext create_database_option() throws RecognitionException {
		Create_database_optionContext _localctx = new Create_database_optionContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_create_database_option);
		try {
			setState(1410);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1406);
				match(T_COMMENT);
				setState(1407);
				expr(0);
				}
				break;
			case T_LOCATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1408);
				match(T_LOCATION);
				setState(1409);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_function_stmtContext extends ParserRuleContext {
		public TerminalNode T_FUNCTION() { return getToken(HiveSqlParser.T_FUNCTION, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_function_returnContext create_function_return() {
			return getRuleContext(Create_function_returnContext.class,0);
		}
		public Single_block_stmtContext single_block_stmt() {
			return getRuleContext(Single_block_stmtContext.class,0);
		}
		public TerminalNode T_ALTER() { return getToken(HiveSqlParser.T_ALTER, 0); }
		public TerminalNode T_CREATE() { return getToken(HiveSqlParser.T_CREATE, 0); }
		public TerminalNode T_REPLACE() { return getToken(HiveSqlParser.T_REPLACE, 0); }
		public Create_routine_paramsContext create_routine_params() {
			return getRuleContext(Create_routine_paramsContext.class,0);
		}
		public Declare_block_inplaceContext declare_block_inplace() {
			return getRuleContext(Declare_block_inplaceContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HiveSqlParser.T_AS, 0); }
		public TerminalNode T_IS() { return getToken(HiveSqlParser.T_IS, 0); }
		public TerminalNode T_OR() { return getToken(HiveSqlParser.T_OR, 0); }
		public Create_function_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_function_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCreate_function_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCreate_function_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCreate_function_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_function_stmtContext create_function_stmt() throws RecognitionException {
		Create_function_stmtContext _localctx = new Create_function_stmtContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_create_function_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1419);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1412);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1413);
				match(T_CREATE);
				setState(1416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1414);
					match(T_OR);
					setState(1415);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1418);
				match(T_REPLACE);
				}
				break;
			case T_FUNCTION:
				break;
			default:
				break;
			}
			setState(1421);
			match(T_FUNCTION);
			setState(1422);
			ident();
			setState(1424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(1423);
				create_routine_params();
				}
				break;
			}
			setState(1426);
			create_function_return();
			setState(1428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				{
				setState(1427);
				_la = _input.LA(1);
				if ( !(_la==T_AS || _la==T_IS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				setState(1430);
				declare_block_inplace();
				}
				break;
			}
			setState(1433);
			single_block_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_function_returnContext extends ParserRuleContext {
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TerminalNode T_RETURN() { return getToken(HiveSqlParser.T_RETURN, 0); }
		public TerminalNode T_RETURNS() { return getToken(HiveSqlParser.T_RETURNS, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public Create_function_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_function_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCreate_function_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCreate_function_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCreate_function_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_function_returnContext create_function_return() throws RecognitionException {
		Create_function_returnContext _localctx = new Create_function_returnContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_create_function_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1435);
			_la = _input.LA(1);
			if ( !(_la==T_RETURN || _la==T_RETURNS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1436);
			dtype();
			setState(1438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(1437);
				dtype_len();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_package_stmtContext extends ParserRuleContext {
		public TerminalNode T_PACKAGE() { return getToken(HiveSqlParser.T_PACKAGE, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public Package_specContext package_spec() {
			return getRuleContext(Package_specContext.class,0);
		}
		public TerminalNode T_END() { return getToken(HiveSqlParser.T_END, 0); }
		public TerminalNode T_AS() { return getToken(HiveSqlParser.T_AS, 0); }
		public TerminalNode T_IS() { return getToken(HiveSqlParser.T_IS, 0); }
		public TerminalNode T_ALTER() { return getToken(HiveSqlParser.T_ALTER, 0); }
		public TerminalNode T_CREATE() { return getToken(HiveSqlParser.T_CREATE, 0); }
		public TerminalNode T_REPLACE() { return getToken(HiveSqlParser.T_REPLACE, 0); }
		public TerminalNode T_SEMICOLON() { return getToken(HiveSqlParser.T_SEMICOLON, 0); }
		public TerminalNode T_OR() { return getToken(HiveSqlParser.T_OR, 0); }
		public Create_package_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_package_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCreate_package_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCreate_package_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCreate_package_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_package_stmtContext create_package_stmt() throws RecognitionException {
		Create_package_stmtContext _localctx = new Create_package_stmtContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_create_package_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1447);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1440);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1441);
				match(T_CREATE);
				setState(1444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1442);
					match(T_OR);
					setState(1443);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1446);
				match(T_REPLACE);
				}
				break;
			case T_PACKAGE:
				break;
			default:
				break;
			}
			setState(1449);
			match(T_PACKAGE);
			setState(1450);
			ident();
			setState(1451);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1452);
			package_spec();
			setState(1453);
			match(T_END);
			setState(1457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				setState(1454);
				ident();
				setState(1455);
				match(T_SEMICOLON);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Package_specContext extends ParserRuleContext {
		public List<Package_spec_itemContext> package_spec_item() {
			return getRuleContexts(Package_spec_itemContext.class);
		}
		public Package_spec_itemContext package_spec_item(int i) {
			return getRuleContext(Package_spec_itemContext.class,i);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(HiveSqlParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(HiveSqlParser.T_SEMICOLON, i);
		}
		public Package_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterPackage_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitPackage_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitPackage_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_specContext package_spec() throws RecognitionException {
		Package_specContext _localctx = new Package_specContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_package_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1459);
			package_spec_item();
			setState(1460);
			match(T_SEMICOLON);
			setState(1466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & -67108928L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -24696061953L) != 0 || (((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & -1L) != 0 || (((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & -2251799817879561L) != 0 || (((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & -108093005306528001L) != 0 || (((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & 211106249245695L) != 0) {
				{
				{
				setState(1461);
				package_spec_item();
				setState(1462);
				match(T_SEMICOLON);
				}
				}
				setState(1468);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Package_spec_itemContext extends ParserRuleContext {
		public Declare_stmt_itemContext declare_stmt_item() {
			return getRuleContext(Declare_stmt_itemContext.class,0);
		}
		public TerminalNode T_FUNCTION() { return getToken(HiveSqlParser.T_FUNCTION, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_function_returnContext create_function_return() {
			return getRuleContext(Create_function_returnContext.class,0);
		}
		public Create_routine_paramsContext create_routine_params() {
			return getRuleContext(Create_routine_paramsContext.class,0);
		}
		public TerminalNode T_PROCEDURE() { return getToken(HiveSqlParser.T_PROCEDURE, 0); }
		public TerminalNode T_PROC() { return getToken(HiveSqlParser.T_PROC, 0); }
		public Package_spec_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_spec_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterPackage_spec_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitPackage_spec_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitPackage_spec_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_spec_itemContext package_spec_item() throws RecognitionException {
		Package_spec_itemContext _localctx = new Package_spec_itemContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_package_spec_item);
		int _la;
		try {
			setState(1482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1469);
				declare_stmt_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1470);
				match(T_FUNCTION);
				setState(1471);
				ident();
				setState(1473);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(1472);
					create_routine_params();
					}
					break;
				}
				setState(1475);
				create_function_return();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1477);
				_la = _input.LA(1);
				if ( !(_la==T_PROC || _la==T_PROCEDURE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1478);
				ident();
				setState(1480);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
				case 1:
					{
					setState(1479);
					create_routine_params();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_package_body_stmtContext extends ParserRuleContext {
		public TerminalNode T_PACKAGE() { return getToken(HiveSqlParser.T_PACKAGE, 0); }
		public TerminalNode T_BODY() { return getToken(HiveSqlParser.T_BODY, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public Package_bodyContext package_body() {
			return getRuleContext(Package_bodyContext.class,0);
		}
		public TerminalNode T_END() { return getToken(HiveSqlParser.T_END, 0); }
		public TerminalNode T_AS() { return getToken(HiveSqlParser.T_AS, 0); }
		public TerminalNode T_IS() { return getToken(HiveSqlParser.T_IS, 0); }
		public TerminalNode T_ALTER() { return getToken(HiveSqlParser.T_ALTER, 0); }
		public TerminalNode T_CREATE() { return getToken(HiveSqlParser.T_CREATE, 0); }
		public TerminalNode T_REPLACE() { return getToken(HiveSqlParser.T_REPLACE, 0); }
		public TerminalNode T_SEMICOLON() { return getToken(HiveSqlParser.T_SEMICOLON, 0); }
		public TerminalNode T_OR() { return getToken(HiveSqlParser.T_OR, 0); }
		public Create_package_body_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_package_body_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCreate_package_body_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCreate_package_body_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCreate_package_body_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_package_body_stmtContext create_package_body_stmt() throws RecognitionException {
		Create_package_body_stmtContext _localctx = new Create_package_body_stmtContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_create_package_body_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1491);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1484);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1485);
				match(T_CREATE);
				setState(1488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1486);
					match(T_OR);
					setState(1487);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1490);
				match(T_REPLACE);
				}
				break;
			case T_PACKAGE:
				break;
			default:
				break;
			}
			setState(1493);
			match(T_PACKAGE);
			setState(1494);
			match(T_BODY);
			setState(1495);
			ident();
			setState(1496);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1497);
			package_body();
			setState(1498);
			match(T_END);
			setState(1502);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				{
				setState(1499);
				ident();
				setState(1500);
				match(T_SEMICOLON);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Package_bodyContext extends ParserRuleContext {
		public List<Package_body_itemContext> package_body_item() {
			return getRuleContexts(Package_body_itemContext.class);
		}
		public Package_body_itemContext package_body_item(int i) {
			return getRuleContext(Package_body_itemContext.class,i);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(HiveSqlParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(HiveSqlParser.T_SEMICOLON, i);
		}
		public Package_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterPackage_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitPackage_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitPackage_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_bodyContext package_body() throws RecognitionException {
		Package_bodyContext _localctx = new Package_bodyContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_package_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1504);
			package_body_item();
			setState(1505);
			match(T_SEMICOLON);
			setState(1511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & -67108928L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -24696061953L) != 0 || (((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & -1L) != 0 || (((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & -2251799817879561L) != 0 || (((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & -108093005306528001L) != 0 || (((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & 211106249245695L) != 0) {
				{
				{
				setState(1506);
				package_body_item();
				setState(1507);
				match(T_SEMICOLON);
				}
				}
				setState(1513);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Package_body_itemContext extends ParserRuleContext {
		public Declare_stmt_itemContext declare_stmt_item() {
			return getRuleContext(Declare_stmt_itemContext.class,0);
		}
		public Create_function_stmtContext create_function_stmt() {
			return getRuleContext(Create_function_stmtContext.class,0);
		}
		public Create_procedure_stmtContext create_procedure_stmt() {
			return getRuleContext(Create_procedure_stmtContext.class,0);
		}
		public Package_body_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_body_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterPackage_body_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitPackage_body_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitPackage_body_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_body_itemContext package_body_item() throws RecognitionException {
		Package_body_itemContext _localctx = new Package_body_itemContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_package_body_item);
		try {
			setState(1517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1514);
				declare_stmt_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1515);
				create_function_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1516);
				create_procedure_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_procedure_stmtContext extends ParserRuleContext {
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public Proc_blockContext proc_block() {
			return getRuleContext(Proc_blockContext.class,0);
		}
		public TerminalNode T_PROCEDURE() { return getToken(HiveSqlParser.T_PROCEDURE, 0); }
		public TerminalNode T_PROC() { return getToken(HiveSqlParser.T_PROC, 0); }
		public TerminalNode T_ALTER() { return getToken(HiveSqlParser.T_ALTER, 0); }
		public TerminalNode T_CREATE() { return getToken(HiveSqlParser.T_CREATE, 0); }
		public TerminalNode T_REPLACE() { return getToken(HiveSqlParser.T_REPLACE, 0); }
		public Create_routine_paramsContext create_routine_params() {
			return getRuleContext(Create_routine_paramsContext.class,0);
		}
		public Create_routine_optionsContext create_routine_options() {
			return getRuleContext(Create_routine_optionsContext.class,0);
		}
		public Declare_block_inplaceContext declare_block_inplace() {
			return getRuleContext(Declare_block_inplaceContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode T_SEMICOLON() { return getToken(HiveSqlParser.T_SEMICOLON, 0); }
		public TerminalNode T_AS() { return getToken(HiveSqlParser.T_AS, 0); }
		public TerminalNode T_IS() { return getToken(HiveSqlParser.T_IS, 0); }
		public TerminalNode T_OR() { return getToken(HiveSqlParser.T_OR, 0); }
		public Create_procedure_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_procedure_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCreate_procedure_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCreate_procedure_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCreate_procedure_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_procedure_stmtContext create_procedure_stmt() throws RecognitionException {
		Create_procedure_stmtContext _localctx = new Create_procedure_stmtContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_create_procedure_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1526);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1519);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1520);
				match(T_CREATE);
				setState(1523);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1521);
					match(T_OR);
					setState(1522);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1525);
				match(T_REPLACE);
				}
				break;
			case T_PROC:
			case T_PROCEDURE:
				break;
			default:
				break;
			}
			setState(1528);
			_la = _input.LA(1);
			if ( !(_la==T_PROC || _la==T_PROCEDURE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1529);
			ident();
			setState(1531);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				{
				setState(1530);
				create_routine_params();
				}
				break;
			}
			setState(1534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				{
				setState(1533);
				create_routine_options();
				}
				break;
			}
			setState(1537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1536);
				_la = _input.LA(1);
				if ( !(_la==T_AS || _la==T_IS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1540);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				{
				setState(1539);
				declare_block_inplace();
				}
				break;
			}
			setState(1543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1542);
				label();
				}
				break;
			}
			setState(1545);
			proc_block();
			setState(1549);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				{
				setState(1546);
				ident();
				setState(1547);
				match(T_SEMICOLON);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_routine_paramsContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HiveSqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HiveSqlParser.T_CLOSE_P, 0); }
		public List<Create_routine_param_itemContext> create_routine_param_item() {
			return getRuleContexts(Create_routine_param_itemContext.class);
		}
		public Create_routine_param_itemContext create_routine_param_item(int i) {
			return getRuleContext(Create_routine_param_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HiveSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveSqlParser.T_COMMA, i);
		}
		public Create_routine_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_routine_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCreate_routine_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCreate_routine_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCreate_routine_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_routine_paramsContext create_routine_params() throws RecognitionException {
		Create_routine_paramsContext _localctx = new Create_routine_paramsContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_create_routine_params);
		int _la;
		try {
			int _alt;
			setState(1573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1551);
				match(T_OPEN_P);
				setState(1552);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1553);
				match(T_OPEN_P);
				setState(1554);
				create_routine_param_item();
				setState(1559);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1555);
					match(T_COMMA);
					setState(1556);
					create_routine_param_item();
					}
					}
					setState(1561);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1562);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1564);
				if (!(!_input.LT(1).getText().equalsIgnoreCase("IS") &&
				        !_input.LT(1).getText().equalsIgnoreCase("AS") &&
				        !(_input.LT(1).getText().equalsIgnoreCase("DYNAMIC") && _input.LT(2).getText().equalsIgnoreCase("RESULT"))
				        )) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"IS\") &&\n        !_input.LT(1).getText().equalsIgnoreCase(\"AS\") &&\n        !(_input.LT(1).getText().equalsIgnoreCase(\"DYNAMIC\") && _input.LT(2).getText().equalsIgnoreCase(\"RESULT\"))\n        ");
				setState(1565);
				create_routine_param_item();
				setState(1570);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1566);
						match(T_COMMA);
						setState(1567);
						create_routine_param_item();
						}
						} 
					}
					setState(1572);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_routine_param_itemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TerminalNode T_IN() { return getToken(HiveSqlParser.T_IN, 0); }
		public TerminalNode T_OUT() { return getToken(HiveSqlParser.T_OUT, 0); }
		public TerminalNode T_INOUT() { return getToken(HiveSqlParser.T_INOUT, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public List<Dtype_attrContext> dtype_attr() {
			return getRuleContexts(Dtype_attrContext.class);
		}
		public Dtype_attrContext dtype_attr(int i) {
			return getRuleContext(Dtype_attrContext.class,i);
		}
		public Dtype_defaultContext dtype_default() {
			return getRuleContext(Dtype_defaultContext.class,0);
		}
		public Create_routine_param_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_routine_param_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCreate_routine_param_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCreate_routine_param_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCreate_routine_param_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_routine_param_itemContext create_routine_param_item() throws RecognitionException {
		Create_routine_param_itemContext _localctx = new Create_routine_param_itemContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_create_routine_param_item);
		try {
			int _alt;
			setState(1617);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1580);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
				case 1:
					{
					setState(1575);
					match(T_IN);
					}
					break;
				case 2:
					{
					setState(1576);
					match(T_OUT);
					}
					break;
				case 3:
					{
					setState(1577);
					match(T_INOUT);
					}
					break;
				case 4:
					{
					setState(1578);
					match(T_IN);
					setState(1579);
					match(T_OUT);
					}
					break;
				}
				setState(1582);
				ident();
				setState(1583);
				dtype();
				setState(1585);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
				case 1:
					{
					setState(1584);
					dtype_len();
					}
					break;
				}
				setState(1590);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1587);
						dtype_attr();
						}
						} 
					}
					setState(1592);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
				}
				setState(1594);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
				case 1:
					{
					setState(1593);
					dtype_default();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1596);
				ident();
				setState(1602);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
				case 1:
					{
					setState(1597);
					match(T_IN);
					}
					break;
				case 2:
					{
					setState(1598);
					match(T_OUT);
					}
					break;
				case 3:
					{
					setState(1599);
					match(T_INOUT);
					}
					break;
				case 4:
					{
					setState(1600);
					match(T_IN);
					setState(1601);
					match(T_OUT);
					}
					break;
				}
				setState(1604);
				dtype();
				setState(1606);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
				case 1:
					{
					setState(1605);
					dtype_len();
					}
					break;
				}
				setState(1611);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1608);
						dtype_attr();
						}
						} 
					}
					setState(1613);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
				}
				setState(1615);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
				case 1:
					{
					setState(1614);
					dtype_default();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_routine_optionsContext extends ParserRuleContext {
		public List<Create_routine_optionContext> create_routine_option() {
			return getRuleContexts(Create_routine_optionContext.class);
		}
		public Create_routine_optionContext create_routine_option(int i) {
			return getRuleContext(Create_routine_optionContext.class,i);
		}
		public Create_routine_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_routine_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCreate_routine_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCreate_routine_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCreate_routine_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_routine_optionsContext create_routine_options() throws RecognitionException {
		Create_routine_optionsContext _localctx = new Create_routine_optionsContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_create_routine_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1620); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1619);
					create_routine_option();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1622); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_routine_optionContext extends ParserRuleContext {
		public TerminalNode T_LANGUAGE() { return getToken(HiveSqlParser.T_LANGUAGE, 0); }
		public TerminalNode T_SQL() { return getToken(HiveSqlParser.T_SQL, 0); }
		public TerminalNode T_SECURITY() { return getToken(HiveSqlParser.T_SECURITY, 0); }
		public TerminalNode T_CREATOR() { return getToken(HiveSqlParser.T_CREATOR, 0); }
		public TerminalNode T_DEFINER() { return getToken(HiveSqlParser.T_DEFINER, 0); }
		public TerminalNode T_INVOKER() { return getToken(HiveSqlParser.T_INVOKER, 0); }
		public TerminalNode T_OWNER() { return getToken(HiveSqlParser.T_OWNER, 0); }
		public TerminalNode T_RESULT() { return getToken(HiveSqlParser.T_RESULT, 0); }
		public TerminalNode T_SETS() { return getToken(HiveSqlParser.T_SETS, 0); }
		public TerminalNode L_INT() { return getToken(HiveSqlParser.L_INT, 0); }
		public TerminalNode T_DYNAMIC() { return getToken(HiveSqlParser.T_DYNAMIC, 0); }
		public Create_routine_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_routine_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCreate_routine_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCreate_routine_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCreate_routine_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_routine_optionContext create_routine_option() throws RecognitionException {
		Create_routine_optionContext _localctx = new Create_routine_optionContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_create_routine_option);
		int _la;
		try {
			setState(1635);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LANGUAGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1624);
				match(T_LANGUAGE);
				setState(1625);
				match(T_SQL);
				}
				break;
			case T_SQL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1626);
				match(T_SQL);
				setState(1627);
				match(T_SECURITY);
				setState(1628);
				_la = _input.LA(1);
				if ( !(_la==T_CREATOR || _la==T_DEFINER || _la==T_INVOKER || _la==T_OWNER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T_DYNAMIC:
			case T_RESULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_DYNAMIC) {
					{
					setState(1629);
					match(T_DYNAMIC);
					}
				}

				setState(1632);
				match(T_RESULT);
				setState(1633);
				match(T_SETS);
				setState(1634);
				match(L_INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Drop_stmtContext extends ParserRuleContext {
		public TerminalNode T_DROP() { return getToken(HiveSqlParser.T_DROP, 0); }
		public TerminalNode T_TABLE() { return getToken(HiveSqlParser.T_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_IF() { return getToken(HiveSqlParser.T_IF, 0); }
		public TerminalNode T_EXISTS() { return getToken(HiveSqlParser.T_EXISTS, 0); }
		public TerminalNode T_PACKAGE() { return getToken(HiveSqlParser.T_PACKAGE, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_PROCEDURE() { return getToken(HiveSqlParser.T_PROCEDURE, 0); }
		public TerminalNode T_FUNCTION() { return getToken(HiveSqlParser.T_FUNCTION, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_DATABASE() { return getToken(HiveSqlParser.T_DATABASE, 0); }
		public TerminalNode T_SCHEMA() { return getToken(HiveSqlParser.T_SCHEMA, 0); }
		public Drop_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterDrop_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitDrop_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitDrop_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_stmtContext drop_stmt() throws RecognitionException {
		Drop_stmtContext _localctx = new Drop_stmtContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_drop_stmt);
		int _la;
		try {
			setState(1665);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1637);
				match(T_DROP);
				setState(1638);
				match(T_TABLE);
				setState(1641);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(1639);
					match(T_IF);
					setState(1640);
					match(T_EXISTS);
					}
					break;
				}
				setState(1643);
				table_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1644);
				match(T_DROP);
				setState(1645);
				match(T_PACKAGE);
				setState(1648);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(1646);
					match(T_IF);
					setState(1647);
					match(T_EXISTS);
					}
					break;
				}
				setState(1650);
				ident();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1651);
				match(T_DROP);
				setState(1652);
				_la = _input.LA(1);
				if ( !(_la==T_FUNCTION || _la==T_PROCEDURE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1655);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
				case 1:
					{
					setState(1653);
					match(T_IF);
					setState(1654);
					match(T_EXISTS);
					}
					break;
				}
				setState(1657);
				ident();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1658);
				match(T_DROP);
				setState(1659);
				_la = _input.LA(1);
				if ( !(_la==T_DATABASE || _la==T_SCHEMA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1662);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
				case 1:
					{
					setState(1660);
					match(T_IF);
					setState(1661);
					match(T_EXISTS);
					}
					break;
				}
				setState(1664);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class End_transaction_stmtContext extends ParserRuleContext {
		public TerminalNode T_END() { return getToken(HiveSqlParser.T_END, 0); }
		public TerminalNode T_TRANSACTION() { return getToken(HiveSqlParser.T_TRANSACTION, 0); }
		public End_transaction_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_transaction_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterEnd_transaction_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitEnd_transaction_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitEnd_transaction_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final End_transaction_stmtContext end_transaction_stmt() throws RecognitionException {
		End_transaction_stmtContext _localctx = new End_transaction_stmtContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_end_transaction_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1667);
			match(T_END);
			setState(1668);
			match(T_TRANSACTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exec_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_EXEC() { return getToken(HiveSqlParser.T_EXEC, 0); }
		public TerminalNode T_EXECUTE() { return getToken(HiveSqlParser.T_EXECUTE, 0); }
		public TerminalNode T_IMMEDIATE() { return getToken(HiveSqlParser.T_IMMEDIATE, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveSqlParser.T_OPEN_P, 0); }
		public Expr_func_paramsContext expr_func_params() {
			return getRuleContext(Expr_func_paramsContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveSqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_INTO() { return getToken(HiveSqlParser.T_INTO, 0); }
		public List<TerminalNode> L_ID() { return getTokens(HiveSqlParser.L_ID); }
		public TerminalNode L_ID(int i) {
			return getToken(HiveSqlParser.L_ID, i);
		}
		public Using_clauseContext using_clause() {
			return getRuleContext(Using_clauseContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HiveSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveSqlParser.T_COMMA, i);
		}
		public Exec_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exec_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterExec_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitExec_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitExec_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exec_stmtContext exec_stmt() throws RecognitionException {
		Exec_stmtContext _localctx = new Exec_stmtContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_exec_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1670);
			_la = _input.LA(1);
			if ( !(_la==T_EXEC || _la==T_EXECUTE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1672);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				{
				setState(1671);
				match(T_IMMEDIATE);
				}
				break;
			}
			setState(1674);
			expr(0);
			setState(1680);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				{
				setState(1675);
				match(T_OPEN_P);
				setState(1676);
				expr_func_params();
				setState(1677);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(1679);
				expr_func_params();
				}
				break;
			}
			setState(1691);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				{
				setState(1682);
				match(T_INTO);
				setState(1683);
				match(L_ID);
				setState(1688);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1684);
						match(T_COMMA);
						setState(1685);
						match(L_ID);
						}
						} 
					}
					setState(1690);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
				}
				}
				break;
			}
			setState(1694);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				{
				setState(1693);
				using_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_stmtContext extends ParserRuleContext {
		public If_plsql_stmtContext if_plsql_stmt() {
			return getRuleContext(If_plsql_stmtContext.class,0);
		}
		public If_tsql_stmtContext if_tsql_stmt() {
			return getRuleContext(If_tsql_stmtContext.class,0);
		}
		public If_bteq_stmtContext if_bteq_stmt() {
			return getRuleContext(If_bteq_stmtContext.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_if_stmt);
		try {
			setState(1699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1696);
				if_plsql_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1697);
				if_tsql_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1698);
				if_bteq_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_plsql_stmtContext extends ParserRuleContext {
		public List<TerminalNode> T_IF() { return getTokens(HiveSqlParser.T_IF); }
		public TerminalNode T_IF(int i) {
			return getToken(HiveSqlParser.T_IF, i);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_THEN() { return getToken(HiveSqlParser.T_THEN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(HiveSqlParser.T_END, 0); }
		public List<Elseif_blockContext> elseif_block() {
			return getRuleContexts(Elseif_blockContext.class);
		}
		public Elseif_blockContext elseif_block(int i) {
			return getRuleContext(Elseif_blockContext.class,i);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public If_plsql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_plsql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterIf_plsql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitIf_plsql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitIf_plsql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_plsql_stmtContext if_plsql_stmt() throws RecognitionException {
		If_plsql_stmtContext _localctx = new If_plsql_stmtContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_if_plsql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1701);
			match(T_IF);
			setState(1702);
			bool_expr(0);
			setState(1703);
			match(T_THEN);
			setState(1704);
			block();
			setState(1708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_ELSEIF || _la==T_ELSIF) {
				{
				{
				setState(1705);
				elseif_block();
				}
				}
				setState(1710);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(1711);
				else_block();
				}
			}

			setState(1714);
			match(T_END);
			setState(1715);
			match(T_IF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_tsql_stmtContext extends ParserRuleContext {
		public TerminalNode T_IF() { return getToken(HiveSqlParser.T_IF, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public List<Single_block_stmtContext> single_block_stmt() {
			return getRuleContexts(Single_block_stmtContext.class);
		}
		public Single_block_stmtContext single_block_stmt(int i) {
			return getRuleContext(Single_block_stmtContext.class,i);
		}
		public TerminalNode T_ELSE() { return getToken(HiveSqlParser.T_ELSE, 0); }
		public If_tsql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_tsql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterIf_tsql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitIf_tsql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitIf_tsql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_tsql_stmtContext if_tsql_stmt() throws RecognitionException {
		If_tsql_stmtContext _localctx = new If_tsql_stmtContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_if_tsql_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1717);
			match(T_IF);
			setState(1718);
			bool_expr(0);
			setState(1719);
			single_block_stmt();
			setState(1722);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				{
				setState(1720);
				match(T_ELSE);
				setState(1721);
				single_block_stmt();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_bteq_stmtContext extends ParserRuleContext {
		public TerminalNode T_IF() { return getToken(HiveSqlParser.T_IF, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_THEN() { return getToken(HiveSqlParser.T_THEN, 0); }
		public Single_block_stmtContext single_block_stmt() {
			return getRuleContext(Single_block_stmtContext.class,0);
		}
		public If_bteq_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_bteq_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterIf_bteq_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitIf_bteq_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitIf_bteq_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_bteq_stmtContext if_bteq_stmt() throws RecognitionException {
		If_bteq_stmtContext _localctx = new If_bteq_stmtContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_if_bteq_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1724);
			match(T__3);
			setState(1725);
			match(T_IF);
			setState(1726);
			bool_expr(0);
			setState(1727);
			match(T_THEN);
			setState(1728);
			single_block_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Elseif_blockContext extends ParserRuleContext {
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_THEN() { return getToken(HiveSqlParser.T_THEN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_ELSIF() { return getToken(HiveSqlParser.T_ELSIF, 0); }
		public TerminalNode T_ELSEIF() { return getToken(HiveSqlParser.T_ELSEIF, 0); }
		public Elseif_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterElseif_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitElseif_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitElseif_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elseif_blockContext elseif_block() throws RecognitionException {
		Elseif_blockContext _localctx = new Elseif_blockContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_elseif_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1730);
			_la = _input.LA(1);
			if ( !(_la==T_ELSEIF || _la==T_ELSIF) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1731);
			bool_expr(0);
			setState(1732);
			match(T_THEN);
			setState(1733);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Else_blockContext extends ParserRuleContext {
		public TerminalNode T_ELSE() { return getToken(HiveSqlParser.T_ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterElse_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitElse_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitElse_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_else_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1735);
			match(T_ELSE);
			setState(1736);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Include_stmtContext extends ParserRuleContext {
		public TerminalNode T_INCLUDE() { return getToken(HiveSqlParser.T_INCLUDE, 0); }
		public File_nameContext file_name() {
			return getRuleContext(File_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Include_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterInclude_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitInclude_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitInclude_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Include_stmtContext include_stmt() throws RecognitionException {
		Include_stmtContext _localctx = new Include_stmtContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_include_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1738);
			match(T_INCLUDE);
			setState(1741);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				{
				setState(1739);
				file_name();
				}
				break;
			case 2:
				{
				setState(1740);
				expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Insert_stmtContext extends ParserRuleContext {
		public TerminalNode T_INSERT() { return getToken(HiveSqlParser.T_INSERT, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_OVERWRITE() { return getToken(HiveSqlParser.T_OVERWRITE, 0); }
		public TerminalNode T_TABLE() { return getToken(HiveSqlParser.T_TABLE, 0); }
		public TerminalNode T_INTO() { return getToken(HiveSqlParser.T_INTO, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Insert_stmt_rowsContext insert_stmt_rows() {
			return getRuleContext(Insert_stmt_rowsContext.class,0);
		}
		public Insert_stmt_colsContext insert_stmt_cols() {
			return getRuleContext(Insert_stmt_colsContext.class,0);
		}
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterInsert_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitInsert_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitInsert_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_insert_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1743);
			match(T_INSERT);
			setState(1750);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_OVERWRITE:
				{
				setState(1744);
				match(T_OVERWRITE);
				setState(1745);
				match(T_TABLE);
				}
				break;
			case T_INTO:
				{
				setState(1746);
				match(T_INTO);
				setState(1748);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(1747);
					match(T_TABLE);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1752);
			table_name();
			setState(1754);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				{
				setState(1753);
				insert_stmt_cols();
				}
				break;
			}
			setState(1758);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEL:
			case T_SELECT:
			case T_WITH:
			case T_OPEN_P:
				{
				setState(1756);
				select_stmt();
				}
				break;
			case T_VALUES:
				{
				setState(1757);
				insert_stmt_rows();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Insert_stmt_colsContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HiveSqlParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveSqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HiveSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveSqlParser.T_COMMA, i);
		}
		public Insert_stmt_colsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt_cols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterInsert_stmt_cols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitInsert_stmt_cols(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitInsert_stmt_cols(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmt_colsContext insert_stmt_cols() throws RecognitionException {
		Insert_stmt_colsContext _localctx = new Insert_stmt_colsContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_insert_stmt_cols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1760);
			match(T_OPEN_P);
			setState(1761);
			ident();
			setState(1766);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1762);
				match(T_COMMA);
				setState(1763);
				ident();
				}
				}
				setState(1768);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1769);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Insert_stmt_rowsContext extends ParserRuleContext {
		public TerminalNode T_VALUES() { return getToken(HiveSqlParser.T_VALUES, 0); }
		public List<Insert_stmt_rowContext> insert_stmt_row() {
			return getRuleContexts(Insert_stmt_rowContext.class);
		}
		public Insert_stmt_rowContext insert_stmt_row(int i) {
			return getRuleContext(Insert_stmt_rowContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HiveSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveSqlParser.T_COMMA, i);
		}
		public Insert_stmt_rowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt_rows; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterInsert_stmt_rows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitInsert_stmt_rows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitInsert_stmt_rows(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmt_rowsContext insert_stmt_rows() throws RecognitionException {
		Insert_stmt_rowsContext _localctx = new Insert_stmt_rowsContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_insert_stmt_rows);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1771);
			match(T_VALUES);
			setState(1772);
			insert_stmt_row();
			setState(1777);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1773);
					match(T_COMMA);
					setState(1774);
					insert_stmt_row();
					}
					} 
				}
				setState(1779);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Insert_stmt_rowContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HiveSqlParser.T_OPEN_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveSqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HiveSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveSqlParser.T_COMMA, i);
		}
		public Insert_stmt_rowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterInsert_stmt_row(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitInsert_stmt_row(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitInsert_stmt_row(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmt_rowContext insert_stmt_row() throws RecognitionException {
		Insert_stmt_rowContext _localctx = new Insert_stmt_rowContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_insert_stmt_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1780);
			match(T_OPEN_P);
			setState(1781);
			expr(0);
			setState(1786);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1782);
				match(T_COMMA);
				setState(1783);
				expr(0);
				}
				}
				setState(1788);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1789);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Insert_directory_stmtContext extends ParserRuleContext {
		public TerminalNode T_INSERT() { return getToken(HiveSqlParser.T_INSERT, 0); }
		public TerminalNode T_OVERWRITE() { return getToken(HiveSqlParser.T_OVERWRITE, 0); }
		public TerminalNode T_DIRECTORY() { return getToken(HiveSqlParser.T_DIRECTORY, 0); }
		public Expr_fileContext expr_file() {
			return getRuleContext(Expr_fileContext.class,0);
		}
		public Expr_selectContext expr_select() {
			return getRuleContext(Expr_selectContext.class,0);
		}
		public TerminalNode T_LOCAL() { return getToken(HiveSqlParser.T_LOCAL, 0); }
		public Insert_directory_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_directory_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterInsert_directory_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitInsert_directory_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitInsert_directory_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_directory_stmtContext insert_directory_stmt() throws RecognitionException {
		Insert_directory_stmtContext _localctx = new Insert_directory_stmtContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_insert_directory_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1791);
			match(T_INSERT);
			setState(1792);
			match(T_OVERWRITE);
			setState(1794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_LOCAL) {
				{
				setState(1793);
				match(T_LOCAL);
				}
			}

			setState(1796);
			match(T_DIRECTORY);
			setState(1797);
			expr_file();
			setState(1798);
			expr_select();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exit_stmtContext extends ParserRuleContext {
		public TerminalNode T_EXIT() { return getToken(HiveSqlParser.T_EXIT, 0); }
		public TerminalNode L_ID() { return getToken(HiveSqlParser.L_ID, 0); }
		public TerminalNode T_WHEN() { return getToken(HiveSqlParser.T_WHEN, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Exit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterExit_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitExit_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitExit_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exit_stmtContext exit_stmt() throws RecognitionException {
		Exit_stmtContext _localctx = new Exit_stmtContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_exit_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1800);
			match(T_EXIT);
			setState(1802);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				{
				setState(1801);
				match(L_ID);
				}
				break;
			}
			setState(1806);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				setState(1804);
				match(T_WHEN);
				setState(1805);
				bool_expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Get_diag_stmtContext extends ParserRuleContext {
		public TerminalNode T_GET() { return getToken(HiveSqlParser.T_GET, 0); }
		public TerminalNode T_DIAGNOSTICS() { return getToken(HiveSqlParser.T_DIAGNOSTICS, 0); }
		public Get_diag_stmt_itemContext get_diag_stmt_item() {
			return getRuleContext(Get_diag_stmt_itemContext.class,0);
		}
		public Get_diag_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_diag_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterGet_diag_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitGet_diag_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitGet_diag_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_diag_stmtContext get_diag_stmt() throws RecognitionException {
		Get_diag_stmtContext _localctx = new Get_diag_stmtContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_get_diag_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1808);
			match(T_GET);
			setState(1809);
			match(T_DIAGNOSTICS);
			setState(1810);
			get_diag_stmt_item();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Get_diag_stmt_itemContext extends ParserRuleContext {
		public Get_diag_stmt_exception_itemContext get_diag_stmt_exception_item() {
			return getRuleContext(Get_diag_stmt_exception_itemContext.class,0);
		}
		public Get_diag_stmt_rowcount_itemContext get_diag_stmt_rowcount_item() {
			return getRuleContext(Get_diag_stmt_rowcount_itemContext.class,0);
		}
		public Get_diag_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_diag_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterGet_diag_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitGet_diag_stmt_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitGet_diag_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_diag_stmt_itemContext get_diag_stmt_item() throws RecognitionException {
		Get_diag_stmt_itemContext _localctx = new Get_diag_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_get_diag_stmt_item);
		try {
			setState(1814);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1812);
				get_diag_stmt_exception_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1813);
				get_diag_stmt_rowcount_item();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Get_diag_stmt_exception_itemContext extends ParserRuleContext {
		public TerminalNode T_EXCEPTION() { return getToken(HiveSqlParser.T_EXCEPTION, 0); }
		public TerminalNode L_INT() { return getToken(HiveSqlParser.L_INT, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(HiveSqlParser.T_EQUAL, 0); }
		public TerminalNode T_MESSAGE_TEXT() { return getToken(HiveSqlParser.T_MESSAGE_TEXT, 0); }
		public Get_diag_stmt_exception_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_diag_stmt_exception_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterGet_diag_stmt_exception_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitGet_diag_stmt_exception_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitGet_diag_stmt_exception_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_diag_stmt_exception_itemContext get_diag_stmt_exception_item() throws RecognitionException {
		Get_diag_stmt_exception_itemContext _localctx = new Get_diag_stmt_exception_itemContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_get_diag_stmt_exception_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1816);
			match(T_EXCEPTION);
			setState(1817);
			match(L_INT);
			setState(1818);
			ident();
			setState(1819);
			match(T_EQUAL);
			setState(1820);
			match(T_MESSAGE_TEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Get_diag_stmt_rowcount_itemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(HiveSqlParser.T_EQUAL, 0); }
		public TerminalNode T_ROW_COUNT() { return getToken(HiveSqlParser.T_ROW_COUNT, 0); }
		public Get_diag_stmt_rowcount_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_diag_stmt_rowcount_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterGet_diag_stmt_rowcount_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitGet_diag_stmt_rowcount_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitGet_diag_stmt_rowcount_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_diag_stmt_rowcount_itemContext get_diag_stmt_rowcount_item() throws RecognitionException {
		Get_diag_stmt_rowcount_itemContext _localctx = new Get_diag_stmt_rowcount_itemContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_get_diag_stmt_rowcount_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1822);
			ident();
			setState(1823);
			match(T_EQUAL);
			setState(1824);
			match(T_ROW_COUNT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Grant_stmtContext extends ParserRuleContext {
		public TerminalNode T_GRANT() { return getToken(HiveSqlParser.T_GRANT, 0); }
		public List<Grant_stmt_itemContext> grant_stmt_item() {
			return getRuleContexts(Grant_stmt_itemContext.class);
		}
		public Grant_stmt_itemContext grant_stmt_item(int i) {
			return getRuleContext(Grant_stmt_itemContext.class,i);
		}
		public TerminalNode T_TO() { return getToken(HiveSqlParser.T_TO, 0); }
		public TerminalNode T_ROLE() { return getToken(HiveSqlParser.T_ROLE, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HiveSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveSqlParser.T_COMMA, i);
		}
		public Grant_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grant_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterGrant_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitGrant_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitGrant_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Grant_stmtContext grant_stmt() throws RecognitionException {
		Grant_stmtContext _localctx = new Grant_stmtContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_grant_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1826);
			match(T_GRANT);
			setState(1827);
			grant_stmt_item();
			setState(1832);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1828);
				match(T_COMMA);
				setState(1829);
				grant_stmt_item();
				}
				}
				setState(1834);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1835);
			match(T_TO);
			setState(1836);
			match(T_ROLE);
			setState(1837);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Grant_stmt_itemContext extends ParserRuleContext {
		public TerminalNode T_EXECUTE() { return getToken(HiveSqlParser.T_EXECUTE, 0); }
		public TerminalNode T_ON() { return getToken(HiveSqlParser.T_ON, 0); }
		public TerminalNode T_PROCEDURE() { return getToken(HiveSqlParser.T_PROCEDURE, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Grant_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grant_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterGrant_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitGrant_stmt_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitGrant_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Grant_stmt_itemContext grant_stmt_item() throws RecognitionException {
		Grant_stmt_itemContext _localctx = new Grant_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_grant_stmt_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1839);
			match(T_EXECUTE);
			setState(1840);
			match(T_ON);
			setState(1841);
			match(T_PROCEDURE);
			setState(1842);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Leave_stmtContext extends ParserRuleContext {
		public TerminalNode T_LEAVE() { return getToken(HiveSqlParser.T_LEAVE, 0); }
		public TerminalNode L_ID() { return getToken(HiveSqlParser.L_ID, 0); }
		public Leave_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leave_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterLeave_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitLeave_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitLeave_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Leave_stmtContext leave_stmt() throws RecognitionException {
		Leave_stmtContext _localctx = new Leave_stmtContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_leave_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1844);
			match(T_LEAVE);
			setState(1846);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				setState(1845);
				match(L_ID);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Map_object_stmtContext extends ParserRuleContext {
		public TerminalNode T_MAP() { return getToken(HiveSqlParser.T_MAP, 0); }
		public TerminalNode T_OBJECT() { return getToken(HiveSqlParser.T_OBJECT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_TO() { return getToken(HiveSqlParser.T_TO, 0); }
		public TerminalNode T_AT() { return getToken(HiveSqlParser.T_AT, 0); }
		public Map_object_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map_object_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterMap_object_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitMap_object_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitMap_object_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Map_object_stmtContext map_object_stmt() throws RecognitionException {
		Map_object_stmtContext _localctx = new Map_object_stmtContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_map_object_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1848);
			match(T_MAP);
			setState(1849);
			match(T_OBJECT);
			setState(1850);
			expr(0);
			setState(1853);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(1851);
				match(T_TO);
				setState(1852);
				expr(0);
				}
				break;
			}
			setState(1857);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				{
				setState(1855);
				match(T_AT);
				setState(1856);
				expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Open_stmtContext extends ParserRuleContext {
		public TerminalNode T_OPEN() { return getToken(HiveSqlParser.T_OPEN, 0); }
		public TerminalNode L_ID() { return getToken(HiveSqlParser.L_ID, 0); }
		public TerminalNode T_FOR() { return getToken(HiveSqlParser.T_FOR, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Open_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterOpen_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitOpen_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitOpen_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Open_stmtContext open_stmt() throws RecognitionException {
		Open_stmtContext _localctx = new Open_stmtContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_open_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1859);
			match(T_OPEN);
			setState(1860);
			match(L_ID);
			setState(1866);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				{
				setState(1861);
				match(T_FOR);
				setState(1864);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
				case 1:
					{
					setState(1862);
					select_stmt();
					}
					break;
				case 2:
					{
					setState(1863);
					expr(0);
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fetch_stmtContext extends ParserRuleContext {
		public TerminalNode T_FETCH() { return getToken(HiveSqlParser.T_FETCH, 0); }
		public List<TerminalNode> L_ID() { return getTokens(HiveSqlParser.L_ID); }
		public TerminalNode L_ID(int i) {
			return getToken(HiveSqlParser.L_ID, i);
		}
		public TerminalNode T_INTO() { return getToken(HiveSqlParser.T_INTO, 0); }
		public TerminalNode T_FROM() { return getToken(HiveSqlParser.T_FROM, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HiveSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveSqlParser.T_COMMA, i);
		}
		public Fetch_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fetch_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterFetch_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitFetch_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitFetch_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fetch_stmtContext fetch_stmt() throws RecognitionException {
		Fetch_stmtContext _localctx = new Fetch_stmtContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_fetch_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1868);
			match(T_FETCH);
			setState(1870);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_FROM) {
				{
				setState(1869);
				match(T_FROM);
				}
			}

			setState(1872);
			match(L_ID);
			setState(1873);
			match(T_INTO);
			setState(1874);
			match(L_ID);
			setState(1879);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1875);
					match(T_COMMA);
					setState(1876);
					match(L_ID);
					}
					} 
				}
				setState(1881);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Collect_stats_stmtContext extends ParserRuleContext {
		public TerminalNode T_COLLECT() { return getToken(HiveSqlParser.T_COLLECT, 0); }
		public TerminalNode T_ON() { return getToken(HiveSqlParser.T_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_STATISTICS() { return getToken(HiveSqlParser.T_STATISTICS, 0); }
		public TerminalNode T_STATS() { return getToken(HiveSqlParser.T_STATS, 0); }
		public Collect_stats_clauseContext collect_stats_clause() {
			return getRuleContext(Collect_stats_clauseContext.class,0);
		}
		public Collect_stats_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collect_stats_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCollect_stats_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCollect_stats_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCollect_stats_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collect_stats_stmtContext collect_stats_stmt() throws RecognitionException {
		Collect_stats_stmtContext _localctx = new Collect_stats_stmtContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_collect_stats_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1882);
			match(T_COLLECT);
			setState(1883);
			_la = _input.LA(1);
			if ( !(_la==T_STATS || _la==T_STATISTICS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1884);
			match(T_ON);
			setState(1885);
			table_name();
			setState(1887);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				setState(1886);
				collect_stats_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Collect_stats_clauseContext extends ParserRuleContext {
		public TerminalNode T_COLUMN() { return getToken(HiveSqlParser.T_COLUMN, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveSqlParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveSqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HiveSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveSqlParser.T_COMMA, i);
		}
		public Collect_stats_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collect_stats_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCollect_stats_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCollect_stats_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCollect_stats_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collect_stats_clauseContext collect_stats_clause() throws RecognitionException {
		Collect_stats_clauseContext _localctx = new Collect_stats_clauseContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_collect_stats_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1889);
			match(T_COLUMN);
			setState(1890);
			match(T_OPEN_P);
			setState(1891);
			ident();
			setState(1896);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1892);
				match(T_COMMA);
				setState(1893);
				ident();
				}
				}
				setState(1898);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1899);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Close_stmtContext extends ParserRuleContext {
		public TerminalNode T_CLOSE() { return getToken(HiveSqlParser.T_CLOSE, 0); }
		public TerminalNode L_ID() { return getToken(HiveSqlParser.L_ID, 0); }
		public Close_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_close_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterClose_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitClose_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitClose_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Close_stmtContext close_stmt() throws RecognitionException {
		Close_stmtContext _localctx = new Close_stmtContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_close_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1901);
			match(T_CLOSE);
			setState(1902);
			match(L_ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cmp_stmtContext extends ParserRuleContext {
		public TerminalNode T_CMP() { return getToken(HiveSqlParser.T_CMP, 0); }
		public List<Cmp_sourceContext> cmp_source() {
			return getRuleContexts(Cmp_sourceContext.class);
		}
		public Cmp_sourceContext cmp_source(int i) {
			return getRuleContext(Cmp_sourceContext.class,i);
		}
		public TerminalNode T_COMMA() { return getToken(HiveSqlParser.T_COMMA, 0); }
		public TerminalNode T_ROW_COUNT() { return getToken(HiveSqlParser.T_ROW_COUNT, 0); }
		public TerminalNode T_SUM() { return getToken(HiveSqlParser.T_SUM, 0); }
		public Cmp_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmp_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCmp_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCmp_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCmp_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmp_stmtContext cmp_stmt() throws RecognitionException {
		Cmp_stmtContext _localctx = new Cmp_stmtContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_cmp_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1904);
			match(T_CMP);
			setState(1905);
			_la = _input.LA(1);
			if ( !(_la==T_ROW_COUNT || _la==T_SUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1906);
			cmp_source();
			setState(1907);
			match(T_COMMA);
			setState(1908);
			cmp_source();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cmp_sourceContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HiveSqlParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveSqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_AT() { return getToken(HiveSqlParser.T_AT, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Cmp_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmp_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCmp_source(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCmp_source(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCmp_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmp_sourceContext cmp_source() throws RecognitionException {
		Cmp_sourceContext _localctx = new Cmp_sourceContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_cmp_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1918);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case T_SUB:
			case L_ID:
				{
				setState(1910);
				table_name();
				setState(1912);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
				case 1:
					{
					setState(1911);
					where_clause();
					}
					break;
				}
				}
				break;
			case T_OPEN_P:
				{
				setState(1914);
				match(T_OPEN_P);
				setState(1915);
				select_stmt();
				setState(1916);
				match(T_CLOSE_P);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1922);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				{
				setState(1920);
				match(T_AT);
				setState(1921);
				ident();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Copy_from_local_stmtContext extends ParserRuleContext {
		public TerminalNode T_COPY() { return getToken(HiveSqlParser.T_COPY, 0); }
		public TerminalNode T_FROM() { return getToken(HiveSqlParser.T_FROM, 0); }
		public TerminalNode T_LOCAL() { return getToken(HiveSqlParser.T_LOCAL, 0); }
		public List<Copy_sourceContext> copy_source() {
			return getRuleContexts(Copy_sourceContext.class);
		}
		public Copy_sourceContext copy_source(int i) {
			return getRuleContext(Copy_sourceContext.class,i);
		}
		public TerminalNode T_TO() { return getToken(HiveSqlParser.T_TO, 0); }
		public Copy_targetContext copy_target() {
			return getRuleContext(Copy_targetContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HiveSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveSqlParser.T_COMMA, i);
		}
		public List<Copy_file_optionContext> copy_file_option() {
			return getRuleContexts(Copy_file_optionContext.class);
		}
		public Copy_file_optionContext copy_file_option(int i) {
			return getRuleContext(Copy_file_optionContext.class,i);
		}
		public Copy_from_local_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copy_from_local_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCopy_from_local_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCopy_from_local_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCopy_from_local_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Copy_from_local_stmtContext copy_from_local_stmt() throws RecognitionException {
		Copy_from_local_stmtContext _localctx = new Copy_from_local_stmtContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_copy_from_local_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1924);
			match(T_COPY);
			setState(1925);
			match(T_FROM);
			setState(1926);
			match(T_LOCAL);
			setState(1927);
			copy_source();
			setState(1932);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1928);
				match(T_COMMA);
				setState(1929);
				copy_source();
				}
				}
				setState(1934);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1935);
			match(T_TO);
			setState(1936);
			copy_target();
			setState(1940);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1937);
					copy_file_option();
					}
					} 
				}
				setState(1942);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Copy_stmtContext extends ParserRuleContext {
		public TerminalNode T_COPY() { return getToken(HiveSqlParser.T_COPY, 0); }
		public TerminalNode T_TO() { return getToken(HiveSqlParser.T_TO, 0); }
		public Copy_targetContext copy_target() {
			return getRuleContext(Copy_targetContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HiveSqlParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveSqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_HDFS() { return getToken(HiveSqlParser.T_HDFS, 0); }
		public List<Copy_optionContext> copy_option() {
			return getRuleContexts(Copy_optionContext.class);
		}
		public Copy_optionContext copy_option(int i) {
			return getRuleContext(Copy_optionContext.class,i);
		}
		public Copy_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copy_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCopy_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCopy_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCopy_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Copy_stmtContext copy_stmt() throws RecognitionException {
		Copy_stmtContext _localctx = new Copy_stmtContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_copy_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1943);
			match(T_COPY);
			setState(1949);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case T_SUB:
			case L_ID:
				{
				setState(1944);
				table_name();
				}
				break;
			case T_OPEN_P:
				{
				setState(1945);
				match(T_OPEN_P);
				setState(1946);
				select_stmt();
				setState(1947);
				match(T_CLOSE_P);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1951);
			match(T_TO);
			setState(1953);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				{
				setState(1952);
				match(T_HDFS);
				}
				break;
			}
			setState(1955);
			copy_target();
			setState(1959);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1956);
					copy_option();
					}
					} 
				}
				setState(1961);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Copy_sourceContext extends ParserRuleContext {
		public File_nameContext file_name() {
			return getRuleContext(File_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Copy_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copy_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCopy_source(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCopy_source(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCopy_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Copy_sourceContext copy_source() throws RecognitionException {
		Copy_sourceContext _localctx = new Copy_sourceContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_copy_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1964);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				{
				setState(1962);
				file_name();
				}
				break;
			case 2:
				{
				setState(1963);
				expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Copy_targetContext extends ParserRuleContext {
		public File_nameContext file_name() {
			return getRuleContext(File_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Copy_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copy_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCopy_target(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCopy_target(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCopy_target(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Copy_targetContext copy_target() throws RecognitionException {
		Copy_targetContext _localctx = new Copy_targetContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_copy_target);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1968);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				{
				setState(1966);
				file_name();
				}
				break;
			case 2:
				{
				setState(1967);
				expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Copy_optionContext extends ParserRuleContext {
		public TerminalNode T_AT() { return getToken(HiveSqlParser.T_AT, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_BATCHSIZE() { return getToken(HiveSqlParser.T_BATCHSIZE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_DELIMITER() { return getToken(HiveSqlParser.T_DELIMITER, 0); }
		public TerminalNode T_SQLINSERT() { return getToken(HiveSqlParser.T_SQLINSERT, 0); }
		public Copy_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copy_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCopy_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCopy_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCopy_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Copy_optionContext copy_option() throws RecognitionException {
		Copy_optionContext _localctx = new Copy_optionContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_copy_option);
		try {
			setState(1978);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1970);
				match(T_AT);
				setState(1971);
				ident();
				}
				break;
			case T_BATCHSIZE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1972);
				match(T_BATCHSIZE);
				setState(1973);
				expr(0);
				}
				break;
			case T_DELIMITER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1974);
				match(T_DELIMITER);
				setState(1975);
				expr(0);
				}
				break;
			case T_SQLINSERT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1976);
				match(T_SQLINSERT);
				setState(1977);
				ident();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Copy_file_optionContext extends ParserRuleContext {
		public TerminalNode T_DELETE() { return getToken(HiveSqlParser.T_DELETE, 0); }
		public TerminalNode T_IGNORE() { return getToken(HiveSqlParser.T_IGNORE, 0); }
		public TerminalNode T_OVERWRITE() { return getToken(HiveSqlParser.T_OVERWRITE, 0); }
		public Copy_file_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copy_file_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCopy_file_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCopy_file_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCopy_file_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Copy_file_optionContext copy_file_option() throws RecognitionException {
		Copy_file_optionContext _localctx = new Copy_file_optionContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_copy_file_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1980);
			_la = _input.LA(1);
			if ( !(_la==T_DELETE || _la==T_IGNORE || _la==T_OVERWRITE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Commit_stmtContext extends ParserRuleContext {
		public TerminalNode T_COMMIT() { return getToken(HiveSqlParser.T_COMMIT, 0); }
		public TerminalNode T_WORK() { return getToken(HiveSqlParser.T_WORK, 0); }
		public Commit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCommit_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCommit_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCommit_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Commit_stmtContext commit_stmt() throws RecognitionException {
		Commit_stmtContext _localctx = new Commit_stmtContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_commit_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1982);
			match(T_COMMIT);
			setState(1984);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				{
				setState(1983);
				match(T_WORK);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_index_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(HiveSqlParser.T_CREATE, 0); }
		public TerminalNode T_INDEX() { return getToken(HiveSqlParser.T_INDEX, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_ON() { return getToken(HiveSqlParser.T_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HiveSqlParser.T_OPEN_P, 0); }
		public List<Create_index_colContext> create_index_col() {
			return getRuleContexts(Create_index_colContext.class);
		}
		public Create_index_colContext create_index_col(int i) {
			return getRuleContext(Create_index_colContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveSqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_UNIQUE() { return getToken(HiveSqlParser.T_UNIQUE, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HiveSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveSqlParser.T_COMMA, i);
		}
		public Create_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCreate_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCreate_index_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCreate_index_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_index_stmtContext create_index_stmt() throws RecognitionException {
		Create_index_stmtContext _localctx = new Create_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1986);
			match(T_CREATE);
			setState(1988);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_UNIQUE) {
				{
				setState(1987);
				match(T_UNIQUE);
				}
			}

			setState(1990);
			match(T_INDEX);
			setState(1991);
			ident();
			setState(1992);
			match(T_ON);
			setState(1993);
			table_name();
			setState(1994);
			match(T_OPEN_P);
			setState(1995);
			create_index_col();
			setState(2000);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1996);
				match(T_COMMA);
				setState(1997);
				create_index_col();
				}
				}
				setState(2002);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2003);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_index_colContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_ASC() { return getToken(HiveSqlParser.T_ASC, 0); }
		public TerminalNode T_DESC() { return getToken(HiveSqlParser.T_DESC, 0); }
		public Create_index_colContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_col; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCreate_index_col(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCreate_index_col(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCreate_index_col(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_index_colContext create_index_col() throws RecognitionException {
		Create_index_colContext _localctx = new Create_index_colContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_create_index_col);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2005);
			ident();
			setState(2007);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ASC || _la==T_DESC) {
				{
				setState(2006);
				_la = _input.LA(1);
				if ( !(_la==T_ASC || _la==T_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Index_storage_clauseContext extends ParserRuleContext {
		public Index_mssql_storage_clauseContext index_mssql_storage_clause() {
			return getRuleContext(Index_mssql_storage_clauseContext.class,0);
		}
		public Index_storage_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_storage_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterIndex_storage_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitIndex_storage_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitIndex_storage_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_storage_clauseContext index_storage_clause() throws RecognitionException {
		Index_storage_clauseContext _localctx = new Index_storage_clauseContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_index_storage_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2009);
			index_mssql_storage_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Index_mssql_storage_clauseContext extends ParserRuleContext {
		public TerminalNode T_WITH() { return getToken(HiveSqlParser.T_WITH, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveSqlParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_EQUAL() { return getTokens(HiveSqlParser.T_EQUAL); }
		public TerminalNode T_EQUAL(int i) {
			return getToken(HiveSqlParser.T_EQUAL, i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveSqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HiveSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveSqlParser.T_COMMA, i);
		}
		public List<Create_table_options_mssql_itemContext> create_table_options_mssql_item() {
			return getRuleContexts(Create_table_options_mssql_itemContext.class);
		}
		public Create_table_options_mssql_itemContext create_table_options_mssql_item(int i) {
			return getRuleContext(Create_table_options_mssql_itemContext.class,i);
		}
		public Index_mssql_storage_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_mssql_storage_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterIndex_mssql_storage_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitIndex_mssql_storage_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitIndex_mssql_storage_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_mssql_storage_clauseContext index_mssql_storage_clause() throws RecognitionException {
		Index_mssql_storage_clauseContext _localctx = new Index_mssql_storage_clauseContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_index_mssql_storage_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2011);
			match(T_WITH);
			setState(2012);
			match(T_OPEN_P);
			setState(2013);
			ident();
			setState(2014);
			match(T_EQUAL);
			setState(2015);
			ident();
			setState(2023);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2016);
				match(T_COMMA);
				setState(2017);
				ident();
				setState(2018);
				match(T_EQUAL);
				setState(2019);
				ident();
				}
				}
				setState(2025);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2026);
			match(T_CLOSE_P);
			setState(2030);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,228,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2027);
					create_table_options_mssql_item();
					}
					} 
				}
				setState(2032);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,228,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Print_stmtContext extends ParserRuleContext {
		public TerminalNode T_PRINT() { return getToken(HiveSqlParser.T_PRINT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HiveSqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HiveSqlParser.T_CLOSE_P, 0); }
		public Print_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterPrint_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitPrint_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitPrint_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_stmtContext print_stmt() throws RecognitionException {
		Print_stmtContext _localctx = new Print_stmtContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_print_stmt);
		try {
			setState(2040);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2033);
				match(T_PRINT);
				setState(2034);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2035);
				match(T_PRINT);
				setState(2036);
				match(T_OPEN_P);
				setState(2037);
				expr(0);
				setState(2038);
				match(T_CLOSE_P);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Quit_stmtContext extends ParserRuleContext {
		public TerminalNode T_QUIT() { return getToken(HiveSqlParser.T_QUIT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Quit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quit_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterQuit_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitQuit_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitQuit_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Quit_stmtContext quit_stmt() throws RecognitionException {
		Quit_stmtContext _localctx = new Quit_stmtContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_quit_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2043);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(2042);
				match(T__3);
				}
			}

			setState(2045);
			match(T_QUIT);
			setState(2047);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
			case 1:
				{
				setState(2046);
				expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Raise_stmtContext extends ParserRuleContext {
		public TerminalNode T_RAISE() { return getToken(HiveSqlParser.T_RAISE, 0); }
		public Raise_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterRaise_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitRaise_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitRaise_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raise_stmtContext raise_stmt() throws RecognitionException {
		Raise_stmtContext _localctx = new Raise_stmtContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_raise_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2049);
			match(T_RAISE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Resignal_stmtContext extends ParserRuleContext {
		public TerminalNode T_RESIGNAL() { return getToken(HiveSqlParser.T_RESIGNAL, 0); }
		public TerminalNode T_SQLSTATE() { return getToken(HiveSqlParser.T_SQLSTATE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_VALUE() { return getToken(HiveSqlParser.T_VALUE, 0); }
		public TerminalNode T_SET() { return getToken(HiveSqlParser.T_SET, 0); }
		public TerminalNode T_MESSAGE_TEXT() { return getToken(HiveSqlParser.T_MESSAGE_TEXT, 0); }
		public TerminalNode T_EQUAL() { return getToken(HiveSqlParser.T_EQUAL, 0); }
		public Resignal_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resignal_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterResignal_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitResignal_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitResignal_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Resignal_stmtContext resignal_stmt() throws RecognitionException {
		Resignal_stmtContext _localctx = new Resignal_stmtContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_resignal_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2051);
			match(T_RESIGNAL);
			setState(2063);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				{
				setState(2052);
				match(T_SQLSTATE);
				setState(2054);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
				case 1:
					{
					setState(2053);
					match(T_VALUE);
					}
					break;
				}
				setState(2056);
				expr(0);
				setState(2061);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
				case 1:
					{
					setState(2057);
					match(T_SET);
					setState(2058);
					match(T_MESSAGE_TEXT);
					setState(2059);
					match(T_EQUAL);
					setState(2060);
					expr(0);
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode T_RETURN() { return getToken(HiveSqlParser.T_RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitReturn_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitReturn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2065);
			match(T_RETURN);
			setState(2067);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				{
				setState(2066);
				expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Rollback_stmtContext extends ParserRuleContext {
		public TerminalNode T_ROLLBACK() { return getToken(HiveSqlParser.T_ROLLBACK, 0); }
		public TerminalNode T_WORK() { return getToken(HiveSqlParser.T_WORK, 0); }
		public Rollback_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterRollback_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitRollback_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitRollback_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rollback_stmtContext rollback_stmt() throws RecognitionException {
		Rollback_stmtContext _localctx = new Rollback_stmtContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_rollback_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2069);
			match(T_ROLLBACK);
			setState(2071);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				{
				setState(2070);
				match(T_WORK);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Set_session_optionContext extends ParserRuleContext {
		public Set_current_schema_optionContext set_current_schema_option() {
			return getRuleContext(Set_current_schema_optionContext.class,0);
		}
		public Set_mssql_session_optionContext set_mssql_session_option() {
			return getRuleContext(Set_mssql_session_optionContext.class,0);
		}
		public Set_teradata_session_optionContext set_teradata_session_option() {
			return getRuleContext(Set_teradata_session_optionContext.class,0);
		}
		public Set_session_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_session_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterSet_session_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitSet_session_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitSet_session_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_session_optionContext set_session_option() throws RecognitionException {
		Set_session_optionContext _localctx = new Set_session_optionContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_set_session_option);
		try {
			setState(2076);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_SCHEMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(2073);
				set_current_schema_option();
				}
				break;
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_NOCOUNT:
			case T_QUOTED_IDENTIFIER:
			case T_XACT_ABORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2074);
				set_mssql_session_option();
				}
				break;
			case T_QUERY_BAND:
				enterOuterAlt(_localctx, 3);
				{
				setState(2075);
				set_teradata_session_option();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Set_current_schema_optionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_CURRENT_SCHEMA() { return getToken(HiveSqlParser.T_CURRENT_SCHEMA, 0); }
		public TerminalNode T_EQUAL() { return getToken(HiveSqlParser.T_EQUAL, 0); }
		public TerminalNode T_SCHEMA() { return getToken(HiveSqlParser.T_SCHEMA, 0); }
		public TerminalNode T_CURRENT() { return getToken(HiveSqlParser.T_CURRENT, 0); }
		public Set_current_schema_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_current_schema_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterSet_current_schema_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitSet_current_schema_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitSet_current_schema_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_current_schema_optionContext set_current_schema_option() throws RecognitionException {
		Set_current_schema_optionContext _localctx = new Set_current_schema_optionContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_set_current_schema_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2083);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CURRENT:
			case T_SCHEMA:
				{
				{
				setState(2079);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CURRENT) {
					{
					setState(2078);
					match(T_CURRENT);
					}
				}

				setState(2081);
				match(T_SCHEMA);
				}
				}
				break;
			case T_CURRENT_SCHEMA:
				{
				setState(2082);
				match(T_CURRENT_SCHEMA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2086);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_EQUAL) {
				{
				setState(2085);
				match(T_EQUAL);
				}
			}

			setState(2088);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Set_mssql_session_optionContext extends ParserRuleContext {
		public TerminalNode T_ANSI_NULLS() { return getToken(HiveSqlParser.T_ANSI_NULLS, 0); }
		public TerminalNode T_ANSI_PADDING() { return getToken(HiveSqlParser.T_ANSI_PADDING, 0); }
		public TerminalNode T_NOCOUNT() { return getToken(HiveSqlParser.T_NOCOUNT, 0); }
		public TerminalNode T_QUOTED_IDENTIFIER() { return getToken(HiveSqlParser.T_QUOTED_IDENTIFIER, 0); }
		public TerminalNode T_XACT_ABORT() { return getToken(HiveSqlParser.T_XACT_ABORT, 0); }
		public TerminalNode T_ON() { return getToken(HiveSqlParser.T_ON, 0); }
		public TerminalNode T_OFF() { return getToken(HiveSqlParser.T_OFF, 0); }
		public Set_mssql_session_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_mssql_session_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterSet_mssql_session_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitSet_mssql_session_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitSet_mssql_session_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_mssql_session_optionContext set_mssql_session_option() throws RecognitionException {
		Set_mssql_session_optionContext _localctx = new Set_mssql_session_optionContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_set_mssql_session_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2090);
			_la = _input.LA(1);
			if ( !(_la==T_ANSI_NULLS || _la==T_ANSI_PADDING || _la==T_NOCOUNT || _la==T_QUOTED_IDENTIFIER || _la==T_XACT_ABORT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2091);
			_la = _input.LA(1);
			if ( !(_la==T_OFF || _la==T_ON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Set_teradata_session_optionContext extends ParserRuleContext {
		public TerminalNode T_QUERY_BAND() { return getToken(HiveSqlParser.T_QUERY_BAND, 0); }
		public TerminalNode T_EQUAL() { return getToken(HiveSqlParser.T_EQUAL, 0); }
		public TerminalNode T_FOR() { return getToken(HiveSqlParser.T_FOR, 0); }
		public TerminalNode T_TRANSACTION() { return getToken(HiveSqlParser.T_TRANSACTION, 0); }
		public TerminalNode T_SESSION() { return getToken(HiveSqlParser.T_SESSION, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_NONE() { return getToken(HiveSqlParser.T_NONE, 0); }
		public TerminalNode T_UPDATE() { return getToken(HiveSqlParser.T_UPDATE, 0); }
		public Set_teradata_session_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_teradata_session_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterSet_teradata_session_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitSet_teradata_session_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitSet_teradata_session_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_teradata_session_optionContext set_teradata_session_option() throws RecognitionException {
		Set_teradata_session_optionContext _localctx = new Set_teradata_session_optionContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_set_teradata_session_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2093);
			match(T_QUERY_BAND);
			setState(2094);
			match(T_EQUAL);
			setState(2097);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				{
				setState(2095);
				expr(0);
				}
				break;
			case 2:
				{
				setState(2096);
				match(T_NONE);
				}
				break;
			}
			setState(2100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_UPDATE) {
				{
				setState(2099);
				match(T_UPDATE);
				}
			}

			setState(2102);
			match(T_FOR);
			setState(2103);
			_la = _input.LA(1);
			if ( !(_la==T_SESSION || _la==T_TRANSACTION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Signal_stmtContext extends ParserRuleContext {
		public TerminalNode T_SIGNAL() { return getToken(HiveSqlParser.T_SIGNAL, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Signal_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signal_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterSignal_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitSignal_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitSignal_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signal_stmtContext signal_stmt() throws RecognitionException {
		Signal_stmtContext _localctx = new Signal_stmtContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_signal_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2105);
			match(T_SIGNAL);
			setState(2106);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Summary_stmtContext extends ParserRuleContext {
		public TerminalNode T_SUMMARY() { return getToken(HiveSqlParser.T_SUMMARY, 0); }
		public TerminalNode T_FOR() { return getToken(HiveSqlParser.T_FOR, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_TOP() { return getToken(HiveSqlParser.T_TOP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public TerminalNode T_LIMIT() { return getToken(HiveSqlParser.T_LIMIT, 0); }
		public Summary_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_summary_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterSummary_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitSummary_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitSummary_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Summary_stmtContext summary_stmt() throws RecognitionException {
		Summary_stmtContext _localctx = new Summary_stmtContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_summary_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2108);
			match(T_SUMMARY);
			setState(2111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_TOP) {
				{
				setState(2109);
				match(T_TOP);
				setState(2110);
				expr(0);
				}
			}

			setState(2113);
			match(T_FOR);
			setState(2123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				{
				setState(2114);
				select_stmt();
				}
				break;
			case 2:
				{
				setState(2115);
				table_name();
				setState(2117);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
				case 1:
					{
					setState(2116);
					where_clause();
					}
					break;
				}
				setState(2121);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
				case 1:
					{
					setState(2119);
					match(T_LIMIT);
					setState(2120);
					expr(0);
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Truncate_stmtContext extends ParserRuleContext {
		public TerminalNode T_TRUNCATE() { return getToken(HiveSqlParser.T_TRUNCATE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_TABLE() { return getToken(HiveSqlParser.T_TABLE, 0); }
		public Truncate_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncate_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterTruncate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitTruncate_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitTruncate_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Truncate_stmtContext truncate_stmt() throws RecognitionException {
		Truncate_stmtContext _localctx = new Truncate_stmtContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_truncate_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2125);
			match(T_TRUNCATE);
			setState(2127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
			case 1:
				{
				setState(2126);
				match(T_TABLE);
				}
				break;
			}
			setState(2129);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Use_stmtContext extends ParserRuleContext {
		public TerminalNode T_USE() { return getToken(HiveSqlParser.T_USE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Use_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterUse_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitUse_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitUse_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Use_stmtContext use_stmt() throws RecognitionException {
		Use_stmtContext _localctx = new Use_stmtContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_use_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2131);
			match(T_USE);
			setState(2132);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Values_into_stmtContext extends ParserRuleContext {
		public TerminalNode T_VALUES() { return getToken(HiveSqlParser.T_VALUES, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_INTO() { return getToken(HiveSqlParser.T_INTO, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_OPEN_P() { return getTokens(HiveSqlParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(HiveSqlParser.T_OPEN_P, i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HiveSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveSqlParser.T_COMMA, i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(HiveSqlParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(HiveSqlParser.T_CLOSE_P, i);
		}
		public Values_into_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values_into_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterValues_into_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitValues_into_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitValues_into_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Values_into_stmtContext values_into_stmt() throws RecognitionException {
		Values_into_stmtContext _localctx = new Values_into_stmtContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_values_into_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2134);
			match(T_VALUES);
			setState(2136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				{
				setState(2135);
				match(T_OPEN_P);
				}
				break;
			}
			setState(2138);
			expr(0);
			setState(2143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2139);
				match(T_COMMA);
				setState(2140);
				expr(0);
				}
				}
				setState(2145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_CLOSE_P) {
				{
				setState(2146);
				match(T_CLOSE_P);
				}
			}

			setState(2149);
			match(T_INTO);
			setState(2151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_OPEN_P) {
				{
				setState(2150);
				match(T_OPEN_P);
				}
			}

			setState(2153);
			ident();
			setState(2158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2154);
					match(T_COMMA);
					setState(2155);
					ident();
					}
					} 
				}
				setState(2160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
			}
			setState(2162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				{
				setState(2161);
				match(T_CLOSE_P);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class While_stmtContext extends ParserRuleContext {
		public List<TerminalNode> T_WHILE() { return getTokens(HiveSqlParser.T_WHILE); }
		public TerminalNode T_WHILE(int i) {
			return getToken(HiveSqlParser.T_WHILE, i);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(HiveSqlParser.T_END, 0); }
		public TerminalNode T_DO() { return getToken(HiveSqlParser.T_DO, 0); }
		public List<TerminalNode> T_LOOP() { return getTokens(HiveSqlParser.T_LOOP); }
		public TerminalNode T_LOOP(int i) {
			return getToken(HiveSqlParser.T_LOOP, i);
		}
		public TerminalNode T_THEN() { return getToken(HiveSqlParser.T_THEN, 0); }
		public TerminalNode T_BEGIN() { return getToken(HiveSqlParser.T_BEGIN, 0); }
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitWhile_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_while_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2164);
			match(T_WHILE);
			setState(2165);
			bool_expr(0);
			setState(2166);
			_la = _input.LA(1);
			if ( !(_la==T_BEGIN || _la==T_DO || _la==T_LOOP || _la==T_THEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2167);
			block();
			setState(2168);
			match(T_END);
			setState(2170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				{
				setState(2169);
				_la = _input.LA(1);
				if ( !(_la==T_LOOP || _la==T_WHILE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_cursor_stmtContext extends ParserRuleContext {
		public TerminalNode T_FOR() { return getToken(HiveSqlParser.T_FOR, 0); }
		public TerminalNode L_ID() { return getToken(HiveSqlParser.L_ID, 0); }
		public TerminalNode T_IN() { return getToken(HiveSqlParser.T_IN, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> T_LOOP() { return getTokens(HiveSqlParser.T_LOOP); }
		public TerminalNode T_LOOP(int i) {
			return getToken(HiveSqlParser.T_LOOP, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(HiveSqlParser.T_END, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveSqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HiveSqlParser.T_CLOSE_P, 0); }
		public For_cursor_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_cursor_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterFor_cursor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitFor_cursor_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitFor_cursor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_cursor_stmtContext for_cursor_stmt() throws RecognitionException {
		For_cursor_stmtContext _localctx = new For_cursor_stmtContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_for_cursor_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2172);
			match(T_FOR);
			setState(2173);
			match(L_ID);
			setState(2174);
			match(T_IN);
			setState(2176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
			case 1:
				{
				setState(2175);
				match(T_OPEN_P);
				}
				break;
			}
			setState(2178);
			select_stmt();
			setState(2180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_CLOSE_P) {
				{
				setState(2179);
				match(T_CLOSE_P);
				}
			}

			setState(2182);
			match(T_LOOP);
			setState(2183);
			block();
			setState(2184);
			match(T_END);
			setState(2185);
			match(T_LOOP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_range_stmtContext extends ParserRuleContext {
		public TerminalNode T_FOR() { return getToken(HiveSqlParser.T_FOR, 0); }
		public TerminalNode L_ID() { return getToken(HiveSqlParser.L_ID, 0); }
		public TerminalNode T_IN() { return getToken(HiveSqlParser.T_IN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_DOT2() { return getToken(HiveSqlParser.T_DOT2, 0); }
		public List<TerminalNode> T_LOOP() { return getTokens(HiveSqlParser.T_LOOP); }
		public TerminalNode T_LOOP(int i) {
			return getToken(HiveSqlParser.T_LOOP, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(HiveSqlParser.T_END, 0); }
		public TerminalNode T_REVERSE() { return getToken(HiveSqlParser.T_REVERSE, 0); }
		public TerminalNode T_BY() { return getToken(HiveSqlParser.T_BY, 0); }
		public TerminalNode T_STEP() { return getToken(HiveSqlParser.T_STEP, 0); }
		public For_range_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_range_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterFor_range_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitFor_range_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitFor_range_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_range_stmtContext for_range_stmt() throws RecognitionException {
		For_range_stmtContext _localctx = new For_range_stmtContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_for_range_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2187);
			match(T_FOR);
			setState(2188);
			match(L_ID);
			setState(2189);
			match(T_IN);
			setState(2191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				{
				setState(2190);
				match(T_REVERSE);
				}
				break;
			}
			setState(2193);
			expr(0);
			setState(2194);
			match(T_DOT2);
			setState(2195);
			expr(0);
			setState(2198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_BY || _la==T_STEP) {
				{
				setState(2196);
				_la = _input.LA(1);
				if ( !(_la==T_BY || _la==T_STEP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2197);
				expr(0);
				}
			}

			setState(2200);
			match(T_LOOP);
			setState(2201);
			block();
			setState(2202);
			match(T_END);
			setState(2203);
			match(T_LOOP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LabelContext extends ParserRuleContext {
		public TerminalNode L_LABEL() { return getToken(HiveSqlParser.L_LABEL, 0); }
		public List<TerminalNode> T_LESS() { return getTokens(HiveSqlParser.T_LESS); }
		public TerminalNode T_LESS(int i) {
			return getToken(HiveSqlParser.T_LESS, i);
		}
		public TerminalNode L_ID() { return getToken(HiveSqlParser.L_ID, 0); }
		public List<TerminalNode> T_GREATER() { return getTokens(HiveSqlParser.T_GREATER); }
		public TerminalNode T_GREATER(int i) {
			return getToken(HiveSqlParser.T_GREATER, i);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_label);
		try {
			setState(2211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_LABEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2205);
				match(L_LABEL);
				}
				break;
			case T_LESS:
				enterOuterAlt(_localctx, 2);
				{
				setState(2206);
				match(T_LESS);
				setState(2207);
				match(T_LESS);
				setState(2208);
				match(L_ID);
				setState(2209);
				match(T_GREATER);
				setState(2210);
				match(T_GREATER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Using_clauseContext extends ParserRuleContext {
		public TerminalNode T_USING() { return getToken(HiveSqlParser.T_USING, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HiveSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveSqlParser.T_COMMA, i);
		}
		public Using_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_using_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterUsing_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitUsing_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitUsing_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Using_clauseContext using_clause() throws RecognitionException {
		Using_clauseContext _localctx = new Using_clauseContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_using_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2213);
			match(T_USING);
			setState(2214);
			expr(0);
			setState(2219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2215);
					match(T_COMMA);
					setState(2216);
					expr(0);
					}
					} 
				}
				setState(2221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Select_stmtContext extends ParserRuleContext {
		public Fullselect_stmtContext fullselect_stmt() {
			return getRuleContext(Fullselect_stmtContext.class,0);
		}
		public Cte_select_stmtContext cte_select_stmt() {
			return getRuleContext(Cte_select_stmtContext.class,0);
		}
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitSelect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_WITH) {
				{
				setState(2222);
				cte_select_stmt();
				}
			}

			setState(2225);
			fullselect_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cte_select_stmtContext extends ParserRuleContext {
		public TerminalNode T_WITH() { return getToken(HiveSqlParser.T_WITH, 0); }
		public List<Cte_select_stmt_itemContext> cte_select_stmt_item() {
			return getRuleContexts(Cte_select_stmt_itemContext.class);
		}
		public Cte_select_stmt_itemContext cte_select_stmt_item(int i) {
			return getRuleContext(Cte_select_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HiveSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveSqlParser.T_COMMA, i);
		}
		public Cte_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCte_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCte_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCte_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_select_stmtContext cte_select_stmt() throws RecognitionException {
		Cte_select_stmtContext _localctx = new Cte_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_cte_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2227);
			match(T_WITH);
			setState(2228);
			cte_select_stmt_item();
			setState(2233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2229);
				match(T_COMMA);
				setState(2230);
				cte_select_stmt_item();
				}
				}
				setState(2235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cte_select_stmt_itemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HiveSqlParser.T_AS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveSqlParser.T_OPEN_P, 0); }
		public Fullselect_stmtContext fullselect_stmt() {
			return getRuleContext(Fullselect_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveSqlParser.T_CLOSE_P, 0); }
		public Cte_select_colsContext cte_select_cols() {
			return getRuleContext(Cte_select_colsContext.class,0);
		}
		public Cte_select_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_select_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCte_select_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCte_select_stmt_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCte_select_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_select_stmt_itemContext cte_select_stmt_item() throws RecognitionException {
		Cte_select_stmt_itemContext _localctx = new Cte_select_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_cte_select_stmt_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2236);
			ident();
			setState(2238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_OPEN_P) {
				{
				setState(2237);
				cte_select_cols();
				}
			}

			setState(2240);
			match(T_AS);
			setState(2241);
			match(T_OPEN_P);
			setState(2242);
			fullselect_stmt();
			setState(2243);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cte_select_colsContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HiveSqlParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveSqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HiveSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveSqlParser.T_COMMA, i);
		}
		public Cte_select_colsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_select_cols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterCte_select_cols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitCte_select_cols(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitCte_select_cols(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_select_colsContext cte_select_cols() throws RecognitionException {
		Cte_select_colsContext _localctx = new Cte_select_colsContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_cte_select_cols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2245);
			match(T_OPEN_P);
			setState(2246);
			ident();
			setState(2251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2247);
				match(T_COMMA);
				setState(2248);
				ident();
				}
				}
				setState(2253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2254);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fullselect_stmtContext extends ParserRuleContext {
		public List<Fullselect_stmt_itemContext> fullselect_stmt_item() {
			return getRuleContexts(Fullselect_stmt_itemContext.class);
		}
		public Fullselect_stmt_itemContext fullselect_stmt_item(int i) {
			return getRuleContext(Fullselect_stmt_itemContext.class,i);
		}
		public List<Fullselect_set_clauseContext> fullselect_set_clause() {
			return getRuleContexts(Fullselect_set_clauseContext.class);
		}
		public Fullselect_set_clauseContext fullselect_set_clause(int i) {
			return getRuleContext(Fullselect_set_clauseContext.class,i);
		}
		public Fullselect_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullselect_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterFullselect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitFullselect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitFullselect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fullselect_stmtContext fullselect_stmt() throws RecognitionException {
		Fullselect_stmtContext _localctx = new Fullselect_stmtContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_fullselect_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2256);
			fullselect_stmt_item();
			setState(2262);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,265,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2257);
					fullselect_set_clause();
					setState(2258);
					fullselect_stmt_item();
					}
					} 
				}
				setState(2264);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,265,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fullselect_stmt_itemContext extends ParserRuleContext {
		public Subselect_stmtContext subselect_stmt() {
			return getRuleContext(Subselect_stmtContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HiveSqlParser.T_OPEN_P, 0); }
		public Fullselect_stmtContext fullselect_stmt() {
			return getRuleContext(Fullselect_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveSqlParser.T_CLOSE_P, 0); }
		public Fullselect_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullselect_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterFullselect_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitFullselect_stmt_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitFullselect_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fullselect_stmt_itemContext fullselect_stmt_item() throws RecognitionException {
		Fullselect_stmt_itemContext _localctx = new Fullselect_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_fullselect_stmt_item);
		try {
			setState(2270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEL:
			case T_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2265);
				subselect_stmt();
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(2266);
				match(T_OPEN_P);
				setState(2267);
				fullselect_stmt();
				setState(2268);
				match(T_CLOSE_P);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fullselect_set_clauseContext extends ParserRuleContext {
		public TerminalNode T_UNION() { return getToken(HiveSqlParser.T_UNION, 0); }
		public TerminalNode T_ALL() { return getToken(HiveSqlParser.T_ALL, 0); }
		public TerminalNode T_EXCEPT() { return getToken(HiveSqlParser.T_EXCEPT, 0); }
		public TerminalNode T_INTERSECT() { return getToken(HiveSqlParser.T_INTERSECT, 0); }
		public Fullselect_set_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullselect_set_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterFullselect_set_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitFullselect_set_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitFullselect_set_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fullselect_set_clauseContext fullselect_set_clause() throws RecognitionException {
		Fullselect_set_clauseContext _localctx = new Fullselect_set_clauseContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_fullselect_set_clause);
		int _la;
		try {
			setState(2284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_UNION:
				enterOuterAlt(_localctx, 1);
				{
				setState(2272);
				match(T_UNION);
				setState(2274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(2273);
					match(T_ALL);
					}
				}

				}
				break;
			case T_EXCEPT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2276);
				match(T_EXCEPT);
				setState(2278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(2277);
					match(T_ALL);
					}
				}

				}
				break;
			case T_INTERSECT:
				enterOuterAlt(_localctx, 3);
				{
				setState(2280);
				match(T_INTERSECT);
				setState(2282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(2281);
					match(T_ALL);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Subselect_stmtContext extends ParserRuleContext {
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public TerminalNode T_SELECT() { return getToken(HiveSqlParser.T_SELECT, 0); }
		public TerminalNode T_SEL() { return getToken(HiveSqlParser.T_SEL, 0); }
		public Into_clauseContext into_clause() {
			return getRuleContext(Into_clauseContext.class,0);
		}
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Group_by_clauseContext group_by_clause() {
			return getRuleContext(Group_by_clauseContext.class,0);
		}
		public Having_clauseContext having_clause() {
			return getRuleContext(Having_clauseContext.class,0);
		}
		public Qualify_clauseContext qualify_clause() {
			return getRuleContext(Qualify_clauseContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public Select_optionsContext select_options() {
			return getRuleContext(Select_optionsContext.class,0);
		}
		public Subselect_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subselect_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterSubselect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitSubselect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitSubselect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subselect_stmtContext subselect_stmt() throws RecognitionException {
		Subselect_stmtContext _localctx = new Subselect_stmtContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_subselect_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2286);
			_la = _input.LA(1);
			if ( !(_la==T_SEL || _la==T_SELECT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2287);
			select_list();
			setState(2289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
			case 1:
				{
				setState(2288);
				into_clause();
				}
				break;
			}
			setState(2292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
			case 1:
				{
				setState(2291);
				from_clause();
				}
				break;
			}
			setState(2295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				{
				setState(2294);
				where_clause();
				}
				break;
			}
			setState(2298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
			case 1:
				{
				setState(2297);
				group_by_clause();
				}
				break;
			}
			setState(2302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				{
				setState(2300);
				having_clause();
				}
				break;
			case 2:
				{
				setState(2301);
				qualify_clause();
				}
				break;
			}
			setState(2305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
			case 1:
				{
				setState(2304);
				order_by_clause();
				}
				break;
			}
			setState(2308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
			case 1:
				{
				setState(2307);
				select_options();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Select_listContext extends ParserRuleContext {
		public List<Select_list_itemContext> select_list_item() {
			return getRuleContexts(Select_list_itemContext.class);
		}
		public Select_list_itemContext select_list_item(int i) {
			return getRuleContext(Select_list_itemContext.class,i);
		}
		public Select_list_setContext select_list_set() {
			return getRuleContext(Select_list_setContext.class,0);
		}
		public Select_list_limitContext select_list_limit() {
			return getRuleContext(Select_list_limitContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HiveSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveSqlParser.T_COMMA, i);
		}
		public Select_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterSelect_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitSelect_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitSelect_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_listContext select_list() throws RecognitionException {
		Select_listContext _localctx = new Select_listContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_select_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
			case 1:
				{
				setState(2310);
				select_list_set();
				}
				break;
			}
			setState(2314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
			case 1:
				{
				setState(2313);
				select_list_limit();
				}
				break;
			}
			setState(2316);
			select_list_item();
			setState(2321);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,280,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2317);
					match(T_COMMA);
					setState(2318);
					select_list_item();
					}
					} 
				}
				setState(2323);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,280,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Select_list_setContext extends ParserRuleContext {
		public TerminalNode T_ALL() { return getToken(HiveSqlParser.T_ALL, 0); }
		public TerminalNode T_DISTINCT() { return getToken(HiveSqlParser.T_DISTINCT, 0); }
		public Select_list_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterSelect_list_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitSelect_list_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitSelect_list_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_setContext select_list_set() throws RecognitionException {
		Select_list_setContext _localctx = new Select_list_setContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_select_list_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2324);
			_la = _input.LA(1);
			if ( !(_la==T_ALL || _la==T_DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Select_list_limitContext extends ParserRuleContext {
		public TerminalNode T_TOP() { return getToken(HiveSqlParser.T_TOP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Select_list_limitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_limit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterSelect_list_limit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitSelect_list_limit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitSelect_list_limit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_limitContext select_list_limit() throws RecognitionException {
		Select_list_limitContext _localctx = new Select_list_limitContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_select_list_limit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2326);
			match(T_TOP);
			setState(2327);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Select_list_itemContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Select_list_asteriskContext select_list_asterisk() {
			return getRuleContext(Select_list_asteriskContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(HiveSqlParser.T_EQUAL, 0); }
		public Select_list_aliasContext select_list_alias() {
			return getRuleContext(Select_list_aliasContext.class,0);
		}
		public Select_list_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterSelect_list_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitSelect_list_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitSelect_list_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_itemContext select_list_item() throws RecognitionException {
		Select_list_itemContext _localctx = new Select_list_itemContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_select_list_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
			case 1:
				{
				setState(2332);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
				case 1:
					{
					setState(2329);
					ident();
					setState(2330);
					match(T_EQUAL);
					}
					break;
				}
				setState(2334);
				expr(0);
				setState(2336);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
				case 1:
					{
					setState(2335);
					select_list_alias();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(2338);
				select_list_asterisk();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Select_list_aliasContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HiveSqlParser.T_AS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveSqlParser.T_OPEN_P, 0); }
		public TerminalNode T_TITLE() { return getToken(HiveSqlParser.T_TITLE, 0); }
		public TerminalNode L_S_STRING() { return getToken(HiveSqlParser.L_S_STRING, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HiveSqlParser.T_CLOSE_P, 0); }
		public Select_list_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterSelect_list_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitSelect_list_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitSelect_list_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_aliasContext select_list_alias() throws RecognitionException {
		Select_list_aliasContext _localctx = new Select_list_aliasContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_select_list_alias);
		try {
			setState(2350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2341);
				if (!(!_input.LT(1).getText().equalsIgnoreCase("INTO") && !_input.LT(1).getText().equalsIgnoreCase("FROM"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"INTO\") && !_input.LT(1).getText().equalsIgnoreCase(\"FROM\")");
				setState(2343);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
				case 1:
					{
					setState(2342);
					match(T_AS);
					}
					break;
				}
				setState(2345);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2346);
				match(T_OPEN_P);
				setState(2347);
				match(T_TITLE);
				setState(2348);
				match(L_S_STRING);
				setState(2349);
				match(T_CLOSE_P);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Select_list_asteriskContext extends ParserRuleContext {
		public TerminalNode T_MUL() { return getToken(HiveSqlParser.T_MUL, 0); }
		public TerminalNode L_ID() { return getToken(HiveSqlParser.L_ID, 0); }
		public Select_list_asteriskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_asterisk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterSelect_list_asterisk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitSelect_list_asterisk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitSelect_list_asterisk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_asteriskContext select_list_asterisk() throws RecognitionException {
		Select_list_asteriskContext _localctx = new Select_list_asteriskContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_select_list_asterisk);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_ID) {
				{
				setState(2352);
				match(L_ID);
				setState(2353);
				match(T__3);
				}
			}

			setState(2356);
			match(T_MUL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Into_clauseContext extends ParserRuleContext {
		public TerminalNode T_INTO() { return getToken(HiveSqlParser.T_INTO, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HiveSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveSqlParser.T_COMMA, i);
		}
		public Into_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_into_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterInto_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitInto_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitInto_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Into_clauseContext into_clause() throws RecognitionException {
		Into_clauseContext _localctx = new Into_clauseContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_into_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2358);
			match(T_INTO);
			setState(2359);
			ident();
			setState(2364);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,287,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2360);
					match(T_COMMA);
					setState(2361);
					ident();
					}
					} 
				}
				setState(2366);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,287,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class From_clauseContext extends ParserRuleContext {
		public TerminalNode T_FROM() { return getToken(HiveSqlParser.T_FROM, 0); }
		public From_table_clauseContext from_table_clause() {
			return getRuleContext(From_table_clauseContext.class,0);
		}
		public List<From_join_clauseContext> from_join_clause() {
			return getRuleContexts(From_join_clauseContext.class);
		}
		public From_join_clauseContext from_join_clause(int i) {
			return getRuleContext(From_join_clauseContext.class,i);
		}
		public From_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterFrom_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitFrom_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitFrom_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_clauseContext from_clause() throws RecognitionException {
		From_clauseContext _localctx = new From_clauseContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_from_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2367);
			match(T_FROM);
			setState(2368);
			from_table_clause();
			setState(2372);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,288,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2369);
					from_join_clause();
					}
					} 
				}
				setState(2374);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,288,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class From_table_clauseContext extends ParserRuleContext {
		public From_table_name_clauseContext from_table_name_clause() {
			return getRuleContext(From_table_name_clauseContext.class,0);
		}
		public From_subselect_clauseContext from_subselect_clause() {
			return getRuleContext(From_subselect_clauseContext.class,0);
		}
		public From_table_values_clauseContext from_table_values_clause() {
			return getRuleContext(From_table_values_clauseContext.class,0);
		}
		public From_table_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterFrom_table_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitFrom_table_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitFrom_table_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_table_clauseContext from_table_clause() throws RecognitionException {
		From_table_clauseContext _localctx = new From_table_clauseContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_from_table_clause);
		try {
			setState(2378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2375);
				from_table_name_clause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2376);
				from_subselect_clause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2377);
				from_table_values_clause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class From_table_name_clauseContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public From_alias_clauseContext from_alias_clause() {
			return getRuleContext(From_alias_clauseContext.class,0);
		}
		public From_table_name_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_name_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterFrom_table_name_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitFrom_table_name_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitFrom_table_name_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_table_name_clauseContext from_table_name_clause() throws RecognitionException {
		From_table_name_clauseContext _localctx = new From_table_name_clauseContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_from_table_name_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2380);
			table_name();
			setState(2382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				{
				setState(2381);
				from_alias_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class From_subselect_clauseContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HiveSqlParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveSqlParser.T_CLOSE_P, 0); }
		public From_alias_clauseContext from_alias_clause() {
			return getRuleContext(From_alias_clauseContext.class,0);
		}
		public From_subselect_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_subselect_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterFrom_subselect_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitFrom_subselect_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitFrom_subselect_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_subselect_clauseContext from_subselect_clause() throws RecognitionException {
		From_subselect_clauseContext _localctx = new From_subselect_clauseContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_from_subselect_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2384);
			match(T_OPEN_P);
			setState(2385);
			select_stmt();
			setState(2386);
			match(T_CLOSE_P);
			setState(2388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
			case 1:
				{
				setState(2387);
				from_alias_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class From_join_clauseContext extends ParserRuleContext {
		public TerminalNode T_COMMA() { return getToken(HiveSqlParser.T_COMMA, 0); }
		public From_table_clauseContext from_table_clause() {
			return getRuleContext(From_table_clauseContext.class,0);
		}
		public From_join_type_clauseContext from_join_type_clause() {
			return getRuleContext(From_join_type_clauseContext.class,0);
		}
		public TerminalNode T_ON() { return getToken(HiveSqlParser.T_ON, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public From_join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterFrom_join_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitFrom_join_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitFrom_join_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_join_clauseContext from_join_clause() throws RecognitionException {
		From_join_clauseContext _localctx = new From_join_clauseContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_from_join_clause);
		try {
			setState(2397);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(2390);
				match(T_COMMA);
				setState(2391);
				from_table_clause();
				}
				break;
			case T_FULL:
			case T_INNER:
			case T_JOIN:
			case T_LEFT:
			case T_RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2392);
				from_join_type_clause();
				setState(2393);
				from_table_clause();
				setState(2394);
				match(T_ON);
				setState(2395);
				bool_expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class From_join_type_clauseContext extends ParserRuleContext {
		public TerminalNode T_JOIN() { return getToken(HiveSqlParser.T_JOIN, 0); }
		public TerminalNode T_INNER() { return getToken(HiveSqlParser.T_INNER, 0); }
		public TerminalNode T_LEFT() { return getToken(HiveSqlParser.T_LEFT, 0); }
		public TerminalNode T_RIGHT() { return getToken(HiveSqlParser.T_RIGHT, 0); }
		public TerminalNode T_FULL() { return getToken(HiveSqlParser.T_FULL, 0); }
		public TerminalNode T_OUTER() { return getToken(HiveSqlParser.T_OUTER, 0); }
		public From_join_type_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_join_type_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterFrom_join_type_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitFrom_join_type_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitFrom_join_type_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_join_type_clauseContext from_join_type_clause() throws RecognitionException {
		From_join_type_clauseContext _localctx = new From_join_type_clauseContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_from_join_type_clause);
		int _la;
		try {
			setState(2408);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_INNER:
			case T_JOIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(2400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INNER) {
					{
					setState(2399);
					match(T_INNER);
					}
				}

				setState(2402);
				match(T_JOIN);
				}
				break;
			case T_FULL:
			case T_LEFT:
			case T_RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2403);
				_la = _input.LA(1);
				if ( !(_la==T_FULL || _la==T_LEFT || _la==T_RIGHT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OUTER) {
					{
					setState(2404);
					match(T_OUTER);
					}
				}

				setState(2407);
				match(T_JOIN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class From_table_values_clauseContext extends ParserRuleContext {
		public TerminalNode T_TABLE() { return getToken(HiveSqlParser.T_TABLE, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveSqlParser.T_OPEN_P, 0); }
		public TerminalNode T_VALUES() { return getToken(HiveSqlParser.T_VALUES, 0); }
		public List<From_table_values_rowContext> from_table_values_row() {
			return getRuleContexts(From_table_values_rowContext.class);
		}
		public From_table_values_rowContext from_table_values_row(int i) {
			return getRuleContext(From_table_values_rowContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveSqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HiveSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveSqlParser.T_COMMA, i);
		}
		public From_alias_clauseContext from_alias_clause() {
			return getRuleContext(From_alias_clauseContext.class,0);
		}
		public From_table_values_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_values_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterFrom_table_values_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitFrom_table_values_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitFrom_table_values_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_table_values_clauseContext from_table_values_clause() throws RecognitionException {
		From_table_values_clauseContext _localctx = new From_table_values_clauseContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_from_table_values_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2410);
			match(T_TABLE);
			setState(2411);
			match(T_OPEN_P);
			setState(2412);
			match(T_VALUES);
			setState(2413);
			from_table_values_row();
			setState(2418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2414);
				match(T_COMMA);
				setState(2415);
				from_table_values_row();
				}
				}
				setState(2420);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2421);
			match(T_CLOSE_P);
			setState(2423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
			case 1:
				{
				setState(2422);
				from_alias_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class From_table_values_rowContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_OPEN_P() { return getToken(HiveSqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HiveSqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HiveSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveSqlParser.T_COMMA, i);
		}
		public From_table_values_rowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_values_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterFrom_table_values_row(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitFrom_table_values_row(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitFrom_table_values_row(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_table_values_rowContext from_table_values_row() throws RecognitionException {
		From_table_values_rowContext _localctx = new From_table_values_rowContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_from_table_values_row);
		int _la;
		try {
			setState(2437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2425);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2426);
				match(T_OPEN_P);
				setState(2427);
				expr(0);
				setState(2432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2428);
					match(T_COMMA);
					setState(2429);
					expr(0);
					}
					}
					setState(2434);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2435);
				match(T_CLOSE_P);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class From_alias_clauseContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HiveSqlParser.T_AS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveSqlParser.T_OPEN_P, 0); }
		public List<TerminalNode> L_ID() { return getTokens(HiveSqlParser.L_ID); }
		public TerminalNode L_ID(int i) {
			return getToken(HiveSqlParser.L_ID, i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveSqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HiveSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveSqlParser.T_COMMA, i);
		}
		public From_alias_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_alias_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterFrom_alias_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitFrom_alias_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitFrom_alias_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_alias_clauseContext from_alias_clause() throws RecognitionException {
		From_alias_clauseContext _localctx = new From_alias_clauseContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_from_alias_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2439);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("EXEC") &&
			        !_input.LT(1).getText().equalsIgnoreCase("EXECUTE") &&
			        !_input.LT(1).getText().equalsIgnoreCase("INNER") &&
			        !_input.LT(1).getText().equalsIgnoreCase("LEFT") &&
			        !_input.LT(1).getText().equalsIgnoreCase("GROUP") &&
			        !_input.LT(1).getText().equalsIgnoreCase("ORDER") &&
			        !_input.LT(1).getText().equalsIgnoreCase("LIMIT") &&
			        !_input.LT(1).getText().equalsIgnoreCase("WITH"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"EXEC\") &&\n        !_input.LT(1).getText().equalsIgnoreCase(\"EXECUTE\") &&\n        !_input.LT(1).getText().equalsIgnoreCase(\"INNER\") &&\n        !_input.LT(1).getText().equalsIgnoreCase(\"LEFT\") &&\n        !_input.LT(1).getText().equalsIgnoreCase(\"GROUP\") &&\n        !_input.LT(1).getText().equalsIgnoreCase(\"ORDER\") &&\n        !_input.LT(1).getText().equalsIgnoreCase(\"LIMIT\") &&\n        !_input.LT(1).getText().equalsIgnoreCase(\"WITH\")");
			setState(2441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
			case 1:
				{
				setState(2440);
				match(T_AS);
				}
				break;
			}
			setState(2443);
			ident();
			setState(2454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
			case 1:
				{
				setState(2444);
				match(T_OPEN_P);
				setState(2445);
				match(L_ID);
				setState(2450);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2446);
					match(T_COMMA);
					setState(2447);
					match(L_ID);
					}
					}
					setState(2452);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2453);
				match(T_CLOSE_P);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_nameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2456);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode T_WHERE() { return getToken(HiveSqlParser.T_WHERE, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitWhere_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitWhere_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2458);
			match(T_WHERE);
			setState(2459);
			bool_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Group_by_clauseContext extends ParserRuleContext {
		public TerminalNode T_GROUP() { return getToken(HiveSqlParser.T_GROUP, 0); }
		public TerminalNode T_BY() { return getToken(HiveSqlParser.T_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HiveSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveSqlParser.T_COMMA, i);
		}
		public Group_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterGroup_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitGroup_by_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitGroup_by_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_by_clauseContext group_by_clause() throws RecognitionException {
		Group_by_clauseContext _localctx = new Group_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_group_by_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2461);
			match(T_GROUP);
			setState(2462);
			match(T_BY);
			setState(2463);
			expr(0);
			setState(2468);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,303,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2464);
					match(T_COMMA);
					setState(2465);
					expr(0);
					}
					} 
				}
				setState(2470);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,303,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Having_clauseContext extends ParserRuleContext {
		public TerminalNode T_HAVING() { return getToken(HiveSqlParser.T_HAVING, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Having_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterHaving_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitHaving_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitHaving_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Having_clauseContext having_clause() throws RecognitionException {
		Having_clauseContext _localctx = new Having_clauseContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_having_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2471);
			match(T_HAVING);
			setState(2472);
			bool_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Qualify_clauseContext extends ParserRuleContext {
		public TerminalNode T_QUALIFY() { return getToken(HiveSqlParser.T_QUALIFY, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Qualify_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualify_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterQualify_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitQualify_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitQualify_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualify_clauseContext qualify_clause() throws RecognitionException {
		Qualify_clauseContext _localctx = new Qualify_clauseContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_qualify_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2474);
			match(T_QUALIFY);
			setState(2475);
			bool_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Order_by_clauseContext extends ParserRuleContext {
		public TerminalNode T_ORDER() { return getToken(HiveSqlParser.T_ORDER, 0); }
		public TerminalNode T_BY() { return getToken(HiveSqlParser.T_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HiveSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveSqlParser.T_COMMA, i);
		}
		public List<TerminalNode> T_ASC() { return getTokens(HiveSqlParser.T_ASC); }
		public TerminalNode T_ASC(int i) {
			return getToken(HiveSqlParser.T_ASC, i);
		}
		public List<TerminalNode> T_DESC() { return getTokens(HiveSqlParser.T_DESC); }
		public TerminalNode T_DESC(int i) {
			return getToken(HiveSqlParser.T_DESC, i);
		}
		public Order_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterOrder_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitOrder_by_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitOrder_by_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_by_clauseContext order_by_clause() throws RecognitionException {
		Order_by_clauseContext _localctx = new Order_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_order_by_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2477);
			match(T_ORDER);
			setState(2478);
			match(T_BY);
			setState(2479);
			expr(0);
			setState(2481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
			case 1:
				{
				setState(2480);
				_la = _input.LA(1);
				if ( !(_la==T_ASC || _la==T_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(2490);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,306,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2483);
					match(T_COMMA);
					setState(2484);
					expr(0);
					setState(2486);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,305,_ctx) ) {
					case 1:
						{
						setState(2485);
						_la = _input.LA(1);
						if ( !(_la==T_ASC || _la==T_DESC) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					}
					} 
				}
				setState(2492);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,306,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Select_optionsContext extends ParserRuleContext {
		public List<Select_options_itemContext> select_options_item() {
			return getRuleContexts(Select_options_itemContext.class);
		}
		public Select_options_itemContext select_options_item(int i) {
			return getRuleContext(Select_options_itemContext.class,i);
		}
		public Select_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterSelect_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitSelect_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitSelect_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_optionsContext select_options() throws RecognitionException {
		Select_optionsContext _localctx = new Select_optionsContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_select_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2494); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2493);
					select_options_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2496); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,307,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Select_options_itemContext extends ParserRuleContext {
		public TerminalNode T_LIMIT() { return getToken(HiveSqlParser.T_LIMIT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_WITH() { return getToken(HiveSqlParser.T_WITH, 0); }
		public TerminalNode T_RR() { return getToken(HiveSqlParser.T_RR, 0); }
		public TerminalNode T_RS() { return getToken(HiveSqlParser.T_RS, 0); }
		public TerminalNode T_CS() { return getToken(HiveSqlParser.T_CS, 0); }
		public TerminalNode T_UR() { return getToken(HiveSqlParser.T_UR, 0); }
		public TerminalNode T_USE() { return getToken(HiveSqlParser.T_USE, 0); }
		public TerminalNode T_AND() { return getToken(HiveSqlParser.T_AND, 0); }
		public TerminalNode T_KEEP() { return getToken(HiveSqlParser.T_KEEP, 0); }
		public TerminalNode T_LOCKS() { return getToken(HiveSqlParser.T_LOCKS, 0); }
		public TerminalNode T_EXCLUSIVE() { return getToken(HiveSqlParser.T_EXCLUSIVE, 0); }
		public TerminalNode T_UPDATE() { return getToken(HiveSqlParser.T_UPDATE, 0); }
		public TerminalNode T_SHARE() { return getToken(HiveSqlParser.T_SHARE, 0); }
		public Select_options_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_options_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterSelect_options_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitSelect_options_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitSelect_options_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_options_itemContext select_options_item() throws RecognitionException {
		Select_options_itemContext _localctx = new Select_options_itemContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_select_options_item);
		int _la;
		try {
			setState(2509);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LIMIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2498);
				match(T_LIMIT);
				setState(2499);
				expr(0);
				}
				break;
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(2500);
				match(T_WITH);
				setState(2501);
				_la = _input.LA(1);
				if ( !(_la==T_CS || (((_la - 245)) & ~0x3f) == 0 && ((1L << (_la - 245)) & 72057594037927939L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2507);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
				case 1:
					{
					setState(2502);
					match(T_USE);
					setState(2503);
					match(T_AND);
					setState(2504);
					match(T_KEEP);
					setState(2505);
					_la = _input.LA(1);
					if ( !(_la==T_EXCLUSIVE || _la==T_SHARE || _la==T_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2506);
					match(T_LOCKS);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Update_stmtContext extends ParserRuleContext {
		public TerminalNode T_UPDATE() { return getToken(HiveSqlParser.T_UPDATE, 0); }
		public Update_tableContext update_table() {
			return getRuleContext(Update_tableContext.class,0);
		}
		public TerminalNode T_SET() { return getToken(HiveSqlParser.T_SET, 0); }
		public Update_assignmentContext update_assignment() {
			return getRuleContext(Update_assignmentContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Update_upsertContext update_upsert() {
			return getRuleContext(Update_upsertContext.class,0);
		}
		public Update_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterUpdate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitUpdate_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitUpdate_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmtContext update_stmt() throws RecognitionException {
		Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_update_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2511);
			match(T_UPDATE);
			setState(2512);
			update_table();
			setState(2513);
			match(T_SET);
			setState(2514);
			update_assignment();
			setState(2516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
			case 1:
				{
				setState(2515);
				where_clause();
				}
				break;
			}
			setState(2519);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
			case 1:
				{
				setState(2518);
				update_upsert();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Update_assignmentContext extends ParserRuleContext {
		public List<Assignment_stmt_itemContext> assignment_stmt_item() {
			return getRuleContexts(Assignment_stmt_itemContext.class);
		}
		public Assignment_stmt_itemContext assignment_stmt_item(int i) {
			return getRuleContext(Assignment_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HiveSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveSqlParser.T_COMMA, i);
		}
		public Update_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterUpdate_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitUpdate_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitUpdate_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_assignmentContext update_assignment() throws RecognitionException {
		Update_assignmentContext _localctx = new Update_assignmentContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_update_assignment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2521);
			assignment_stmt_item();
			setState(2526);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,312,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2522);
					match(T_COMMA);
					setState(2523);
					assignment_stmt_item();
					}
					} 
				}
				setState(2528);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,312,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Update_tableContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HiveSqlParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveSqlParser.T_CLOSE_P, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HiveSqlParser.T_AS, 0); }
		public Update_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterUpdate_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitUpdate_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitUpdate_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_tableContext update_table() throws RecognitionException {
		Update_tableContext _localctx = new Update_tableContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_update_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2537);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case T_SUB:
			case L_ID:
				{
				setState(2529);
				table_name();
				setState(2531);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
				case 1:
					{
					setState(2530);
					from_clause();
					}
					break;
				}
				}
				break;
			case T_OPEN_P:
				{
				setState(2533);
				match(T_OPEN_P);
				setState(2534);
				select_stmt();
				setState(2535);
				match(T_CLOSE_P);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
			case 1:
				{
				setState(2540);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
				case 1:
					{
					setState(2539);
					match(T_AS);
					}
					break;
				}
				setState(2542);
				ident();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Update_upsertContext extends ParserRuleContext {
		public TerminalNode T_ELSE() { return getToken(HiveSqlParser.T_ELSE, 0); }
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Update_upsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_upsert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterUpdate_upsert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitUpdate_upsert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitUpdate_upsert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_upsertContext update_upsert() throws RecognitionException {
		Update_upsertContext _localctx = new Update_upsertContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_update_upsert);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2545);
			match(T_ELSE);
			setState(2546);
			insert_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Merge_stmtContext extends ParserRuleContext {
		public TerminalNode T_MERGE() { return getToken(HiveSqlParser.T_MERGE, 0); }
		public TerminalNode T_INTO() { return getToken(HiveSqlParser.T_INTO, 0); }
		public List<Merge_tableContext> merge_table() {
			return getRuleContexts(Merge_tableContext.class);
		}
		public Merge_tableContext merge_table(int i) {
			return getRuleContext(Merge_tableContext.class,i);
		}
		public TerminalNode T_USING() { return getToken(HiveSqlParser.T_USING, 0); }
		public TerminalNode T_ON() { return getToken(HiveSqlParser.T_ON, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public List<Merge_conditionContext> merge_condition() {
			return getRuleContexts(Merge_conditionContext.class);
		}
		public Merge_conditionContext merge_condition(int i) {
			return getRuleContext(Merge_conditionContext.class,i);
		}
		public Merge_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_merge_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterMerge_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitMerge_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitMerge_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Merge_stmtContext merge_stmt() throws RecognitionException {
		Merge_stmtContext _localctx = new Merge_stmtContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_merge_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2548);
			match(T_MERGE);
			setState(2549);
			match(T_INTO);
			setState(2550);
			merge_table();
			setState(2551);
			match(T_USING);
			setState(2552);
			merge_table();
			setState(2553);
			match(T_ON);
			setState(2554);
			bool_expr(0);
			setState(2556); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2555);
					merge_condition();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2558); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,317,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Merge_tableContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HiveSqlParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveSqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_AS() { return getToken(HiveSqlParser.T_AS, 0); }
		public Merge_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_merge_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterMerge_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitMerge_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitMerge_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Merge_tableContext merge_table() throws RecognitionException {
		Merge_tableContext _localctx = new Merge_tableContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_merge_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2565);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case T_SUB:
			case L_ID:
				{
				setState(2560);
				table_name();
				}
				break;
			case T_OPEN_P:
				{
				{
				setState(2561);
				match(T_OPEN_P);
				setState(2562);
				select_stmt();
				setState(2563);
				match(T_CLOSE_P);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,320,_ctx) ) {
			case 1:
				{
				setState(2568);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,319,_ctx) ) {
				case 1:
					{
					setState(2567);
					match(T_AS);
					}
					break;
				}
				setState(2570);
				ident();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Merge_conditionContext extends ParserRuleContext {
		public TerminalNode T_WHEN() { return getToken(HiveSqlParser.T_WHEN, 0); }
		public TerminalNode T_MATCHED() { return getToken(HiveSqlParser.T_MATCHED, 0); }
		public TerminalNode T_THEN() { return getToken(HiveSqlParser.T_THEN, 0); }
		public Merge_actionContext merge_action() {
			return getRuleContext(Merge_actionContext.class,0);
		}
		public TerminalNode T_NOT() { return getToken(HiveSqlParser.T_NOT, 0); }
		public TerminalNode T_AND() { return getToken(HiveSqlParser.T_AND, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_ELSE() { return getToken(HiveSqlParser.T_ELSE, 0); }
		public TerminalNode T_IGNORE() { return getToken(HiveSqlParser.T_IGNORE, 0); }
		public Merge_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_merge_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterMerge_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitMerge_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitMerge_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Merge_conditionContext merge_condition() throws RecognitionException {
		Merge_conditionContext _localctx = new Merge_conditionContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_merge_condition);
		int _la;
		try {
			setState(2586);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_WHEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(2573);
				match(T_WHEN);
				setState(2575);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2574);
					match(T_NOT);
					}
				}

				setState(2577);
				match(T_MATCHED);
				setState(2580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AND) {
					{
					setState(2578);
					match(T_AND);
					setState(2579);
					bool_expr(0);
					}
				}

				setState(2582);
				match(T_THEN);
				setState(2583);
				merge_action();
				}
				break;
			case T_ELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2584);
				match(T_ELSE);
				setState(2585);
				match(T_IGNORE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Merge_actionContext extends ParserRuleContext {
		public TerminalNode T_INSERT() { return getToken(HiveSqlParser.T_INSERT, 0); }
		public TerminalNode T_VALUES() { return getToken(HiveSqlParser.T_VALUES, 0); }
		public Insert_stmt_rowContext insert_stmt_row() {
			return getRuleContext(Insert_stmt_rowContext.class,0);
		}
		public Insert_stmt_colsContext insert_stmt_cols() {
			return getRuleContext(Insert_stmt_colsContext.class,0);
		}
		public TerminalNode T_UPDATE() { return getToken(HiveSqlParser.T_UPDATE, 0); }
		public TerminalNode T_SET() { return getToken(HiveSqlParser.T_SET, 0); }
		public List<Assignment_stmt_itemContext> assignment_stmt_item() {
			return getRuleContexts(Assignment_stmt_itemContext.class);
		}
		public Assignment_stmt_itemContext assignment_stmt_item(int i) {
			return getRuleContext(Assignment_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HiveSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveSqlParser.T_COMMA, i);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public TerminalNode T_DELETE() { return getToken(HiveSqlParser.T_DELETE, 0); }
		public Merge_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_merge_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterMerge_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitMerge_action(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitMerge_action(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Merge_actionContext merge_action() throws RecognitionException {
		Merge_actionContext _localctx = new Merge_actionContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_merge_action);
		int _la;
		try {
			int _alt;
			setState(2608);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_INSERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2588);
				match(T_INSERT);
				setState(2590);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(2589);
					insert_stmt_cols();
					}
				}

				setState(2592);
				match(T_VALUES);
				setState(2593);
				insert_stmt_row();
				}
				break;
			case T_UPDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2594);
				match(T_UPDATE);
				setState(2595);
				match(T_SET);
				setState(2596);
				assignment_stmt_item();
				setState(2601);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,325,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2597);
						match(T_COMMA);
						setState(2598);
						assignment_stmt_item();
						}
						} 
					}
					setState(2603);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,325,_ctx);
				}
				setState(2605);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,326,_ctx) ) {
				case 1:
					{
					setState(2604);
					where_clause();
					}
					break;
				}
				}
				break;
			case T_DELETE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2607);
				match(T_DELETE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Delete_stmtContext extends ParserRuleContext {
		public TerminalNode T_DELETE() { return getToken(HiveSqlParser.T_DELETE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_FROM() { return getToken(HiveSqlParser.T_FROM, 0); }
		public Delete_aliasContext delete_alias() {
			return getRuleContext(Delete_aliasContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public TerminalNode T_ALL() { return getToken(HiveSqlParser.T_ALL, 0); }
		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterDelete_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitDelete_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitDelete_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_delete_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2610);
			match(T_DELETE);
			setState(2612);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,328,_ctx) ) {
			case 1:
				{
				setState(2611);
				match(T_FROM);
				}
				break;
			}
			setState(2614);
			table_name();
			setState(2616);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,329,_ctx) ) {
			case 1:
				{
				setState(2615);
				delete_alias();
				}
				break;
			}
			setState(2620);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,330,_ctx) ) {
			case 1:
				{
				setState(2618);
				where_clause();
				}
				break;
			case 2:
				{
				setState(2619);
				match(T_ALL);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Delete_aliasContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HiveSqlParser.T_AS, 0); }
		public Delete_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterDelete_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitDelete_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitDelete_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_aliasContext delete_alias() throws RecognitionException {
		Delete_aliasContext _localctx = new Delete_aliasContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_delete_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2622);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("ALL"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"ALL\")");
			setState(2624);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,331,_ctx) ) {
			case 1:
				{
				setState(2623);
				match(T_AS);
				}
				break;
			}
			setState(2626);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Describe_stmtContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_DESCRIBE() { return getToken(HiveSqlParser.T_DESCRIBE, 0); }
		public TerminalNode T_DESC() { return getToken(HiveSqlParser.T_DESC, 0); }
		public TerminalNode T_TABLE() { return getToken(HiveSqlParser.T_TABLE, 0); }
		public Describe_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describe_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterDescribe_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitDescribe_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitDescribe_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Describe_stmtContext describe_stmt() throws RecognitionException {
		Describe_stmtContext _localctx = new Describe_stmtContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_describe_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2628);
			_la = _input.LA(1);
			if ( !(_la==T_DESC || _la==T_DESCRIBE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2630);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,332,_ctx) ) {
			case 1:
				{
				setState(2629);
				match(T_TABLE);
				}
				break;
			}
			setState(2632);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bool_exprContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HiveSqlParser.T_OPEN_P, 0); }
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveSqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_NOT() { return getToken(HiveSqlParser.T_NOT, 0); }
		public Bool_expr_atomContext bool_expr_atom() {
			return getRuleContext(Bool_expr_atomContext.class,0);
		}
		public Bool_expr_logical_operatorContext bool_expr_logical_operator() {
			return getRuleContext(Bool_expr_logical_operatorContext.class,0);
		}
		public Bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterBool_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitBool_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitBool_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_exprContext bool_expr() throws RecognitionException {
		return bool_expr(0);
	}

	private Bool_exprContext bool_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, _parentState);
		Bool_exprContext _prevctx = _localctx;
		int _startState = 368;
		enterRecursionRule(_localctx, 368, RULE_bool_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2643);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,334,_ctx) ) {
			case 1:
				{
				setState(2636);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2635);
					match(T_NOT);
					}
				}

				setState(2638);
				match(T_OPEN_P);
				setState(2639);
				bool_expr(0);
				setState(2640);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(2642);
				bool_expr_atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2651);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,335,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bool_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bool_expr);
					setState(2645);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(2646);
					bool_expr_logical_operator();
					setState(2647);
					bool_expr(3);
					}
					} 
				}
				setState(2653);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,335,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bool_expr_atomContext extends ParserRuleContext {
		public Bool_expr_unaryContext bool_expr_unary() {
			return getRuleContext(Bool_expr_unaryContext.class,0);
		}
		public Bool_expr_binaryContext bool_expr_binary() {
			return getRuleContext(Bool_expr_binaryContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Bool_expr_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterBool_expr_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitBool_expr_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitBool_expr_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_atomContext bool_expr_atom() throws RecognitionException {
		Bool_expr_atomContext _localctx = new Bool_expr_atomContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_bool_expr_atom);
		try {
			setState(2657);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,336,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2654);
				bool_expr_unary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2655);
				bool_expr_binary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2656);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bool_expr_unaryContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_IS() { return getToken(HiveSqlParser.T_IS, 0); }
		public TerminalNode T_NULL() { return getToken(HiveSqlParser.T_NULL, 0); }
		public TerminalNode T_NOT() { return getToken(HiveSqlParser.T_NOT, 0); }
		public TerminalNode T_BETWEEN() { return getToken(HiveSqlParser.T_BETWEEN, 0); }
		public TerminalNode T_AND() { return getToken(HiveSqlParser.T_AND, 0); }
		public TerminalNode T_EXISTS() { return getToken(HiveSqlParser.T_EXISTS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveSqlParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveSqlParser.T_CLOSE_P, 0); }
		public Bool_expr_single_inContext bool_expr_single_in() {
			return getRuleContext(Bool_expr_single_inContext.class,0);
		}
		public Bool_expr_multi_inContext bool_expr_multi_in() {
			return getRuleContext(Bool_expr_multi_inContext.class,0);
		}
		public Bool_expr_unaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterBool_expr_unary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitBool_expr_unary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitBool_expr_unary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_unaryContext bool_expr_unary() throws RecognitionException {
		Bool_expr_unaryContext _localctx = new Bool_expr_unaryContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_bool_expr_unary);
		int _la;
		try {
			setState(2682);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,339,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2659);
				expr(0);
				setState(2660);
				match(T_IS);
				setState(2662);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2661);
					match(T_NOT);
					}
				}

				setState(2664);
				match(T_NULL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2666);
				expr(0);
				setState(2667);
				match(T_BETWEEN);
				setState(2668);
				expr(0);
				setState(2669);
				match(T_AND);
				setState(2670);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2673);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2672);
					match(T_NOT);
					}
				}

				setState(2675);
				match(T_EXISTS);
				setState(2676);
				match(T_OPEN_P);
				setState(2677);
				select_stmt();
				setState(2678);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2680);
				bool_expr_single_in();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2681);
				bool_expr_multi_in();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bool_expr_single_inContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_IN() { return getToken(HiveSqlParser.T_IN, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveSqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HiveSqlParser.T_CLOSE_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_NOT() { return getToken(HiveSqlParser.T_NOT, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HiveSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveSqlParser.T_COMMA, i);
		}
		public Bool_expr_single_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_single_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterBool_expr_single_in(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitBool_expr_single_in(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitBool_expr_single_in(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_single_inContext bool_expr_single_in() throws RecognitionException {
		Bool_expr_single_inContext _localctx = new Bool_expr_single_inContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_bool_expr_single_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2684);
			expr(0);
			setState(2686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NOT) {
				{
				setState(2685);
				match(T_NOT);
				}
			}

			setState(2688);
			match(T_IN);
			setState(2689);
			match(T_OPEN_P);
			setState(2699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,342,_ctx) ) {
			case 1:
				{
				{
				setState(2690);
				expr(0);
				setState(2695);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2691);
					match(T_COMMA);
					setState(2692);
					expr(0);
					}
					}
					setState(2697);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				setState(2698);
				select_stmt();
				}
				break;
			}
			setState(2701);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bool_expr_multi_inContext extends ParserRuleContext {
		public List<TerminalNode> T_OPEN_P() { return getTokens(HiveSqlParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(HiveSqlParser.T_OPEN_P, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(HiveSqlParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(HiveSqlParser.T_CLOSE_P, i);
		}
		public TerminalNode T_IN() { return getToken(HiveSqlParser.T_IN, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HiveSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveSqlParser.T_COMMA, i);
		}
		public TerminalNode T_NOT() { return getToken(HiveSqlParser.T_NOT, 0); }
		public Bool_expr_multi_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_multi_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterBool_expr_multi_in(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitBool_expr_multi_in(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitBool_expr_multi_in(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_multi_inContext bool_expr_multi_in() throws RecognitionException {
		Bool_expr_multi_inContext _localctx = new Bool_expr_multi_inContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_bool_expr_multi_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2703);
			match(T_OPEN_P);
			setState(2704);
			expr(0);
			setState(2709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2705);
				match(T_COMMA);
				setState(2706);
				expr(0);
				}
				}
				setState(2711);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2712);
			match(T_CLOSE_P);
			setState(2714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NOT) {
				{
				setState(2713);
				match(T_NOT);
				}
			}

			setState(2716);
			match(T_IN);
			setState(2717);
			match(T_OPEN_P);
			setState(2718);
			select_stmt();
			setState(2719);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bool_expr_binaryContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Bool_expr_binary_operatorContext bool_expr_binary_operator() {
			return getRuleContext(Bool_expr_binary_operatorContext.class,0);
		}
		public Bool_expr_binaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_binary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterBool_expr_binary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitBool_expr_binary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitBool_expr_binary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_binaryContext bool_expr_binary() throws RecognitionException {
		Bool_expr_binaryContext _localctx = new Bool_expr_binaryContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_bool_expr_binary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2721);
			expr(0);
			setState(2722);
			bool_expr_binary_operator();
			setState(2723);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bool_expr_logical_operatorContext extends ParserRuleContext {
		public TerminalNode T_AND() { return getToken(HiveSqlParser.T_AND, 0); }
		public TerminalNode T_OR() { return getToken(HiveSqlParser.T_OR, 0); }
		public Bool_expr_logical_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_logical_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterBool_expr_logical_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitBool_expr_logical_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitBool_expr_logical_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_logical_operatorContext bool_expr_logical_operator() throws RecognitionException {
		Bool_expr_logical_operatorContext _localctx = new Bool_expr_logical_operatorContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_bool_expr_logical_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2725);
			_la = _input.LA(1);
			if ( !(_la==T_AND || _la==T_OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bool_expr_binary_operatorContext extends ParserRuleContext {
		public TerminalNode T_EQUAL() { return getToken(HiveSqlParser.T_EQUAL, 0); }
		public TerminalNode T_EQUAL2() { return getToken(HiveSqlParser.T_EQUAL2, 0); }
		public TerminalNode T_NOTEQUAL() { return getToken(HiveSqlParser.T_NOTEQUAL, 0); }
		public TerminalNode T_NOTEQUAL2() { return getToken(HiveSqlParser.T_NOTEQUAL2, 0); }
		public TerminalNode T_LESS() { return getToken(HiveSqlParser.T_LESS, 0); }
		public TerminalNode T_LESSEQUAL() { return getToken(HiveSqlParser.T_LESSEQUAL, 0); }
		public TerminalNode T_GREATER() { return getToken(HiveSqlParser.T_GREATER, 0); }
		public TerminalNode T_GREATEREQUAL() { return getToken(HiveSqlParser.T_GREATEREQUAL, 0); }
		public TerminalNode T_LIKE() { return getToken(HiveSqlParser.T_LIKE, 0); }
		public TerminalNode T_RLIKE() { return getToken(HiveSqlParser.T_RLIKE, 0); }
		public TerminalNode T_REGEXP() { return getToken(HiveSqlParser.T_REGEXP, 0); }
		public TerminalNode T_NOT() { return getToken(HiveSqlParser.T_NOT, 0); }
		public Bool_expr_binary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_binary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterBool_expr_binary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitBool_expr_binary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitBool_expr_binary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_binary_operatorContext bool_expr_binary_operator() throws RecognitionException {
		Bool_expr_binary_operatorContext _localctx = new Bool_expr_binary_operatorContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_bool_expr_binary_operator);
		int _la;
		try {
			setState(2739);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2727);
				match(T_EQUAL);
				}
				break;
			case T_EQUAL2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2728);
				match(T_EQUAL2);
				}
				break;
			case T_NOTEQUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2729);
				match(T_NOTEQUAL);
				}
				break;
			case T_NOTEQUAL2:
				enterOuterAlt(_localctx, 4);
				{
				setState(2730);
				match(T_NOTEQUAL2);
				}
				break;
			case T_LESS:
				enterOuterAlt(_localctx, 5);
				{
				setState(2731);
				match(T_LESS);
				}
				break;
			case T_LESSEQUAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(2732);
				match(T_LESSEQUAL);
				}
				break;
			case T_GREATER:
				enterOuterAlt(_localctx, 7);
				{
				setState(2733);
				match(T_GREATER);
				}
				break;
			case T_GREATEREQUAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(2734);
				match(T_GREATEREQUAL);
				}
				break;
			case T_LIKE:
			case T_NOT:
			case T_REGEXP:
			case T_RLIKE:
				enterOuterAlt(_localctx, 9);
				{
				setState(2736);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2735);
					match(T_NOT);
					}
				}

				setState(2738);
				_la = _input.LA(1);
				if ( !(_la==T_LIKE || _la==T_REGEXP || _la==T_RLIKE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HiveSqlParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveSqlParser.T_CLOSE_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr_intervalContext expr_interval() {
			return getRuleContext(Expr_intervalContext.class,0);
		}
		public Expr_concatContext expr_concat() {
			return getRuleContext(Expr_concatContext.class,0);
		}
		public Expr_caseContext expr_case() {
			return getRuleContext(Expr_caseContext.class,0);
		}
		public Expr_cursor_attributeContext expr_cursor_attribute() {
			return getRuleContext(Expr_cursor_attributeContext.class,0);
		}
		public Expr_agg_window_funcContext expr_agg_window_func() {
			return getRuleContext(Expr_agg_window_funcContext.class,0);
		}
		public Expr_spec_funcContext expr_spec_func() {
			return getRuleContext(Expr_spec_funcContext.class,0);
		}
		public Expr_funcContext expr_func() {
			return getRuleContext(Expr_funcContext.class,0);
		}
		public Expr_atomContext expr_atom() {
			return getRuleContext(Expr_atomContext.class,0);
		}
		public TerminalNode T_MUL() { return getToken(HiveSqlParser.T_MUL, 0); }
		public TerminalNode T_DIV() { return getToken(HiveSqlParser.T_DIV, 0); }
		public TerminalNode T_ADD() { return getToken(HiveSqlParser.T_ADD, 0); }
		public TerminalNode T_SUB() { return getToken(HiveSqlParser.T_SUB, 0); }
		public Interval_itemContext interval_item() {
			return getRuleContext(Interval_itemContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 384;
		enterRecursionRule(_localctx, 384, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2758);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,347,_ctx) ) {
			case 1:
				{
				setState(2742);
				match(T_OPEN_P);
				setState(2743);
				select_stmt();
				setState(2744);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(2746);
				match(T_OPEN_P);
				setState(2747);
				expr(0);
				setState(2748);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				{
				setState(2750);
				expr_interval();
				}
				break;
			case 4:
				{
				setState(2751);
				expr_concat();
				}
				break;
			case 5:
				{
				setState(2752);
				expr_case();
				}
				break;
			case 6:
				{
				setState(2753);
				expr_cursor_attribute();
				}
				break;
			case 7:
				{
				setState(2754);
				expr_agg_window_func();
				}
				break;
			case 8:
				{
				setState(2755);
				expr_spec_func();
				}
				break;
			case 9:
				{
				setState(2756);
				expr_func();
				}
				break;
			case 10:
				{
				setState(2757);
				expr_atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2776);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,349,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2774);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,348,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2760);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(2761);
						match(T_MUL);
						setState(2762);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2763);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(2764);
						match(T_DIV);
						setState(2765);
						expr(14);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2766);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(2767);
						match(T_ADD);
						setState(2768);
						expr(13);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2769);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(2770);
						match(T_SUB);
						setState(2771);
						expr(12);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2772);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(2773);
						interval_item();
						}
						break;
					}
					} 
				}
				setState(2778);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,349,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_atomContext extends ParserRuleContext {
		public Date_literalContext date_literal() {
			return getRuleContext(Date_literalContext.class,0);
		}
		public Timestamp_literalContext timestamp_literal() {
			return getRuleContext(Timestamp_literalContext.class,0);
		}
		public Bool_literalContext bool_literal() {
			return getRuleContext(Bool_literalContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Dec_numberContext dec_number() {
			return getRuleContext(Dec_numberContext.class,0);
		}
		public Int_numberContext int_number() {
			return getRuleContext(Int_numberContext.class,0);
		}
		public Null_constContext null_const() {
			return getRuleContext(Null_constContext.class,0);
		}
		public Expr_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterExpr_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitExpr_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitExpr_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_atomContext expr_atom() throws RecognitionException {
		Expr_atomContext _localctx = new Expr_atomContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_expr_atom);
		try {
			setState(2787);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,350,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2779);
				date_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2780);
				timestamp_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2781);
				bool_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2782);
				ident();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2783);
				string();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2784);
				dec_number();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2785);
				int_number();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2786);
				null_const();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_intervalContext extends ParserRuleContext {
		public TerminalNode T_INTERVAL() { return getToken(HiveSqlParser.T_INTERVAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Interval_itemContext interval_item() {
			return getRuleContext(Interval_itemContext.class,0);
		}
		public Expr_intervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterExpr_interval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitExpr_interval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitExpr_interval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_intervalContext expr_interval() throws RecognitionException {
		Expr_intervalContext _localctx = new Expr_intervalContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_expr_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2789);
			match(T_INTERVAL);
			setState(2790);
			expr(0);
			setState(2791);
			interval_item();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Interval_itemContext extends ParserRuleContext {
		public TerminalNode T_DAY() { return getToken(HiveSqlParser.T_DAY, 0); }
		public TerminalNode T_DAYS() { return getToken(HiveSqlParser.T_DAYS, 0); }
		public TerminalNode T_MICROSECOND() { return getToken(HiveSqlParser.T_MICROSECOND, 0); }
		public TerminalNode T_MICROSECONDS() { return getToken(HiveSqlParser.T_MICROSECONDS, 0); }
		public TerminalNode T_SECOND() { return getToken(HiveSqlParser.T_SECOND, 0); }
		public TerminalNode T_SECONDS() { return getToken(HiveSqlParser.T_SECONDS, 0); }
		public Interval_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterInterval_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitInterval_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitInterval_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interval_itemContext interval_item() throws RecognitionException {
		Interval_itemContext _localctx = new Interval_itemContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_interval_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2793);
			_la = _input.LA(1);
			if ( !(_la==T_DAY || _la==T_DAYS || _la==T_MICROSECOND || _la==T_MICROSECONDS || _la==T_SECOND || _la==T_SECONDS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_concatContext extends ParserRuleContext {
		public List<Expr_concat_itemContext> expr_concat_item() {
			return getRuleContexts(Expr_concat_itemContext.class);
		}
		public Expr_concat_itemContext expr_concat_item(int i) {
			return getRuleContext(Expr_concat_itemContext.class,i);
		}
		public List<TerminalNode> T_PIPE() { return getTokens(HiveSqlParser.T_PIPE); }
		public TerminalNode T_PIPE(int i) {
			return getToken(HiveSqlParser.T_PIPE, i);
		}
		public List<TerminalNode> T_CONCAT() { return getTokens(HiveSqlParser.T_CONCAT); }
		public TerminalNode T_CONCAT(int i) {
			return getToken(HiveSqlParser.T_CONCAT, i);
		}
		public Expr_concatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_concat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterExpr_concat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitExpr_concat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitExpr_concat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_concatContext expr_concat() throws RecognitionException {
		Expr_concatContext _localctx = new Expr_concatContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_expr_concat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2795);
			expr_concat_item();
			setState(2796);
			_la = _input.LA(1);
			if ( !(_la==T_CONCAT || _la==T_PIPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2797);
			expr_concat_item();
			setState(2802);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,351,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2798);
					_la = _input.LA(1);
					if ( !(_la==T_CONCAT || _la==T_PIPE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2799);
					expr_concat_item();
					}
					} 
				}
				setState(2804);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,351,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_concat_itemContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HiveSqlParser.T_OPEN_P, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveSqlParser.T_CLOSE_P, 0); }
		public Expr_caseContext expr_case() {
			return getRuleContext(Expr_caseContext.class,0);
		}
		public Expr_agg_window_funcContext expr_agg_window_func() {
			return getRuleContext(Expr_agg_window_funcContext.class,0);
		}
		public Expr_spec_funcContext expr_spec_func() {
			return getRuleContext(Expr_spec_funcContext.class,0);
		}
		public Expr_funcContext expr_func() {
			return getRuleContext(Expr_funcContext.class,0);
		}
		public Expr_atomContext expr_atom() {
			return getRuleContext(Expr_atomContext.class,0);
		}
		public Expr_concat_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_concat_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterExpr_concat_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitExpr_concat_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitExpr_concat_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_concat_itemContext expr_concat_item() throws RecognitionException {
		Expr_concat_itemContext _localctx = new Expr_concat_itemContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_expr_concat_item);
		try {
			setState(2814);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,352,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2805);
				match(T_OPEN_P);
				setState(2806);
				expr(0);
				setState(2807);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2809);
				expr_case();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2810);
				expr_agg_window_func();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2811);
				expr_spec_func();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2812);
				expr_func();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2813);
				expr_atom();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_caseContext extends ParserRuleContext {
		public Expr_case_simpleContext expr_case_simple() {
			return getRuleContext(Expr_case_simpleContext.class,0);
		}
		public Expr_case_searchedContext expr_case_searched() {
			return getRuleContext(Expr_case_searchedContext.class,0);
		}
		public Expr_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterExpr_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitExpr_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitExpr_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_caseContext expr_case() throws RecognitionException {
		Expr_caseContext _localctx = new Expr_caseContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_expr_case);
		try {
			setState(2818);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,353,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2816);
				expr_case_simple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2817);
				expr_case_searched();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_case_simpleContext extends ParserRuleContext {
		public TerminalNode T_CASE() { return getToken(HiveSqlParser.T_CASE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_END() { return getToken(HiveSqlParser.T_END, 0); }
		public List<TerminalNode> T_WHEN() { return getTokens(HiveSqlParser.T_WHEN); }
		public TerminalNode T_WHEN(int i) {
			return getToken(HiveSqlParser.T_WHEN, i);
		}
		public List<TerminalNode> T_THEN() { return getTokens(HiveSqlParser.T_THEN); }
		public TerminalNode T_THEN(int i) {
			return getToken(HiveSqlParser.T_THEN, i);
		}
		public TerminalNode T_ELSE() { return getToken(HiveSqlParser.T_ELSE, 0); }
		public Expr_case_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_case_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterExpr_case_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitExpr_case_simple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitExpr_case_simple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_case_simpleContext expr_case_simple() throws RecognitionException {
		Expr_case_simpleContext _localctx = new Expr_case_simpleContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_expr_case_simple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2820);
			match(T_CASE);
			setState(2821);
			expr(0);
			setState(2827); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2822);
				match(T_WHEN);
				setState(2823);
				expr(0);
				setState(2824);
				match(T_THEN);
				setState(2825);
				expr(0);
				}
				}
				setState(2829); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_WHEN );
			setState(2833);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(2831);
				match(T_ELSE);
				setState(2832);
				expr(0);
				}
			}

			setState(2835);
			match(T_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_case_searchedContext extends ParserRuleContext {
		public TerminalNode T_CASE() { return getToken(HiveSqlParser.T_CASE, 0); }
		public TerminalNode T_END() { return getToken(HiveSqlParser.T_END, 0); }
		public List<TerminalNode> T_WHEN() { return getTokens(HiveSqlParser.T_WHEN); }
		public TerminalNode T_WHEN(int i) {
			return getToken(HiveSqlParser.T_WHEN, i);
		}
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public List<TerminalNode> T_THEN() { return getTokens(HiveSqlParser.T_THEN); }
		public TerminalNode T_THEN(int i) {
			return getToken(HiveSqlParser.T_THEN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_ELSE() { return getToken(HiveSqlParser.T_ELSE, 0); }
		public Expr_case_searchedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_case_searched; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterExpr_case_searched(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitExpr_case_searched(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitExpr_case_searched(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_case_searchedContext expr_case_searched() throws RecognitionException {
		Expr_case_searchedContext _localctx = new Expr_case_searchedContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_expr_case_searched);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2837);
			match(T_CASE);
			setState(2843); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2838);
				match(T_WHEN);
				setState(2839);
				bool_expr(0);
				setState(2840);
				match(T_THEN);
				setState(2841);
				expr(0);
				}
				}
				setState(2845); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_WHEN );
			setState(2849);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(2847);
				match(T_ELSE);
				setState(2848);
				expr(0);
				}
			}

			setState(2851);
			match(T_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_cursor_attributeContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_ISOPEN() { return getToken(HiveSqlParser.T_ISOPEN, 0); }
		public TerminalNode T_FOUND() { return getToken(HiveSqlParser.T_FOUND, 0); }
		public TerminalNode T_NOTFOUND() { return getToken(HiveSqlParser.T_NOTFOUND, 0); }
		public Expr_cursor_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_cursor_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterExpr_cursor_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitExpr_cursor_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitExpr_cursor_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_cursor_attributeContext expr_cursor_attribute() throws RecognitionException {
		Expr_cursor_attributeContext _localctx = new Expr_cursor_attributeContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_expr_cursor_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2853);
			ident();
			setState(2854);
			match(T__2);
			setState(2855);
			_la = _input.LA(1);
			if ( !(_la==T_FOUND || _la==T_ISOPEN || _la==T_NOTFOUND) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_agg_window_funcContext extends ParserRuleContext {
		public TerminalNode T_AVG() { return getToken(HiveSqlParser.T_AVG, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveSqlParser.T_OPEN_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveSqlParser.T_CLOSE_P, 0); }
		public Expr_func_all_distinctContext expr_func_all_distinct() {
			return getRuleContext(Expr_func_all_distinctContext.class,0);
		}
		public Expr_func_over_clauseContext expr_func_over_clause() {
			return getRuleContext(Expr_func_over_clauseContext.class,0);
		}
		public TerminalNode T_COUNT() { return getToken(HiveSqlParser.T_COUNT, 0); }
		public TerminalNode T_MUL() { return getToken(HiveSqlParser.T_MUL, 0); }
		public TerminalNode T_COUNT_BIG() { return getToken(HiveSqlParser.T_COUNT_BIG, 0); }
		public TerminalNode T_CUME_DIST() { return getToken(HiveSqlParser.T_CUME_DIST, 0); }
		public TerminalNode T_DENSE_RANK() { return getToken(HiveSqlParser.T_DENSE_RANK, 0); }
		public TerminalNode T_FIRST_VALUE() { return getToken(HiveSqlParser.T_FIRST_VALUE, 0); }
		public TerminalNode T_LAG() { return getToken(HiveSqlParser.T_LAG, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HiveSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveSqlParser.T_COMMA, i);
		}
		public TerminalNode T_LAST_VALUE() { return getToken(HiveSqlParser.T_LAST_VALUE, 0); }
		public TerminalNode T_LEAD() { return getToken(HiveSqlParser.T_LEAD, 0); }
		public TerminalNode T_MAX() { return getToken(HiveSqlParser.T_MAX, 0); }
		public TerminalNode T_MIN() { return getToken(HiveSqlParser.T_MIN, 0); }
		public TerminalNode T_RANK() { return getToken(HiveSqlParser.T_RANK, 0); }
		public TerminalNode T_ROW_NUMBER() { return getToken(HiveSqlParser.T_ROW_NUMBER, 0); }
		public TerminalNode T_STDEV() { return getToken(HiveSqlParser.T_STDEV, 0); }
		public TerminalNode T_SUM() { return getToken(HiveSqlParser.T_SUM, 0); }
		public TerminalNode T_VAR() { return getToken(HiveSqlParser.T_VAR, 0); }
		public TerminalNode T_VARIANCE() { return getToken(HiveSqlParser.T_VARIANCE, 0); }
		public Expr_agg_window_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_agg_window_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterExpr_agg_window_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitExpr_agg_window_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitExpr_agg_window_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_agg_window_funcContext expr_agg_window_func() throws RecognitionException {
		Expr_agg_window_funcContext _localctx = new Expr_agg_window_funcContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_expr_agg_window_func);
		int _la;
		try {
			setState(3009);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AVG:
				enterOuterAlt(_localctx, 1);
				{
				setState(2857);
				match(T_AVG);
				setState(2858);
				match(T_OPEN_P);
				setState(2860);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,358,_ctx) ) {
				case 1:
					{
					setState(2859);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2862);
				expr(0);
				setState(2863);
				match(T_CLOSE_P);
				setState(2865);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,359,_ctx) ) {
				case 1:
					{
					setState(2864);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_COUNT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2867);
				match(T_COUNT);
				setState(2868);
				match(T_OPEN_P);
				setState(2874);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ACTION:
				case T_ADD2:
				case T_ALL:
				case T_ALLOCATE:
				case T_ALTER:
				case T_AND:
				case T_ANSI_NULLS:
				case T_ANSI_PADDING:
				case T_AS:
				case T_ASC:
				case T_ASSOCIATE:
				case T_AT:
				case T_AUTO_INCREMENT:
				case T_AVG:
				case T_BATCHSIZE:
				case T_BEGIN:
				case T_BETWEEN:
				case T_BIGINT:
				case T_BINARY_DOUBLE:
				case T_BINARY_FLOAT:
				case T_BIT:
				case T_BODY:
				case T_BREAK:
				case T_BY:
				case T_BYTE:
				case T_CALL:
				case T_CALLER:
				case T_CASCADE:
				case T_CASE:
				case T_CASESPECIFIC:
				case T_CAST:
				case T_CHAR:
				case T_CHARACTER:
				case T_CHARSET:
				case T_CLIENT:
				case T_CLOSE:
				case T_CLUSTERED:
				case T_CMP:
				case T_COLLECT:
				case T_COLLECTION:
				case T_COLUMN:
				case T_COMMENT:
				case T_CONSTANT:
				case T_COMMIT:
				case T_COMPRESS:
				case T_CONCAT:
				case T_CONDITION:
				case T_CONSTRAINT:
				case T_CONTINUE:
				case T_COPY:
				case T_COUNT:
				case T_COUNT_BIG:
				case T_CREATE:
				case T_CREATION:
				case T_CREATOR:
				case T_CS:
				case T_CURRENT:
				case T_CURRENT_SCHEMA:
				case T_CURSOR:
				case T_DATABASE:
				case T_DATA:
				case T_DATE:
				case T_DATETIME:
				case T_DAY:
				case T_DAYS:
				case T_DEC:
				case T_DECIMAL:
				case T_DECLARE:
				case T_DEFAULT:
				case T_DEFERRED:
				case T_DEFINED:
				case T_DEFINER:
				case T_DEFINITION:
				case T_DELETE:
				case T_DELIMITED:
				case T_DELIMITER:
				case T_DESC:
				case T_DESCRIBE:
				case T_DIAGNOSTICS:
				case T_DIR:
				case T_DIRECTORY:
				case T_DISTINCT:
				case T_DISTRIBUTE:
				case T_DO:
				case T_DOUBLE:
				case T_DROP:
				case T_DYNAMIC:
				case T_ENABLE:
				case T_ENGINE:
				case T_ESCAPED:
				case T_EXCEPT:
				case T_EXEC:
				case T_EXECUTE:
				case T_EXCEPTION:
				case T_EXCLUSIVE:
				case T_EXISTS:
				case T_EXIT:
				case T_FALLBACK:
				case T_FALSE:
				case T_FETCH:
				case T_FIELDS:
				case T_FILE:
				case T_FILES:
				case T_FLOAT:
				case T_FOR:
				case T_FOREIGN:
				case T_FORMAT:
				case T_FOUND:
				case T_FROM:
				case T_FULL:
				case T_FUNCTION:
				case T_GET:
				case T_GLOBAL:
				case T_GO:
				case T_GRANT:
				case T_GROUP:
				case T_HANDLER:
				case T_HASH:
				case T_HAVING:
				case T_HDFS:
				case T_HIVE:
				case T_HOST:
				case T_IDENTITY:
				case T_IF:
				case T_IGNORE:
				case T_IMMEDIATE:
				case T_IN:
				case T_INCLUDE:
				case T_INDEX:
				case T_INITRANS:
				case T_INNER:
				case T_INOUT:
				case T_INSERT:
				case T_INT:
				case T_INT2:
				case T_INT4:
				case T_INT8:
				case T_INTEGER:
				case T_INTERSECT:
				case T_INTERVAL:
				case T_INTO:
				case T_INVOKER:
				case T_IS:
				case T_ISOPEN:
				case T_ITEMS:
				case T_JOIN:
				case T_KEEP:
				case T_KEY:
				case T_KEYS:
				case T_LANGUAGE:
				case T_LEAVE:
				case T_LEFT:
				case T_LIKE:
				case T_LIMIT:
				case T_LINES:
				case T_LOCAL:
				case T_LOCATION:
				case T_LOCATOR:
				case T_LOCATORS:
				case T_LOCKS:
				case T_LOG:
				case T_LOGGED:
				case T_LOGGING:
				case T_LOOP:
				case T_MAP:
				case T_MATCHED:
				case T_MAX:
				case T_MAXTRANS:
				case T_MERGE:
				case T_MESSAGE_TEXT:
				case T_MICROSECOND:
				case T_MICROSECONDS:
				case T_MIN:
				case T_MULTISET:
				case T_NCHAR:
				case T_NEW:
				case T_NVARCHAR:
				case T_NO:
				case T_NOCOUNT:
				case T_NOCOMPRESS:
				case T_NOLOGGING:
				case T_NONE:
				case T_NOT:
				case T_NOTFOUND:
				case T_NULL:
				case T_NUMERIC:
				case T_NUMBER:
				case T_OBJECT:
				case T_OFF:
				case T_ON:
				case T_ONLY:
				case T_OPEN:
				case T_OR:
				case T_ORDER:
				case T_OUT:
				case T_OUTER:
				case T_OVER:
				case T_OVERWRITE:
				case T_OWNER:
				case T_PACKAGE:
				case T_PARTITION:
				case T_PCTFREE:
				case T_PCTUSED:
				case T_PRECISION:
				case T_PRESERVE:
				case T_PRIMARY:
				case T_PRINT:
				case T_PROC:
				case T_PROCEDURE:
				case T_QUALIFY:
				case T_QUERY_BAND:
				case T_QUIT:
				case T_QUOTED_IDENTIFIER:
				case T_RAISE:
				case T_REAL:
				case T_REFERENCES:
				case T_REGEXP:
				case T_REPLACE:
				case T_RESIGNAL:
				case T_RESTRICT:
				case T_RESULT:
				case T_RESULT_SET_LOCATOR:
				case T_RETURN:
				case T_RETURNS:
				case T_REVERSE:
				case T_RIGHT:
				case T_RLIKE:
				case T_ROLE:
				case T_ROLLBACK:
				case T_ROW:
				case T_ROWS:
				case T_ROW_COUNT:
				case T_RR:
				case T_RS:
				case T_PWD:
				case T_TRIM:
				case T_SCHEMA:
				case T_SECOND:
				case T_SECONDS:
				case T_SECURITY:
				case T_SEGMENT:
				case T_SEL:
				case T_SELECT:
				case T_SET:
				case T_SESSION:
				case T_SESSIONS:
				case T_SETS:
				case T_SHARE:
				case T_SIGNAL:
				case T_SIMPLE_DOUBLE:
				case T_SIMPLE_FLOAT:
				case T_SMALLDATETIME:
				case T_SMALLINT:
				case T_SQL:
				case T_SQLEXCEPTION:
				case T_SQLINSERT:
				case T_SQLSTATE:
				case T_SQLWARNING:
				case T_STATS:
				case T_STATISTICS:
				case T_STEP:
				case T_STORAGE:
				case T_STORED:
				case T_STRING:
				case T_SUBDIR:
				case T_SUBSTRING:
				case T_SUM:
				case T_SUMMARY:
				case T_SYS_REFCURSOR:
				case T_TABLE:
				case T_TABLESPACE:
				case T_TEMPORARY:
				case T_TERMINATED:
				case T_TEXTIMAGE_ON:
				case T_THEN:
				case T_TIMESTAMP:
				case T_TITLE:
				case T_TO:
				case T_TOP:
				case T_TRANSACTION:
				case T_TRUE:
				case T_TRUNCATE:
				case T_UNIQUE:
				case T_UPDATE:
				case T_UR:
				case T_USE:
				case T_USING:
				case T_VALUE:
				case T_VALUES:
				case T_VAR:
				case T_VARCHAR:
				case T_VARCHAR2:
				case T_VARYING:
				case T_VOLATILE:
				case T_WHILE:
				case T_WITH:
				case T_WITHOUT:
				case T_WORK:
				case T_XACT_ABORT:
				case T_XML:
				case T_YES:
				case T_ACTIVITY_COUNT:
				case T_CUME_DIST:
				case T_CURRENT_DATE:
				case T_CURRENT_TIMESTAMP:
				case T_CURRENT_USER:
				case T_DENSE_RANK:
				case T_FIRST_VALUE:
				case T_LAG:
				case T_LAST_VALUE:
				case T_LEAD:
				case T_MAX_PART_STRING:
				case T_MIN_PART_STRING:
				case T_MAX_PART_INT:
				case T_MIN_PART_INT:
				case T_MAX_PART_DATE:
				case T_MIN_PART_DATE:
				case T_PART_COUNT:
				case T_PART_LOC:
				case T_RANK:
				case T_ROW_NUMBER:
				case T_STDEV:
				case T_SYSDATE:
				case T_VARIANCE:
				case T_USER:
				case T_ADD:
				case T_OPEN_P:
				case T_SUB:
				case L_ID:
				case L_S_STRING:
				case L_D_STRING:
				case L_INT:
				case L_DEC:
					{
					{
					setState(2870);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,360,_ctx) ) {
					case 1:
						{
						setState(2869);
						expr_func_all_distinct();
						}
						break;
					}
					setState(2872);
					expr(0);
					}
					}
					break;
				case T_MUL:
					{
					setState(2873);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2876);
				match(T_CLOSE_P);
				setState(2878);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,362,_ctx) ) {
				case 1:
					{
					setState(2877);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_COUNT_BIG:
				enterOuterAlt(_localctx, 3);
				{
				setState(2880);
				match(T_COUNT_BIG);
				setState(2881);
				match(T_OPEN_P);
				setState(2887);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ACTION:
				case T_ADD2:
				case T_ALL:
				case T_ALLOCATE:
				case T_ALTER:
				case T_AND:
				case T_ANSI_NULLS:
				case T_ANSI_PADDING:
				case T_AS:
				case T_ASC:
				case T_ASSOCIATE:
				case T_AT:
				case T_AUTO_INCREMENT:
				case T_AVG:
				case T_BATCHSIZE:
				case T_BEGIN:
				case T_BETWEEN:
				case T_BIGINT:
				case T_BINARY_DOUBLE:
				case T_BINARY_FLOAT:
				case T_BIT:
				case T_BODY:
				case T_BREAK:
				case T_BY:
				case T_BYTE:
				case T_CALL:
				case T_CALLER:
				case T_CASCADE:
				case T_CASE:
				case T_CASESPECIFIC:
				case T_CAST:
				case T_CHAR:
				case T_CHARACTER:
				case T_CHARSET:
				case T_CLIENT:
				case T_CLOSE:
				case T_CLUSTERED:
				case T_CMP:
				case T_COLLECT:
				case T_COLLECTION:
				case T_COLUMN:
				case T_COMMENT:
				case T_CONSTANT:
				case T_COMMIT:
				case T_COMPRESS:
				case T_CONCAT:
				case T_CONDITION:
				case T_CONSTRAINT:
				case T_CONTINUE:
				case T_COPY:
				case T_COUNT:
				case T_COUNT_BIG:
				case T_CREATE:
				case T_CREATION:
				case T_CREATOR:
				case T_CS:
				case T_CURRENT:
				case T_CURRENT_SCHEMA:
				case T_CURSOR:
				case T_DATABASE:
				case T_DATA:
				case T_DATE:
				case T_DATETIME:
				case T_DAY:
				case T_DAYS:
				case T_DEC:
				case T_DECIMAL:
				case T_DECLARE:
				case T_DEFAULT:
				case T_DEFERRED:
				case T_DEFINED:
				case T_DEFINER:
				case T_DEFINITION:
				case T_DELETE:
				case T_DELIMITED:
				case T_DELIMITER:
				case T_DESC:
				case T_DESCRIBE:
				case T_DIAGNOSTICS:
				case T_DIR:
				case T_DIRECTORY:
				case T_DISTINCT:
				case T_DISTRIBUTE:
				case T_DO:
				case T_DOUBLE:
				case T_DROP:
				case T_DYNAMIC:
				case T_ENABLE:
				case T_ENGINE:
				case T_ESCAPED:
				case T_EXCEPT:
				case T_EXEC:
				case T_EXECUTE:
				case T_EXCEPTION:
				case T_EXCLUSIVE:
				case T_EXISTS:
				case T_EXIT:
				case T_FALLBACK:
				case T_FALSE:
				case T_FETCH:
				case T_FIELDS:
				case T_FILE:
				case T_FILES:
				case T_FLOAT:
				case T_FOR:
				case T_FOREIGN:
				case T_FORMAT:
				case T_FOUND:
				case T_FROM:
				case T_FULL:
				case T_FUNCTION:
				case T_GET:
				case T_GLOBAL:
				case T_GO:
				case T_GRANT:
				case T_GROUP:
				case T_HANDLER:
				case T_HASH:
				case T_HAVING:
				case T_HDFS:
				case T_HIVE:
				case T_HOST:
				case T_IDENTITY:
				case T_IF:
				case T_IGNORE:
				case T_IMMEDIATE:
				case T_IN:
				case T_INCLUDE:
				case T_INDEX:
				case T_INITRANS:
				case T_INNER:
				case T_INOUT:
				case T_INSERT:
				case T_INT:
				case T_INT2:
				case T_INT4:
				case T_INT8:
				case T_INTEGER:
				case T_INTERSECT:
				case T_INTERVAL:
				case T_INTO:
				case T_INVOKER:
				case T_IS:
				case T_ISOPEN:
				case T_ITEMS:
				case T_JOIN:
				case T_KEEP:
				case T_KEY:
				case T_KEYS:
				case T_LANGUAGE:
				case T_LEAVE:
				case T_LEFT:
				case T_LIKE:
				case T_LIMIT:
				case T_LINES:
				case T_LOCAL:
				case T_LOCATION:
				case T_LOCATOR:
				case T_LOCATORS:
				case T_LOCKS:
				case T_LOG:
				case T_LOGGED:
				case T_LOGGING:
				case T_LOOP:
				case T_MAP:
				case T_MATCHED:
				case T_MAX:
				case T_MAXTRANS:
				case T_MERGE:
				case T_MESSAGE_TEXT:
				case T_MICROSECOND:
				case T_MICROSECONDS:
				case T_MIN:
				case T_MULTISET:
				case T_NCHAR:
				case T_NEW:
				case T_NVARCHAR:
				case T_NO:
				case T_NOCOUNT:
				case T_NOCOMPRESS:
				case T_NOLOGGING:
				case T_NONE:
				case T_NOT:
				case T_NOTFOUND:
				case T_NULL:
				case T_NUMERIC:
				case T_NUMBER:
				case T_OBJECT:
				case T_OFF:
				case T_ON:
				case T_ONLY:
				case T_OPEN:
				case T_OR:
				case T_ORDER:
				case T_OUT:
				case T_OUTER:
				case T_OVER:
				case T_OVERWRITE:
				case T_OWNER:
				case T_PACKAGE:
				case T_PARTITION:
				case T_PCTFREE:
				case T_PCTUSED:
				case T_PRECISION:
				case T_PRESERVE:
				case T_PRIMARY:
				case T_PRINT:
				case T_PROC:
				case T_PROCEDURE:
				case T_QUALIFY:
				case T_QUERY_BAND:
				case T_QUIT:
				case T_QUOTED_IDENTIFIER:
				case T_RAISE:
				case T_REAL:
				case T_REFERENCES:
				case T_REGEXP:
				case T_REPLACE:
				case T_RESIGNAL:
				case T_RESTRICT:
				case T_RESULT:
				case T_RESULT_SET_LOCATOR:
				case T_RETURN:
				case T_RETURNS:
				case T_REVERSE:
				case T_RIGHT:
				case T_RLIKE:
				case T_ROLE:
				case T_ROLLBACK:
				case T_ROW:
				case T_ROWS:
				case T_ROW_COUNT:
				case T_RR:
				case T_RS:
				case T_PWD:
				case T_TRIM:
				case T_SCHEMA:
				case T_SECOND:
				case T_SECONDS:
				case T_SECURITY:
				case T_SEGMENT:
				case T_SEL:
				case T_SELECT:
				case T_SET:
				case T_SESSION:
				case T_SESSIONS:
				case T_SETS:
				case T_SHARE:
				case T_SIGNAL:
				case T_SIMPLE_DOUBLE:
				case T_SIMPLE_FLOAT:
				case T_SMALLDATETIME:
				case T_SMALLINT:
				case T_SQL:
				case T_SQLEXCEPTION:
				case T_SQLINSERT:
				case T_SQLSTATE:
				case T_SQLWARNING:
				case T_STATS:
				case T_STATISTICS:
				case T_STEP:
				case T_STORAGE:
				case T_STORED:
				case T_STRING:
				case T_SUBDIR:
				case T_SUBSTRING:
				case T_SUM:
				case T_SUMMARY:
				case T_SYS_REFCURSOR:
				case T_TABLE:
				case T_TABLESPACE:
				case T_TEMPORARY:
				case T_TERMINATED:
				case T_TEXTIMAGE_ON:
				case T_THEN:
				case T_TIMESTAMP:
				case T_TITLE:
				case T_TO:
				case T_TOP:
				case T_TRANSACTION:
				case T_TRUE:
				case T_TRUNCATE:
				case T_UNIQUE:
				case T_UPDATE:
				case T_UR:
				case T_USE:
				case T_USING:
				case T_VALUE:
				case T_VALUES:
				case T_VAR:
				case T_VARCHAR:
				case T_VARCHAR2:
				case T_VARYING:
				case T_VOLATILE:
				case T_WHILE:
				case T_WITH:
				case T_WITHOUT:
				case T_WORK:
				case T_XACT_ABORT:
				case T_XML:
				case T_YES:
				case T_ACTIVITY_COUNT:
				case T_CUME_DIST:
				case T_CURRENT_DATE:
				case T_CURRENT_TIMESTAMP:
				case T_CURRENT_USER:
				case T_DENSE_RANK:
				case T_FIRST_VALUE:
				case T_LAG:
				case T_LAST_VALUE:
				case T_LEAD:
				case T_MAX_PART_STRING:
				case T_MIN_PART_STRING:
				case T_MAX_PART_INT:
				case T_MIN_PART_INT:
				case T_MAX_PART_DATE:
				case T_MIN_PART_DATE:
				case T_PART_COUNT:
				case T_PART_LOC:
				case T_RANK:
				case T_ROW_NUMBER:
				case T_STDEV:
				case T_SYSDATE:
				case T_VARIANCE:
				case T_USER:
				case T_ADD:
				case T_OPEN_P:
				case T_SUB:
				case L_ID:
				case L_S_STRING:
				case L_D_STRING:
				case L_INT:
				case L_DEC:
					{
					{
					setState(2883);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,363,_ctx) ) {
					case 1:
						{
						setState(2882);
						expr_func_all_distinct();
						}
						break;
					}
					setState(2885);
					expr(0);
					}
					}
					break;
				case T_MUL:
					{
					setState(2886);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2889);
				match(T_CLOSE_P);
				setState(2891);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,365,_ctx) ) {
				case 1:
					{
					setState(2890);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_CUME_DIST:
				enterOuterAlt(_localctx, 4);
				{
				setState(2893);
				match(T_CUME_DIST);
				setState(2894);
				match(T_OPEN_P);
				setState(2895);
				match(T_CLOSE_P);
				setState(2896);
				expr_func_over_clause();
				}
				break;
			case T_DENSE_RANK:
				enterOuterAlt(_localctx, 5);
				{
				setState(2897);
				match(T_DENSE_RANK);
				setState(2898);
				match(T_OPEN_P);
				setState(2899);
				match(T_CLOSE_P);
				setState(2900);
				expr_func_over_clause();
				}
				break;
			case T_FIRST_VALUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(2901);
				match(T_FIRST_VALUE);
				setState(2902);
				match(T_OPEN_P);
				setState(2903);
				expr(0);
				setState(2904);
				match(T_CLOSE_P);
				setState(2905);
				expr_func_over_clause();
				}
				break;
			case T_LAG:
				enterOuterAlt(_localctx, 7);
				{
				setState(2907);
				match(T_LAG);
				setState(2908);
				match(T_OPEN_P);
				setState(2909);
				expr(0);
				setState(2916);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2910);
					match(T_COMMA);
					setState(2911);
					expr(0);
					setState(2914);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_COMMA) {
						{
						setState(2912);
						match(T_COMMA);
						setState(2913);
						expr(0);
						}
					}

					}
				}

				setState(2918);
				match(T_CLOSE_P);
				setState(2919);
				expr_func_over_clause();
				}
				break;
			case T_LAST_VALUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(2921);
				match(T_LAST_VALUE);
				setState(2922);
				match(T_OPEN_P);
				setState(2923);
				expr(0);
				setState(2924);
				match(T_CLOSE_P);
				setState(2925);
				expr_func_over_clause();
				}
				break;
			case T_LEAD:
				enterOuterAlt(_localctx, 9);
				{
				setState(2927);
				match(T_LEAD);
				setState(2928);
				match(T_OPEN_P);
				setState(2929);
				expr(0);
				setState(2936);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2930);
					match(T_COMMA);
					setState(2931);
					expr(0);
					setState(2934);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_COMMA) {
						{
						setState(2932);
						match(T_COMMA);
						setState(2933);
						expr(0);
						}
					}

					}
				}

				setState(2938);
				match(T_CLOSE_P);
				setState(2939);
				expr_func_over_clause();
				}
				break;
			case T_MAX:
				enterOuterAlt(_localctx, 10);
				{
				setState(2941);
				match(T_MAX);
				setState(2942);
				match(T_OPEN_P);
				setState(2944);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,370,_ctx) ) {
				case 1:
					{
					setState(2943);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2946);
				expr(0);
				setState(2947);
				match(T_CLOSE_P);
				setState(2949);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,371,_ctx) ) {
				case 1:
					{
					setState(2948);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_MIN:
				enterOuterAlt(_localctx, 11);
				{
				setState(2951);
				match(T_MIN);
				setState(2952);
				match(T_OPEN_P);
				setState(2954);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,372,_ctx) ) {
				case 1:
					{
					setState(2953);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2956);
				expr(0);
				setState(2957);
				match(T_CLOSE_P);
				setState(2959);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,373,_ctx) ) {
				case 1:
					{
					setState(2958);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_RANK:
				enterOuterAlt(_localctx, 12);
				{
				setState(2961);
				match(T_RANK);
				setState(2962);
				match(T_OPEN_P);
				setState(2963);
				match(T_CLOSE_P);
				setState(2964);
				expr_func_over_clause();
				}
				break;
			case T_ROW_NUMBER:
				enterOuterAlt(_localctx, 13);
				{
				setState(2965);
				match(T_ROW_NUMBER);
				setState(2966);
				match(T_OPEN_P);
				setState(2967);
				match(T_CLOSE_P);
				setState(2968);
				expr_func_over_clause();
				}
				break;
			case T_STDEV:
				enterOuterAlt(_localctx, 14);
				{
				setState(2969);
				match(T_STDEV);
				setState(2970);
				match(T_OPEN_P);
				setState(2972);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,374,_ctx) ) {
				case 1:
					{
					setState(2971);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2974);
				expr(0);
				setState(2975);
				match(T_CLOSE_P);
				setState(2977);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,375,_ctx) ) {
				case 1:
					{
					setState(2976);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_SUM:
				enterOuterAlt(_localctx, 15);
				{
				setState(2979);
				match(T_SUM);
				setState(2980);
				match(T_OPEN_P);
				setState(2982);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,376,_ctx) ) {
				case 1:
					{
					setState(2981);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2984);
				expr(0);
				setState(2985);
				match(T_CLOSE_P);
				setState(2987);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,377,_ctx) ) {
				case 1:
					{
					setState(2986);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_VAR:
				enterOuterAlt(_localctx, 16);
				{
				setState(2989);
				match(T_VAR);
				setState(2990);
				match(T_OPEN_P);
				setState(2992);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,378,_ctx) ) {
				case 1:
					{
					setState(2991);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2994);
				expr(0);
				setState(2995);
				match(T_CLOSE_P);
				setState(2997);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,379,_ctx) ) {
				case 1:
					{
					setState(2996);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_VARIANCE:
				enterOuterAlt(_localctx, 17);
				{
				setState(2999);
				match(T_VARIANCE);
				setState(3000);
				match(T_OPEN_P);
				setState(3002);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,380,_ctx) ) {
				case 1:
					{
					setState(3001);
					expr_func_all_distinct();
					}
					break;
				}
				setState(3004);
				expr(0);
				setState(3005);
				match(T_CLOSE_P);
				setState(3007);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,381,_ctx) ) {
				case 1:
					{
					setState(3006);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_func_all_distinctContext extends ParserRuleContext {
		public TerminalNode T_ALL() { return getToken(HiveSqlParser.T_ALL, 0); }
		public TerminalNode T_DISTINCT() { return getToken(HiveSqlParser.T_DISTINCT, 0); }
		public Expr_func_all_distinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_all_distinct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterExpr_func_all_distinct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitExpr_func_all_distinct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitExpr_func_all_distinct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_func_all_distinctContext expr_func_all_distinct() throws RecognitionException {
		Expr_func_all_distinctContext _localctx = new Expr_func_all_distinctContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_expr_func_all_distinct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3011);
			_la = _input.LA(1);
			if ( !(_la==T_ALL || _la==T_DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_func_over_clauseContext extends ParserRuleContext {
		public TerminalNode T_OVER() { return getToken(HiveSqlParser.T_OVER, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveSqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HiveSqlParser.T_CLOSE_P, 0); }
		public Expr_func_partition_by_clauseContext expr_func_partition_by_clause() {
			return getRuleContext(Expr_func_partition_by_clauseContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public Expr_func_over_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_over_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterExpr_func_over_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitExpr_func_over_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitExpr_func_over_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_func_over_clauseContext expr_func_over_clause() throws RecognitionException {
		Expr_func_over_clauseContext _localctx = new Expr_func_over_clauseContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_expr_func_over_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3013);
			match(T_OVER);
			setState(3014);
			match(T_OPEN_P);
			setState(3016);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_PARTITION) {
				{
				setState(3015);
				expr_func_partition_by_clause();
				}
			}

			setState(3019);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ORDER) {
				{
				setState(3018);
				order_by_clause();
				}
			}

			setState(3021);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_func_partition_by_clauseContext extends ParserRuleContext {
		public TerminalNode T_PARTITION() { return getToken(HiveSqlParser.T_PARTITION, 0); }
		public TerminalNode T_BY() { return getToken(HiveSqlParser.T_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HiveSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveSqlParser.T_COMMA, i);
		}
		public Expr_func_partition_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_partition_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterExpr_func_partition_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitExpr_func_partition_by_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitExpr_func_partition_by_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_func_partition_by_clauseContext expr_func_partition_by_clause() throws RecognitionException {
		Expr_func_partition_by_clauseContext _localctx = new Expr_func_partition_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_expr_func_partition_by_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3023);
			match(T_PARTITION);
			setState(3024);
			match(T_BY);
			setState(3025);
			expr(0);
			setState(3030);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(3026);
				match(T_COMMA);
				setState(3027);
				expr(0);
				}
				}
				setState(3032);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_spec_funcContext extends ParserRuleContext {
		public TerminalNode T_ACTIVITY_COUNT() { return getToken(HiveSqlParser.T_ACTIVITY_COUNT, 0); }
		public TerminalNode T_CAST() { return getToken(HiveSqlParser.T_CAST, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HiveSqlParser.T_OPEN_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_AS() { return getToken(HiveSqlParser.T_AS, 0); }
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HiveSqlParser.T_CLOSE_P, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public TerminalNode T_COUNT() { return getToken(HiveSqlParser.T_COUNT, 0); }
		public TerminalNode T_MUL() { return getToken(HiveSqlParser.T_MUL, 0); }
		public TerminalNode T_CURRENT_DATE() { return getToken(HiveSqlParser.T_CURRENT_DATE, 0); }
		public TerminalNode T_CURRENT() { return getToken(HiveSqlParser.T_CURRENT, 0); }
		public TerminalNode T_DATE() { return getToken(HiveSqlParser.T_DATE, 0); }
		public TerminalNode T_CURRENT_TIMESTAMP() { return getToken(HiveSqlParser.T_CURRENT_TIMESTAMP, 0); }
		public TerminalNode T_TIMESTAMP() { return getToken(HiveSqlParser.T_TIMESTAMP, 0); }
		public TerminalNode T_CURRENT_USER() { return getToken(HiveSqlParser.T_CURRENT_USER, 0); }
		public TerminalNode T_USER() { return getToken(HiveSqlParser.T_USER, 0); }
		public TerminalNode T_MAX_PART_STRING() { return getToken(HiveSqlParser.T_MAX_PART_STRING, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HiveSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveSqlParser.T_COMMA, i);
		}
		public List<TerminalNode> T_EQUAL() { return getTokens(HiveSqlParser.T_EQUAL); }
		public TerminalNode T_EQUAL(int i) {
			return getToken(HiveSqlParser.T_EQUAL, i);
		}
		public TerminalNode T_MIN_PART_STRING() { return getToken(HiveSqlParser.T_MIN_PART_STRING, 0); }
		public TerminalNode T_MAX_PART_INT() { return getToken(HiveSqlParser.T_MAX_PART_INT, 0); }
		public TerminalNode T_MIN_PART_INT() { return getToken(HiveSqlParser.T_MIN_PART_INT, 0); }
		public TerminalNode T_MAX_PART_DATE() { return getToken(HiveSqlParser.T_MAX_PART_DATE, 0); }
		public TerminalNode T_MIN_PART_DATE() { return getToken(HiveSqlParser.T_MIN_PART_DATE, 0); }
		public TerminalNode T_PART_COUNT() { return getToken(HiveSqlParser.T_PART_COUNT, 0); }
		public TerminalNode T_PART_LOC() { return getToken(HiveSqlParser.T_PART_LOC, 0); }
		public TerminalNode T_TRIM() { return getToken(HiveSqlParser.T_TRIM, 0); }
		public TerminalNode T_SUBSTRING() { return getToken(HiveSqlParser.T_SUBSTRING, 0); }
		public TerminalNode T_FROM() { return getToken(HiveSqlParser.T_FROM, 0); }
		public TerminalNode T_FOR() { return getToken(HiveSqlParser.T_FOR, 0); }
		public TerminalNode T_SYSDATE() { return getToken(HiveSqlParser.T_SYSDATE, 0); }
		public Expr_spec_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_spec_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterExpr_spec_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitExpr_spec_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitExpr_spec_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_spec_funcContext expr_spec_func() throws RecognitionException {
		Expr_spec_funcContext _localctx = new Expr_spec_funcContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_expr_spec_func);
		int _la;
		try {
			int _alt;
			setState(3233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,406,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3033);
				match(T_ACTIVITY_COUNT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3034);
				match(T_CAST);
				setState(3035);
				match(T_OPEN_P);
				setState(3036);
				expr(0);
				setState(3037);
				match(T_AS);
				setState(3038);
				dtype();
				setState(3040);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(3039);
					dtype_len();
					}
				}

				setState(3042);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3044);
				match(T_COUNT);
				setState(3045);
				match(T_OPEN_P);
				setState(3048);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ACTION:
				case T_ADD2:
				case T_ALL:
				case T_ALLOCATE:
				case T_ALTER:
				case T_AND:
				case T_ANSI_NULLS:
				case T_ANSI_PADDING:
				case T_AS:
				case T_ASC:
				case T_ASSOCIATE:
				case T_AT:
				case T_AUTO_INCREMENT:
				case T_AVG:
				case T_BATCHSIZE:
				case T_BEGIN:
				case T_BETWEEN:
				case T_BIGINT:
				case T_BINARY_DOUBLE:
				case T_BINARY_FLOAT:
				case T_BIT:
				case T_BODY:
				case T_BREAK:
				case T_BY:
				case T_BYTE:
				case T_CALL:
				case T_CALLER:
				case T_CASCADE:
				case T_CASE:
				case T_CASESPECIFIC:
				case T_CAST:
				case T_CHAR:
				case T_CHARACTER:
				case T_CHARSET:
				case T_CLIENT:
				case T_CLOSE:
				case T_CLUSTERED:
				case T_CMP:
				case T_COLLECT:
				case T_COLLECTION:
				case T_COLUMN:
				case T_COMMENT:
				case T_CONSTANT:
				case T_COMMIT:
				case T_COMPRESS:
				case T_CONCAT:
				case T_CONDITION:
				case T_CONSTRAINT:
				case T_CONTINUE:
				case T_COPY:
				case T_COUNT:
				case T_COUNT_BIG:
				case T_CREATE:
				case T_CREATION:
				case T_CREATOR:
				case T_CS:
				case T_CURRENT:
				case T_CURRENT_SCHEMA:
				case T_CURSOR:
				case T_DATABASE:
				case T_DATA:
				case T_DATE:
				case T_DATETIME:
				case T_DAY:
				case T_DAYS:
				case T_DEC:
				case T_DECIMAL:
				case T_DECLARE:
				case T_DEFAULT:
				case T_DEFERRED:
				case T_DEFINED:
				case T_DEFINER:
				case T_DEFINITION:
				case T_DELETE:
				case T_DELIMITED:
				case T_DELIMITER:
				case T_DESC:
				case T_DESCRIBE:
				case T_DIAGNOSTICS:
				case T_DIR:
				case T_DIRECTORY:
				case T_DISTINCT:
				case T_DISTRIBUTE:
				case T_DO:
				case T_DOUBLE:
				case T_DROP:
				case T_DYNAMIC:
				case T_ENABLE:
				case T_ENGINE:
				case T_ESCAPED:
				case T_EXCEPT:
				case T_EXEC:
				case T_EXECUTE:
				case T_EXCEPTION:
				case T_EXCLUSIVE:
				case T_EXISTS:
				case T_EXIT:
				case T_FALLBACK:
				case T_FALSE:
				case T_FETCH:
				case T_FIELDS:
				case T_FILE:
				case T_FILES:
				case T_FLOAT:
				case T_FOR:
				case T_FOREIGN:
				case T_FORMAT:
				case T_FOUND:
				case T_FROM:
				case T_FULL:
				case T_FUNCTION:
				case T_GET:
				case T_GLOBAL:
				case T_GO:
				case T_GRANT:
				case T_GROUP:
				case T_HANDLER:
				case T_HASH:
				case T_HAVING:
				case T_HDFS:
				case T_HIVE:
				case T_HOST:
				case T_IDENTITY:
				case T_IF:
				case T_IGNORE:
				case T_IMMEDIATE:
				case T_IN:
				case T_INCLUDE:
				case T_INDEX:
				case T_INITRANS:
				case T_INNER:
				case T_INOUT:
				case T_INSERT:
				case T_INT:
				case T_INT2:
				case T_INT4:
				case T_INT8:
				case T_INTEGER:
				case T_INTERSECT:
				case T_INTERVAL:
				case T_INTO:
				case T_INVOKER:
				case T_IS:
				case T_ISOPEN:
				case T_ITEMS:
				case T_JOIN:
				case T_KEEP:
				case T_KEY:
				case T_KEYS:
				case T_LANGUAGE:
				case T_LEAVE:
				case T_LEFT:
				case T_LIKE:
				case T_LIMIT:
				case T_LINES:
				case T_LOCAL:
				case T_LOCATION:
				case T_LOCATOR:
				case T_LOCATORS:
				case T_LOCKS:
				case T_LOG:
				case T_LOGGED:
				case T_LOGGING:
				case T_LOOP:
				case T_MAP:
				case T_MATCHED:
				case T_MAX:
				case T_MAXTRANS:
				case T_MERGE:
				case T_MESSAGE_TEXT:
				case T_MICROSECOND:
				case T_MICROSECONDS:
				case T_MIN:
				case T_MULTISET:
				case T_NCHAR:
				case T_NEW:
				case T_NVARCHAR:
				case T_NO:
				case T_NOCOUNT:
				case T_NOCOMPRESS:
				case T_NOLOGGING:
				case T_NONE:
				case T_NOT:
				case T_NOTFOUND:
				case T_NULL:
				case T_NUMERIC:
				case T_NUMBER:
				case T_OBJECT:
				case T_OFF:
				case T_ON:
				case T_ONLY:
				case T_OPEN:
				case T_OR:
				case T_ORDER:
				case T_OUT:
				case T_OUTER:
				case T_OVER:
				case T_OVERWRITE:
				case T_OWNER:
				case T_PACKAGE:
				case T_PARTITION:
				case T_PCTFREE:
				case T_PCTUSED:
				case T_PRECISION:
				case T_PRESERVE:
				case T_PRIMARY:
				case T_PRINT:
				case T_PROC:
				case T_PROCEDURE:
				case T_QUALIFY:
				case T_QUERY_BAND:
				case T_QUIT:
				case T_QUOTED_IDENTIFIER:
				case T_RAISE:
				case T_REAL:
				case T_REFERENCES:
				case T_REGEXP:
				case T_REPLACE:
				case T_RESIGNAL:
				case T_RESTRICT:
				case T_RESULT:
				case T_RESULT_SET_LOCATOR:
				case T_RETURN:
				case T_RETURNS:
				case T_REVERSE:
				case T_RIGHT:
				case T_RLIKE:
				case T_ROLE:
				case T_ROLLBACK:
				case T_ROW:
				case T_ROWS:
				case T_ROW_COUNT:
				case T_RR:
				case T_RS:
				case T_PWD:
				case T_TRIM:
				case T_SCHEMA:
				case T_SECOND:
				case T_SECONDS:
				case T_SECURITY:
				case T_SEGMENT:
				case T_SEL:
				case T_SELECT:
				case T_SET:
				case T_SESSION:
				case T_SESSIONS:
				case T_SETS:
				case T_SHARE:
				case T_SIGNAL:
				case T_SIMPLE_DOUBLE:
				case T_SIMPLE_FLOAT:
				case T_SMALLDATETIME:
				case T_SMALLINT:
				case T_SQL:
				case T_SQLEXCEPTION:
				case T_SQLINSERT:
				case T_SQLSTATE:
				case T_SQLWARNING:
				case T_STATS:
				case T_STATISTICS:
				case T_STEP:
				case T_STORAGE:
				case T_STORED:
				case T_STRING:
				case T_SUBDIR:
				case T_SUBSTRING:
				case T_SUM:
				case T_SUMMARY:
				case T_SYS_REFCURSOR:
				case T_TABLE:
				case T_TABLESPACE:
				case T_TEMPORARY:
				case T_TERMINATED:
				case T_TEXTIMAGE_ON:
				case T_THEN:
				case T_TIMESTAMP:
				case T_TITLE:
				case T_TO:
				case T_TOP:
				case T_TRANSACTION:
				case T_TRUE:
				case T_TRUNCATE:
				case T_UNIQUE:
				case T_UPDATE:
				case T_UR:
				case T_USE:
				case T_USING:
				case T_VALUE:
				case T_VALUES:
				case T_VAR:
				case T_VARCHAR:
				case T_VARCHAR2:
				case T_VARYING:
				case T_VOLATILE:
				case T_WHILE:
				case T_WITH:
				case T_WITHOUT:
				case T_WORK:
				case T_XACT_ABORT:
				case T_XML:
				case T_YES:
				case T_ACTIVITY_COUNT:
				case T_CUME_DIST:
				case T_CURRENT_DATE:
				case T_CURRENT_TIMESTAMP:
				case T_CURRENT_USER:
				case T_DENSE_RANK:
				case T_FIRST_VALUE:
				case T_LAG:
				case T_LAST_VALUE:
				case T_LEAD:
				case T_MAX_PART_STRING:
				case T_MIN_PART_STRING:
				case T_MAX_PART_INT:
				case T_MIN_PART_INT:
				case T_MAX_PART_DATE:
				case T_MIN_PART_DATE:
				case T_PART_COUNT:
				case T_PART_LOC:
				case T_RANK:
				case T_ROW_NUMBER:
				case T_STDEV:
				case T_SYSDATE:
				case T_VARIANCE:
				case T_USER:
				case T_ADD:
				case T_OPEN_P:
				case T_SUB:
				case L_ID:
				case L_S_STRING:
				case L_D_STRING:
				case L_INT:
				case L_DEC:
					{
					setState(3046);
					expr(0);
					}
					break;
				case T_MUL:
					{
					setState(3047);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3050);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3051);
				match(T_CURRENT_DATE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3052);
				match(T_CURRENT);
				setState(3053);
				match(T_DATE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(3057);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_CURRENT_TIMESTAMP:
					{
					setState(3054);
					match(T_CURRENT_TIMESTAMP);
					}
					break;
				case T_CURRENT:
					{
					setState(3055);
					match(T_CURRENT);
					setState(3056);
					match(T_TIMESTAMP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3063);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,389,_ctx) ) {
				case 1:
					{
					setState(3059);
					match(T_OPEN_P);
					setState(3060);
					expr(0);
					setState(3061);
					match(T_CLOSE_P);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(3065);
				match(T_CURRENT_USER);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(3066);
				match(T_CURRENT);
				setState(3067);
				match(T_USER);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(3068);
				match(T_MAX_PART_STRING);
				setState(3069);
				match(T_OPEN_P);
				setState(3070);
				expr(0);
				setState(3083);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(3071);
					match(T_COMMA);
					setState(3072);
					expr(0);
					setState(3080);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(3073);
						match(T_COMMA);
						setState(3074);
						expr(0);
						setState(3075);
						match(T_EQUAL);
						setState(3076);
						expr(0);
						}
						}
						setState(3082);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(3085);
				match(T_CLOSE_P);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(3087);
				match(T_MIN_PART_STRING);
				setState(3088);
				match(T_OPEN_P);
				setState(3089);
				expr(0);
				setState(3102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(3090);
					match(T_COMMA);
					setState(3091);
					expr(0);
					setState(3099);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(3092);
						match(T_COMMA);
						setState(3093);
						expr(0);
						setState(3094);
						match(T_EQUAL);
						setState(3095);
						expr(0);
						}
						}
						setState(3101);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(3104);
				match(T_CLOSE_P);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(3106);
				match(T_MAX_PART_INT);
				setState(3107);
				match(T_OPEN_P);
				setState(3108);
				expr(0);
				setState(3121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(3109);
					match(T_COMMA);
					setState(3110);
					expr(0);
					setState(3118);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(3111);
						match(T_COMMA);
						setState(3112);
						expr(0);
						setState(3113);
						match(T_EQUAL);
						setState(3114);
						expr(0);
						}
						}
						setState(3120);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(3123);
				match(T_CLOSE_P);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(3125);
				match(T_MIN_PART_INT);
				setState(3126);
				match(T_OPEN_P);
				setState(3127);
				expr(0);
				setState(3140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(3128);
					match(T_COMMA);
					setState(3129);
					expr(0);
					setState(3137);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(3130);
						match(T_COMMA);
						setState(3131);
						expr(0);
						setState(3132);
						match(T_EQUAL);
						setState(3133);
						expr(0);
						}
						}
						setState(3139);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(3142);
				match(T_CLOSE_P);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(3144);
				match(T_MAX_PART_DATE);
				setState(3145);
				match(T_OPEN_P);
				setState(3146);
				expr(0);
				setState(3159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(3147);
					match(T_COMMA);
					setState(3148);
					expr(0);
					setState(3156);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(3149);
						match(T_COMMA);
						setState(3150);
						expr(0);
						setState(3151);
						match(T_EQUAL);
						setState(3152);
						expr(0);
						}
						}
						setState(3158);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(3161);
				match(T_CLOSE_P);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(3163);
				match(T_MIN_PART_DATE);
				setState(3164);
				match(T_OPEN_P);
				setState(3165);
				expr(0);
				setState(3178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(3166);
					match(T_COMMA);
					setState(3167);
					expr(0);
					setState(3175);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(3168);
						match(T_COMMA);
						setState(3169);
						expr(0);
						setState(3170);
						match(T_EQUAL);
						setState(3171);
						expr(0);
						}
						}
						setState(3177);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(3180);
				match(T_CLOSE_P);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(3182);
				match(T_PART_COUNT);
				setState(3183);
				match(T_OPEN_P);
				setState(3184);
				expr(0);
				setState(3192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(3185);
					match(T_COMMA);
					setState(3186);
					expr(0);
					setState(3187);
					match(T_EQUAL);
					setState(3188);
					expr(0);
					}
					}
					setState(3194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3195);
				match(T_CLOSE_P);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(3197);
				match(T_PART_LOC);
				setState(3198);
				match(T_OPEN_P);
				setState(3199);
				expr(0);
				setState(3205); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3200);
						match(T_COMMA);
						setState(3201);
						expr(0);
						setState(3202);
						match(T_EQUAL);
						setState(3203);
						expr(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3207); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,403,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(3211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(3209);
					match(T_COMMA);
					setState(3210);
					expr(0);
					}
				}

				setState(3213);
				match(T_CLOSE_P);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(3215);
				match(T_TRIM);
				setState(3216);
				match(T_OPEN_P);
				setState(3217);
				expr(0);
				setState(3218);
				match(T_CLOSE_P);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(3220);
				match(T_SUBSTRING);
				setState(3221);
				match(T_OPEN_P);
				setState(3222);
				expr(0);
				setState(3223);
				match(T_FROM);
				setState(3224);
				expr(0);
				setState(3227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_FOR) {
					{
					setState(3225);
					match(T_FOR);
					setState(3226);
					expr(0);
					}
				}

				setState(3229);
				match(T_CLOSE_P);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(3231);
				match(T_SYSDATE);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(3232);
				match(T_USER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_funcContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HiveSqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HiveSqlParser.T_CLOSE_P, 0); }
		public Expr_func_paramsContext expr_func_params() {
			return getRuleContext(Expr_func_paramsContext.class,0);
		}
		public Expr_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterExpr_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitExpr_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitExpr_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_funcContext expr_func() throws RecognitionException {
		Expr_funcContext _localctx = new Expr_funcContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_expr_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3235);
			ident();
			setState(3236);
			match(T_OPEN_P);
			setState(3238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,407,_ctx) ) {
			case 1:
				{
				setState(3237);
				expr_func_params();
				}
				break;
			}
			setState(3240);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_func_paramsContext extends ParserRuleContext {
		public List<Func_paramContext> func_param() {
			return getRuleContexts(Func_paramContext.class);
		}
		public Func_paramContext func_param(int i) {
			return getRuleContext(Func_paramContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HiveSqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HiveSqlParser.T_COMMA, i);
		}
		public Expr_func_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterExpr_func_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitExpr_func_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitExpr_func_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_func_paramsContext expr_func_params() throws RecognitionException {
		Expr_func_paramsContext _localctx = new Expr_func_paramsContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_expr_func_params);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3242);
			func_param();
			setState(3247);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,408,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3243);
					match(T_COMMA);
					setState(3244);
					func_param();
					}
					} 
				}
				setState(3249);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,408,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Func_paramContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(HiveSqlParser.T_EQUAL, 0); }
		public TerminalNode T_GREATER() { return getToken(HiveSqlParser.T_GREATER, 0); }
		public Func_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterFunc_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitFunc_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitFunc_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_paramContext func_param() throws RecognitionException {
		Func_paramContext _localctx = new Func_paramContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_func_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3250);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("INTO"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"INTO\")");
			setState(3256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,410,_ctx) ) {
			case 1:
				{
				setState(3251);
				ident();
				setState(3252);
				match(T_EQUAL);
				setState(3254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_GREATER) {
					{
					setState(3253);
					match(T_GREATER);
					}
				}

				}
				break;
			}
			setState(3258);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_selectContext extends ParserRuleContext {
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_selectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterExpr_select(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitExpr_select(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitExpr_select(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_selectContext expr_select() throws RecognitionException {
		Expr_selectContext _localctx = new Expr_selectContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_expr_select);
		try {
			setState(3262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,411,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3260);
				select_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3261);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_fileContext extends ParserRuleContext {
		public File_nameContext file_name() {
			return getRuleContext(File_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterExpr_file(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitExpr_file(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitExpr_file(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_fileContext expr_file() throws RecognitionException {
		Expr_fileContext _localctx = new Expr_fileContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_expr_file);
		try {
			setState(3266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,412,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3264);
				file_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3265);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HiveContext extends ParserRuleContext {
		public TerminalNode T_HIVE() { return getToken(HiveSqlParser.T_HIVE, 0); }
		public List<Hive_itemContext> hive_item() {
			return getRuleContexts(Hive_itemContext.class);
		}
		public Hive_itemContext hive_item(int i) {
			return getRuleContext(Hive_itemContext.class,i);
		}
		public HiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterHive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitHive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitHive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HiveContext hive() throws RecognitionException {
		HiveContext _localctx = new HiveContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_hive);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3268);
			match(T_HIVE);
			setState(3272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,413,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3269);
					hive_item();
					}
					} 
				}
				setState(3274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,413,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Hive_itemContext extends ParserRuleContext {
		public TerminalNode T_SUB() { return getToken(HiveSqlParser.T_SUB, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode L_ID() { return getToken(HiveSqlParser.L_ID, 0); }
		public TerminalNode T_EQUAL() { return getToken(HiveSqlParser.T_EQUAL, 0); }
		public Hive_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hive_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterHive_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitHive_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitHive_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Hive_itemContext hive_item() throws RecognitionException {
		Hive_itemContext _localctx = new Hive_itemContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_hive_item);
		try {
			setState(3287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,414,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3275);
				match(T_SUB);
				setState(3276);
				ident();
				setState(3277);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3279);
				match(T_SUB);
				setState(3280);
				ident();
				setState(3281);
				match(L_ID);
				setState(3282);
				match(T_EQUAL);
				setState(3283);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3285);
				match(T_SUB);
				setState(3286);
				ident();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HostContext extends ParserRuleContext {
		public Host_cmdContext host_cmd() {
			return getRuleContext(Host_cmdContext.class,0);
		}
		public TerminalNode T_SEMICOLON() { return getToken(HiveSqlParser.T_SEMICOLON, 0); }
		public Host_stmtContext host_stmt() {
			return getRuleContext(Host_stmtContext.class,0);
		}
		public HostContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_host; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterHost(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitHost(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitHost(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HostContext host() throws RecognitionException {
		HostContext _localctx = new HostContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_host);
		try {
			setState(3294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(3289);
				match(T__4);
				setState(3290);
				host_cmd();
				setState(3291);
				match(T_SEMICOLON);
				}
				break;
			case T_HOST:
				enterOuterAlt(_localctx, 2);
				{
				setState(3293);
				host_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Host_cmdContext extends ParserRuleContext {
		public Host_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_host_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterHost_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitHost_cmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitHost_cmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Host_cmdContext host_cmd() throws RecognitionException {
		Host_cmdContext _localctx = new Host_cmdContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_host_cmd);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,416,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(3296);
					matchWildcard();
					}
					} 
				}
				setState(3301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,416,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Host_stmtContext extends ParserRuleContext {
		public TerminalNode T_HOST() { return getToken(HiveSqlParser.T_HOST, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Host_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_host_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterHost_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitHost_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitHost_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Host_stmtContext host_stmt() throws RecognitionException {
		Host_stmtContext _localctx = new Host_stmtContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_host_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3302);
			match(T_HOST);
			setState(3303);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class File_nameContext extends ParserRuleContext {
		public TerminalNode L_FILE() { return getToken(HiveSqlParser.L_FILE, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_DIV() { return getTokens(HiveSqlParser.T_DIV); }
		public TerminalNode T_DIV(int i) {
			return getToken(HiveSqlParser.T_DIV, i);
		}
		public File_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterFile_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitFile_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitFile_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_nameContext file_name() throws RecognitionException {
		File_nameContext _localctx = new File_nameContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_file_name);
		try {
			int _alt;
			setState(3319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_FILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(3305);
				match(L_FILE);
				}
				break;
			case T__3:
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case T_DIV:
			case T_SUB:
			case L_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(3309);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_DIV:
					{
					setState(3306);
					match(T_DIV);
					}
					break;
				case T__3:
					{
					setState(3307);
					match(T__3);
					setState(3308);
					match(T_DIV);
					}
					break;
				case T_ACTION:
				case T_ADD2:
				case T_ALL:
				case T_ALLOCATE:
				case T_ALTER:
				case T_AND:
				case T_ANSI_NULLS:
				case T_ANSI_PADDING:
				case T_AS:
				case T_ASC:
				case T_ASSOCIATE:
				case T_AT:
				case T_AUTO_INCREMENT:
				case T_AVG:
				case T_BATCHSIZE:
				case T_BEGIN:
				case T_BETWEEN:
				case T_BIGINT:
				case T_BINARY_DOUBLE:
				case T_BINARY_FLOAT:
				case T_BIT:
				case T_BODY:
				case T_BREAK:
				case T_BY:
				case T_BYTE:
				case T_CALL:
				case T_CALLER:
				case T_CASCADE:
				case T_CASE:
				case T_CASESPECIFIC:
				case T_CAST:
				case T_CHAR:
				case T_CHARACTER:
				case T_CHARSET:
				case T_CLIENT:
				case T_CLOSE:
				case T_CLUSTERED:
				case T_CMP:
				case T_COLLECT:
				case T_COLLECTION:
				case T_COLUMN:
				case T_COMMENT:
				case T_CONSTANT:
				case T_COMMIT:
				case T_COMPRESS:
				case T_CONCAT:
				case T_CONDITION:
				case T_CONSTRAINT:
				case T_CONTINUE:
				case T_COPY:
				case T_COUNT:
				case T_COUNT_BIG:
				case T_CREATE:
				case T_CREATION:
				case T_CREATOR:
				case T_CS:
				case T_CURRENT:
				case T_CURRENT_SCHEMA:
				case T_CURSOR:
				case T_DATABASE:
				case T_DATA:
				case T_DATE:
				case T_DATETIME:
				case T_DAY:
				case T_DAYS:
				case T_DEC:
				case T_DECIMAL:
				case T_DECLARE:
				case T_DEFAULT:
				case T_DEFERRED:
				case T_DEFINED:
				case T_DEFINER:
				case T_DEFINITION:
				case T_DELETE:
				case T_DELIMITED:
				case T_DELIMITER:
				case T_DESC:
				case T_DESCRIBE:
				case T_DIAGNOSTICS:
				case T_DIR:
				case T_DIRECTORY:
				case T_DISTINCT:
				case T_DISTRIBUTE:
				case T_DO:
				case T_DOUBLE:
				case T_DROP:
				case T_DYNAMIC:
				case T_ENABLE:
				case T_ENGINE:
				case T_ESCAPED:
				case T_EXCEPT:
				case T_EXEC:
				case T_EXECUTE:
				case T_EXCEPTION:
				case T_EXCLUSIVE:
				case T_EXISTS:
				case T_EXIT:
				case T_FALLBACK:
				case T_FALSE:
				case T_FETCH:
				case T_FIELDS:
				case T_FILE:
				case T_FILES:
				case T_FLOAT:
				case T_FOR:
				case T_FOREIGN:
				case T_FORMAT:
				case T_FOUND:
				case T_FROM:
				case T_FULL:
				case T_FUNCTION:
				case T_GET:
				case T_GLOBAL:
				case T_GO:
				case T_GRANT:
				case T_GROUP:
				case T_HANDLER:
				case T_HASH:
				case T_HAVING:
				case T_HDFS:
				case T_HIVE:
				case T_HOST:
				case T_IDENTITY:
				case T_IF:
				case T_IGNORE:
				case T_IMMEDIATE:
				case T_IN:
				case T_INCLUDE:
				case T_INDEX:
				case T_INITRANS:
				case T_INNER:
				case T_INOUT:
				case T_INSERT:
				case T_INT:
				case T_INT2:
				case T_INT4:
				case T_INT8:
				case T_INTEGER:
				case T_INTERSECT:
				case T_INTERVAL:
				case T_INTO:
				case T_INVOKER:
				case T_IS:
				case T_ISOPEN:
				case T_ITEMS:
				case T_JOIN:
				case T_KEEP:
				case T_KEY:
				case T_KEYS:
				case T_LANGUAGE:
				case T_LEAVE:
				case T_LEFT:
				case T_LIKE:
				case T_LIMIT:
				case T_LINES:
				case T_LOCAL:
				case T_LOCATION:
				case T_LOCATOR:
				case T_LOCATORS:
				case T_LOCKS:
				case T_LOG:
				case T_LOGGED:
				case T_LOGGING:
				case T_LOOP:
				case T_MAP:
				case T_MATCHED:
				case T_MAX:
				case T_MAXTRANS:
				case T_MERGE:
				case T_MESSAGE_TEXT:
				case T_MICROSECOND:
				case T_MICROSECONDS:
				case T_MIN:
				case T_MULTISET:
				case T_NCHAR:
				case T_NEW:
				case T_NVARCHAR:
				case T_NO:
				case T_NOCOUNT:
				case T_NOCOMPRESS:
				case T_NOLOGGING:
				case T_NONE:
				case T_NOT:
				case T_NOTFOUND:
				case T_NUMERIC:
				case T_NUMBER:
				case T_OBJECT:
				case T_OFF:
				case T_ON:
				case T_ONLY:
				case T_OPEN:
				case T_OR:
				case T_ORDER:
				case T_OUT:
				case T_OUTER:
				case T_OVER:
				case T_OVERWRITE:
				case T_OWNER:
				case T_PACKAGE:
				case T_PARTITION:
				case T_PCTFREE:
				case T_PCTUSED:
				case T_PRECISION:
				case T_PRESERVE:
				case T_PRIMARY:
				case T_PRINT:
				case T_PROC:
				case T_PROCEDURE:
				case T_QUALIFY:
				case T_QUERY_BAND:
				case T_QUIT:
				case T_QUOTED_IDENTIFIER:
				case T_RAISE:
				case T_REAL:
				case T_REFERENCES:
				case T_REGEXP:
				case T_REPLACE:
				case T_RESIGNAL:
				case T_RESTRICT:
				case T_RESULT:
				case T_RESULT_SET_LOCATOR:
				case T_RETURN:
				case T_RETURNS:
				case T_REVERSE:
				case T_RIGHT:
				case T_RLIKE:
				case T_ROLE:
				case T_ROLLBACK:
				case T_ROW:
				case T_ROWS:
				case T_ROW_COUNT:
				case T_RR:
				case T_RS:
				case T_PWD:
				case T_TRIM:
				case T_SCHEMA:
				case T_SECOND:
				case T_SECONDS:
				case T_SECURITY:
				case T_SEGMENT:
				case T_SEL:
				case T_SELECT:
				case T_SET:
				case T_SESSION:
				case T_SESSIONS:
				case T_SETS:
				case T_SHARE:
				case T_SIGNAL:
				case T_SIMPLE_DOUBLE:
				case T_SIMPLE_FLOAT:
				case T_SMALLDATETIME:
				case T_SMALLINT:
				case T_SQL:
				case T_SQLEXCEPTION:
				case T_SQLINSERT:
				case T_SQLSTATE:
				case T_SQLWARNING:
				case T_STATS:
				case T_STATISTICS:
				case T_STEP:
				case T_STORAGE:
				case T_STORED:
				case T_STRING:
				case T_SUBDIR:
				case T_SUBSTRING:
				case T_SUM:
				case T_SUMMARY:
				case T_SYS_REFCURSOR:
				case T_TABLE:
				case T_TABLESPACE:
				case T_TEMPORARY:
				case T_TERMINATED:
				case T_TEXTIMAGE_ON:
				case T_THEN:
				case T_TIMESTAMP:
				case T_TITLE:
				case T_TO:
				case T_TOP:
				case T_TRANSACTION:
				case T_TRUE:
				case T_TRUNCATE:
				case T_UNIQUE:
				case T_UPDATE:
				case T_UR:
				case T_USE:
				case T_USING:
				case T_VALUE:
				case T_VALUES:
				case T_VAR:
				case T_VARCHAR:
				case T_VARCHAR2:
				case T_VARYING:
				case T_VOLATILE:
				case T_WHILE:
				case T_WITH:
				case T_WITHOUT:
				case T_WORK:
				case T_XACT_ABORT:
				case T_XML:
				case T_YES:
				case T_ACTIVITY_COUNT:
				case T_CUME_DIST:
				case T_CURRENT_DATE:
				case T_CURRENT_TIMESTAMP:
				case T_CURRENT_USER:
				case T_DENSE_RANK:
				case T_FIRST_VALUE:
				case T_LAG:
				case T_LAST_VALUE:
				case T_LEAD:
				case T_PART_COUNT:
				case T_PART_LOC:
				case T_RANK:
				case T_ROW_NUMBER:
				case T_STDEV:
				case T_SYSDATE:
				case T_VARIANCE:
				case T_USER:
				case T_SUB:
				case L_ID:
					break;
				default:
					break;
				}
				setState(3311);
				ident();
				setState(3316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,418,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(3312);
						match(T_DIV);
						setState(3313);
						ident();
						}
						} 
					}
					setState(3318);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,418,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Date_literalContext extends ParserRuleContext {
		public TerminalNode T_DATE() { return getToken(HiveSqlParser.T_DATE, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Date_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterDate_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitDate_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitDate_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Date_literalContext date_literal() throws RecognitionException {
		Date_literalContext _localctx = new Date_literalContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_date_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3321);
			match(T_DATE);
			setState(3322);
			string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Timestamp_literalContext extends ParserRuleContext {
		public TerminalNode T_TIMESTAMP() { return getToken(HiveSqlParser.T_TIMESTAMP, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Timestamp_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timestamp_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterTimestamp_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitTimestamp_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitTimestamp_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Timestamp_literalContext timestamp_literal() throws RecognitionException {
		Timestamp_literalContext _localctx = new Timestamp_literalContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_timestamp_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3324);
			match(T_TIMESTAMP);
			setState(3325);
			string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentContext extends ParserRuleContext {
		public List<TerminalNode> L_ID() { return getTokens(HiveSqlParser.L_ID); }
		public TerminalNode L_ID(int i) {
			return getToken(HiveSqlParser.L_ID, i);
		}
		public List<Non_reserved_wordsContext> non_reserved_words() {
			return getRuleContexts(Non_reserved_wordsContext.class);
		}
		public Non_reserved_wordsContext non_reserved_words(int i) {
			return getRuleContext(Non_reserved_wordsContext.class,i);
		}
		public TerminalNode T_SUB() { return getToken(HiveSqlParser.T_SUB, 0); }
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_ident);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_SUB) {
				{
				setState(3327);
				match(T_SUB);
				}
			}

			setState(3332);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
				{
				setState(3330);
				match(L_ID);
				}
				break;
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
				{
				setState(3331);
				non_reserved_words();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(3341);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,423,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3334);
					match(T__3);
					setState(3337);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case L_ID:
						{
						setState(3335);
						match(L_ID);
						}
						break;
					case T_ACTION:
					case T_ADD2:
					case T_ALL:
					case T_ALLOCATE:
					case T_ALTER:
					case T_AND:
					case T_ANSI_NULLS:
					case T_ANSI_PADDING:
					case T_AS:
					case T_ASC:
					case T_ASSOCIATE:
					case T_AT:
					case T_AUTO_INCREMENT:
					case T_AVG:
					case T_BATCHSIZE:
					case T_BEGIN:
					case T_BETWEEN:
					case T_BIGINT:
					case T_BINARY_DOUBLE:
					case T_BINARY_FLOAT:
					case T_BIT:
					case T_BODY:
					case T_BREAK:
					case T_BY:
					case T_BYTE:
					case T_CALL:
					case T_CALLER:
					case T_CASCADE:
					case T_CASE:
					case T_CASESPECIFIC:
					case T_CAST:
					case T_CHAR:
					case T_CHARACTER:
					case T_CHARSET:
					case T_CLIENT:
					case T_CLOSE:
					case T_CLUSTERED:
					case T_CMP:
					case T_COLLECT:
					case T_COLLECTION:
					case T_COLUMN:
					case T_COMMENT:
					case T_CONSTANT:
					case T_COMMIT:
					case T_COMPRESS:
					case T_CONCAT:
					case T_CONDITION:
					case T_CONSTRAINT:
					case T_CONTINUE:
					case T_COPY:
					case T_COUNT:
					case T_COUNT_BIG:
					case T_CREATE:
					case T_CREATION:
					case T_CREATOR:
					case T_CS:
					case T_CURRENT:
					case T_CURRENT_SCHEMA:
					case T_CURSOR:
					case T_DATABASE:
					case T_DATA:
					case T_DATE:
					case T_DATETIME:
					case T_DAY:
					case T_DAYS:
					case T_DEC:
					case T_DECIMAL:
					case T_DECLARE:
					case T_DEFAULT:
					case T_DEFERRED:
					case T_DEFINED:
					case T_DEFINER:
					case T_DEFINITION:
					case T_DELETE:
					case T_DELIMITED:
					case T_DELIMITER:
					case T_DESC:
					case T_DESCRIBE:
					case T_DIAGNOSTICS:
					case T_DIR:
					case T_DIRECTORY:
					case T_DISTINCT:
					case T_DISTRIBUTE:
					case T_DO:
					case T_DOUBLE:
					case T_DROP:
					case T_DYNAMIC:
					case T_ENABLE:
					case T_ENGINE:
					case T_ESCAPED:
					case T_EXCEPT:
					case T_EXEC:
					case T_EXECUTE:
					case T_EXCEPTION:
					case T_EXCLUSIVE:
					case T_EXISTS:
					case T_EXIT:
					case T_FALLBACK:
					case T_FALSE:
					case T_FETCH:
					case T_FIELDS:
					case T_FILE:
					case T_FILES:
					case T_FLOAT:
					case T_FOR:
					case T_FOREIGN:
					case T_FORMAT:
					case T_FOUND:
					case T_FROM:
					case T_FULL:
					case T_FUNCTION:
					case T_GET:
					case T_GLOBAL:
					case T_GO:
					case T_GRANT:
					case T_GROUP:
					case T_HANDLER:
					case T_HASH:
					case T_HAVING:
					case T_HDFS:
					case T_HIVE:
					case T_HOST:
					case T_IDENTITY:
					case T_IF:
					case T_IGNORE:
					case T_IMMEDIATE:
					case T_IN:
					case T_INCLUDE:
					case T_INDEX:
					case T_INITRANS:
					case T_INNER:
					case T_INOUT:
					case T_INSERT:
					case T_INT:
					case T_INT2:
					case T_INT4:
					case T_INT8:
					case T_INTEGER:
					case T_INTERSECT:
					case T_INTERVAL:
					case T_INTO:
					case T_INVOKER:
					case T_IS:
					case T_ISOPEN:
					case T_ITEMS:
					case T_JOIN:
					case T_KEEP:
					case T_KEY:
					case T_KEYS:
					case T_LANGUAGE:
					case T_LEAVE:
					case T_LEFT:
					case T_LIKE:
					case T_LIMIT:
					case T_LINES:
					case T_LOCAL:
					case T_LOCATION:
					case T_LOCATOR:
					case T_LOCATORS:
					case T_LOCKS:
					case T_LOG:
					case T_LOGGED:
					case T_LOGGING:
					case T_LOOP:
					case T_MAP:
					case T_MATCHED:
					case T_MAX:
					case T_MAXTRANS:
					case T_MERGE:
					case T_MESSAGE_TEXT:
					case T_MICROSECOND:
					case T_MICROSECONDS:
					case T_MIN:
					case T_MULTISET:
					case T_NCHAR:
					case T_NEW:
					case T_NVARCHAR:
					case T_NO:
					case T_NOCOUNT:
					case T_NOCOMPRESS:
					case T_NOLOGGING:
					case T_NONE:
					case T_NOT:
					case T_NOTFOUND:
					case T_NUMERIC:
					case T_NUMBER:
					case T_OBJECT:
					case T_OFF:
					case T_ON:
					case T_ONLY:
					case T_OPEN:
					case T_OR:
					case T_ORDER:
					case T_OUT:
					case T_OUTER:
					case T_OVER:
					case T_OVERWRITE:
					case T_OWNER:
					case T_PACKAGE:
					case T_PARTITION:
					case T_PCTFREE:
					case T_PCTUSED:
					case T_PRECISION:
					case T_PRESERVE:
					case T_PRIMARY:
					case T_PRINT:
					case T_PROC:
					case T_PROCEDURE:
					case T_QUALIFY:
					case T_QUERY_BAND:
					case T_QUIT:
					case T_QUOTED_IDENTIFIER:
					case T_RAISE:
					case T_REAL:
					case T_REFERENCES:
					case T_REGEXP:
					case T_REPLACE:
					case T_RESIGNAL:
					case T_RESTRICT:
					case T_RESULT:
					case T_RESULT_SET_LOCATOR:
					case T_RETURN:
					case T_RETURNS:
					case T_REVERSE:
					case T_RIGHT:
					case T_RLIKE:
					case T_ROLE:
					case T_ROLLBACK:
					case T_ROW:
					case T_ROWS:
					case T_ROW_COUNT:
					case T_RR:
					case T_RS:
					case T_PWD:
					case T_TRIM:
					case T_SCHEMA:
					case T_SECOND:
					case T_SECONDS:
					case T_SECURITY:
					case T_SEGMENT:
					case T_SEL:
					case T_SELECT:
					case T_SET:
					case T_SESSION:
					case T_SESSIONS:
					case T_SETS:
					case T_SHARE:
					case T_SIGNAL:
					case T_SIMPLE_DOUBLE:
					case T_SIMPLE_FLOAT:
					case T_SMALLDATETIME:
					case T_SMALLINT:
					case T_SQL:
					case T_SQLEXCEPTION:
					case T_SQLINSERT:
					case T_SQLSTATE:
					case T_SQLWARNING:
					case T_STATS:
					case T_STATISTICS:
					case T_STEP:
					case T_STORAGE:
					case T_STORED:
					case T_STRING:
					case T_SUBDIR:
					case T_SUBSTRING:
					case T_SUM:
					case T_SUMMARY:
					case T_SYS_REFCURSOR:
					case T_TABLE:
					case T_TABLESPACE:
					case T_TEMPORARY:
					case T_TERMINATED:
					case T_TEXTIMAGE_ON:
					case T_THEN:
					case T_TIMESTAMP:
					case T_TITLE:
					case T_TO:
					case T_TOP:
					case T_TRANSACTION:
					case T_TRUE:
					case T_TRUNCATE:
					case T_UNIQUE:
					case T_UPDATE:
					case T_UR:
					case T_USE:
					case T_USING:
					case T_VALUE:
					case T_VALUES:
					case T_VAR:
					case T_VARCHAR:
					case T_VARCHAR2:
					case T_VARYING:
					case T_VOLATILE:
					case T_WHILE:
					case T_WITH:
					case T_WITHOUT:
					case T_WORK:
					case T_XACT_ABORT:
					case T_XML:
					case T_YES:
					case T_ACTIVITY_COUNT:
					case T_CUME_DIST:
					case T_CURRENT_DATE:
					case T_CURRENT_TIMESTAMP:
					case T_CURRENT_USER:
					case T_DENSE_RANK:
					case T_FIRST_VALUE:
					case T_LAG:
					case T_LAST_VALUE:
					case T_LEAD:
					case T_PART_COUNT:
					case T_PART_LOC:
					case T_RANK:
					case T_ROW_NUMBER:
					case T_STDEV:
					case T_SYSDATE:
					case T_VARIANCE:
					case T_USER:
						{
						setState(3336);
						non_reserved_words();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(3343);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,423,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ParserRuleContext {
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	 
		public StringContext() { }
		public void copyFrom(StringContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Double_quotedStringContext extends StringContext {
		public TerminalNode L_D_STRING() { return getToken(HiveSqlParser.L_D_STRING, 0); }
		public Double_quotedStringContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterDouble_quotedString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitDouble_quotedString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitDouble_quotedString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Single_quotedStringContext extends StringContext {
		public TerminalNode L_S_STRING() { return getToken(HiveSqlParser.L_S_STRING, 0); }
		public Single_quotedStringContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterSingle_quotedString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitSingle_quotedString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitSingle_quotedString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_string);
		try {
			setState(3346);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_S_STRING:
				_localctx = new Single_quotedStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3344);
				match(L_S_STRING);
				}
				break;
			case L_D_STRING:
				_localctx = new Double_quotedStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(3345);
				match(L_D_STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Int_numberContext extends ParserRuleContext {
		public TerminalNode L_INT() { return getToken(HiveSqlParser.L_INT, 0); }
		public TerminalNode T_SUB() { return getToken(HiveSqlParser.T_SUB, 0); }
		public TerminalNode T_ADD() { return getToken(HiveSqlParser.T_ADD, 0); }
		public Int_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterInt_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitInt_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitInt_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_numberContext int_number() throws RecognitionException {
		Int_numberContext _localctx = new Int_numberContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_int_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ADD || _la==T_SUB) {
				{
				setState(3348);
				_la = _input.LA(1);
				if ( !(_la==T_ADD || _la==T_SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(3351);
			match(L_INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dec_numberContext extends ParserRuleContext {
		public TerminalNode L_DEC() { return getToken(HiveSqlParser.L_DEC, 0); }
		public TerminalNode T_SUB() { return getToken(HiveSqlParser.T_SUB, 0); }
		public TerminalNode T_ADD() { return getToken(HiveSqlParser.T_ADD, 0); }
		public Dec_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterDec_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitDec_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitDec_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dec_numberContext dec_number() throws RecognitionException {
		Dec_numberContext _localctx = new Dec_numberContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_dec_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ADD || _la==T_SUB) {
				{
				setState(3353);
				_la = _input.LA(1);
				if ( !(_la==T_ADD || _la==T_SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(3356);
			match(L_DEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bool_literalContext extends ParserRuleContext {
		public TerminalNode T_TRUE() { return getToken(HiveSqlParser.T_TRUE, 0); }
		public TerminalNode T_FALSE() { return getToken(HiveSqlParser.T_FALSE, 0); }
		public Bool_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterBool_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitBool_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitBool_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_literalContext bool_literal() throws RecognitionException {
		Bool_literalContext _localctx = new Bool_literalContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_bool_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3358);
			_la = _input.LA(1);
			if ( !(_la==T_FALSE || _la==T_TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Null_constContext extends ParserRuleContext {
		public TerminalNode T_NULL() { return getToken(HiveSqlParser.T_NULL, 0); }
		public Null_constContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterNull_const(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitNull_const(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitNull_const(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Null_constContext null_const() throws RecognitionException {
		Null_constContext _localctx = new Null_constContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_null_const);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3360);
			match(T_NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Non_reserved_wordsContext extends ParserRuleContext {
		public TerminalNode T_ACTION() { return getToken(HiveSqlParser.T_ACTION, 0); }
		public TerminalNode T_ACTIVITY_COUNT() { return getToken(HiveSqlParser.T_ACTIVITY_COUNT, 0); }
		public TerminalNode T_ADD2() { return getToken(HiveSqlParser.T_ADD2, 0); }
		public TerminalNode T_ALL() { return getToken(HiveSqlParser.T_ALL, 0); }
		public TerminalNode T_ALLOCATE() { return getToken(HiveSqlParser.T_ALLOCATE, 0); }
		public TerminalNode T_ALTER() { return getToken(HiveSqlParser.T_ALTER, 0); }
		public TerminalNode T_AND() { return getToken(HiveSqlParser.T_AND, 0); }
		public TerminalNode T_ANSI_NULLS() { return getToken(HiveSqlParser.T_ANSI_NULLS, 0); }
		public TerminalNode T_ANSI_PADDING() { return getToken(HiveSqlParser.T_ANSI_PADDING, 0); }
		public TerminalNode T_AS() { return getToken(HiveSqlParser.T_AS, 0); }
		public TerminalNode T_ASC() { return getToken(HiveSqlParser.T_ASC, 0); }
		public TerminalNode T_ASSOCIATE() { return getToken(HiveSqlParser.T_ASSOCIATE, 0); }
		public TerminalNode T_AT() { return getToken(HiveSqlParser.T_AT, 0); }
		public TerminalNode T_AUTO_INCREMENT() { return getToken(HiveSqlParser.T_AUTO_INCREMENT, 0); }
		public TerminalNode T_AVG() { return getToken(HiveSqlParser.T_AVG, 0); }
		public TerminalNode T_BATCHSIZE() { return getToken(HiveSqlParser.T_BATCHSIZE, 0); }
		public TerminalNode T_BEGIN() { return getToken(HiveSqlParser.T_BEGIN, 0); }
		public TerminalNode T_BETWEEN() { return getToken(HiveSqlParser.T_BETWEEN, 0); }
		public TerminalNode T_BIGINT() { return getToken(HiveSqlParser.T_BIGINT, 0); }
		public TerminalNode T_BINARY_DOUBLE() { return getToken(HiveSqlParser.T_BINARY_DOUBLE, 0); }
		public TerminalNode T_BINARY_FLOAT() { return getToken(HiveSqlParser.T_BINARY_FLOAT, 0); }
		public TerminalNode T_BIT() { return getToken(HiveSqlParser.T_BIT, 0); }
		public TerminalNode T_BODY() { return getToken(HiveSqlParser.T_BODY, 0); }
		public TerminalNode T_BREAK() { return getToken(HiveSqlParser.T_BREAK, 0); }
		public TerminalNode T_BY() { return getToken(HiveSqlParser.T_BY, 0); }
		public TerminalNode T_BYTE() { return getToken(HiveSqlParser.T_BYTE, 0); }
		public TerminalNode T_CALL() { return getToken(HiveSqlParser.T_CALL, 0); }
		public TerminalNode T_CALLER() { return getToken(HiveSqlParser.T_CALLER, 0); }
		public TerminalNode T_CASCADE() { return getToken(HiveSqlParser.T_CASCADE, 0); }
		public TerminalNode T_CASE() { return getToken(HiveSqlParser.T_CASE, 0); }
		public TerminalNode T_CASESPECIFIC() { return getToken(HiveSqlParser.T_CASESPECIFIC, 0); }
		public TerminalNode T_CAST() { return getToken(HiveSqlParser.T_CAST, 0); }
		public TerminalNode T_CHAR() { return getToken(HiveSqlParser.T_CHAR, 0); }
		public TerminalNode T_CHARACTER() { return getToken(HiveSqlParser.T_CHARACTER, 0); }
		public TerminalNode T_CHARSET() { return getToken(HiveSqlParser.T_CHARSET, 0); }
		public TerminalNode T_CLIENT() { return getToken(HiveSqlParser.T_CLIENT, 0); }
		public TerminalNode T_CLOSE() { return getToken(HiveSqlParser.T_CLOSE, 0); }
		public TerminalNode T_CLUSTERED() { return getToken(HiveSqlParser.T_CLUSTERED, 0); }
		public TerminalNode T_CMP() { return getToken(HiveSqlParser.T_CMP, 0); }
		public TerminalNode T_COLLECT() { return getToken(HiveSqlParser.T_COLLECT, 0); }
		public TerminalNode T_COLLECTION() { return getToken(HiveSqlParser.T_COLLECTION, 0); }
		public TerminalNode T_COLUMN() { return getToken(HiveSqlParser.T_COLUMN, 0); }
		public TerminalNode T_COMMENT() { return getToken(HiveSqlParser.T_COMMENT, 0); }
		public TerminalNode T_COMPRESS() { return getToken(HiveSqlParser.T_COMPRESS, 0); }
		public TerminalNode T_CONSTANT() { return getToken(HiveSqlParser.T_CONSTANT, 0); }
		public TerminalNode T_COPY() { return getToken(HiveSqlParser.T_COPY, 0); }
		public TerminalNode T_COMMIT() { return getToken(HiveSqlParser.T_COMMIT, 0); }
		public TerminalNode T_CONCAT() { return getToken(HiveSqlParser.T_CONCAT, 0); }
		public TerminalNode T_CONDITION() { return getToken(HiveSqlParser.T_CONDITION, 0); }
		public TerminalNode T_CONSTRAINT() { return getToken(HiveSqlParser.T_CONSTRAINT, 0); }
		public TerminalNode T_CONTINUE() { return getToken(HiveSqlParser.T_CONTINUE, 0); }
		public TerminalNode T_COUNT() { return getToken(HiveSqlParser.T_COUNT, 0); }
		public TerminalNode T_COUNT_BIG() { return getToken(HiveSqlParser.T_COUNT_BIG, 0); }
		public TerminalNode T_CREATE() { return getToken(HiveSqlParser.T_CREATE, 0); }
		public TerminalNode T_CREATION() { return getToken(HiveSqlParser.T_CREATION, 0); }
		public TerminalNode T_CREATOR() { return getToken(HiveSqlParser.T_CREATOR, 0); }
		public TerminalNode T_CS() { return getToken(HiveSqlParser.T_CS, 0); }
		public TerminalNode T_CUME_DIST() { return getToken(HiveSqlParser.T_CUME_DIST, 0); }
		public TerminalNode T_CURRENT() { return getToken(HiveSqlParser.T_CURRENT, 0); }
		public TerminalNode T_CURRENT_DATE() { return getToken(HiveSqlParser.T_CURRENT_DATE, 0); }
		public TerminalNode T_CURRENT_SCHEMA() { return getToken(HiveSqlParser.T_CURRENT_SCHEMA, 0); }
		public TerminalNode T_CURRENT_TIMESTAMP() { return getToken(HiveSqlParser.T_CURRENT_TIMESTAMP, 0); }
		public TerminalNode T_CURRENT_USER() { return getToken(HiveSqlParser.T_CURRENT_USER, 0); }
		public TerminalNode T_CURSOR() { return getToken(HiveSqlParser.T_CURSOR, 0); }
		public TerminalNode T_DATA() { return getToken(HiveSqlParser.T_DATA, 0); }
		public TerminalNode T_DATABASE() { return getToken(HiveSqlParser.T_DATABASE, 0); }
		public TerminalNode T_DATE() { return getToken(HiveSqlParser.T_DATE, 0); }
		public TerminalNode T_DATETIME() { return getToken(HiveSqlParser.T_DATETIME, 0); }
		public TerminalNode T_DAY() { return getToken(HiveSqlParser.T_DAY, 0); }
		public TerminalNode T_DAYS() { return getToken(HiveSqlParser.T_DAYS, 0); }
		public TerminalNode T_DEC() { return getToken(HiveSqlParser.T_DEC, 0); }
		public TerminalNode T_DECIMAL() { return getToken(HiveSqlParser.T_DECIMAL, 0); }
		public TerminalNode T_DECLARE() { return getToken(HiveSqlParser.T_DECLARE, 0); }
		public TerminalNode T_DEFAULT() { return getToken(HiveSqlParser.T_DEFAULT, 0); }
		public TerminalNode T_DEFERRED() { return getToken(HiveSqlParser.T_DEFERRED, 0); }
		public TerminalNode T_DEFINED() { return getToken(HiveSqlParser.T_DEFINED, 0); }
		public TerminalNode T_DEFINER() { return getToken(HiveSqlParser.T_DEFINER, 0); }
		public TerminalNode T_DEFINITION() { return getToken(HiveSqlParser.T_DEFINITION, 0); }
		public TerminalNode T_DELETE() { return getToken(HiveSqlParser.T_DELETE, 0); }
		public TerminalNode T_DELIMITED() { return getToken(HiveSqlParser.T_DELIMITED, 0); }
		public TerminalNode T_DELIMITER() { return getToken(HiveSqlParser.T_DELIMITER, 0); }
		public TerminalNode T_DENSE_RANK() { return getToken(HiveSqlParser.T_DENSE_RANK, 0); }
		public TerminalNode T_DESC() { return getToken(HiveSqlParser.T_DESC, 0); }
		public TerminalNode T_DESCRIBE() { return getToken(HiveSqlParser.T_DESCRIBE, 0); }
		public TerminalNode T_DIAGNOSTICS() { return getToken(HiveSqlParser.T_DIAGNOSTICS, 0); }
		public TerminalNode T_DIR() { return getToken(HiveSqlParser.T_DIR, 0); }
		public TerminalNode T_DIRECTORY() { return getToken(HiveSqlParser.T_DIRECTORY, 0); }
		public TerminalNode T_DISTINCT() { return getToken(HiveSqlParser.T_DISTINCT, 0); }
		public TerminalNode T_DISTRIBUTE() { return getToken(HiveSqlParser.T_DISTRIBUTE, 0); }
		public TerminalNode T_DO() { return getToken(HiveSqlParser.T_DO, 0); }
		public TerminalNode T_DOUBLE() { return getToken(HiveSqlParser.T_DOUBLE, 0); }
		public TerminalNode T_DROP() { return getToken(HiveSqlParser.T_DROP, 0); }
		public TerminalNode T_DYNAMIC() { return getToken(HiveSqlParser.T_DYNAMIC, 0); }
		public TerminalNode T_ENABLE() { return getToken(HiveSqlParser.T_ENABLE, 0); }
		public TerminalNode T_ENGINE() { return getToken(HiveSqlParser.T_ENGINE, 0); }
		public TerminalNode T_ESCAPED() { return getToken(HiveSqlParser.T_ESCAPED, 0); }
		public TerminalNode T_EXCEPT() { return getToken(HiveSqlParser.T_EXCEPT, 0); }
		public TerminalNode T_EXEC() { return getToken(HiveSqlParser.T_EXEC, 0); }
		public TerminalNode T_EXECUTE() { return getToken(HiveSqlParser.T_EXECUTE, 0); }
		public TerminalNode T_EXCEPTION() { return getToken(HiveSqlParser.T_EXCEPTION, 0); }
		public TerminalNode T_EXCLUSIVE() { return getToken(HiveSqlParser.T_EXCLUSIVE, 0); }
		public TerminalNode T_EXISTS() { return getToken(HiveSqlParser.T_EXISTS, 0); }
		public TerminalNode T_EXIT() { return getToken(HiveSqlParser.T_EXIT, 0); }
		public TerminalNode T_FALLBACK() { return getToken(HiveSqlParser.T_FALLBACK, 0); }
		public TerminalNode T_FALSE() { return getToken(HiveSqlParser.T_FALSE, 0); }
		public TerminalNode T_FETCH() { return getToken(HiveSqlParser.T_FETCH, 0); }
		public TerminalNode T_FIELDS() { return getToken(HiveSqlParser.T_FIELDS, 0); }
		public TerminalNode T_FILE() { return getToken(HiveSqlParser.T_FILE, 0); }
		public TerminalNode T_FILES() { return getToken(HiveSqlParser.T_FILES, 0); }
		public TerminalNode T_FIRST_VALUE() { return getToken(HiveSqlParser.T_FIRST_VALUE, 0); }
		public TerminalNode T_FLOAT() { return getToken(HiveSqlParser.T_FLOAT, 0); }
		public TerminalNode T_FOR() { return getToken(HiveSqlParser.T_FOR, 0); }
		public TerminalNode T_FOREIGN() { return getToken(HiveSqlParser.T_FOREIGN, 0); }
		public TerminalNode T_FORMAT() { return getToken(HiveSqlParser.T_FORMAT, 0); }
		public TerminalNode T_FOUND() { return getToken(HiveSqlParser.T_FOUND, 0); }
		public TerminalNode T_FROM() { return getToken(HiveSqlParser.T_FROM, 0); }
		public TerminalNode T_FULL() { return getToken(HiveSqlParser.T_FULL, 0); }
		public TerminalNode T_FUNCTION() { return getToken(HiveSqlParser.T_FUNCTION, 0); }
		public TerminalNode T_GET() { return getToken(HiveSqlParser.T_GET, 0); }
		public TerminalNode T_GLOBAL() { return getToken(HiveSqlParser.T_GLOBAL, 0); }
		public TerminalNode T_GO() { return getToken(HiveSqlParser.T_GO, 0); }
		public TerminalNode T_GRANT() { return getToken(HiveSqlParser.T_GRANT, 0); }
		public TerminalNode T_GROUP() { return getToken(HiveSqlParser.T_GROUP, 0); }
		public TerminalNode T_HANDLER() { return getToken(HiveSqlParser.T_HANDLER, 0); }
		public TerminalNode T_HASH() { return getToken(HiveSqlParser.T_HASH, 0); }
		public TerminalNode T_HAVING() { return getToken(HiveSqlParser.T_HAVING, 0); }
		public TerminalNode T_HDFS() { return getToken(HiveSqlParser.T_HDFS, 0); }
		public TerminalNode T_HIVE() { return getToken(HiveSqlParser.T_HIVE, 0); }
		public TerminalNode T_HOST() { return getToken(HiveSqlParser.T_HOST, 0); }
		public TerminalNode T_IDENTITY() { return getToken(HiveSqlParser.T_IDENTITY, 0); }
		public TerminalNode T_IF() { return getToken(HiveSqlParser.T_IF, 0); }
		public TerminalNode T_IGNORE() { return getToken(HiveSqlParser.T_IGNORE, 0); }
		public TerminalNode T_IMMEDIATE() { return getToken(HiveSqlParser.T_IMMEDIATE, 0); }
		public TerminalNode T_IN() { return getToken(HiveSqlParser.T_IN, 0); }
		public TerminalNode T_INCLUDE() { return getToken(HiveSqlParser.T_INCLUDE, 0); }
		public TerminalNode T_INDEX() { return getToken(HiveSqlParser.T_INDEX, 0); }
		public TerminalNode T_INITRANS() { return getToken(HiveSqlParser.T_INITRANS, 0); }
		public TerminalNode T_INNER() { return getToken(HiveSqlParser.T_INNER, 0); }
		public TerminalNode T_INOUT() { return getToken(HiveSqlParser.T_INOUT, 0); }
		public TerminalNode T_INSERT() { return getToken(HiveSqlParser.T_INSERT, 0); }
		public TerminalNode T_INT() { return getToken(HiveSqlParser.T_INT, 0); }
		public TerminalNode T_INT2() { return getToken(HiveSqlParser.T_INT2, 0); }
		public TerminalNode T_INT4() { return getToken(HiveSqlParser.T_INT4, 0); }
		public TerminalNode T_INT8() { return getToken(HiveSqlParser.T_INT8, 0); }
		public TerminalNode T_INTEGER() { return getToken(HiveSqlParser.T_INTEGER, 0); }
		public TerminalNode T_INTERSECT() { return getToken(HiveSqlParser.T_INTERSECT, 0); }
		public TerminalNode T_INTERVAL() { return getToken(HiveSqlParser.T_INTERVAL, 0); }
		public TerminalNode T_INTO() { return getToken(HiveSqlParser.T_INTO, 0); }
		public TerminalNode T_INVOKER() { return getToken(HiveSqlParser.T_INVOKER, 0); }
		public TerminalNode T_ITEMS() { return getToken(HiveSqlParser.T_ITEMS, 0); }
		public TerminalNode T_IS() { return getToken(HiveSqlParser.T_IS, 0); }
		public TerminalNode T_ISOPEN() { return getToken(HiveSqlParser.T_ISOPEN, 0); }
		public TerminalNode T_JOIN() { return getToken(HiveSqlParser.T_JOIN, 0); }
		public TerminalNode T_KEEP() { return getToken(HiveSqlParser.T_KEEP, 0); }
		public TerminalNode T_KEY() { return getToken(HiveSqlParser.T_KEY, 0); }
		public TerminalNode T_KEYS() { return getToken(HiveSqlParser.T_KEYS, 0); }
		public TerminalNode T_LAG() { return getToken(HiveSqlParser.T_LAG, 0); }
		public TerminalNode T_LANGUAGE() { return getToken(HiveSqlParser.T_LANGUAGE, 0); }
		public TerminalNode T_LAST_VALUE() { return getToken(HiveSqlParser.T_LAST_VALUE, 0); }
		public TerminalNode T_LEAD() { return getToken(HiveSqlParser.T_LEAD, 0); }
		public TerminalNode T_LEAVE() { return getToken(HiveSqlParser.T_LEAVE, 0); }
		public TerminalNode T_LEFT() { return getToken(HiveSqlParser.T_LEFT, 0); }
		public TerminalNode T_LIKE() { return getToken(HiveSqlParser.T_LIKE, 0); }
		public TerminalNode T_LIMIT() { return getToken(HiveSqlParser.T_LIMIT, 0); }
		public TerminalNode T_LINES() { return getToken(HiveSqlParser.T_LINES, 0); }
		public TerminalNode T_LOCAL() { return getToken(HiveSqlParser.T_LOCAL, 0); }
		public TerminalNode T_LOCATION() { return getToken(HiveSqlParser.T_LOCATION, 0); }
		public TerminalNode T_LOCATOR() { return getToken(HiveSqlParser.T_LOCATOR, 0); }
		public TerminalNode T_LOCATORS() { return getToken(HiveSqlParser.T_LOCATORS, 0); }
		public TerminalNode T_LOCKS() { return getToken(HiveSqlParser.T_LOCKS, 0); }
		public TerminalNode T_LOG() { return getToken(HiveSqlParser.T_LOG, 0); }
		public TerminalNode T_LOGGED() { return getToken(HiveSqlParser.T_LOGGED, 0); }
		public TerminalNode T_LOGGING() { return getToken(HiveSqlParser.T_LOGGING, 0); }
		public TerminalNode T_LOOP() { return getToken(HiveSqlParser.T_LOOP, 0); }
		public TerminalNode T_MAP() { return getToken(HiveSqlParser.T_MAP, 0); }
		public TerminalNode T_MATCHED() { return getToken(HiveSqlParser.T_MATCHED, 0); }
		public TerminalNode T_MAX() { return getToken(HiveSqlParser.T_MAX, 0); }
		public TerminalNode T_MAXTRANS() { return getToken(HiveSqlParser.T_MAXTRANS, 0); }
		public TerminalNode T_MERGE() { return getToken(HiveSqlParser.T_MERGE, 0); }
		public TerminalNode T_MESSAGE_TEXT() { return getToken(HiveSqlParser.T_MESSAGE_TEXT, 0); }
		public TerminalNode T_MICROSECOND() { return getToken(HiveSqlParser.T_MICROSECOND, 0); }
		public TerminalNode T_MICROSECONDS() { return getToken(HiveSqlParser.T_MICROSECONDS, 0); }
		public TerminalNode T_MIN() { return getToken(HiveSqlParser.T_MIN, 0); }
		public TerminalNode T_MULTISET() { return getToken(HiveSqlParser.T_MULTISET, 0); }
		public TerminalNode T_NCHAR() { return getToken(HiveSqlParser.T_NCHAR, 0); }
		public TerminalNode T_NEW() { return getToken(HiveSqlParser.T_NEW, 0); }
		public TerminalNode T_NVARCHAR() { return getToken(HiveSqlParser.T_NVARCHAR, 0); }
		public TerminalNode T_NO() { return getToken(HiveSqlParser.T_NO, 0); }
		public TerminalNode T_NOCOMPRESS() { return getToken(HiveSqlParser.T_NOCOMPRESS, 0); }
		public TerminalNode T_NOCOUNT() { return getToken(HiveSqlParser.T_NOCOUNT, 0); }
		public TerminalNode T_NOLOGGING() { return getToken(HiveSqlParser.T_NOLOGGING, 0); }
		public TerminalNode T_NONE() { return getToken(HiveSqlParser.T_NONE, 0); }
		public TerminalNode T_NOT() { return getToken(HiveSqlParser.T_NOT, 0); }
		public TerminalNode T_NOTFOUND() { return getToken(HiveSqlParser.T_NOTFOUND, 0); }
		public TerminalNode T_NUMERIC() { return getToken(HiveSqlParser.T_NUMERIC, 0); }
		public TerminalNode T_NUMBER() { return getToken(HiveSqlParser.T_NUMBER, 0); }
		public TerminalNode T_OBJECT() { return getToken(HiveSqlParser.T_OBJECT, 0); }
		public TerminalNode T_OFF() { return getToken(HiveSqlParser.T_OFF, 0); }
		public TerminalNode T_ON() { return getToken(HiveSqlParser.T_ON, 0); }
		public TerminalNode T_ONLY() { return getToken(HiveSqlParser.T_ONLY, 0); }
		public TerminalNode T_OPEN() { return getToken(HiveSqlParser.T_OPEN, 0); }
		public TerminalNode T_OR() { return getToken(HiveSqlParser.T_OR, 0); }
		public TerminalNode T_ORDER() { return getToken(HiveSqlParser.T_ORDER, 0); }
		public TerminalNode T_OUT() { return getToken(HiveSqlParser.T_OUT, 0); }
		public TerminalNode T_OUTER() { return getToken(HiveSqlParser.T_OUTER, 0); }
		public TerminalNode T_OVER() { return getToken(HiveSqlParser.T_OVER, 0); }
		public TerminalNode T_OVERWRITE() { return getToken(HiveSqlParser.T_OVERWRITE, 0); }
		public TerminalNode T_OWNER() { return getToken(HiveSqlParser.T_OWNER, 0); }
		public TerminalNode T_PACKAGE() { return getToken(HiveSqlParser.T_PACKAGE, 0); }
		public TerminalNode T_PART_COUNT() { return getToken(HiveSqlParser.T_PART_COUNT, 0); }
		public TerminalNode T_PART_LOC() { return getToken(HiveSqlParser.T_PART_LOC, 0); }
		public TerminalNode T_PARTITION() { return getToken(HiveSqlParser.T_PARTITION, 0); }
		public TerminalNode T_PCTFREE() { return getToken(HiveSqlParser.T_PCTFREE, 0); }
		public TerminalNode T_PCTUSED() { return getToken(HiveSqlParser.T_PCTUSED, 0); }
		public TerminalNode T_PRECISION() { return getToken(HiveSqlParser.T_PRECISION, 0); }
		public TerminalNode T_PRESERVE() { return getToken(HiveSqlParser.T_PRESERVE, 0); }
		public TerminalNode T_PRIMARY() { return getToken(HiveSqlParser.T_PRIMARY, 0); }
		public TerminalNode T_PRINT() { return getToken(HiveSqlParser.T_PRINT, 0); }
		public TerminalNode T_PROC() { return getToken(HiveSqlParser.T_PROC, 0); }
		public TerminalNode T_PROCEDURE() { return getToken(HiveSqlParser.T_PROCEDURE, 0); }
		public TerminalNode T_PWD() { return getToken(HiveSqlParser.T_PWD, 0); }
		public TerminalNode T_QUALIFY() { return getToken(HiveSqlParser.T_QUALIFY, 0); }
		public TerminalNode T_QUERY_BAND() { return getToken(HiveSqlParser.T_QUERY_BAND, 0); }
		public TerminalNode T_QUIT() { return getToken(HiveSqlParser.T_QUIT, 0); }
		public TerminalNode T_QUOTED_IDENTIFIER() { return getToken(HiveSqlParser.T_QUOTED_IDENTIFIER, 0); }
		public TerminalNode T_RAISE() { return getToken(HiveSqlParser.T_RAISE, 0); }
		public TerminalNode T_RANK() { return getToken(HiveSqlParser.T_RANK, 0); }
		public TerminalNode T_REAL() { return getToken(HiveSqlParser.T_REAL, 0); }
		public TerminalNode T_REFERENCES() { return getToken(HiveSqlParser.T_REFERENCES, 0); }
		public TerminalNode T_REGEXP() { return getToken(HiveSqlParser.T_REGEXP, 0); }
		public TerminalNode T_RR() { return getToken(HiveSqlParser.T_RR, 0); }
		public TerminalNode T_REPLACE() { return getToken(HiveSqlParser.T_REPLACE, 0); }
		public TerminalNode T_RESIGNAL() { return getToken(HiveSqlParser.T_RESIGNAL, 0); }
		public TerminalNode T_RESTRICT() { return getToken(HiveSqlParser.T_RESTRICT, 0); }
		public TerminalNode T_RESULT() { return getToken(HiveSqlParser.T_RESULT, 0); }
		public TerminalNode T_RESULT_SET_LOCATOR() { return getToken(HiveSqlParser.T_RESULT_SET_LOCATOR, 0); }
		public TerminalNode T_RETURN() { return getToken(HiveSqlParser.T_RETURN, 0); }
		public TerminalNode T_RETURNS() { return getToken(HiveSqlParser.T_RETURNS, 0); }
		public TerminalNode T_REVERSE() { return getToken(HiveSqlParser.T_REVERSE, 0); }
		public TerminalNode T_RIGHT() { return getToken(HiveSqlParser.T_RIGHT, 0); }
		public TerminalNode T_RLIKE() { return getToken(HiveSqlParser.T_RLIKE, 0); }
		public TerminalNode T_RS() { return getToken(HiveSqlParser.T_RS, 0); }
		public TerminalNode T_ROLE() { return getToken(HiveSqlParser.T_ROLE, 0); }
		public TerminalNode T_ROLLBACK() { return getToken(HiveSqlParser.T_ROLLBACK, 0); }
		public TerminalNode T_ROW() { return getToken(HiveSqlParser.T_ROW, 0); }
		public TerminalNode T_ROWS() { return getToken(HiveSqlParser.T_ROWS, 0); }
		public TerminalNode T_ROW_COUNT() { return getToken(HiveSqlParser.T_ROW_COUNT, 0); }
		public TerminalNode T_ROW_NUMBER() { return getToken(HiveSqlParser.T_ROW_NUMBER, 0); }
		public TerminalNode T_SCHEMA() { return getToken(HiveSqlParser.T_SCHEMA, 0); }
		public TerminalNode T_SECOND() { return getToken(HiveSqlParser.T_SECOND, 0); }
		public TerminalNode T_SECONDS() { return getToken(HiveSqlParser.T_SECONDS, 0); }
		public TerminalNode T_SECURITY() { return getToken(HiveSqlParser.T_SECURITY, 0); }
		public TerminalNode T_SEGMENT() { return getToken(HiveSqlParser.T_SEGMENT, 0); }
		public TerminalNode T_SEL() { return getToken(HiveSqlParser.T_SEL, 0); }
		public TerminalNode T_SELECT() { return getToken(HiveSqlParser.T_SELECT, 0); }
		public TerminalNode T_SESSION() { return getToken(HiveSqlParser.T_SESSION, 0); }
		public TerminalNode T_SESSIONS() { return getToken(HiveSqlParser.T_SESSIONS, 0); }
		public TerminalNode T_SET() { return getToken(HiveSqlParser.T_SET, 0); }
		public TerminalNode T_SETS() { return getToken(HiveSqlParser.T_SETS, 0); }
		public TerminalNode T_SHARE() { return getToken(HiveSqlParser.T_SHARE, 0); }
		public TerminalNode T_SIGNAL() { return getToken(HiveSqlParser.T_SIGNAL, 0); }
		public TerminalNode T_SIMPLE_DOUBLE() { return getToken(HiveSqlParser.T_SIMPLE_DOUBLE, 0); }
		public TerminalNode T_SIMPLE_FLOAT() { return getToken(HiveSqlParser.T_SIMPLE_FLOAT, 0); }
		public TerminalNode T_SMALLDATETIME() { return getToken(HiveSqlParser.T_SMALLDATETIME, 0); }
		public TerminalNode T_SMALLINT() { return getToken(HiveSqlParser.T_SMALLINT, 0); }
		public TerminalNode T_SQL() { return getToken(HiveSqlParser.T_SQL, 0); }
		public TerminalNode T_SQLEXCEPTION() { return getToken(HiveSqlParser.T_SQLEXCEPTION, 0); }
		public TerminalNode T_SQLINSERT() { return getToken(HiveSqlParser.T_SQLINSERT, 0); }
		public TerminalNode T_SQLSTATE() { return getToken(HiveSqlParser.T_SQLSTATE, 0); }
		public TerminalNode T_SQLWARNING() { return getToken(HiveSqlParser.T_SQLWARNING, 0); }
		public TerminalNode T_STATS() { return getToken(HiveSqlParser.T_STATS, 0); }
		public TerminalNode T_STATISTICS() { return getToken(HiveSqlParser.T_STATISTICS, 0); }
		public TerminalNode T_STEP() { return getToken(HiveSqlParser.T_STEP, 0); }
		public TerminalNode T_STDEV() { return getToken(HiveSqlParser.T_STDEV, 0); }
		public TerminalNode T_STORAGE() { return getToken(HiveSqlParser.T_STORAGE, 0); }
		public TerminalNode T_STORED() { return getToken(HiveSqlParser.T_STORED, 0); }
		public TerminalNode T_STRING() { return getToken(HiveSqlParser.T_STRING, 0); }
		public TerminalNode T_SUBDIR() { return getToken(HiveSqlParser.T_SUBDIR, 0); }
		public TerminalNode T_SUBSTRING() { return getToken(HiveSqlParser.T_SUBSTRING, 0); }
		public TerminalNode T_SUM() { return getToken(HiveSqlParser.T_SUM, 0); }
		public TerminalNode T_SUMMARY() { return getToken(HiveSqlParser.T_SUMMARY, 0); }
		public TerminalNode T_SYSDATE() { return getToken(HiveSqlParser.T_SYSDATE, 0); }
		public TerminalNode T_SYS_REFCURSOR() { return getToken(HiveSqlParser.T_SYS_REFCURSOR, 0); }
		public TerminalNode T_TABLE() { return getToken(HiveSqlParser.T_TABLE, 0); }
		public TerminalNode T_TABLESPACE() { return getToken(HiveSqlParser.T_TABLESPACE, 0); }
		public TerminalNode T_TEMPORARY() { return getToken(HiveSqlParser.T_TEMPORARY, 0); }
		public TerminalNode T_TERMINATED() { return getToken(HiveSqlParser.T_TERMINATED, 0); }
		public TerminalNode T_TEXTIMAGE_ON() { return getToken(HiveSqlParser.T_TEXTIMAGE_ON, 0); }
		public TerminalNode T_THEN() { return getToken(HiveSqlParser.T_THEN, 0); }
		public TerminalNode T_TIMESTAMP() { return getToken(HiveSqlParser.T_TIMESTAMP, 0); }
		public TerminalNode T_TITLE() { return getToken(HiveSqlParser.T_TITLE, 0); }
		public TerminalNode T_TO() { return getToken(HiveSqlParser.T_TO, 0); }
		public TerminalNode T_TOP() { return getToken(HiveSqlParser.T_TOP, 0); }
		public TerminalNode T_TRANSACTION() { return getToken(HiveSqlParser.T_TRANSACTION, 0); }
		public TerminalNode T_TRIM() { return getToken(HiveSqlParser.T_TRIM, 0); }
		public TerminalNode T_TRUE() { return getToken(HiveSqlParser.T_TRUE, 0); }
		public TerminalNode T_TRUNCATE() { return getToken(HiveSqlParser.T_TRUNCATE, 0); }
		public TerminalNode T_UNIQUE() { return getToken(HiveSqlParser.T_UNIQUE, 0); }
		public TerminalNode T_UPDATE() { return getToken(HiveSqlParser.T_UPDATE, 0); }
		public TerminalNode T_UR() { return getToken(HiveSqlParser.T_UR, 0); }
		public TerminalNode T_USE() { return getToken(HiveSqlParser.T_USE, 0); }
		public TerminalNode T_USER() { return getToken(HiveSqlParser.T_USER, 0); }
		public TerminalNode T_USING() { return getToken(HiveSqlParser.T_USING, 0); }
		public TerminalNode T_VALUE() { return getToken(HiveSqlParser.T_VALUE, 0); }
		public TerminalNode T_VALUES() { return getToken(HiveSqlParser.T_VALUES, 0); }
		public TerminalNode T_VAR() { return getToken(HiveSqlParser.T_VAR, 0); }
		public TerminalNode T_VARCHAR() { return getToken(HiveSqlParser.T_VARCHAR, 0); }
		public TerminalNode T_VARCHAR2() { return getToken(HiveSqlParser.T_VARCHAR2, 0); }
		public TerminalNode T_VARYING() { return getToken(HiveSqlParser.T_VARYING, 0); }
		public TerminalNode T_VARIANCE() { return getToken(HiveSqlParser.T_VARIANCE, 0); }
		public TerminalNode T_VOLATILE() { return getToken(HiveSqlParser.T_VOLATILE, 0); }
		public TerminalNode T_WHILE() { return getToken(HiveSqlParser.T_WHILE, 0); }
		public TerminalNode T_WITH() { return getToken(HiveSqlParser.T_WITH, 0); }
		public TerminalNode T_WITHOUT() { return getToken(HiveSqlParser.T_WITHOUT, 0); }
		public TerminalNode T_WORK() { return getToken(HiveSqlParser.T_WORK, 0); }
		public TerminalNode T_XACT_ABORT() { return getToken(HiveSqlParser.T_XACT_ABORT, 0); }
		public TerminalNode T_XML() { return getToken(HiveSqlParser.T_XML, 0); }
		public TerminalNode T_YES() { return getToken(HiveSqlParser.T_YES, 0); }
		public Non_reserved_wordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_reserved_words; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).enterNon_reserved_words(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HiveSqlListener ) ((HiveSqlListener)listener).exitNon_reserved_words(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HiveSqlVisitor ) return ((HiveSqlVisitor<? extends T>)visitor).visitNon_reserved_words(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_reserved_wordsContext non_reserved_words() throws RecognitionException {
		Non_reserved_wordsContext _localctx = new Non_reserved_wordsContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_non_reserved_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3362);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & -67108928L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -24696061953L) != 0 || (((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & -1L) != 0 || (((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & -2251799817879561L) != 0 || (((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & -108093005306528001L) != 0 || (((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & 16712703L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return block_end_sempred((Block_endContext)_localctx, predIndex);
		case 11:
			return expr_stmt_sempred((Expr_stmtContext)_localctx, predIndex);
		case 75:
			return create_routine_params_sempred((Create_routine_paramsContext)_localctx, predIndex);
		case 153:
			return select_list_alias_sempred((Select_list_aliasContext)_localctx, predIndex);
		case 164:
			return from_alias_clause_sempred((From_alias_clauseContext)_localctx, predIndex);
		case 182:
			return delete_alias_sempred((Delete_aliasContext)_localctx, predIndex);
		case 184:
			return bool_expr_sempred((Bool_exprContext)_localctx, predIndex);
		case 192:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 209:
			return func_param_sempred((Func_paramContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean block_end_sempred(Block_endContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return !_input.LT(2).getText().equalsIgnoreCase("TRANSACTION");
		}
		return true;
	}
	private boolean expr_stmt_sempred(Expr_stmtContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return !_input.LT(1).getText().equalsIgnoreCase("GO");
		}
		return true;
	}
	private boolean create_routine_params_sempred(Create_routine_paramsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return !_input.LT(1).getText().equalsIgnoreCase("IS") &&
		        !_input.LT(1).getText().equalsIgnoreCase("AS") &&
		        !(_input.LT(1).getText().equalsIgnoreCase("DYNAMIC") && _input.LT(2).getText().equalsIgnoreCase("RESULT"))
		        ;
		}
		return true;
	}
	private boolean select_list_alias_sempred(Select_list_aliasContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return !_input.LT(1).getText().equalsIgnoreCase("INTO") && !_input.LT(1).getText().equalsIgnoreCase("FROM");
		}
		return true;
	}
	private boolean from_alias_clause_sempred(From_alias_clauseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return !_input.LT(1).getText().equalsIgnoreCase("EXEC") &&
		        !_input.LT(1).getText().equalsIgnoreCase("EXECUTE") &&
		        !_input.LT(1).getText().equalsIgnoreCase("INNER") &&
		        !_input.LT(1).getText().equalsIgnoreCase("LEFT") &&
		        !_input.LT(1).getText().equalsIgnoreCase("GROUP") &&
		        !_input.LT(1).getText().equalsIgnoreCase("ORDER") &&
		        !_input.LT(1).getText().equalsIgnoreCase("LIMIT") &&
		        !_input.LT(1).getText().equalsIgnoreCase("WITH");
		}
		return true;
	}
	private boolean delete_alias_sempred(Delete_aliasContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return !_input.LT(1).getText().equalsIgnoreCase("ALL");
		}
		return true;
	}
	private boolean bool_expr_sempred(Bool_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 14);
		case 8:
			return precpred(_ctx, 13);
		case 9:
			return precpred(_ctx, 12);
		case 10:
			return precpred(_ctx, 11);
		case 11:
			return precpred(_ctx, 15);
		}
		return true;
	}
	private boolean func_param_sempred(Func_paramContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return !_input.LT(1).getText().equalsIgnoreCase("INTO");
		}
		return true;
	}

	private static final String _serializedATNSegment0 =
		"\u0004\u0001\u0178\u0d25\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007"+
		"h\u0002i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007"+
		"m\u0002n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007"+
		"r\u0002s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007"+
		"w\u0002x\u0007x\u0002y\u0007y\u0002z\u0007z\u0002{\u0007{\u0002|\u0007"+
		"|\u0002}\u0007}\u0002~\u0007~\u0002\u007f\u0007\u007f\u0002\u0080\u0007"+
		"\u0080\u0002\u0081\u0007\u0081\u0002\u0082\u0007\u0082\u0002\u0083\u0007"+
		"\u0083\u0002\u0084\u0007\u0084\u0002\u0085\u0007\u0085\u0002\u0086\u0007"+
		"\u0086\u0002\u0087\u0007\u0087\u0002\u0088\u0007\u0088\u0002\u0089\u0007"+
		"\u0089\u0002\u008a\u0007\u008a\u0002\u008b\u0007\u008b\u0002\u008c\u0007"+
		"\u008c\u0002\u008d\u0007\u008d\u0002\u008e\u0007\u008e\u0002\u008f\u0007"+
		"\u008f\u0002\u0090\u0007\u0090\u0002\u0091\u0007\u0091\u0002\u0092\u0007"+
		"\u0092\u0002\u0093\u0007\u0093\u0002\u0094\u0007\u0094\u0002\u0095\u0007"+
		"\u0095\u0002\u0096\u0007\u0096\u0002\u0097\u0007\u0097\u0002\u0098\u0007"+
		"\u0098\u0002\u0099\u0007\u0099\u0002\u009a\u0007\u009a\u0002\u009b\u0007"+
		"\u009b\u0002\u009c\u0007\u009c\u0002\u009d\u0007\u009d\u0002\u009e\u0007"+
		"\u009e\u0002\u009f\u0007\u009f\u0002\u00a0\u0007\u00a0\u0002\u00a1\u0007"+
		"\u00a1\u0002\u00a2\u0007\u00a2\u0002\u00a3\u0007\u00a3\u0002\u00a4\u0007"+
		"\u00a4\u0002\u00a5\u0007\u00a5\u0002\u00a6\u0007\u00a6\u0002\u00a7\u0007"+
		"\u00a7\u0002\u00a8\u0007\u00a8\u0002\u00a9\u0007\u00a9\u0002\u00aa\u0007"+
		"\u00aa\u0002\u00ab\u0007\u00ab\u0002\u00ac\u0007\u00ac\u0002\u00ad\u0007"+
		"\u00ad\u0002\u00ae\u0007\u00ae\u0002\u00af\u0007\u00af\u0002\u00b0\u0007"+
		"\u00b0\u0002\u00b1\u0007\u00b1\u0002\u00b2\u0007\u00b2\u0002\u00b3\u0007"+
		"\u00b3\u0002\u00b4\u0007\u00b4\u0002\u00b5\u0007\u00b5\u0002\u00b6\u0007"+
		"\u00b6\u0002\u00b7\u0007\u00b7\u0002\u00b8\u0007\u00b8\u0002\u00b9\u0007"+
		"\u00b9\u0002\u00ba\u0007\u00ba\u0002\u00bb\u0007\u00bb\u0002\u00bc\u0007"+
		"\u00bc\u0002\u00bd\u0007\u00bd\u0002\u00be\u0007\u00be\u0002\u00bf\u0007"+
		"\u00bf\u0002\u00c0\u0007\u00c0\u0002\u00c1\u0007\u00c1\u0002\u00c2\u0007"+
		"\u00c2\u0002\u00c3\u0007\u00c3\u0002\u00c4\u0007\u00c4\u0002\u00c5\u0007"+
		"\u00c5\u0002\u00c6\u0007\u00c6\u0002\u00c7\u0007\u00c7\u0002\u00c8\u0007"+
		"\u00c8\u0002\u00c9\u0007\u00c9\u0002\u00ca\u0007\u00ca\u0002\u00cb\u0007"+
		"\u00cb\u0002\u00cc\u0007\u00cc\u0002\u00cd\u0007\u00cd\u0002\u00ce\u0007"+
		"\u00ce\u0002\u00cf\u0007\u00cf\u0002\u00d0\u0007\u00d0\u0002\u00d1\u0007"+
		"\u00d1\u0002\u00d2\u0007\u00d2\u0002\u00d3\u0007\u00d3\u0002\u00d4\u0007"+
		"\u00d4\u0002\u00d5\u0007\u00d5\u0002\u00d6\u0007\u00d6\u0002\u00d7\u0007"+
		"\u00d7\u0002\u00d8\u0007\u00d8\u0002\u00d9\u0007\u00d9\u0002\u00da\u0007"+
		"\u00da\u0002\u00db\u0007\u00db\u0002\u00dc\u0007\u00dc\u0002\u00dd\u0007"+
		"\u00dd\u0002\u00de\u0007\u00de\u0002\u00df\u0007\u00df\u0002\u00e0\u0007"+
		"\u00e0\u0002\u00e1\u0007\u00e1\u0002\u00e2\u0007\u00e2\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001\u01cc\b\u0001\u0001"+
		"\u0001\u0003\u0001\u01cf\b\u0001\u0004\u0001\u01d1\b\u0001\u000b\u0001"+
		"\f\u0001\u01d2\u0001\u0002\u0003\u0002\u01d6\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002\u01db\b\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u01e2\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u01e8\b\u0003\u0003\u0003\u01ea"+
		"\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0004"+
		"\u0005\u01f1\b\u0005\u000b\u0005\f\u0005\u01f2\u0001\u0005\u0003\u0005"+
		"\u01f6\b\u0005\u0003\u0005\u01f8\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0237"+
		"\b\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0004\b\u023d\b\b\u000b"+
		"\b\f\b\u023e\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0003\f"+
		"\u024f\b\f\u0001\f\u0001\f\u0001\f\u0005\f\u0254\b\f\n\f\f\f\u0257\t\f"+
		"\u0003\f\u0259\b\f\u0001\r\u0001\r\u0001\r\u0003\r\u025e\b\r\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u0262\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u026b\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0270\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0276\b\u000f\n\u000f"+
		"\f\u000f\u0279\t\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u027d\b\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u0284\b\u000f\n\u000f\f\u000f\u0287\t\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0290"+
		"\b\u0010\n\u0010\f\u0010\u0293\t\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u0297\b\u0010\u0001\u0010\u0003\u0010\u029a\b\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u02a8"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u02af\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0005\u0012\u02b6\b\u0012\n\u0012\f\u0012\u02b9\t\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u02c9\b\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u02cd\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016"+
		"\u02d3\b\u0016\n\u0016\f\u0016\u02d6\t\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u02de\b\u0017\n"+
		"\u0017\f\u0017\u02e1\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0005\u0018\u02e8\b\u0018\n\u0018\f\u0018\u02eb\t\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u02f2\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u02f7\b"+
		"\u001a\n\u001a\f\u001a\u02fa\t\u001a\u0001\u001a\u0003\u001a\u02fd\b\u001a"+
		"\u0001\u001a\u0001\u001a\u0003\u001a\u0301\b\u001a\u0001\u001a\u0005\u001a"+
		"\u0304\b\u001a\n\u001a\f\u001a\u0307\t\u001a\u0001\u001a\u0003\u001a\u030a"+
		"\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u030f\b\u001a"+
		"\u0001\u001a\u0001\u001a\u0003\u001a\u0313\b\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u0317\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0321\b\u001c"+
		"\u0001\u001c\u0001\u001c\u0003\u001c\u0325\b\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u032a\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u032f\b\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0333\b"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003"+
		"\u001f\u0340\b\u001f\u0001\u001f\u0001\u001f\u0001 \u0003 \u0345\b \u0001"+
		" \u0001 \u0001 \u0001 \u0003 \u034b\b \u0001 \u0001 \u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0003!\u0354\b!\u0001!\u0001!\u0003!\u0358\b!\u0001!\u0001"+
		"!\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0360\b\"\u0001\"\u0003\"\u0363"+
		"\b\"\u0001\"\u0001\"\u0001\"\u0003\"\u0368\b\"\u0001\"\u0001\"\u0001#"+
		"\u0003#\u036d\b#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u0374\b#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u037d\b#\u0001#\u0003"+
		"#\u0380\b#\u0001$\u0001$\u0001$\u0005$\u0385\b$\n$\f$\u0388\t$\u0001%"+
		"\u0001%\u0001%\u0003%\u038d\b%\u0001%\u0005%\u0390\b%\n%\f%\u0393\t%\u0001"+
		"%\u0005%\u0396\b%\n%\f%\u0399\t%\u0001%\u0001%\u0003%\u039d\b%\u0001%"+
		"\u0001%\u0003%\u03a1\b%\u0001%\u0003%\u03a4\b%\u0001&\u0001&\u0001\'\u0001"+
		"\'\u0001(\u0001(\u0003(\u03ac\b(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0005(\u03b8\b(\n(\f(\u03bb\t(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0005(\u03c2\b(\n(\f(\u03c5\t(\u0001(\u0001(\u0001"+
		"(\u0003(\u03ca\b(\u0001)\u0001)\u0001)\u0003)\u03cf\b)\u0001)\u0001)\u0001"+
		")\u0003)\u03d4\b)\u0001)\u0001)\u0001)\u0003)\u03d9\b)\u0005)\u03db\b"+
		")\n)\f)\u03de\t)\u0001)\u0001)\u0003)\u03e2\b)\u0001)\u0003)\u03e5\b)"+
		"\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0005)\u03ed\b)\n)\f)\u03f0"+
		"\t)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0005)\u03f9\b)\n"+
		")\f)\u03fc\t)\u0001)\u0001)\u0005)\u0400\b)\n)\f)\u0403\t)\u0003)\u0405"+
		"\b)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0003*\u0411\b*\u0001+\u0004+\u0414\b+\u000b+\f+\u0415\u0001,\u0001"+
		",\u0001,\u0003,\u041b\b,\u0001-\u0003-\u041e\b-\u0001-\u0001-\u0001.\u0004"+
		".\u0423\b.\u000b.\f.\u0424\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0003/\u0431\b/\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00010\u00040\u043e\b0\u000b0\f0"+
		"\u043f\u00010\u00010\u00010\u00030\u0445\b0\u00011\u00031\u0448\b1\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00051\u0455\b1\n1\f1\u0458\t1\u00011\u00011\u00011\u00031\u045d\b1"+
		"\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0003"+
		"1\u0468\b1\u00012\u00032\u046b\b2\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00052\u0473\b2\n2\f2\u0476\t2\u00012\u00012\u00012\u00012\u00032\u047c"+
		"\b2\u00013\u00013\u00013\u00013\u00033\u0482\b3\u00014\u00014\u00014\u0001"+
		"4\u00054\u0488\b4\n4\f4\u048b\t4\u00015\u00015\u00015\u00015\u00015\u0001"+
		"5\u00015\u00035\u0494\b5\u00015\u00015\u00015\u00015\u00015\u00015\u0001"+
		"5\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u0001"+
		"5\u00015\u00035\u04a8\b5\u00016\u00016\u00016\u00016\u00036\u04ae\b6\u0001"+
		"7\u00017\u00037\u04b2\b7\u00017\u00017\u00017\u00037\u04b7\b7\u00017\u0001"+
		"7\u00037\u04bb\b7\u00017\u00017\u00017\u00037\u04c0\b7\u00017\u00037\u04c3"+
		"\b7\u00017\u00017\u00017\u00037\u04c8\b7\u00017\u00037\u04cb\b7\u0001"+
		"8\u00018\u00018\u00018\u00018\u00019\u00019\u0001:\u0001:\u0001:\u0003"+
		":\u04d7\b:\u0001:\u0001:\u0001;\u0001;\u0001;\u0003;\u04de\b;\u0001;\u0001"+
		";\u0001;\u0003;\u04e3\b;\u0001;\u0001;\u0001;\u0003;\u04e8\b;\u0005;\u04ea"+
		"\b;\n;\f;\u04ed\t;\u0001;\u0001;\u0003;\u04f1\b;\u0001;\u0003;\u04f4\b"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0005;\u04fc\b;\n;\f;\u04ff"+
		"\t;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0005;\u0508\b;\n"+
		";\f;\u050b\t;\u0001;\u0001;\u0005;\u050f\b;\n;\f;\u0512\t;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0003;\u0519\b;\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0003<\u0528"+
		"\b<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0003"+
		"<\u0547\b<\u0003<\u0549\b<\u0001=\u0001=\u0001=\u0003=\u054e\b=\u0001"+
		"=\u0001=\u0003=\u0552\b=\u0001=\u0001=\u0001>\u0003>\u0557\b>\u0001>\u0001"+
		">\u0001>\u0001>\u0001>\u0003>\u055e\b>\u0001>\u0003>\u0561\b>\u0001?\u0003"+
		"?\u0564\b?\u0001?\u0001?\u0001?\u0003?\u0569\b?\u0001?\u0001?\u0003?\u056d"+
		"\b?\u0003?\u056f\b?\u0001@\u0001@\u0001@\u0001@\u0001@\u0003@\u0576\b"+
		"@\u0001@\u0001@\u0005@\u057a\b@\n@\f@\u057d\t@\u0001A\u0001A\u0001A\u0001"+
		"A\u0003A\u0583\bA\u0001B\u0001B\u0001B\u0001B\u0003B\u0589\bB\u0001B\u0003"+
		"B\u058c\bB\u0001B\u0001B\u0001B\u0003B\u0591\bB\u0001B\u0001B\u0003B\u0595"+
		"\bB\u0001B\u0003B\u0598\bB\u0001B\u0001B\u0001C\u0001C\u0001C\u0003C\u059f"+
		"\bC\u0001D\u0001D\u0001D\u0001D\u0003D\u05a5\bD\u0001D\u0003D\u05a8\b"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0003D\u05b2"+
		"\bD\u0001E\u0001E\u0001E\u0001E\u0001E\u0005E\u05b9\bE\nE\fE\u05bc\tE"+
		"\u0001F\u0001F\u0001F\u0001F\u0003F\u05c2\bF\u0001F\u0001F\u0001F\u0001"+
		"F\u0001F\u0003F\u05c9\bF\u0003F\u05cb\bF\u0001G\u0001G\u0001G\u0001G\u0003"+
		"G\u05d1\bG\u0001G\u0003G\u05d4\bG\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0003G\u05df\bG\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0005H\u05e6\bH\nH\fH\u05e9\tH\u0001I\u0001I\u0001I\u0003I\u05ee\bI"+
		"\u0001J\u0001J\u0001J\u0001J\u0003J\u05f4\bJ\u0001J\u0003J\u05f7\bJ\u0001"+
		"J\u0001J\u0001J\u0003J\u05fc\bJ\u0001J\u0003J\u05ff\bJ\u0001J\u0003J\u0602"+
		"\bJ\u0001J\u0003J\u0605\bJ\u0001J\u0003J\u0608\bJ\u0001J\u0001J\u0001"+
		"J\u0001J\u0003J\u060e\bJ\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0005"+
		"K\u0616\bK\nK\fK\u0619\tK\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0005"+
		"K\u0621\bK\nK\fK\u0624\tK\u0003K\u0626\bK\u0001L\u0001L\u0001L\u0001L"+
		"\u0001L\u0003L\u062d\bL\u0001L\u0001L\u0001L\u0003L\u0632\bL\u0001L\u0005"+
		"L\u0635\bL\nL\fL\u0638\tL\u0001L\u0003L\u063b\bL\u0001L\u0001L\u0001L"+
		"\u0001L\u0001L\u0001L\u0003L\u0643\bL\u0001L\u0001L\u0003L\u0647\bL\u0001"+
		"L\u0005L\u064a\bL\nL\fL\u064d\tL\u0001L\u0003L\u0650\bL\u0003L\u0652\b"+
		"L\u0001M\u0004M\u0655\bM\u000bM\fM\u0656\u0001N\u0001N\u0001N\u0001N\u0001"+
		"N\u0001N\u0003N\u065f\bN\u0001N\u0001N\u0001N\u0003N\u0664\bN\u0001O\u0001"+
		"O\u0001O\u0001O\u0003O\u066a\bO\u0001O\u0001O\u0001O\u0001O\u0001O\u0003"+
		"O\u0671\bO\u0001O\u0001O\u0001O\u0001O\u0001O\u0003O\u0678\bO\u0001O\u0001"+
		"O\u0001O\u0001O\u0001O\u0003O\u067f\bO\u0001O\u0003O\u0682\bO\u0001P\u0001"+
		"P\u0001P\u0001Q\u0001Q\u0003Q\u0689\bQ\u0001Q\u0001Q\u0001Q\u0001Q\u0001"+
		"Q\u0001Q\u0003Q\u0691\bQ\u0001Q\u0001Q\u0001Q\u0001Q\u0005Q\u0697\bQ\n"+
		"Q\fQ\u069a\tQ\u0003Q\u069c\bQ\u0001Q\u0003Q\u069f\bQ\u0001R\u0001R\u0001"+
		"R\u0003R\u06a4\bR\u0001S\u0001S\u0001S\u0001S\u0001S\u0005S\u06ab\bS\n"+
		"S\fS\u06ae\tS\u0001S\u0003S\u06b1\bS\u0001S\u0001S\u0001S\u0001T\u0001"+
		"T\u0001T\u0001T\u0001T\u0003T\u06bb\bT\u0001U\u0001U\u0001U\u0001U\u0001"+
		"U\u0001U\u0001V\u0001V\u0001V\u0001V\u0001V\u0001W\u0001W\u0001W\u0001"+
		"X\u0001X\u0001X\u0003X\u06ce\bX\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0003"+
		"Y\u06d5\bY\u0003Y\u06d7\bY\u0001Y\u0001Y\u0003Y\u06db\bY\u0001Y\u0001"+
		"Y\u0003Y\u06df\bY\u0001Z\u0001Z\u0001Z\u0001Z\u0005Z\u06e5\bZ\nZ\fZ\u06e8"+
		"\tZ\u0001Z\u0001Z\u0001[\u0001[\u0001[\u0001[\u0005[\u06f0\b[\n[\f[\u06f3"+
		"\t[\u0001\\\u0001\\\u0001\\\u0001\\\u0005\\\u06f9\b\\\n\\\f\\\u06fc\t"+
		"\\\u0001\\\u0001\\\u0001]\u0001]\u0001]\u0003]\u0703\b]\u0001]\u0001]"+
		"\u0001]\u0001]\u0001^\u0001^\u0003^\u070b\b^\u0001^\u0001^\u0003^\u070f"+
		"\b^\u0001_\u0001_\u0001_\u0001_\u0001`\u0001`\u0003`\u0717\b`\u0001a\u0001"+
		"a\u0001a\u0001a\u0001a\u0001a\u0001b\u0001b\u0001b\u0001b\u0001c\u0001"+
		"c\u0001c\u0001c\u0005c\u0727\bc\nc\fc\u072a\tc\u0001c\u0001c\u0001c\u0001"+
		"c\u0001d\u0001d\u0001d\u0001d\u0001d\u0001e\u0001e\u0003e\u0737\be\u0001"+
		"f\u0001f\u0001f\u0001f\u0001f\u0003f\u073e\bf\u0001f\u0001f\u0003f\u0742"+
		"\bf\u0001g\u0001g\u0001g\u0001g\u0001g\u0003g\u0749\bg\u0003g\u074b\b"+
		"g\u0001h\u0001h\u0003h\u074f\bh\u0001h\u0001h\u0001h\u0001h\u0001h\u0005"+
		"h\u0756\bh\nh\fh\u0759\th\u0001i\u0001i\u0001i\u0001i\u0001i\u0003i\u0760"+
		"\bi\u0001j\u0001j\u0001j\u0001j\u0001j\u0005j\u0767\bj\nj\fj\u076a\tj"+
		"\u0001j\u0001j\u0001k\u0001k\u0001k\u0001l\u0001l\u0001l\u0001l\u0001"+
		"l\u0001l\u0001m\u0001m\u0003m\u0779\bm\u0001m\u0001m\u0001m\u0001m\u0003"+
		"m\u077f\bm\u0001m\u0001m\u0003m\u0783\bm\u0001n\u0001n\u0001n\u0001n\u0001"+
		"n\u0001n\u0005n\u078b\bn\nn\fn\u078e\tn\u0001n\u0001n\u0001n\u0005n\u0793"+
		"\bn\nn\fn\u0796\tn\u0001o\u0001o\u0001o\u0001o\u0001o\u0001o\u0003o\u079e"+
		"\bo\u0001o\u0001o\u0003o\u07a2\bo\u0001o\u0001o\u0005o\u07a6\bo\no\fo"+
		"\u07a9\to\u0001p\u0001p\u0003p\u07ad\bp\u0001q\u0001q\u0003q\u07b1\bq"+
		"\u0001r\u0001r\u0001r\u0001r\u0001r\u0001r\u0001r\u0001r\u0003r\u07bb"+
		"\br\u0001s\u0001s\u0001t\u0001t\u0003t\u07c1\bt\u0001u\u0001u\u0003u\u07c5"+
		"\bu\u0001u\u0001u\u0001u\u0001u\u0001u\u0001u\u0001u\u0001u\u0005u\u07cf"+
		"\bu\nu\fu\u07d2\tu\u0001u\u0001u\u0001v\u0001v\u0003v\u07d8\bv\u0001w"+
		"\u0001w\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001"+
		"x\u0001x\u0005x\u07e6\bx\nx\fx\u07e9\tx\u0001x\u0001x\u0005x\u07ed\bx"+
		"\nx\fx\u07f0\tx\u0001y\u0001y\u0001y\u0001y\u0001y\u0001y\u0001y\u0003"+
		"y\u07f9\by\u0001z\u0003z\u07fc\bz\u0001z\u0001z\u0003z\u0800\bz\u0001"+
		"{\u0001{\u0001|\u0001|\u0001|\u0003|\u0807\b|\u0001|\u0001|\u0001|\u0001"+
		"|\u0001|\u0003|\u080e\b|\u0003|\u0810\b|\u0001}\u0001}\u0003}\u0814\b"+
		"}\u0001~\u0001~\u0003~\u0818\b~\u0001\u007f\u0001\u007f\u0001\u007f\u0003"+
		"\u007f\u081d\b\u007f\u0001\u0080\u0003\u0080\u0820\b\u0080\u0001\u0080"+
		"\u0001\u0080\u0003\u0080\u0824\b\u0080\u0001\u0080\u0003\u0080\u0827\b"+
		"\u0080\u0001\u0080\u0001\u0080\u0001\u0081\u0001\u0081\u0001\u0081\u0001"+
		"\u0082\u0001\u0082\u0001\u0082\u0001\u0082\u0003\u0082\u0832\b\u0082\u0001"+
		"\u0082\u0003\u0082\u0835\b\u0082\u0001\u0082\u0001\u0082\u0001\u0082\u0001"+
		"\u0083\u0001\u0083\u0001\u0083\u0001\u0084\u0001\u0084\u0001\u0084\u0003"+
		"\u0084\u0840\b\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0003"+
		"\u0084\u0846\b\u0084\u0001\u0084\u0001\u0084\u0003\u0084\u084a\b\u0084"+
		"\u0003\u0084\u084c\b\u0084\u0001\u0085\u0001\u0085\u0003\u0085\u0850\b"+
		"\u0085\u0001\u0085\u0001\u0085\u0001\u0086\u0001\u0086\u0001\u0086\u0001"+
		"\u0087\u0001\u0087\u0003\u0087\u0859\b\u0087\u0001\u0087\u0001\u0087\u0001"+
		"\u0087\u0005\u0087\u085e\b\u0087\n\u0087\f\u0087\u0861\t\u0087\u0001\u0087"+
		"\u0003\u0087\u0864\b\u0087\u0001\u0087\u0001\u0087\u0003\u0087\u0868\b"+
		"\u0087\u0001\u0087\u0001\u0087\u0001\u0087\u0005\u0087\u086d\b\u0087\n"+
		"\u0087\f\u0087\u0870\t\u0087\u0001\u0087\u0003\u0087\u0873\b\u0087\u0001"+
		"\u0088\u0001\u0088\u0001\u0088\u0001\u0088\u0001\u0088\u0001\u0088\u0003"+
		"\u0088\u087b\b\u0088\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0003"+
		"\u0089\u0881\b\u0089\u0001\u0089\u0001\u0089\u0003\u0089\u0885\b\u0089"+
		"\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u008a"+
		"\u0001\u008a\u0001\u008a\u0001\u008a\u0003\u008a\u0890\b\u008a\u0001\u008a"+
		"\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0003\u008a\u0897\b\u008a"+
		"\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008b"+
		"\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0003\u008b"+
		"\u08a4\b\u008b\u0001\u008c\u0001\u008c\u0001\u008c\u0001\u008c\u0005\u008c"+
		"\u08aa\b\u008c\n\u008c\f\u008c\u08ad\t\u008c\u0001\u008d\u0003\u008d\u08b0"+
		"\b\u008d\u0001\u008d\u0001\u008d\u0001\u008e\u0001\u008e\u0001\u008e\u0001"+
		"\u008e\u0005\u008e\u08b8\b\u008e\n\u008e\f\u008e\u08bb\t\u008e\u0001\u008f"+
		"\u0001\u008f\u0003\u008f\u08bf\b\u008f\u0001\u008f\u0001\u008f\u0001\u008f"+
		"\u0001\u008f\u0001\u008f\u0001\u0090\u0001\u0090\u0001\u0090\u0001\u0090"+
		"\u0005\u0090\u08ca\b\u0090\n\u0090\f\u0090\u08cd\t\u0090\u0001\u0090\u0001"+
		"\u0090\u0001\u0091\u0001\u0091\u0001\u0091\u0001\u0091\u0005\u0091\u08d5"+
		"\b\u0091\n\u0091\f\u0091\u08d8\t\u0091\u0001\u0092\u0001\u0092\u0001\u0092"+
		"\u0001\u0092\u0001\u0092\u0003\u0092\u08df\b\u0092\u0001\u0093\u0001\u0093"+
		"\u0003\u0093\u08e3\b\u0093\u0001\u0093\u0001\u0093\u0003\u0093\u08e7\b"+
		"\u0093\u0001\u0093\u0001\u0093\u0003\u0093\u08eb\b\u0093\u0003\u0093\u08ed"+
		"\b\u0093\u0001\u0094\u0001\u0094\u0001\u0094\u0003\u0094\u08f2\b\u0094"+
		"\u0001\u0094\u0003\u0094\u08f5\b\u0094\u0001\u0094\u0003\u0094\u08f8\b"+
		"\u0094\u0001\u0094\u0003\u0094\u08fb\b\u0094\u0001\u0094\u0001\u0094\u0003"+
		"\u0094\u08ff\b\u0094\u0001\u0094\u0003\u0094\u0902\b\u0094\u0001\u0094"+
		"\u0003\u0094\u0905\b\u0094\u0001\u0095\u0003\u0095\u0908\b\u0095\u0001"+
		"\u0095\u0003\u0095\u090b\b\u0095\u0001\u0095\u0001\u0095\u0001\u0095\u0005"+
		"\u0095\u0910\b\u0095\n\u0095\f\u0095\u0913\t\u0095\u0001\u0096\u0001\u0096"+
		"\u0001\u0097\u0001\u0097\u0001\u0097\u0001\u0098\u0001\u0098\u0001\u0098"+
		"\u0003\u0098\u091d\b\u0098\u0001\u0098\u0001\u0098\u0003\u0098\u0921\b"+
		"\u0098\u0001\u0098\u0003\u0098\u0924\b\u0098\u0001\u0099\u0001\u0099\u0003"+
		"\u0099\u0928\b\u0099\u0001\u0099\u0001\u0099\u0001\u0099\u0001\u0099\u0001"+
		"\u0099\u0003\u0099\u092f\b\u0099\u0001\u009a\u0001\u009a\u0003\u009a\u0933"+
		"\b\u009a\u0001\u009a\u0001\u009a\u0001\u009b\u0001\u009b\u0001\u009b\u0001"+
		"\u009b\u0005\u009b\u093b\b\u009b\n\u009b\f\u009b\u093e\t\u009b\u0001\u009c"+
		"\u0001\u009c\u0001\u009c\u0005\u009c\u0943\b\u009c\n\u009c\f\u009c\u0946"+
		"\t\u009c\u0001\u009d\u0001\u009d\u0001\u009d\u0003\u009d\u094b\b\u009d"+
		"\u0001\u009e\u0001\u009e\u0003\u009e\u094f\b\u009e\u0001\u009f\u0001\u009f"+
		"\u0001\u009f\u0001\u009f\u0003\u009f\u0955\b\u009f\u0001\u00a0\u0001\u00a0"+
		"\u0001\u00a0\u0001\u00a0\u0001\u00a0\u0001\u00a0\u0001\u00a0\u0003\u00a0"+
		"\u095e\b\u00a0\u0001\u00a1\u0003\u00a1\u0961\b\u00a1\u0001\u00a1\u0001"+
		"\u00a1\u0001\u00a1\u0003\u00a1\u0966\b\u00a1\u0001\u00a1\u0003\u00a1\u0969"+
		"\b\u00a1\u0001\u00a2\u0001\u00a2\u0001\u00a2\u0001\u00a2\u0001\u00a2\u0001"+
		"\u00a2\u0005\u00a2\u0971\b\u00a2\n\u00a2\f\u00a2\u0974\t\u00a2\u0001\u00a2"+
		"\u0001\u00a2\u0003\u00a2\u0978\b\u00a2\u0001\u00a3\u0001\u00a3\u0001\u00a3"+
		"\u0001\u00a3\u0001\u00a3\u0005\u00a3\u097f\b\u00a3\n\u00a3\f\u00a3\u0982"+
		"\t\u00a3\u0001\u00a3\u0001\u00a3\u0003\u00a3\u0986\b\u00a3\u0001\u00a4"+
		"\u0001\u00a4\u0003\u00a4\u098a\b\u00a4\u0001\u00a4\u0001\u00a4\u0001\u00a4"+
		"\u0001\u00a4\u0001\u00a4\u0005\u00a4\u0991\b\u00a4\n\u00a4\f\u00a4\u0994"+
		"\t\u00a4\u0001\u00a4\u0003\u00a4\u0997\b\u00a4\u0001\u00a5\u0001\u00a5"+
		"\u0001\u00a6\u0001\u00a6\u0001\u00a6\u0001\u00a7\u0001\u00a7\u0001\u00a7"+
		"\u0001\u00a7\u0001\u00a7\u0005\u00a7\u09a3\b\u00a7\n\u00a7\f\u00a7\u09a6"+
		"\t\u00a7\u0001\u00a8\u0001\u00a8\u0001\u00a8\u0001\u00a9\u0001\u00a9\u0001"+
		"\u00a9\u0001\u00aa\u0001\u00aa\u0001\u00aa\u0001\u00aa\u0003\u00aa\u09b2"+
		"\b\u00aa\u0001\u00aa\u0001\u00aa\u0001\u00aa\u0003\u00aa\u09b7\b\u00aa"+
		"\u0005\u00aa\u09b9\b\u00aa\n\u00aa\f\u00aa\u09bc\t\u00aa\u0001\u00ab\u0004"+
		"\u00ab\u09bf\b\u00ab\u000b\u00ab\f\u00ab\u09c0\u0001\u00ac\u0001\u00ac"+
		"\u0001\u00ac\u0001\u00ac\u0001\u00ac\u0001\u00ac\u0001\u00ac\u0001\u00ac"+
		"\u0001\u00ac\u0003\u00ac\u09cc\b\u00ac\u0003\u00ac\u09ce\b\u00ac\u0001"+
		"\u00ad\u0001\u00ad\u0001\u00ad\u0001\u00ad\u0001\u00ad\u0003\u00ad\u09d5"+
		"\b\u00ad\u0001\u00ad\u0003\u00ad\u09d8\b\u00ad\u0001\u00ae\u0001\u00ae"+
		"\u0001\u00ae\u0005\u00ae\u09dd\b\u00ae\n\u00ae\f\u00ae\u09e0\t\u00ae\u0001"+
		"\u00af\u0001\u00af\u0003\u00af\u09e4\b\u00af\u0001\u00af\u0001\u00af\u0001"+
		"\u00af\u0001\u00af\u0003\u00af\u09ea\b\u00af\u0001\u00af\u0003\u00af\u09ed"+
		"\b\u00af\u0001\u00af\u0003\u00af\u09f0\b\u00af\u0001\u00b0\u0001\u00b0"+
		"\u0001\u00b0\u0001\u00b1\u0001\u00b1\u0001\u00b1\u0001\u00b1\u0001\u00b1"+
		"\u0001\u00b1\u0001\u00b1\u0001\u00b1\u0004\u00b1\u09fd\b\u00b1\u000b\u00b1"+
		"\f\u00b1\u09fe\u0001\u00b2\u0001\u00b2\u0001\u00b2\u0001\u00b2\u0001\u00b2"+
		"\u0003\u00b2\u0a06\b\u00b2\u0001\u00b2\u0003\u00b2\u0a09\b\u00b2\u0001"+
		"\u00b2\u0003\u00b2\u0a0c\b\u00b2\u0001\u00b3\u0001\u00b3\u0003\u00b3\u0a10"+
		"\b\u00b3\u0001\u00b3\u0001\u00b3\u0001\u00b3\u0003\u00b3\u0a15\b\u00b3"+
		"\u0001\u00b3\u0001\u00b3\u0001\u00b3\u0001\u00b3\u0003\u00b3\u0a1b\b\u00b3"+
		"\u0001\u00b4\u0001\u00b4\u0003\u00b4\u0a1f\b\u00b4\u0001\u00b4\u0001\u00b4"+
		"\u0001\u00b4\u0001\u00b4\u0001\u00b4\u0001\u00b4\u0001\u00b4\u0005\u00b4"+
		"\u0a28\b\u00b4\n\u00b4\f\u00b4\u0a2b\t\u00b4\u0001\u00b4\u0003\u00b4\u0a2e"+
		"\b\u00b4\u0001\u00b4\u0003\u00b4\u0a31\b\u00b4\u0001\u00b5\u0001\u00b5"+
		"\u0003\u00b5\u0a35\b\u00b5\u0001\u00b5\u0001\u00b5\u0003\u00b5\u0a39\b"+
		"\u00b5\u0001\u00b5\u0001\u00b5\u0003\u00b5\u0a3d\b\u00b5\u0001\u00b6\u0001"+
		"\u00b6\u0003\u00b6\u0a41\b\u00b6\u0001\u00b6\u0001\u00b6\u0001\u00b7\u0001"+
		"\u00b7\u0003\u00b7\u0a47\b\u00b7\u0001\u00b7\u0001\u00b7\u0001\u00b8\u0001"+
		"\u00b8\u0003\u00b8\u0a4d\b\u00b8\u0001\u00b8\u0001\u00b8\u0001\u00b8\u0001"+
		"\u00b8\u0001\u00b8\u0003\u00b8\u0a54\b\u00b8\u0001\u00b8\u0001\u00b8\u0001"+
		"\u00b8\u0001\u00b8\u0005\u00b8\u0a5a\b\u00b8\n\u00b8\f\u00b8\u0a5d\t\u00b8"+
		"\u0001\u00b9\u0001\u00b9\u0001\u00b9\u0003\u00b9\u0a62\b\u00b9\u0001\u00ba"+
		"\u0001\u00ba\u0001\u00ba\u0003\u00ba\u0a67\b\u00ba\u0001\u00ba\u0001\u00ba"+
		"\u0001\u00ba\u0001\u00ba\u0001\u00ba\u0001\u00ba\u0001\u00ba\u0001\u00ba"+
		"\u0001\u00ba\u0003\u00ba\u0a72\b\u00ba\u0001\u00ba\u0001\u00ba\u0001\u00ba"+
		"\u0001\u00ba\u0001\u00ba\u0001\u00ba\u0001\u00ba\u0003\u00ba\u0a7b\b\u00ba"+
		"\u0001\u00bb\u0001\u00bb\u0003\u00bb\u0a7f\b\u00bb\u0001\u00bb\u0001\u00bb"+
		"\u0001\u00bb\u0001\u00bb\u0001\u00bb\u0005\u00bb\u0a86\b\u00bb\n\u00bb"+
		"\f\u00bb\u0a89\t\u00bb\u0001\u00bb\u0003\u00bb\u0a8c\b\u00bb\u0001\u00bb"+
		"\u0001\u00bb\u0001\u00bc\u0001\u00bc\u0001\u00bc\u0001\u00bc\u0005\u00bc"+
		"\u0a94\b\u00bc\n\u00bc\f\u00bc\u0a97\t\u00bc\u0001\u00bc\u0001\u00bc\u0003"+
		"\u00bc\u0a9b\b\u00bc\u0001\u00bc\u0001\u00bc\u0001\u00bc\u0001\u00bc\u0001"+
		"\u00bc\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00be\u0001"+
		"\u00be\u0001\u00bf\u0001\u00bf\u0001\u00bf\u0001\u00bf\u0001\u00bf\u0001"+
		"\u00bf\u0001\u00bf\u0001\u00bf\u0001\u00bf\u0003\u00bf\u0ab1\b\u00bf\u0001"+
		"\u00bf\u0003\u00bf\u0ab4\b\u00bf\u0001\u00c0\u0001\u00c0\u0001\u00c0\u0001"+
		"\u00c0\u0001\u00c0\u0001\u00c0\u0001\u00c0\u0001\u00c0\u0001\u00c0\u0001"+
		"\u00c0\u0001\u00c0\u0001\u00c0\u0001\u00c0\u0001\u00c0\u0001\u00c0\u0001"+
		"\u00c0\u0001\u00c0\u0003\u00c0\u0ac7\b\u00c0\u0001\u00c0\u0001\u00c0\u0001"+
		"\u00c0\u0001\u00c0\u0001\u00c0\u0001\u00c0\u0001\u00c0\u0001\u00c0\u0001"+
		"\u00c0\u0001\u00c0\u0001\u00c0\u0001\u00c0\u0001\u00c0\u0001\u00c0\u0005"+
		"\u00c0\u0ad7\b\u00c0\n\u00c0\f\u00c0\u0ada\t\u00c0\u0001\u00c1\u0001\u00c1"+
		"\u0001\u00c1\u0001\u00c1\u0001\u00c1\u0001\u00c1\u0001\u00c1\u0001\u00c1"+
		"\u0003\u00c1\u0ae4\b\u00c1\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2"+
		"\u0001\u00c3\u0001\u00c3\u0001\u00c4\u0001\u00c4\u0001\u00c4\u0001\u00c4"+
		"\u0001\u00c4\u0005\u00c4\u0af1\b\u00c4\n\u00c4\f\u00c4\u0af4\t\u00c4\u0001"+
		"\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0001"+
		"\u00c5\u0001\u00c5\u0001\u00c5\u0003\u00c5\u0aff\b\u00c5\u0001\u00c6\u0001"+
		"\u00c6\u0003\u00c6\u0b03\b\u00c6\u0001\u00c7\u0001\u00c7\u0001\u00c7\u0001"+
		"\u00c7\u0001\u00c7\u0001\u00c7\u0001\u00c7\u0004\u00c7\u0b0c\b\u00c7\u000b"+
		"\u00c7\f\u00c7\u0b0d\u0001\u00c7\u0001\u00c7\u0003\u00c7\u0b12\b\u00c7"+
		"\u0001\u00c7\u0001\u00c7\u0001\u00c8\u0001\u00c8\u0001\u00c8\u0001\u00c8"+
		"\u0001\u00c8\u0001\u00c8\u0004\u00c8\u0b1c\b\u00c8\u000b\u00c8\f\u00c8"+
		"\u0b1d\u0001\u00c8\u0001\u00c8\u0003\u00c8\u0b22\b\u00c8\u0001\u00c8\u0001"+
		"\u00c8\u0001\u00c9\u0001\u00c9\u0001\u00c9\u0001\u00c9\u0001\u00ca\u0001"+
		"\u00ca\u0001\u00ca\u0003\u00ca\u0b2d\b\u00ca\u0001\u00ca\u0001\u00ca\u0001"+
		"\u00ca\u0003\u00ca\u0b32\b\u00ca\u0001\u00ca\u0001\u00ca\u0001\u00ca\u0003"+
		"\u00ca\u0b37\b\u00ca\u0001\u00ca\u0001\u00ca\u0003\u00ca\u0b3b\b\u00ca"+
		"\u0001\u00ca\u0001\u00ca\u0003\u00ca\u0b3f\b\u00ca\u0001\u00ca\u0001\u00ca"+
		"\u0001\u00ca\u0003\u00ca\u0b44\b\u00ca\u0001\u00ca\u0001\u00ca\u0003\u00ca"+
		"\u0b48\b\u00ca\u0001\u00ca\u0001\u00ca\u0003\u00ca\u0b4c\b\u00ca\u0001"+
		"\u00ca\u0001\u00ca\u0001\u00ca\u0001\u00ca\u0001\u00ca\u0001\u00ca\u0001"+
		"\u00ca\u0001\u00ca\u0001\u00ca\u0001\u00ca\u0001\u00ca\u0001\u00ca\u0001"+
		"\u00ca\u0001\u00ca\u0001\u00ca\u0001\u00ca\u0001\u00ca\u0001\u00ca\u0001"+
		"\u00ca\u0001\u00ca\u0001\u00ca\u0003\u00ca\u0b63\b\u00ca\u0003\u00ca\u0b65"+
		"\b\u00ca\u0001\u00ca\u0001\u00ca\u0001\u00ca\u0001\u00ca\u0001\u00ca\u0001"+
		"\u00ca\u0001\u00ca\u0001\u00ca\u0001\u00ca\u0001\u00ca\u0001\u00ca\u0001"+
		"\u00ca\u0001\u00ca\u0001\u00ca\u0001\u00ca\u0001\u00ca\u0003\u00ca\u0b77"+
		"\b\u00ca\u0003\u00ca\u0b79\b\u00ca\u0001\u00ca\u0001\u00ca\u0001\u00ca"+
		"\u0001\u00ca\u0001\u00ca\u0001\u00ca\u0003\u00ca\u0b81\b\u00ca\u0001\u00ca"+
		"\u0001\u00ca\u0001\u00ca\u0003\u00ca\u0b86\b\u00ca\u0001\u00ca\u0001\u00ca"+
		"\u0001\u00ca\u0003\u00ca\u0b8b\b\u00ca\u0001\u00ca\u0001\u00ca\u0001\u00ca"+
		"\u0003\u00ca\u0b90\b\u00ca\u0001\u00ca\u0001\u00ca\u0001\u00ca\u0001\u00ca"+
		"\u0001\u00ca\u0001\u00ca\u0001\u00ca\u0001\u00ca\u0001\u00ca\u0001\u00ca"+
		"\u0001\u00ca\u0003\u00ca\u0b9d\b\u00ca\u0001\u00ca\u0001\u00ca\u0001\u00ca"+
		"\u0003\u00ca\u0ba2\b\u00ca\u0001\u00ca\u0001\u00ca\u0001\u00ca\u0003\u00ca"+
		"\u0ba7\b\u00ca\u0001\u00ca\u0001\u00ca\u0001\u00ca\u0003\u00ca\u0bac\b"+
		"\u00ca\u0001\u00ca\u0001\u00ca\u0001\u00ca\u0003\u00ca\u0bb1\b\u00ca\u0001"+
		"\u00ca\u0001\u00ca\u0001\u00ca\u0003\u00ca\u0bb6\b\u00ca\u0001\u00ca\u0001"+
		"\u00ca\u0001\u00ca\u0003\u00ca\u0bbb\b\u00ca\u0001\u00ca\u0001\u00ca\u0001"+
		"\u00ca\u0003\u00ca\u0bc0\b\u00ca\u0003\u00ca\u0bc2\b\u00ca\u0001\u00cb"+
		"\u0001\u00cb\u0001\u00cc\u0001\u00cc\u0001\u00cc\u0003\u00cc\u0bc9\b\u00cc"+
		"\u0001\u00cc\u0003\u00cc\u0bcc\b\u00cc\u0001\u00cc\u0001\u00cc\u0001\u00cd"+
		"\u0001\u00cd\u0001\u00cd\u0001\u00cd\u0001\u00cd\u0005\u00cd\u0bd5\b\u00cd"+
		"\n\u00cd\f\u00cd\u0bd8\t\u00cd\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001"+
		"\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0003\u00ce\u0be1\b\u00ce\u0001"+
		"\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0003"+
		"\u00ce\u0be9\b\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001"+
		"\u00ce\u0001\u00ce\u0001\u00ce\u0003\u00ce\u0bf2\b\u00ce\u0001\u00ce\u0001"+
		"\u00ce\u0001\u00ce\u0001\u00ce\u0003\u00ce\u0bf8\b\u00ce\u0001\u00ce\u0001"+
		"\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001"+
		"\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0005"+
		"\u00ce\u0c07\b\u00ce\n\u00ce\f\u00ce\u0c0a\t\u00ce\u0003\u00ce\u0c0c\b"+
		"\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001"+
		"\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001"+
		"\u00ce\u0005\u00ce\u0c1a\b\u00ce\n\u00ce\f\u00ce\u0c1d\t\u00ce\u0003\u00ce"+
		"\u0c1f\b\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce"+
		"\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce"+
		"\u0001\u00ce\u0005\u00ce\u0c2d\b\u00ce\n\u00ce\f\u00ce\u0c30\t\u00ce\u0003"+
		"\u00ce\u0c32\b\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001"+
		"\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001"+
		"\u00ce\u0001\u00ce\u0005\u00ce\u0c40\b\u00ce\n\u00ce\f\u00ce\u0c43\t\u00ce"+
		"\u0003\u00ce\u0c45\b\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce"+
		"\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce"+
		"\u0001\u00ce\u0001\u00ce\u0005\u00ce\u0c53\b\u00ce\n\u00ce\f\u00ce\u0c56"+
		"\t\u00ce\u0003\u00ce\u0c58\b\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce"+
		"\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce"+
		"\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0005\u00ce\u0c66\b\u00ce\n\u00ce"+
		"\f\u00ce\u0c69\t\u00ce\u0003\u00ce\u0c6b\b\u00ce\u0001\u00ce\u0001\u00ce"+
		"\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce"+
		"\u0001\u00ce\u0001\u00ce\u0005\u00ce\u0c77\b\u00ce\n\u00ce\f\u00ce\u0c7a"+
		"\t\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001"+
		"\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0004\u00ce\u0c86"+
		"\b\u00ce\u000b\u00ce\f\u00ce\u0c87\u0001\u00ce\u0001\u00ce\u0003\u00ce"+
		"\u0c8c\b\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce"+
		"\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce"+
		"\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0003\u00ce\u0c9c\b\u00ce\u0001\u00ce"+
		"\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0003\u00ce\u0ca2\b\u00ce\u0001\u00cf"+
		"\u0001\u00cf\u0001\u00cf\u0003\u00cf\u0ca7\b\u00cf\u0001\u00cf\u0001\u00cf"+
		"\u0001\u00d0\u0001\u00d0\u0001\u00d0\u0005\u00d0\u0cae\b\u00d0\n\u00d0"+
		"\f\u00d0\u0cb1\t\u00d0\u0001\u00d1\u0001\u00d1\u0001\u00d1\u0001\u00d1"+
		"\u0003\u00d1\u0cb7\b\u00d1\u0003\u00d1\u0cb9\b\u00d1\u0001\u00d1\u0001"+
		"\u00d1\u0001\u00d2\u0001\u00d2\u0003\u00d2\u0cbf\b\u00d2\u0001\u00d3\u0001"+
		"\u00d3\u0003\u00d3\u0cc3\b\u00d3\u0001\u00d4\u0001\u00d4\u0005\u00d4\u0cc7"+
		"\b\u00d4\n\u00d4\f\u00d4\u0cca\t\u00d4\u0001\u00d5\u0001\u00d5\u0001\u00d5"+
		"\u0001\u00d5\u0001\u00d5\u0001\u00d5\u0001\u00d5\u0001\u00d5\u0001\u00d5"+
		"\u0001\u00d5\u0001\u00d5\u0001\u00d5\u0003\u00d5\u0cd8\b\u00d5\u0001\u00d6"+
		"\u0001\u00d6\u0001\u00d6\u0001\u00d6\u0001\u00d6\u0003\u00d6\u0cdf\b\u00d6"+
		"\u0001\u00d7\u0005\u00d7\u0ce2\b\u00d7\n\u00d7\f\u00d7\u0ce5\t\u00d7\u0001"+
		"\u00d8\u0001\u00d8\u0001\u00d8\u0001\u00d9\u0001\u00d9\u0001\u00d9\u0001"+
		"\u00d9\u0003\u00d9\u0cee\b\u00d9\u0001\u00d9\u0001\u00d9\u0001\u00d9\u0005"+
		"\u00d9\u0cf3\b\u00d9\n\u00d9\f\u00d9\u0cf6\t\u00d9\u0003\u00d9\u0cf8\b"+
		"\u00d9\u0001\u00da\u0001\u00da\u0001\u00da\u0001\u00db\u0001\u00db\u0001"+
		"\u00db\u0001\u00dc\u0003\u00dc\u0d01\b\u00dc\u0001\u00dc\u0001\u00dc\u0003"+
		"\u00dc\u0d05\b\u00dc\u0001\u00dc\u0001\u00dc\u0001\u00dc\u0003\u00dc\u0d0a"+
		"\b\u00dc\u0005\u00dc\u0d0c\b\u00dc\n\u00dc\f\u00dc\u0d0f\t\u00dc\u0001"+
		"\u00dd\u0001\u00dd\u0003\u00dd\u0d13\b\u00dd\u0001\u00de\u0003\u00de\u0d16"+
		"\b\u00de\u0001\u00de\u0001\u00de\u0001\u00df\u0003\u00df\u0d1b\b\u00df"+
		"\u0001\u00df\u0001\u00df\u0001\u00e0\u0001\u00e0\u0001\u00e1\u0001\u00e1"+
		"\u0001\u00e2\u0001\u00e2\u0001\u00e2\u0001\u0ce3\u0002\u0170\u0180\u00e3"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2"+
		"\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa"+
		"\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112"+
		"\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a"+
		"\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142"+
		"\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a"+
		"\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172"+
		"\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a"+
		"\u018c\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2"+
		"\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba"+
		"\u01bc\u01be\u01c0\u01c2\u01c4\u00002\u0003\u0000\u0001\u0002\u015c\u015c"+
		"\u016d\u016d\u0002\u0000bb\u0137\u0137\u0001\u0000\u00a8\u00a9\u0003\u0000"+
		"\u000e\u000ess\u0099\u0099\u0002\u0000!!))\u0002\u000077kk\u0002\u0000"+
		"\u00b8\u00b8\u0100\u0100\u0002\u0000\u000f\u000fSS\u0002\u0000PP\u012c"+
		"\u012c\u0002\u0000ll\u00ab\u00ab\u0002\u0000PP\u00d8\u00d8\u0002\u0000"+
		"LL\u0088\u0088\u0003\u0000\u008c\u008c\u00b2\u00b2\u00d4\u00d5\u0002\u0000"+
		"\u00ad\u00ad\u00bf\u00bf\u0002\u0000\u00bc\u00bc\u013f\u013f\u0002\u0000"+
		"\u00f3\u00f3\u0129\u0129\u0002\u0000\u00b1\u00b1\u0172\u0172\u0002\u0000"+
		"\u001f\u001f&&\u0002\u0000$$>>\u0002\u0000BB\u00f9\u00f9\u0002\u0000\u000e"+
		"\u000e\u0099\u0099\u0001\u0000\u00ea\u00eb\u0001\u0000\u00db\u00dc\u0004"+
		"\u0000==NN\u0098\u0098\u00d1\u00d1\u0002\u0000yy\u00dc\u00dc\u0001\u0000"+
		"fg\u0001\u0000_`\u0001\u0000\u0110\u0111\u0002\u0000\u00f4\u00f4\u0118"+
		"\u0118\u0003\u0000PP\u0087\u0087\u00d0\u00d0\u0004\u0000\f\r\u00bd\u00bd"+
		"\u00e0\u00e0\u013d\u013d\u0001\u0000\u00c7\u00c8\u0002\u0000\u0101\u0101"+
		"\u0126\u0126\u0004\u0000\u0015\u0015ZZ\u00ae\u00ae\u0120\u0120\u0002\u0000"+
		"\u00ae\u00ae\u0139\u0139\u0002\u0000\u001e\u001e\u0112\u0112\u0001\u0000"+
		"\u00fe\u00ff\u0002\u0000\b\bXX\u0003\u0000xx\u00a2\u00a2\u00ed\u00ed\u0003"+
		"\u0000>>\u00f5\u00f6\u012d\u012d\u0003\u0000ii\u0104\u0104\u012c\u012c"+
		"\u0001\u0000ST\u0002\u0000\u000b\u000b\u00cb\u00cb\u0003\u0000\u00a3\u00a3"+
		"\u00e4\u00e4\u00ee\u00ee\u0003\u0000FG\u00b5\u00b6\u00fa\u00fb\u0002\u0000"+
		"44\u015b\u015b\u0003\u0000vv\u009a\u009a\u00c2\u00c2\u0002\u0000\u0158"+
		"\u0158\u016e\u016e\u0002\u0000mm\u0127\u0127\f\u0000\u0006\u0019\u001b"+
		"]aac\u00c2\u00c4\u00d5\u00d7\u00f2\u00f4\u0107\u0109\u0121\u0123\u0128"+
		"\u012b\u0136\u0139\u0149\u0150\u0157\u0ed4\u0000\u01c6\u0001\u0000\u0000"+
		"\u0000\u0002\u01d0\u0001\u0000\u0000\u0000\u0004\u01d5\u0001\u0000\u0000"+
		"\u0000\u0006\u01e9\u0001\u0000\u0000\u0000\b\u01eb\u0001\u0000\u0000\u0000"+
		"\n\u01f7\u0001\u0000\u0000\u0000\f\u0236\u0001\u0000\u0000\u0000\u000e"+
		"\u0238\u0001\u0000\u0000\u0000\u0010\u023a\u0001\u0000\u0000\u0000\u0012"+
		"\u0240\u0001\u0000\u0000\u0000\u0014\u0246\u0001\u0000\u0000\u0000\u0016"+
		"\u0248\u0001\u0000\u0000\u0000\u0018\u0258\u0001\u0000\u0000\u0000\u001a"+
		"\u025d\u0001\u0000\u0000\u0000\u001c\u026f\u0001\u0000\u0000\u0000\u001e"+
		"\u0271\u0001\u0000\u0000\u0000 \u0296\u0001\u0000\u0000\u0000\"\u02a0"+
		"\u0001\u0000\u0000\u0000$\u02ab\u0001\u0000\u0000\u0000&\u02bf\u0001\u0000"+
		"\u0000\u0000(\u02c2\u0001\u0000\u0000\u0000*\u02c4\u0001\u0000\u0000\u0000"+
		",\u02ce\u0001\u0000\u0000\u0000.\u02d7\u0001\u0000\u0000\u00000\u02e2"+
		"\u0001\u0000\u0000\u00002\u02f1\u0001\u0000\u0000\u00004\u0316\u0001\u0000"+
		"\u0000\u00006\u0318\u0001\u0000\u0000\u00008\u0320\u0001\u0000\u0000\u0000"+
		":\u032b\u0001\u0000\u0000\u0000<\u0334\u0001\u0000\u0000\u0000>\u0337"+
		"\u0001\u0000\u0000\u0000@\u0344\u0001\u0000\u0000\u0000B\u034e\u0001\u0000"+
		"\u0000\u0000D\u035b\u0001\u0000\u0000\u0000F\u037c\u0001\u0000\u0000\u0000"+
		"H\u0381\u0001\u0000\u0000\u0000J\u03a3\u0001\u0000\u0000\u0000L\u03a5"+
		"\u0001\u0000\u0000\u0000N\u03a7\u0001\u0000\u0000\u0000P\u03c9\u0001\u0000"+
		"\u0000\u0000R\u0404\u0001\u0000\u0000\u0000T\u0406\u0001\u0000\u0000\u0000"+
		"V\u0413\u0001\u0000\u0000\u0000X\u041a\u0001\u0000\u0000\u0000Z\u041d"+
		"\u0001\u0000\u0000\u0000\\\u0422\u0001\u0000\u0000\u0000^\u0430\u0001"+
		"\u0000\u0000\u0000`\u0444\u0001\u0000\u0000\u0000b\u0467\u0001\u0000\u0000"+
		"\u0000d\u047b\u0001\u0000\u0000\u0000f\u0481\u0001\u0000\u0000\u0000h"+
		"\u0483\u0001\u0000\u0000\u0000j\u04a7\u0001\u0000\u0000\u0000l\u04ad\u0001"+
		"\u0000\u0000\u0000n\u04ca\u0001\u0000\u0000\u0000p\u04cc\u0001\u0000\u0000"+
		"\u0000r\u04d1\u0001\u0000\u0000\u0000t\u04d3\u0001\u0000\u0000\u0000v"+
		"\u0518\u0001\u0000\u0000\u0000x\u0548\u0001\u0000\u0000\u0000z\u054a\u0001"+
		"\u0000\u0000\u0000|\u0560\u0001\u0000\u0000\u0000~\u056e\u0001\u0000\u0000"+
		"\u0000\u0080\u0570\u0001\u0000\u0000\u0000\u0082\u0582\u0001\u0000\u0000"+
		"\u0000\u0084\u058b\u0001\u0000\u0000\u0000\u0086\u059b\u0001\u0000\u0000"+
		"\u0000\u0088\u05a7\u0001\u0000\u0000\u0000\u008a\u05b3\u0001\u0000\u0000"+
		"\u0000\u008c\u05ca\u0001\u0000\u0000\u0000\u008e\u05d3\u0001\u0000\u0000"+
		"\u0000\u0090\u05e0\u0001\u0000\u0000\u0000\u0092\u05ed\u0001\u0000\u0000"+
		"\u0000\u0094\u05f6\u0001\u0000\u0000\u0000\u0096\u0625\u0001\u0000\u0000"+
		"\u0000\u0098\u0651\u0001\u0000\u0000\u0000\u009a\u0654\u0001\u0000\u0000"+
		"\u0000\u009c\u0663\u0001\u0000\u0000\u0000\u009e\u0681\u0001\u0000\u0000"+
		"\u0000\u00a0\u0683\u0001\u0000\u0000\u0000\u00a2\u0686\u0001\u0000\u0000"+
		"\u0000\u00a4\u06a3\u0001\u0000\u0000\u0000\u00a6\u06a5\u0001\u0000\u0000"+
		"\u0000\u00a8\u06b5\u0001\u0000\u0000\u0000\u00aa\u06bc\u0001\u0000\u0000"+
		"\u0000\u00ac\u06c2\u0001\u0000\u0000\u0000\u00ae\u06c7\u0001\u0000\u0000"+
		"\u0000\u00b0\u06ca\u0001\u0000\u0000\u0000\u00b2\u06cf\u0001\u0000\u0000"+
		"\u0000\u00b4\u06e0\u0001\u0000\u0000\u0000\u00b6\u06eb\u0001\u0000\u0000"+
		"\u0000\u00b8\u06f4\u0001\u0000\u0000\u0000\u00ba\u06ff\u0001\u0000\u0000"+
		"\u0000\u00bc\u0708\u0001\u0000\u0000\u0000\u00be\u0710\u0001\u0000\u0000"+
		"\u0000\u00c0\u0716\u0001\u0000\u0000\u0000\u00c2\u0718\u0001\u0000\u0000"+
		"\u0000\u00c4\u071e\u0001\u0000\u0000\u0000\u00c6\u0722\u0001\u0000\u0000"+
		"\u0000\u00c8\u072f\u0001\u0000\u0000\u0000\u00ca\u0734\u0001\u0000\u0000"+
		"\u0000\u00cc\u0738\u0001\u0000\u0000\u0000\u00ce\u0743\u0001\u0000\u0000"+
		"\u0000\u00d0\u074c\u0001\u0000\u0000\u0000\u00d2\u075a\u0001\u0000\u0000"+
		"\u0000\u00d4\u0761\u0001\u0000\u0000\u0000\u00d6\u076d\u0001\u0000\u0000"+
		"\u0000\u00d8\u0770\u0001\u0000\u0000\u0000\u00da\u077e\u0001\u0000\u0000"+
		"\u0000\u00dc\u0784\u0001\u0000\u0000\u0000\u00de\u0797\u0001\u0000\u0000"+
		"\u0000\u00e0\u07ac\u0001\u0000\u0000\u0000\u00e2\u07b0\u0001\u0000\u0000"+
		"\u0000\u00e4\u07ba\u0001\u0000\u0000\u0000\u00e6\u07bc\u0001\u0000\u0000"+
		"\u0000\u00e8\u07be\u0001\u0000\u0000\u0000\u00ea\u07c2\u0001\u0000\u0000"+
		"\u0000\u00ec\u07d5\u0001\u0000\u0000\u0000\u00ee\u07d9\u0001\u0000\u0000"+
		"\u0000\u00f0\u07db\u0001\u0000\u0000\u0000\u00f2\u07f8\u0001\u0000\u0000"+
		"\u0000\u00f4\u07fb\u0001\u0000\u0000\u0000\u00f6\u0801\u0001\u0000\u0000"+
		"\u0000\u00f8\u0803\u0001\u0000\u0000\u0000\u00fa\u0811\u0001\u0000\u0000"+
		"\u0000\u00fc\u0815\u0001\u0000\u0000\u0000\u00fe\u081c\u0001\u0000\u0000"+
		"\u0000\u0100\u0823\u0001\u0000\u0000\u0000\u0102\u082a\u0001\u0000\u0000"+
		"\u0000\u0104\u082d\u0001\u0000\u0000\u0000\u0106\u0839\u0001\u0000\u0000"+
		"\u0000\u0108\u083c\u0001\u0000\u0000\u0000\u010a\u084d\u0001\u0000\u0000"+
		"\u0000\u010c\u0853\u0001\u0000\u0000\u0000\u010e\u0856\u0001\u0000\u0000"+
		"\u0000\u0110\u0874\u0001\u0000\u0000\u0000\u0112\u087c\u0001\u0000\u0000"+
		"\u0000\u0114\u088b\u0001\u0000\u0000\u0000\u0116\u08a3\u0001\u0000\u0000"+
		"\u0000\u0118\u08a5\u0001\u0000\u0000\u0000\u011a\u08af\u0001\u0000\u0000"+
		"\u0000\u011c\u08b3\u0001\u0000\u0000\u0000\u011e\u08bc\u0001\u0000\u0000"+
		"\u0000\u0120\u08c5\u0001\u0000\u0000\u0000\u0122\u08d0\u0001\u0000\u0000"+
		"\u0000\u0124\u08de\u0001\u0000\u0000\u0000\u0126\u08ec\u0001\u0000\u0000"+
		"\u0000\u0128\u08ee\u0001\u0000\u0000\u0000\u012a\u0907\u0001\u0000\u0000"+
		"\u0000\u012c\u0914\u0001\u0000\u0000\u0000\u012e\u0916\u0001\u0000\u0000"+
		"\u0000\u0130\u0923\u0001\u0000\u0000\u0000\u0132\u092e\u0001\u0000\u0000"+
		"\u0000\u0134\u0932\u0001\u0000\u0000\u0000\u0136\u0936\u0001\u0000\u0000"+
		"\u0000\u0138\u093f\u0001\u0000\u0000\u0000\u013a\u094a\u0001\u0000\u0000"+
		"\u0000\u013c\u094c\u0001\u0000\u0000\u0000\u013e\u0950\u0001\u0000\u0000"+
		"\u0000\u0140\u095d\u0001\u0000\u0000\u0000\u0142\u0968\u0001\u0000\u0000"+
		"\u0000\u0144\u096a\u0001\u0000\u0000\u0000\u0146\u0985\u0001\u0000\u0000"+
		"\u0000\u0148\u0987\u0001\u0000\u0000\u0000\u014a\u0998\u0001\u0000\u0000"+
		"\u0000\u014c\u099a\u0001\u0000\u0000\u0000\u014e\u099d\u0001\u0000\u0000"+
		"\u0000\u0150\u09a7\u0001\u0000\u0000\u0000\u0152\u09aa\u0001\u0000\u0000"+
		"\u0000\u0154\u09ad\u0001\u0000\u0000\u0000\u0156\u09be\u0001\u0000\u0000"+
		"\u0000\u0158\u09cd\u0001\u0000\u0000\u0000\u015a\u09cf\u0001\u0000\u0000"+
		"\u0000\u015c\u09d9\u0001\u0000\u0000\u0000\u015e\u09e9\u0001\u0000\u0000"+
		"\u0000\u0160\u09f1\u0001\u0000\u0000\u0000\u0162\u09f4\u0001\u0000\u0000"+
		"\u0000\u0164\u0a05\u0001\u0000\u0000\u0000\u0166\u0a1a\u0001\u0000\u0000"+
		"\u0000\u0168\u0a30\u0001\u0000\u0000\u0000\u016a\u0a32\u0001\u0000\u0000"+
		"\u0000\u016c\u0a3e\u0001\u0000\u0000\u0000\u016e\u0a44\u0001\u0000\u0000"+
		"\u0000\u0170\u0a53\u0001\u0000\u0000\u0000\u0172\u0a61\u0001\u0000\u0000"+
		"\u0000\u0174\u0a7a\u0001\u0000\u0000\u0000\u0176\u0a7c\u0001\u0000\u0000"+
		"\u0000\u0178\u0a8f\u0001\u0000\u0000\u0000\u017a\u0aa1\u0001\u0000\u0000"+
		"\u0000\u017c\u0aa5\u0001\u0000\u0000\u0000\u017e\u0ab3\u0001\u0000\u0000"+
		"\u0000\u0180\u0ac6\u0001\u0000\u0000\u0000\u0182\u0ae3\u0001\u0000\u0000"+
		"\u0000\u0184\u0ae5\u0001\u0000\u0000\u0000\u0186\u0ae9\u0001\u0000\u0000"+
		"\u0000\u0188\u0aeb\u0001\u0000\u0000\u0000\u018a\u0afe\u0001\u0000\u0000"+
		"\u0000\u018c\u0b02\u0001\u0000\u0000\u0000\u018e\u0b04\u0001\u0000\u0000"+
		"\u0000\u0190\u0b15\u0001\u0000\u0000\u0000\u0192\u0b25\u0001\u0000\u0000"+
		"\u0000\u0194\u0bc1\u0001\u0000\u0000\u0000\u0196\u0bc3\u0001\u0000\u0000"+
		"\u0000\u0198\u0bc5\u0001\u0000\u0000\u0000\u019a\u0bcf\u0001\u0000\u0000"+
		"\u0000\u019c\u0ca1\u0001\u0000\u0000\u0000\u019e\u0ca3\u0001\u0000\u0000"+
		"\u0000\u01a0\u0caa\u0001\u0000\u0000\u0000\u01a2\u0cb2\u0001\u0000\u0000"+
		"\u0000\u01a4\u0cbe\u0001\u0000\u0000\u0000\u01a6\u0cc2\u0001\u0000\u0000"+
		"\u0000\u01a8\u0cc4\u0001\u0000\u0000\u0000\u01aa\u0cd7\u0001\u0000\u0000"+
		"\u0000\u01ac\u0cde\u0001\u0000\u0000\u0000\u01ae\u0ce3\u0001\u0000\u0000"+
		"\u0000\u01b0\u0ce6\u0001\u0000\u0000\u0000\u01b2\u0cf7\u0001\u0000\u0000"+
		"\u0000\u01b4\u0cf9\u0001\u0000\u0000\u0000\u01b6\u0cfc\u0001\u0000\u0000"+
		"\u0000\u01b8\u0d00\u0001\u0000\u0000\u0000\u01ba\u0d12\u0001\u0000\u0000"+
		"\u0000\u01bc\u0d15\u0001\u0000\u0000\u0000\u01be\u0d1a\u0001\u0000\u0000"+
		"\u0000\u01c0\u0d1e\u0001\u0000\u0000\u0000\u01c2\u0d20\u0001\u0000\u0000"+
		"\u0000\u01c4\u0d22\u0001\u0000\u0000\u0000\u01c6\u01c7\u0003\u0002\u0001"+
		"\u0000\u01c7\u01c8\u0005\u0000\u0000\u0001\u01c8\u0001\u0001\u0000\u0000"+
		"\u0000\u01c9\u01cc\u0003\u0004\u0002\u0000\u01ca\u01cc\u0003\f\u0006\u0000"+
		"\u01cb\u01c9\u0001\u0000\u0000\u0000\u01cb\u01ca\u0001\u0000\u0000\u0000"+
		"\u01cc\u01ce\u0001\u0000\u0000\u0000\u01cd\u01cf\u0005|\u0000\u0000\u01ce"+
		"\u01cd\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cf"+
		"\u01d1\u0001\u0000\u0000\u0000\u01d0\u01cb\u0001\u0000\u0000\u0000\u01d1"+
		"\u01d2\u0001\u0000\u0000\u0000\u01d2\u01d0\u0001\u0000\u0000\u0000\u01d2"+
		"\u01d3\u0001\u0000\u0000\u0000\u01d3\u0003\u0001\u0000\u0000\u0000\u01d4"+
		"\u01d6\u0003.\u0017\u0000\u01d5\u01d4\u0001\u0000\u0000\u0000\u01d5\u01d6"+
		"\u0001\u0000\u0000\u0000\u01d6\u01d7\u0001\u0000\u0000\u0000\u01d7\u01d8"+
		"\u0005\u0015\u0000\u0000\u01d8\u01da\u0003\u0002\u0001\u0000\u01d9\u01db"+
		"\u0003\u0010\b\u0000\u01da\u01d9\u0001\u0000\u0000\u0000\u01da\u01db\u0001"+
		"\u0000\u0000\u0000\u01db\u01dc\u0001\u0000\u0000\u0000\u01dc\u01dd\u0003"+
		"\b\u0004\u0000\u01dd\u0005\u0001\u0000\u0000\u0000\u01de\u01df\u0005\u0015"+
		"\u0000\u0000\u01df\u01e1\u0003\u0002\u0001\u0000\u01e0\u01e2\u0003\u0010"+
		"\b\u0000\u01e1\u01e0\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000"+
		"\u0000\u01e2\u01e3\u0001\u0000\u0000\u0000\u01e3\u01e4\u0003\b\u0004\u0000"+
		"\u01e4\u01ea\u0001\u0000\u0000\u0000\u01e5\u01e7\u0003\f\u0006\u0000\u01e6"+
		"\u01e8\u0005\u016d\u0000\u0000\u01e7\u01e6\u0001\u0000\u0000\u0000\u01e7"+
		"\u01e8\u0001\u0000\u0000\u0000\u01e8\u01ea\u0001\u0000\u0000\u0000\u01e9"+
		"\u01de\u0001\u0000\u0000\u0000\u01e9\u01e5\u0001\u0000\u0000\u0000\u01ea"+
		"\u0007\u0001\u0000\u0000\u0000\u01eb\u01ec\u0004\u0004\u0000\u0000\u01ec"+
		"\u01ed\u0005b\u0000\u0000\u01ed\t\u0001\u0000\u0000\u0000\u01ee\u01f8"+
		"\u0003\u0004\u0002\u0000\u01ef\u01f1\u0003\f\u0006\u0000\u01f0\u01ef\u0001"+
		"\u0000\u0000\u0000\u01f1\u01f2\u0001\u0000\u0000\u0000\u01f2\u01f0\u0001"+
		"\u0000\u0000\u0000\u01f2\u01f3\u0001\u0000\u0000\u0000\u01f3\u01f5\u0001"+
		"\u0000\u0000\u0000\u01f4\u01f6\u0005|\u0000\u0000\u01f5\u01f4\u0001\u0000"+
		"\u0000\u0000\u01f5\u01f6\u0001\u0000\u0000\u0000\u01f6\u01f8\u0001\u0000"+
		"\u0000\u0000\u01f7\u01ee\u0001\u0000\u0000\u0000\u01f7\u01f0\u0001\u0000"+
		"\u0000\u0000\u01f8\u000b\u0001\u0000\u0000\u0000\u01f9\u0237\u0003\u0018"+
		"\f\u0000\u01fa\u0237\u0003\"\u0011\u0000\u01fb\u0237\u0003p8\u0000\u01fc"+
		"\u0237\u0003$\u0012\u0000\u01fd\u0237\u0003&\u0013\u0000\u01fe\u0237\u0003"+
		"(\u0014\u0000\u01ff\u0237\u0003*\u0015\u0000\u0200\u0237\u0003\u00d2i"+
		"\u0000\u0201\u0237\u0003\u00d6k\u0000\u0202\u0237\u0003\u00d8l\u0000\u0203"+
		"\u0237\u0003\u00dcn\u0000\u0204\u0237\u0003\u00deo\u0000\u0205\u0237\u0003"+
		"\u00e8t\u0000\u0206\u0237\u0003\u0080@\u0000\u0207\u0237\u0003\u0084B"+
		"\u0000\u0208\u0237\u0003\u00eau\u0000\u0209\u0237\u0003D\"\u0000\u020a"+
		"\u0237\u0003\u0088D\u0000\u020b\u0237\u0003\u008eG\u0000\u020c\u0237\u0003"+
		"\u0094J\u0000\u020d\u0237\u0003B!\u0000\u020e\u0237\u0003,\u0016\u0000"+
		"\u020f\u0237\u0003\u016a\u00b5\u0000\u0210\u0237\u0003\u016e\u00b7\u0000"+
		"\u0211\u0237\u0003\u009eO\u0000\u0212\u0237\u0003\u00a0P\u0000\u0213\u0237"+
		"\u0003\u00a2Q\u0000\u0214\u0237\u0003\u00bc^\u0000\u0215\u0237\u0003\u00d0"+
		"h\u0000\u0216\u0237\u0003\u0112\u0089\u0000\u0217\u0237\u0003\u0114\u008a"+
		"\u0000\u0218\u0237\u0003\u00a4R\u0000\u0219\u0237\u0003\u00b0X\u0000\u021a"+
		"\u0237\u0003\u00b2Y\u0000\u021b\u0237\u0003\u00ba]\u0000\u021c\u0237\u0003"+
		"\u00be_\u0000\u021d\u0237\u0003\u00c6c\u0000\u021e\u0237\u0003\u00cae"+
		"\u0000\u021f\u0237\u0003\u00ccf\u0000\u0220\u0237\u0003\u0162\u00b1\u0000"+
		"\u0221\u0237\u0003\u00ceg\u0000\u0222\u0237\u0003\u00f2y\u0000\u0223\u0237"+
		"\u0003\u00f4z\u0000\u0224\u0237\u0003\u00f6{\u0000\u0225\u0237\u0003\u00f8"+
		"|\u0000\u0226\u0237\u0003\u00fa}\u0000\u0227\u0237\u0003\u00fc~\u0000"+
		"\u0228\u0237\u0003\u011a\u008d\u0000\u0229\u0237\u0003\u0106\u0083\u0000"+
		"\u022a\u0237\u0003\u0108\u0084\u0000\u022b\u0237\u0003\u015a\u00ad\u0000"+
		"\u022c\u0237\u0003\u010c\u0086\u0000\u022d\u0237\u0003\u010a\u0085\u0000"+
		"\u022e\u0237\u0003\u010e\u0087\u0000\u022f\u0237\u0003\u0110\u0088\u0000"+
		"\u0230\u0237\u0003\u0116\u008b\u0000\u0231\u0237\u0003\u01a8\u00d4\u0000"+
		"\u0232\u0237\u0003\u01ac\u00d6\u0000\u0233\u0237\u0003\u0014\n\u0000\u0234"+
		"\u0237\u0003\u0016\u000b\u0000\u0235\u0237\u0003\u000e\u0007\u0000\u0236"+
		"\u01f9\u0001\u0000\u0000\u0000\u0236\u01fa\u0001\u0000\u0000\u0000\u0236"+
		"\u01fb\u0001\u0000\u0000\u0000\u0236\u01fc\u0001\u0000\u0000\u0000\u0236"+
		"\u01fd\u0001\u0000\u0000\u0000\u0236\u01fe\u0001\u0000\u0000\u0000\u0236"+
		"\u01ff\u0001\u0000\u0000\u0000\u0236\u0200\u0001\u0000\u0000\u0000\u0236"+
		"\u0201\u0001\u0000\u0000\u0000\u0236\u0202\u0001\u0000\u0000\u0000\u0236"+
		"\u0203\u0001\u0000\u0000\u0000\u0236\u0204\u0001\u0000\u0000\u0000\u0236"+
		"\u0205\u0001\u0000\u0000\u0000\u0236\u0206\u0001\u0000\u0000\u0000\u0236"+
		"\u0207\u0001\u0000\u0000\u0000\u0236\u0208\u0001\u0000\u0000\u0000\u0236"+
		"\u0209\u0001\u0000\u0000\u0000\u0236\u020a\u0001\u0000\u0000\u0000\u0236"+
		"\u020b\u0001\u0000\u0000\u0000\u0236\u020c\u0001\u0000\u0000\u0000\u0236"+
		"\u020d\u0001\u0000\u0000\u0000\u0236\u020e\u0001\u0000\u0000\u0000\u0236"+
		"\u020f\u0001\u0000\u0000\u0000\u0236\u0210\u0001\u0000\u0000\u0000\u0236"+
		"\u0211\u0001\u0000\u0000\u0000\u0236\u0212\u0001\u0000\u0000\u0000\u0236"+
		"\u0213\u0001\u0000\u0000\u0000\u0236\u0214\u0001\u0000\u0000\u0000\u0236"+
		"\u0215\u0001\u0000\u0000\u0000\u0236\u0216\u0001\u0000\u0000\u0000\u0236"+
		"\u0217\u0001\u0000\u0000\u0000\u0236\u0218\u0001\u0000\u0000\u0000\u0236"+
		"\u0219\u0001\u0000\u0000\u0000\u0236\u021a\u0001\u0000\u0000\u0000\u0236"+
		"\u021b\u0001\u0000\u0000\u0000\u0236\u021c\u0001\u0000\u0000\u0000\u0236"+
		"\u021d\u0001\u0000\u0000\u0000\u0236\u021e\u0001\u0000\u0000\u0000\u0236"+
		"\u021f\u0001\u0000\u0000\u0000\u0236\u0220\u0001\u0000\u0000\u0000\u0236"+
		"\u0221\u0001\u0000\u0000\u0000\u0236\u0222\u0001\u0000\u0000\u0000\u0236"+
		"\u0223\u0001\u0000\u0000\u0000\u0236\u0224\u0001\u0000\u0000\u0000\u0236"+
		"\u0225\u0001\u0000\u0000\u0000\u0236\u0226\u0001\u0000\u0000\u0000\u0236"+
		"\u0227\u0001\u0000\u0000\u0000\u0236\u0228\u0001\u0000\u0000\u0000\u0236"+
		"\u0229\u0001\u0000\u0000\u0000\u0236\u022a\u0001\u0000\u0000\u0000\u0236"+
		"\u022b\u0001\u0000\u0000\u0000\u0236\u022c\u0001\u0000\u0000\u0000\u0236"+
		"\u022d\u0001\u0000\u0000\u0000\u0236\u022e\u0001\u0000\u0000\u0000\u0236"+
		"\u022f\u0001\u0000\u0000\u0000\u0236\u0230\u0001\u0000\u0000\u0000\u0236"+
		"\u0231\u0001\u0000\u0000\u0000\u0236\u0232\u0001\u0000\u0000\u0000\u0236"+
		"\u0233\u0001\u0000\u0000\u0000\u0236\u0234\u0001\u0000\u0000\u0000\u0236"+
		"\u0235\u0001\u0000\u0000\u0000\u0237\r\u0001\u0000\u0000\u0000\u0238\u0239"+
		"\u0007\u0000\u0000\u0000\u0239\u000f\u0001\u0000\u0000\u0000\u023a\u023c"+
		"\u0005h\u0000\u0000\u023b\u023d\u0003\u0012\t\u0000\u023c\u023b\u0001"+
		"\u0000\u0000\u0000\u023d\u023e\u0001\u0000\u0000\u0000\u023e\u023c\u0001"+
		"\u0000\u0000\u0000\u023e\u023f\u0001\u0000\u0000\u0000\u023f\u0011\u0001"+
		"\u0000\u0000\u0000\u0240\u0241\u0005\u0137\u0000\u0000\u0241\u0242\u0005"+
		"\u016f\u0000\u0000\u0242\u0243\u0005\u0120\u0000\u0000\u0243\u0244\u0003"+
		"\u0002\u0001\u0000\u0244\u0245\b\u0001\u0000\u0000\u0245\u0013\u0001\u0000"+
		"\u0000\u0000\u0246\u0247\u0005\u00c3\u0000\u0000\u0247\u0015\u0001\u0000"+
		"\u0000\u0000\u0248\u0249\u0004\u000b\u0001\u0000\u0249\u024a\u0003\u0180"+
		"\u00c0\u0000\u024a\u0017\u0001\u0000\u0000\u0000\u024b\u024c\u0005\u0100"+
		"\u0000\u0000\u024c\u0259\u0003\u00fe\u007f\u0000\u024d\u024f\u0005\u0100"+
		"\u0000\u0000\u024e\u024d\u0001\u0000\u0000\u0000\u024e\u024f\u0001\u0000"+
		"\u0000\u0000\u024f\u0250\u0001\u0000\u0000\u0000\u0250\u0255\u0003\u001a"+
		"\r\u0000\u0251\u0252\u0005\u015a\u0000\u0000\u0252\u0254\u0003\u001a\r"+
		"\u0000\u0253\u0251\u0001\u0000\u0000\u0000\u0254\u0257\u0001\u0000\u0000"+
		"\u0000\u0255\u0253\u0001\u0000\u0000\u0000\u0255\u0256\u0001\u0000\u0000"+
		"\u0000\u0256\u0259\u0001\u0000\u0000\u0000\u0257\u0255\u0001\u0000\u0000"+
		"\u0000\u0258\u024b\u0001\u0000\u0000\u0000\u0258\u024e\u0001\u0000\u0000"+
		"\u0000\u0259\u0019\u0001\u0000\u0000\u0000\u025a\u025e\u0003\u001c\u000e"+
		"\u0000\u025b\u025e\u0003\u001e\u000f\u0000\u025c\u025e\u0003 \u0010\u0000"+
		"\u025d\u025a\u0001\u0000\u0000\u0000\u025d\u025b\u0001\u0000\u0000\u0000"+
		"\u025d\u025c\u0001\u0000\u0000\u0000\u025e\u001b\u0001\u0000\u0000\u0000"+
		"\u025f\u0261\u0003\u01b8\u00dc\u0000\u0260\u0262\u0005\u0159\u0000\u0000"+
		"\u0261\u0260\u0001\u0000\u0000\u0000\u0261\u0262\u0001\u0000\u0000\u0000"+
		"\u0262\u0263\u0001\u0000\u0000\u0000\u0263\u0264\u0005\u015e\u0000\u0000"+
		"\u0264\u0265\u0003\u0180\u00c0\u0000\u0265\u0270\u0001\u0000\u0000\u0000"+
		"\u0266\u0267\u0005\u0168\u0000\u0000\u0267\u0268\u0003\u01b8\u00dc\u0000"+
		"\u0268\u026a\u0005\u016b\u0000\u0000\u0269\u026b\u0005\u0159\u0000\u0000"+
		"\u026a\u0269\u0001\u0000\u0000\u0000\u026a\u026b\u0001\u0000\u0000\u0000"+
		"\u026b\u026c\u0001\u0000\u0000\u0000\u026c\u026d\u0005\u015e\u0000\u0000"+
		"\u026d\u026e\u0003\u0180\u00c0\u0000\u026e\u0270\u0001\u0000\u0000\u0000"+
		"\u026f\u025f\u0001\u0000\u0000\u0000\u026f\u0266\u0001\u0000\u0000\u0000"+
		"\u0270\u001d\u0001\u0000\u0000\u0000\u0271\u0272\u0005\u0168\u0000\u0000"+
		"\u0272\u0277\u0003\u01b8\u00dc\u0000\u0273\u0274\u0005\u015a\u0000\u0000"+
		"\u0274\u0276\u0003\u01b8\u00dc\u0000\u0275\u0273\u0001\u0000\u0000\u0000"+
		"\u0276\u0279\u0001\u0000\u0000\u0000\u0277\u0275\u0001\u0000\u0000\u0000"+
		"\u0277\u0278\u0001\u0000\u0000\u0000\u0278\u027a\u0001\u0000\u0000\u0000"+
		"\u0279\u0277\u0001\u0000\u0000\u0000\u027a\u027c\u0005\u016b\u0000\u0000"+
		"\u027b\u027d\u0005\u0159\u0000\u0000\u027c\u027b\u0001\u0000\u0000\u0000"+
		"\u027c\u027d\u0001\u0000\u0000\u0000\u027d\u027e\u0001\u0000\u0000\u0000"+
		"\u027e\u027f\u0005\u015e\u0000\u0000\u027f\u0280\u0005\u0168\u0000\u0000"+
		"\u0280\u0285\u0003\u0180\u00c0\u0000\u0281\u0282\u0005\u015a\u0000\u0000"+
		"\u0282\u0284\u0003\u0180\u00c0\u0000\u0283\u0281\u0001\u0000\u0000\u0000"+
		"\u0284\u0287\u0001\u0000\u0000\u0000\u0285\u0283\u0001\u0000\u0000\u0000"+
		"\u0285\u0286\u0001\u0000\u0000\u0000\u0286\u0288\u0001\u0000\u0000\u0000"+
		"\u0287\u0285\u0001\u0000\u0000\u0000\u0288\u0289\u0005\u016b\u0000\u0000"+
		"\u0289\u001f\u0001\u0000\u0000\u0000\u028a\u0297\u0003\u01b8\u00dc\u0000"+
		"\u028b\u028c\u0005\u0168\u0000\u0000\u028c\u0291\u0003\u01b8\u00dc\u0000"+
		"\u028d\u028e\u0005\u015a\u0000\u0000\u028e\u0290\u0003\u01b8\u00dc\u0000"+
		"\u028f\u028d\u0001\u0000\u0000\u0000\u0290\u0293\u0001\u0000\u0000\u0000"+
		"\u0291\u028f\u0001\u0000\u0000\u0000\u0291\u0292\u0001\u0000\u0000\u0000"+
		"\u0292\u0294\u0001\u0000\u0000\u0000\u0293\u0291\u0001\u0000\u0000\u0000"+
		"\u0294\u0295\u0005\u016b\u0000\u0000\u0295\u0297\u0001\u0000\u0000\u0000"+
		"\u0296\u028a\u0001\u0000\u0000\u0000\u0296\u028b\u0001\u0000\u0000\u0000"+
		"\u0297\u0299\u0001\u0000\u0000\u0000\u0298\u029a\u0005\u0159\u0000\u0000"+
		"\u0299\u0298\u0001\u0000\u0000\u0000\u0299\u029a\u0001\u0000\u0000\u0000"+
		"\u029a\u029b\u0001\u0000\u0000\u0000\u029b\u029c\u0005\u015e\u0000\u0000"+
		"\u029c\u029d\u0005\u0168\u0000\u0000\u029d\u029e\u0003\u011a\u008d\u0000"+
		"\u029e\u029f\u0005\u016b\u0000\u0000\u029f!\u0001\u0000\u0000\u0000\u02a0"+
		"\u02a1\u0005\t\u0000\u0000\u02a1\u02a2\u0003\u01b8\u00dc\u0000\u02a2\u02a3"+
		"\u0005A\u0000\u0000\u02a3\u02a7\u0005s\u0000\u0000\u02a4\u02a5\u0005\u00e8"+
		"\u0000\u0000\u02a5\u02a8\u0005\u0100\u0000\u0000\u02a6\u02a8\u0005\u00dc"+
		"\u0000\u0000\u02a7\u02a4\u0001\u0000\u0000\u0000\u02a7\u02a6\u0001\u0000"+
		"\u0000\u0000\u02a8\u02a9\u0001\u0000\u0000\u0000\u02a9\u02aa\u0003\u01b8"+
		"\u00dc\u0000\u02aa#\u0001\u0000\u0000\u0000\u02ab\u02ae\u0005\u0010\u0000"+
		"\u0000\u02ac\u02ad\u0005\u00e8\u0000\u0000\u02ad\u02af\u0005\u0100\u0000"+
		"\u0000\u02ae\u02ac\u0001\u0000\u0000\u0000\u02ae\u02af\u0001\u0000\u0000"+
		"\u0000\u02af\u02b0\u0001\u0000\u0000\u0000\u02b0\u02b1\u0007\u0002\u0000"+
		"\u0000\u02b1\u02b2\u0005\u0168\u0000\u0000\u02b2\u02b7\u0003\u01b8\u00dc"+
		"\u0000\u02b3\u02b4\u0005\u015a\u0000\u0000\u02b4\u02b6\u0003\u01b8\u00dc"+
		"\u0000\u02b5\u02b3\u0001\u0000\u0000\u0000\u02b6\u02b9\u0001\u0000\u0000"+
		"\u0000\u02b7\u02b5\u0001\u0000\u0000\u0000\u02b7\u02b8\u0001\u0000\u0000"+
		"\u0000\u02b8\u02ba\u0001\u0000\u0000\u0000\u02b9\u02b7\u0001\u0000\u0000"+
		"\u0000\u02ba\u02bb\u0005\u016b\u0000\u0000\u02bb\u02bc\u0005\u013a\u0000"+
		"\u0000\u02bc\u02bd\u0005\u00dc\u0000\u0000\u02bd\u02be\u0003\u01b8\u00dc"+
		"\u0000\u02be%\u0001\u0000\u0000\u0000\u02bf\u02c0\u0005\u0015\u0000\u0000"+
		"\u02c0\u02c1\u0005\u0126\u0000\u0000\u02c1\'\u0001\u0000\u0000\u0000\u02c2"+
		"\u02c3\u0005\u001d\u0000\u0000\u02c3)\u0001\u0000\u0000\u0000\u02c4\u02c5"+
		"\u0005 \u0000\u0000\u02c5\u02cc\u0003\u01b8\u00dc\u0000\u02c6\u02c8\u0005"+
		"\u0168\u0000\u0000\u02c7\u02c9\u0003\u01a0\u00d0\u0000\u02c8\u02c7\u0001"+
		"\u0000\u0000\u0000\u02c8\u02c9\u0001\u0000\u0000\u0000\u02c9\u02ca\u0001"+
		"\u0000\u0000\u0000\u02ca\u02cd\u0005\u016b\u0000\u0000\u02cb\u02cd\u0003"+
		"\u01a0\u00d0\u0000\u02cc\u02c6\u0001\u0000\u0000\u0000\u02cc\u02cb\u0001"+
		"\u0000\u0000\u0000\u02cc\u02cd\u0001\u0000\u0000\u0000\u02cd+\u0001\u0000"+
		"\u0000\u0000\u02ce\u02cf\u0005J\u0000\u0000\u02cf\u02d4\u00032\u0019\u0000"+
		"\u02d0\u02d1\u0005\u015a\u0000\u0000\u02d1\u02d3\u00032\u0019\u0000\u02d2"+
		"\u02d0\u0001\u0000\u0000\u0000\u02d3\u02d6\u0001\u0000\u0000\u0000\u02d4"+
		"\u02d2\u0001\u0000\u0000\u0000\u02d4\u02d5\u0001\u0000\u0000\u0000\u02d5"+
		"-\u0001\u0000\u0000\u0000\u02d6\u02d4\u0001\u0000\u0000\u0000\u02d7\u02d8"+
		"\u0005J\u0000\u0000\u02d8\u02d9\u00032\u0019\u0000\u02d9\u02df\u0005\u016d"+
		"\u0000\u0000\u02da\u02db\u00032\u0019\u0000\u02db\u02dc\u0005\u016d\u0000"+
		"\u0000\u02dc\u02de\u0001\u0000\u0000\u0000\u02dd\u02da\u0001\u0000\u0000"+
		"\u0000\u02de\u02e1\u0001\u0000\u0000\u0000\u02df\u02dd\u0001\u0000\u0000"+
		"\u0000\u02df\u02e0\u0001\u0000\u0000\u0000\u02e0/\u0001\u0000\u0000\u0000"+
		"\u02e1\u02df\u0001\u0000\u0000\u0000\u02e2\u02e3\u00032\u0019\u0000\u02e3"+
		"\u02e9\u0005\u016d\u0000\u0000\u02e4\u02e5\u00032\u0019\u0000\u02e5\u02e6"+
		"\u0005\u016d\u0000\u0000\u02e6\u02e8\u0001\u0000\u0000\u0000\u02e7\u02e4"+
		"\u0001\u0000\u0000\u0000\u02e8\u02eb\u0001\u0000\u0000\u0000\u02e9\u02e7"+
		"\u0001\u0000\u0000\u0000\u02e9\u02ea\u0001\u0000\u0000\u0000\u02ea1\u0001"+
		"\u0000\u0000\u0000\u02eb\u02e9\u0001\u0000\u0000\u0000\u02ec\u02f2\u0003"+
		"8\u001c\u0000\u02ed\u02f2\u00036\u001b\u0000\u02ee\u02f2\u0003>\u001f"+
		"\u0000\u02ef\u02f2\u00034\u001a\u0000\u02f0\u02f2\u0003@ \u0000\u02f1"+
		"\u02ec\u0001\u0000\u0000\u0000\u02f1\u02ed\u0001\u0000\u0000\u0000\u02f1"+
		"\u02ee\u0001\u0000\u0000\u0000\u02f1\u02ef\u0001\u0000\u0000\u0000\u02f1"+
		"\u02f0\u0001\u0000\u0000\u0000\u02f23\u0001\u0000\u0000\u0000\u02f3\u02f8"+
		"\u0003\u01b8\u00dc\u0000\u02f4\u02f5\u0005\u015a\u0000\u0000\u02f5\u02f7"+
		"\u0003\u01b8\u00dc\u0000\u02f6\u02f4\u0001\u0000\u0000\u0000\u02f7\u02fa"+
		"\u0001\u0000\u0000\u0000\u02f8\u02f6\u0001\u0000\u0000\u0000\u02f8\u02f9"+
		"\u0001\u0000\u0000\u0000\u02f9\u02fc\u0001\u0000\u0000\u0000\u02fa\u02f8"+
		"\u0001\u0000\u0000\u0000\u02fb\u02fd\u0005\u000e\u0000\u0000\u02fc\u02fb"+
		"\u0001\u0000\u0000\u0000\u02fc\u02fd\u0001\u0000\u0000\u0000\u02fd\u02fe"+
		"\u0001\u0000\u0000\u0000\u02fe\u0300\u0003x<\u0000\u02ff\u0301\u0003z"+
		"=\u0000\u0300\u02ff\u0001\u0000\u0000\u0000\u0300\u0301\u0001\u0000\u0000"+
		"\u0000\u0301\u0305\u0001\u0000\u0000\u0000\u0302\u0304\u0003|>\u0000\u0303"+
		"\u0302\u0001\u0000\u0000\u0000\u0304\u0307\u0001\u0000\u0000\u0000\u0305"+
		"\u0303\u0001\u0000\u0000\u0000\u0305\u0306\u0001\u0000\u0000\u0000\u0306"+
		"\u0309\u0001\u0000\u0000\u0000\u0307\u0305\u0001\u0000\u0000\u0000\u0308"+
		"\u030a\u0003~?\u0000\u0309\u0308\u0001\u0000\u0000\u0000\u0309\u030a\u0001"+
		"\u0000\u0000\u0000\u030a\u0317\u0001\u0000\u0000\u0000\u030b\u030c\u0003"+
		"\u01b8\u00dc\u0000\u030c\u030e\u00051\u0000\u0000\u030d\u030f\u0005\u000e"+
		"\u0000\u0000\u030e\u030d\u0001\u0000\u0000\u0000\u030e\u030f\u0001\u0000"+
		"\u0000\u0000\u030f\u0310\u0001\u0000\u0000\u0000\u0310\u0312\u0003x<\u0000"+
		"\u0311\u0313\u0003z=\u0000\u0312\u0311\u0001\u0000\u0000\u0000\u0312\u0313"+
		"\u0001\u0000\u0000\u0000\u0313\u0314\u0001\u0000\u0000\u0000\u0314\u0315"+
		"\u0003~?\u0000\u0315\u0317\u0001\u0000\u0000\u0000\u0316\u02f3\u0001\u0000"+
		"\u0000\u0000\u0316\u030b\u0001\u0000\u0000\u0000\u03175\u0001\u0000\u0000"+
		"\u0000\u0318\u0319\u0003\u01b8\u00dc\u0000\u0319\u031a\u00055\u0000\u0000"+
		"\u031a7\u0001\u0000\u0000\u0000\u031b\u031c\u0005A\u0000\u0000\u031c\u0321"+
		"\u0003\u01b8\u00dc\u0000\u031d\u031e\u0003\u01b8\u00dc\u0000\u031e\u031f"+
		"\u0005A\u0000\u0000\u031f\u0321\u0001\u0000\u0000\u0000\u0320\u031b\u0001"+
		"\u0000\u0000\u0000\u0320\u031d\u0001\u0000\u0000\u0000\u0321\u0324\u0001"+
		"\u0000\u0000\u0000\u0322\u0325\u0003:\u001d\u0000\u0323\u0325\u0003<\u001e"+
		"\u0000\u0324\u0322\u0001\u0000\u0000\u0000\u0324\u0323\u0001\u0000\u0000"+
		"\u0000\u0324\u0325\u0001\u0000\u0000\u0000\u0325\u0326\u0001\u0000\u0000"+
		"\u0000\u0326\u0329\u0007\u0003\u0000\u0000\u0327\u032a\u0003\u011a\u008d"+
		"\u0000\u0328\u032a\u0003\u0180\u00c0\u0000\u0329\u0327\u0001\u0000\u0000"+
		"\u0000\u0329\u0328\u0001\u0000\u0000\u0000\u032a9\u0001\u0000\u0000\u0000"+
		"\u032b\u032c\u0005\u013a\u0000\u0000\u032c\u032e\u0005\u00ea\u0000\u0000"+
		"\u032d\u032f\u0005\u00c9\u0000\u0000\u032e\u032d\u0001\u0000\u0000\u0000"+
		"\u032e\u032f\u0001\u0000\u0000\u0000\u032f\u0332\u0001\u0000\u0000\u0000"+
		"\u0330\u0331\u0005\u0124\u0000\u0000\u0331\u0333\u0007\u0004\u0000\u0000"+
		"\u0332\u0330\u0001\u0000\u0000\u0000\u0332\u0333\u0001\u0000\u0000\u0000"+
		"\u0333;\u0001\u0000\u0000\u0000\u0334\u0335\u0005\u013b\u0000\u0000\u0335"+
		"\u0336\u0005\u00ea\u0000\u0000\u0336=\u0001\u0000\u0000\u0000\u0337\u0338"+
		"\u0007\u0005\u0000\u0000\u0338\u0339\u0005\u007f\u0000\u0000\u0339\u033f"+
		"\u0005s\u0000\u0000\u033a\u0340\u0005\u010c\u0000\u0000\u033b\u0340\u0005"+
		"\u010f\u0000\u0000\u033c\u033d\u0005\u00c1\u0000\u0000\u033d\u0340\u0005"+
		"v\u0000\u0000\u033e\u0340\u0003\u01b8\u00dc\u0000\u033f\u033a\u0001\u0000"+
		"\u0000\u0000\u033f\u033b\u0001\u0000\u0000\u0000\u033f\u033c\u0001\u0000"+
		"\u0000\u0000\u033f\u033e\u0001\u0000\u0000\u0000\u0340\u0341\u0001\u0000"+
		"\u0000\u0000\u0341\u0342\u0003\u0006\u0003\u0000\u0342?\u0001\u0000\u0000"+
		"\u0000\u0343\u0345\u0005{\u0000\u0000\u0344\u0343\u0001\u0000\u0000\u0000"+
		"\u0344\u0345\u0001\u0000\u0000\u0000\u0345\u0346\u0001\u0000\u0000\u0000"+
		"\u0346\u0347\u0005\u011d\u0000\u0000\u0347\u0348\u0005\u011b\u0000\u0000"+
		"\u0348\u034a\u0003\u01b8\u00dc\u0000\u0349\u034b\u0003V+\u0000\u034a\u0349"+
		"\u0001\u0000\u0000\u0000\u034a\u034b\u0001\u0000\u0000\u0000\u034b\u034c"+
		"\u0001\u0000\u0000\u0000\u034c\u034d\u0003F#\u0000\u034dA\u0001\u0000"+
		"\u0000\u0000\u034e\u034f\u0005;\u0000\u0000\u034f\u0353\u0005\u011b\u0000"+
		"\u0000\u0350\u0351\u0005\u0086\u0000\u0000\u0351\u0352\u0005\u00c1\u0000"+
		"\u0000\u0352\u0354\u0005j\u0000\u0000\u0353\u0350\u0001\u0000\u0000\u0000"+
		"\u0353\u0354\u0001\u0000\u0000\u0000\u0354\u0355\u0001\u0000\u0000\u0000"+
		"\u0355\u0357\u0003\u014a\u00a5\u0000\u0356\u0358\u0003V+\u0000\u0357\u0356"+
		"\u0001\u0000\u0000\u0000\u0357\u0358\u0001\u0000\u0000\u0000\u0358\u0359"+
		"\u0001\u0000\u0000\u0000\u0359\u035a\u0003F#\u0000\u035aC\u0001\u0000"+
		"\u0000\u0000\u035b\u0362\u0005;\u0000\u0000\u035c\u035d\u0005\u00a6\u0000"+
		"\u0000\u035d\u0363\u0005\u011d\u0000\u0000\u035e\u0360\u0007\u0006\u0000"+
		"\u0000\u035f\u035e\u0001\u0000\u0000\u0000\u035f\u0360\u0001\u0000\u0000"+
		"\u0000\u0360\u0361\u0001\u0000\u0000\u0000\u0361\u0363\u0005\u0136\u0000"+
		"\u0000\u0362\u035c\u0001\u0000\u0000\u0000\u0362\u035f\u0001\u0000\u0000"+
		"\u0000\u0363\u0364\u0001\u0000\u0000\u0000\u0364\u0365\u0005\u011b\u0000"+
		"\u0000\u0365\u0367\u0003\u01b8\u00dc\u0000\u0366\u0368\u0003V+\u0000\u0367"+
		"\u0366\u0001\u0000\u0000\u0000\u0367\u0368\u0001\u0000\u0000\u0000\u0368"+
		"\u0369\u0001\u0000\u0000\u0000\u0369\u036a\u0003F#\u0000\u036aE\u0001"+
		"\u0000\u0000\u0000\u036b\u036d\u0005\u000e\u0000\u0000\u036c\u036b\u0001"+
		"\u0000\u0000\u0000\u036c\u036d\u0001\u0000\u0000\u0000\u036d\u036e\u0001"+
		"\u0000\u0000\u0000\u036e\u036f\u0005\u0168\u0000\u0000\u036f\u0370\u0003"+
		"\u011a\u008d\u0000\u0370\u0371\u0005\u016b\u0000\u0000\u0371\u037d\u0001"+
		"\u0000\u0000\u0000\u0372\u0374\u0005\u000e\u0000\u0000\u0373\u0372\u0001"+
		"\u0000\u0000\u0000\u0373\u0374\u0001\u0000\u0000\u0000\u0374\u0375\u0001"+
		"\u0000\u0000\u0000\u0375\u037d\u0003\u011a\u008d\u0000\u0376\u0377\u0005"+
		"\u0168\u0000\u0000\u0377\u0378\u0003H$\u0000\u0378\u0379\u0005\u016b\u0000"+
		"\u0000\u0379\u037d\u0001\u0000\u0000\u0000\u037a\u037b\u0005\u00a3\u0000"+
		"\u0000\u037b\u037d\u0003\u014a\u00a5\u0000\u037c\u036c\u0001\u0000\u0000"+
		"\u0000\u037c\u0373\u0001\u0000\u0000\u0000\u037c\u0376\u0001\u0000\u0000"+
		"\u0000\u037c\u037a\u0001\u0000\u0000\u0000\u037d\u037f\u0001\u0000\u0000"+
		"\u0000\u037e\u0380\u0003\\.\u0000\u037f\u037e\u0001\u0000\u0000\u0000"+
		"\u037f\u0380\u0001\u0000\u0000\u0000\u0380G\u0001\u0000\u0000\u0000\u0381"+
		"\u0386\u0003J%\u0000\u0382\u0383\u0005\u015a\u0000\u0000\u0383\u0385\u0003"+
		"J%\u0000\u0384\u0382\u0001\u0000\u0000\u0000\u0385\u0388\u0001\u0000\u0000"+
		"\u0000\u0386\u0384\u0001\u0000\u0000\u0000\u0386\u0387\u0001\u0000\u0000"+
		"\u0000\u0387I\u0001\u0000\u0000\u0000\u0388\u0386\u0001\u0000\u0000\u0000"+
		"\u0389\u038a\u0003N\'\u0000\u038a\u038c\u0003x<\u0000\u038b\u038d\u0003"+
		"z=\u0000\u038c\u038b\u0001\u0000\u0000\u0000\u038c\u038d\u0001\u0000\u0000"+
		"\u0000\u038d\u0391\u0001\u0000\u0000\u0000\u038e\u0390\u0003|>\u0000\u038f"+
		"\u038e\u0001\u0000\u0000\u0000\u0390\u0393\u0001\u0000\u0000\u0000\u0391"+
		"\u038f\u0001\u0000\u0000\u0000\u0391\u0392\u0001\u0000\u0000\u0000\u0392"+
		"\u0397\u0001\u0000\u0000\u0000\u0393\u0391\u0001\u0000\u0000\u0000\u0394"+
		"\u0396\u0003P(\u0000\u0395\u0394\u0001\u0000\u0000\u0000\u0396\u0399\u0001"+
		"\u0000\u0000\u0000\u0397\u0395\u0001\u0000\u0000\u0000\u0397\u0398\u0001"+
		"\u0000\u0000\u0000\u0398\u039c\u0001\u0000\u0000\u0000\u0399\u0397\u0001"+
		"\u0000\u0000\u0000\u039a\u039b\u00050\u0000\u0000\u039b\u039d\u0003L&"+
		"\u0000\u039c\u039a\u0001\u0000\u0000\u0000\u039c\u039d\u0001\u0000\u0000"+
		"\u0000\u039d\u03a4\u0001\u0000\u0000\u0000\u039e\u039f\u00056\u0000\u0000"+
		"\u039f\u03a1\u0003\u01b8\u00dc\u0000\u03a0\u039e\u0001\u0000\u0000\u0000"+
		"\u03a0\u03a1\u0001\u0000\u0000\u0000\u03a1\u03a2\u0001\u0000\u0000\u0000"+
		"\u03a2\u03a4\u0003R)\u0000\u03a3\u0389\u0001\u0000\u0000\u0000\u03a3\u03a0"+
		"\u0001\u0000\u0000\u0000\u03a4K\u0001\u0000\u0000\u0000\u03a5\u03a6\u0003"+
		"\u0180\u00c0\u0000\u03a6M\u0001\u0000\u0000\u0000\u03a7\u03a8\u0003\u01b8"+
		"\u00dc\u0000\u03a8O\u0001\u0000\u0000\u0000\u03a9\u03ca\u0003~?\u0000"+
		"\u03aa\u03ac\u0005\u00c1\u0000\u0000\u03ab\u03aa\u0001\u0000\u0000\u0000"+
		"\u03ab\u03ac\u0001\u0000\u0000\u0000\u03ac\u03ad\u0001\u0000\u0000\u0000"+
		"\u03ad\u03ca\u0005\u00c3\u0000\u0000\u03ae\u03af\u0005\u00d9\u0000\u0000"+
		"\u03af\u03ca\u0005\u009e\u0000\u0000\u03b0\u03ca\u0005\u012b\u0000\u0000"+
		"\u03b1\u03b2\u0005\u00e3\u0000\u0000\u03b2\u03b3\u0003\u014a\u00a5\u0000"+
		"\u03b3\u03b4\u0005\u0168\u0000\u0000\u03b4\u03b5\u0003\u01b8\u00dc\u0000"+
		"\u03b5\u03b9\u0005\u016b\u0000\u0000\u03b6\u03b8\u0003T*\u0000\u03b7\u03b6"+
		"\u0001\u0000\u0000\u0000\u03b8\u03bb\u0001\u0000\u0000\u0000\u03b9\u03b7"+
		"\u0001\u0000\u0000\u0000\u03b9\u03ba\u0001\u0000\u0000\u0000\u03ba\u03ca"+
		"\u0001\u0000\u0000\u0000\u03bb\u03b9\u0001\u0000\u0000\u0000\u03bc\u03bd"+
		"\u0005\u0085\u0000\u0000\u03bd\u03be\u0005\u0168\u0000\u0000\u03be\u03c3"+
		"\u0005\u0172\u0000\u0000\u03bf\u03c0\u0005\u015a\u0000\u0000\u03c0\u03c2"+
		"\u0005\u0172\u0000\u0000\u03c1\u03bf\u0001\u0000\u0000\u0000\u03c2\u03c5"+
		"\u0001\u0000\u0000\u0000\u03c3\u03c1\u0001\u0000\u0000\u0000\u03c3\u03c4"+
		"\u0001\u0000\u0000\u0000\u03c4\u03c6\u0001\u0000\u0000\u0000\u03c5\u03c3"+
		"\u0001\u0000\u0000\u0000\u03c6\u03ca\u0005\u016b\u0000\u0000\u03c7\u03ca"+
		"\u0005\u0012\u0000\u0000\u03c8\u03ca\u0005a\u0000\u0000\u03c9\u03a9\u0001"+
		"\u0000\u0000\u0000\u03c9\u03ab\u0001\u0000\u0000\u0000\u03c9\u03ae\u0001"+
		"\u0000\u0000\u0000\u03c9\u03b0\u0001\u0000\u0000\u0000\u03c9\u03b1\u0001"+
		"\u0000\u0000\u0000\u03c9\u03bc\u0001\u0000\u0000\u0000\u03c9\u03c7\u0001"+
		"\u0000\u0000\u0000\u03c9\u03c8\u0001\u0000\u0000\u0000\u03caQ\u0001\u0000"+
		"\u0000\u0000\u03cb\u03cc\u0005\u00d9\u0000\u0000\u03cc\u03ce\u0005\u009e"+
		"\u0000\u0000\u03cd\u03cf\u0005+\u0000\u0000\u03ce\u03cd\u0001\u0000\u0000"+
		"\u0000\u03ce\u03cf\u0001\u0000\u0000\u0000\u03cf\u03d0\u0001\u0000\u0000"+
		"\u0000\u03d0\u03d1\u0005\u0168\u0000\u0000\u03d1\u03d3\u0003\u01b8\u00dc"+
		"\u0000\u03d2\u03d4\u0007\u0007\u0000\u0000\u03d3\u03d2\u0001\u0000\u0000"+
		"\u0000\u03d3\u03d4\u0001\u0000\u0000\u0000\u03d4\u03dc\u0001\u0000\u0000"+
		"\u0000\u03d5\u03d6\u0005\u015a\u0000\u0000\u03d6\u03d8\u0003\u01b8\u00dc"+
		"\u0000\u03d7\u03d9\u0007\u0007\u0000\u0000\u03d8\u03d7\u0001\u0000\u0000"+
		"\u0000\u03d8\u03d9\u0001\u0000\u0000\u0000\u03d9\u03db\u0001\u0000\u0000"+
		"\u0000\u03da\u03d5\u0001\u0000\u0000\u0000\u03db\u03de\u0001\u0000\u0000"+
		"\u0000\u03dc\u03da\u0001\u0000\u0000\u0000\u03dc\u03dd\u0001\u0000\u0000"+
		"\u0000\u03dd\u03df\u0001\u0000\u0000\u0000\u03de\u03dc\u0001\u0000\u0000"+
		"\u0000\u03df\u03e1\u0005\u016b\u0000\u0000\u03e0\u03e2\u0005a\u0000\u0000"+
		"\u03e1\u03e0\u0001\u0000\u0000\u0000\u03e1\u03e2\u0001\u0000\u0000\u0000"+
		"\u03e2\u03e4\u0001\u0000\u0000\u0000\u03e3\u03e5\u0003\u00eew\u0000\u03e4"+
		"\u03e3\u0001\u0000\u0000\u0000\u03e4\u03e5\u0001\u0000\u0000\u0000\u03e5"+
		"\u0405\u0001\u0000\u0000\u0000\u03e6\u03e7\u0005t\u0000\u0000\u03e7\u03e8"+
		"\u0005\u009e\u0000\u0000\u03e8\u03e9\u0005\u0168\u0000\u0000\u03e9\u03ee"+
		"\u0003\u01b8\u00dc\u0000\u03ea\u03eb\u0005\u015a\u0000\u0000\u03eb\u03ed"+
		"\u0003\u01b8\u00dc\u0000\u03ec\u03ea\u0001\u0000\u0000\u0000\u03ed\u03f0"+
		"\u0001\u0000\u0000\u0000\u03ee\u03ec\u0001\u0000\u0000\u0000\u03ee\u03ef"+
		"\u0001\u0000\u0000\u0000\u03ef\u03f1\u0001\u0000\u0000\u0000\u03f0\u03ee"+
		"\u0001\u0000\u0000\u0000\u03f1\u03f2\u0005\u016b\u0000\u0000\u03f2\u03f3"+
		"\u0005\u00e3\u0000\u0000\u03f3\u03f4\u0003\u014a\u00a5\u0000\u03f4\u03f5"+
		"\u0005\u0168\u0000\u0000\u03f5\u03fa\u0003\u01b8\u00dc\u0000\u03f6\u03f7"+
		"\u0005\u015a\u0000\u0000\u03f7\u03f9\u0003\u01b8\u00dc\u0000\u03f8\u03f6"+
		"\u0001\u0000\u0000\u0000\u03f9\u03fc\u0001\u0000\u0000\u0000\u03fa\u03f8"+
		"\u0001\u0000\u0000\u0000\u03fa\u03fb\u0001\u0000\u0000\u0000\u03fb\u03fd"+
		"\u0001\u0000\u0000\u0000\u03fc\u03fa\u0001\u0000\u0000\u0000\u03fd\u0401"+
		"\u0005\u016b\u0000\u0000\u03fe\u0400\u0003T*\u0000\u03ff\u03fe\u0001\u0000"+
		"\u0000\u0000\u0400\u0403\u0001\u0000\u0000\u0000\u0401\u03ff\u0001\u0000"+
		"\u0000\u0000\u0401\u0402\u0001\u0000\u0000\u0000\u0402\u0405\u0001\u0000"+
		"\u0000\u0000\u0403\u0401\u0001\u0000\u0000\u0000\u0404\u03cb\u0001\u0000"+
		"\u0000\u0000\u0404\u03e6\u0001\u0000\u0000\u0000\u0405S\u0001\u0000\u0000"+
		"\u0000\u0406\u0407\u0005\u00c8\u0000\u0000\u0407\u0410\u0007\b\u0000\u0000"+
		"\u0408\u0409\u0005\u00bc\u0000\u0000\u0409\u0411\u0005\u0006\u0000\u0000"+
		"\u040a\u0411\u0005\u00e7\u0000\u0000\u040b\u040c\u0005\u0100\u0000\u0000"+
		"\u040c\u0411\u0005\u00c3\u0000\u0000\u040d\u040e\u0005\u0100\u0000\u0000"+
		"\u040e\u0411\u0005K\u0000\u0000\u040f\u0411\u0005\"\u0000\u0000\u0410"+
		"\u0408\u0001\u0000\u0000\u0000\u0410\u040a\u0001\u0000\u0000\u0000\u0410"+
		"\u040b\u0001\u0000\u0000\u0000\u0410\u040d\u0001\u0000\u0000\u0000\u0410"+
		"\u040f\u0001\u0000\u0000\u0000\u0411U\u0001\u0000\u0000\u0000\u0412\u0414"+
		"\u0003X,\u0000\u0413\u0412\u0001\u0000\u0000\u0000\u0414\u0415\u0001\u0000"+
		"\u0000\u0000\u0415\u0413\u0001\u0000\u0000\u0000\u0415\u0416\u0001\u0000"+
		"\u0000\u0000\u0416W\u0001\u0000\u0000\u0000\u0417\u0418\u0005\u015a\u0000"+
		"\u0000\u0418\u041b\u0003Z-\u0000\u0419\u041b\u0003f3\u0000\u041a\u0417"+
		"\u0001\u0000\u0000\u0000\u041a\u0419\u0001\u0000\u0000\u0000\u041bY\u0001"+
		"\u0000\u0000\u0000\u041c\u041e\u0005\u00bc\u0000\u0000\u041d\u041c\u0001"+
		"\u0000\u0000\u0000\u041d\u041e\u0001\u0000\u0000\u0000\u041e\u041f\u0001"+
		"\u0000\u0000\u0000\u041f\u0420\u0007\t\u0000\u0000\u0420[\u0001\u0000"+
		"\u0000\u0000\u0421\u0423\u0003^/\u0000\u0422\u0421\u0001\u0000\u0000\u0000"+
		"\u0423\u0424\u0001\u0000\u0000\u0000\u0424\u0422\u0001\u0000\u0000\u0000"+
		"\u0424\u0425\u0001\u0000\u0000\u0000\u0425]\u0001\u0000\u0000\u0000\u0426"+
		"\u0427\u0005\u00c8\u0000\u0000\u0427\u0428\u00052\u0000\u0000\u0428\u0429"+
		"\u0007\n\u0000\u0000\u0429\u0431\u0005\u00f2\u0000\u0000\u042a\u0431\u0003"+
		"`0\u0000\u042b\u0431\u0003b1\u0000\u042c\u0431\u0003d2\u0000\u042d\u0431"+
		"\u0003f3\u0000\u042e\u0431\u0003l6\u0000\u042f\u0431\u0003n7\u0000\u0430"+
		"\u0426\u0001\u0000\u0000\u0000\u0430\u042a\u0001\u0000\u0000\u0000\u0430"+
		"\u042b\u0001\u0000\u0000\u0000\u0430\u042c\u0001\u0000\u0000\u0000\u0430"+
		"\u042d\u0001\u0000\u0000\u0000\u0430\u042e\u0001\u0000\u0000\u0000\u0430"+
		"\u042f\u0001\u0000\u0000\u0000\u0431_\u0001\u0000\u0000\u0000\u0432\u0433"+
		"\u0005\u00fd\u0000\u0000\u0433\u0434\u0005<\u0000\u0000\u0434\u0445\u0007"+
		"\u000b\u0000\u0000\u0435\u0436\u0007\f\u0000\u0000\u0436\u0445\u0005\u0172"+
		"\u0000\u0000\u0437\u0445\u0005\u00be\u0000\u0000\u0438\u0445\u0007\r\u0000"+
		"\u0000\u0439\u043a\u0005\u0113\u0000\u0000\u043a\u043d\u0005\u0168\u0000"+
		"\u0000\u043b\u043e\u0003\u01b8\u00dc\u0000\u043c\u043e\u0005\u0172\u0000"+
		"\u0000\u043d\u043b\u0001\u0000\u0000\u0000\u043d\u043c\u0001\u0000\u0000"+
		"\u0000\u043e\u043f\u0001\u0000\u0000\u0000\u043f\u043d\u0001\u0000\u0000"+
		"\u0000\u043f\u0440\u0001\u0000\u0000\u0000\u0440\u0441\u0001\u0000\u0000"+
		"\u0000\u0441\u0445\u0005\u016b\u0000\u0000\u0442\u0443\u0005\u011c\u0000"+
		"\u0000\u0443\u0445\u0003\u01b8\u00dc\u0000\u0444\u0432\u0001\u0000\u0000"+
		"\u0000\u0444\u0435\u0001\u0000\u0000\u0000\u0444\u0437\u0001\u0000\u0000"+
		"\u0000\u0444\u0438\u0001\u0000\u0000\u0000\u0444\u0439\u0001\u0000\u0000"+
		"\u0000\u0444\u0442\u0001\u0000\u0000\u0000\u0445a\u0001\u0000\u0000\u0000"+
		"\u0446\u0448\u0005\u008b\u0000\u0000\u0447\u0446\u0001\u0000\u0000\u0000"+
		"\u0447\u0448\u0001\u0000\u0000\u0000\u0448\u0449\u0001\u0000\u0000\u0000"+
		"\u0449\u044a\u0005\u0089\u0000\u0000\u044a\u0468\u0003\u01b8\u00dc\u0000"+
		"\u044b\u044c\u0005\u013a\u0000\u0000\u044c\u0468\u0005\u00e5\u0000\u0000"+
		"\u044d\u044e\u0005Y\u0000\u0000\u044e\u044f\u0005\u001e\u0000\u0000\u044f"+
		"\u0450\u0005\u0080\u0000\u0000\u0450\u0451\u0005\u0168\u0000\u0000\u0451"+
		"\u0456\u0003\u01b8\u00dc\u0000\u0452\u0453\u0005\u015a\u0000\u0000\u0453"+
		"\u0455\u0003\u01b8\u00dc\u0000\u0454\u0452\u0001\u0000\u0000\u0000\u0455"+
		"\u0458\u0001\u0000\u0000\u0000\u0456\u0454\u0001\u0000\u0000\u0000\u0456"+
		"\u0457\u0001\u0000\u0000\u0000\u0457\u0459\u0001\u0000\u0000\u0000\u0458"+
		"\u0456\u0001\u0000\u0000\u0000\u0459\u045a\u0005\u016b\u0000\u0000\u045a"+
		"\u0468\u0001\u0000\u0000\u0000\u045b\u045d\u0005\u00c1\u0000\u0000\u045c"+
		"\u045b\u0001\u0000\u0000\u0000\u045c\u045d\u0001\u0000\u0000\u0000\u045d"+
		"\u045e\u0001\u0000\u0000\u0000\u045e\u0468\u0005\u00ac\u0000\u0000\u045f"+
		"\u0460\u00053\u0000\u0000\u0460\u0468\u0007\u000e\u0000\u0000\u0461\u0462"+
		"\u0005O\u0000\u0000\u0462\u0468\u0005\u00c9\u0000\u0000\u0463\u0464\u0005"+
		"\u013a\u0000\u0000\u0464\u0465\u0005\u00e7\u0000\u0000\u0465\u0466\u0005"+
		"\u00c8\u0000\u0000\u0466\u0468\u0005\\\u0000\u0000\u0467\u0447\u0001\u0000"+
		"\u0000\u0000\u0467\u044b\u0001\u0000\u0000\u0000\u0467\u044d\u0001\u0000"+
		"\u0000\u0000\u0467\u045c\u0001\u0000\u0000\u0000\u0467\u045f\u0001\u0000"+
		"\u0000\u0000\u0467\u0461\u0001\u0000\u0000\u0000\u0467\u0463\u0001\u0000"+
		"\u0000\u0000\u0468c\u0001\u0000\u0000\u0000\u0469\u046b\u0005\u012b\u0000"+
		"\u0000\u046a\u0469\u0001\u0000\u0000\u0000\u046a\u046b\u0001\u0000\u0000"+
		"\u0000\u046b\u046c\u0001\u0000\u0000\u0000\u046c\u046d\u0005\u00d9\u0000"+
		"\u0000\u046d\u046e\u0005\u008b\u0000\u0000\u046e\u046f\u0005\u0168\u0000"+
		"\u0000\u046f\u0474\u0003\u01b8\u00dc\u0000\u0470\u0471\u0005\u015a\u0000"+
		"\u0000\u0471\u0473\u0003\u01b8\u00dc\u0000\u0472\u0470\u0001\u0000\u0000"+
		"\u0000\u0473\u0476\u0001\u0000\u0000\u0000\u0474\u0472\u0001\u0000\u0000"+
		"\u0000\u0474\u0475\u0001\u0000\u0000\u0000\u0475\u0477\u0001\u0000\u0000"+
		"\u0000\u0476\u0474\u0001\u0000\u0000\u0000\u0477\u0478\u0005\u016b\u0000"+
		"\u0000\u0478\u047c\u0001\u0000\u0000\u0000\u0479\u047a\u0005\u013a\u0000"+
		"\u0000\u047a\u047c\u0005C\u0000\u0000\u047b\u046a\u0001\u0000\u0000\u0000"+
		"\u047b\u0479\u0001\u0000\u0000\u0000\u047ce\u0001\u0000\u0000\u0000\u047d"+
		"\u0482\u0003h4\u0000\u047e\u047f\u0005\u0114\u0000\u0000\u047f\u0480\u0005"+
		"\u000e\u0000\u0000\u0480\u0482\u0003\u01b8\u00dc\u0000\u0481\u047d\u0001"+
		"\u0000\u0000\u0000\u0481\u047e\u0001\u0000\u0000\u0000\u0482g\u0001\u0000"+
		"\u0000\u0000\u0483\u0484\u0005\u00f1\u0000\u0000\u0484\u0485\u0005u\u0000"+
		"\u0000\u0485\u0489\u0005Q\u0000\u0000\u0486\u0488\u0003j5\u0000\u0487"+
		"\u0486\u0001\u0000\u0000\u0000\u0488\u048b\u0001\u0000\u0000\u0000\u0489"+
		"\u0487\u0001\u0000\u0000\u0000\u0489\u048a\u0001\u0000\u0000\u0000\u048a"+
		"i\u0001\u0000\u0000\u0000\u048b\u0489\u0001\u0000\u0000\u0000\u048c\u048d"+
		"\u0005o\u0000\u0000\u048d\u048e\u0005\u011e\u0000\u0000\u048e\u048f\u0005"+
		"\u001e\u0000\u0000\u048f\u0493\u0003\u0180\u00c0\u0000\u0490\u0491\u0005"+
		"d\u0000\u0000\u0491\u0492\u0005\u001e\u0000\u0000\u0492\u0494\u0003\u0180"+
		"\u00c0\u0000\u0493\u0490\u0001\u0000\u0000\u0000\u0493\u0494\u0001\u0000"+
		"\u0000\u0000\u0494\u04a8\u0001\u0000\u0000\u0000\u0495\u0496\u0005.\u0000"+
		"\u0000\u0496\u0497\u0005\u009b\u0000\u0000\u0497\u0498\u0005\u011e\u0000"+
		"\u0000\u0498\u0499\u0005\u001e\u0000\u0000\u0499\u04a8\u0003\u0180\u00c0"+
		"\u0000\u049a\u049b\u0005\u00af\u0000\u0000\u049b\u049c\u0005\u009f\u0000"+
		"\u0000\u049c\u049d\u0005\u011e\u0000\u0000\u049d\u049e\u0005\u001e\u0000"+
		"\u0000\u049e\u04a8\u0003\u0180\u00c0\u0000\u049f\u04a0\u0005\u00a5\u0000"+
		"\u0000\u04a0\u04a1\u0005\u011e\u0000\u0000\u04a1\u04a2\u0005\u001e\u0000"+
		"\u0000\u04a2\u04a8\u0003\u0180\u00c0\u0000\u04a3\u04a4\u0005\u00c3\u0000"+
		"\u0000\u04a4\u04a5\u0005M\u0000\u0000\u04a5\u04a6\u0005\u000e\u0000\u0000"+
		"\u04a6\u04a8\u0003\u0180\u00c0\u0000\u04a7\u048c\u0001\u0000\u0000\u0000"+
		"\u04a7\u0495\u0001\u0000\u0000\u0000\u04a7\u049a\u0001\u0000\u0000\u0000"+
		"\u04a7\u049f\u0001\u0000\u0000\u0000\u04a7\u04a3\u0001\u0000\u0000\u0000"+
		"\u04a8k\u0001\u0000\u0000\u0000\u04a9\u04aa\u0005\u00c8\u0000\u0000\u04aa"+
		"\u04ae\u0003\u01b8\u00dc\u0000\u04ab\u04ac\u0005\u011f\u0000\u0000\u04ac"+
		"\u04ae\u0003\u01b8\u00dc\u0000\u04ad\u04a9\u0001\u0000\u0000\u0000\u04ad"+
		"\u04ab\u0001\u0000\u0000\u0000\u04aem\u0001\u0000\u0000\u0000\u04af\u04b1"+
		"\u0005\u0012\u0000\u0000\u04b0\u04b2\u0005\u015e\u0000\u0000\u04b1\u04b0"+
		"\u0001\u0000\u0000\u0000\u04b1\u04b2\u0001\u0000\u0000\u0000\u04b2\u04b3"+
		"\u0001\u0000\u0000\u0000\u04b3\u04cb\u0003\u0180\u00c0\u0000\u04b4\u04b6"+
		"\u00050\u0000\u0000\u04b5\u04b7\u0005\u015e\u0000\u0000\u04b6\u04b5\u0001"+
		"\u0000\u0000\u0000\u04b6\u04b7\u0001\u0000\u0000\u0000\u04b7\u04b8\u0001"+
		"\u0000\u0000\u0000\u04b8\u04cb\u0003\u0180\u00c0\u0000\u04b9\u04bb\u0005"+
		"K\u0000\u0000\u04ba\u04b9\u0001\u0000\u0000\u0000\u04ba\u04bb\u0001\u0000"+
		"\u0000\u0000\u04bb\u04bf\u0001\u0000\u0000\u0000\u04bc\u04bd\u0005\'\u0000"+
		"\u0000\u04bd\u04c0\u0005\u0100\u0000\u0000\u04be\u04c0\u0005(\u0000\u0000"+
		"\u04bf\u04bc\u0001\u0000\u0000\u0000\u04bf\u04be\u0001\u0000\u0000\u0000"+
		"\u04c0\u04c2\u0001\u0000\u0000\u0000\u04c1\u04c3\u0005\u015e\u0000\u0000"+
		"\u04c2\u04c1\u0001\u0000\u0000\u0000\u04c2\u04c3\u0001\u0000\u0000\u0000"+
		"\u04c3\u04c4\u0001\u0000\u0000\u0000\u04c4\u04cb\u0003\u0180\u00c0\u0000"+
		"\u04c5\u04c7\u0005c\u0000\u0000\u04c6\u04c8\u0005\u015e\u0000\u0000\u04c7"+
		"\u04c6\u0001\u0000\u0000\u0000\u04c7\u04c8\u0001\u0000\u0000\u0000\u04c8"+
		"\u04c9\u0001\u0000\u0000\u0000\u04c9\u04cb\u0003\u0180\u00c0\u0000\u04ca"+
		"\u04af\u0001\u0000\u0000\u0000\u04ca\u04b4\u0001\u0000\u0000\u0000\u04ca"+
		"\u04ba\u0001\u0000\u0000\u0000\u04ca\u04c5\u0001\u0000\u0000\u0000\u04cb"+
		"o\u0001\u0000\u0000\u0000\u04cc\u04cd\u0005\n\u0000\u0000\u04cd\u04ce"+
		"\u0005\u011b\u0000\u0000\u04ce\u04cf\u0003\u014a\u00a5\u0000\u04cf\u04d0"+
		"\u0003r9\u0000\u04d0q\u0001\u0000\u0000\u0000\u04d1\u04d2\u0003t:\u0000"+
		"\u04d2s\u0001\u0000\u0000\u0000\u04d3\u04d6\u0005\u0007\u0000\u0000\u04d4"+
		"\u04d5\u00056\u0000\u0000\u04d5\u04d7\u0003\u01b8\u00dc\u0000\u04d6\u04d4"+
		"\u0001\u0000\u0000\u0000\u04d6\u04d7\u0001\u0000\u0000\u0000\u04d7\u04d8"+
		"\u0001\u0000\u0000\u0000\u04d8\u04d9\u0003v;\u0000\u04d9u\u0001\u0000"+
		"\u0000\u0000\u04da\u04db\u0005\u00d9\u0000\u0000\u04db\u04dd\u0005\u009e"+
		"\u0000\u0000\u04dc\u04de\u0005+\u0000\u0000\u04dd\u04dc\u0001\u0000\u0000"+
		"\u0000\u04dd\u04de\u0001\u0000\u0000\u0000\u04de\u04df\u0001\u0000\u0000"+
		"\u0000\u04df\u04e0\u0005\u0168\u0000\u0000\u04e0\u04e2\u0003\u01b8\u00dc"+
		"\u0000\u04e1\u04e3\u0007\u0007\u0000\u0000\u04e2\u04e1\u0001\u0000\u0000"+
		"\u0000\u04e2\u04e3\u0001\u0000\u0000\u0000\u04e3\u04eb\u0001\u0000\u0000"+
		"\u0000\u04e4\u04e5\u0005\u015a\u0000\u0000\u04e5\u04e7\u0003\u01b8\u00dc"+
		"\u0000\u04e6\u04e8\u0007\u0007\u0000\u0000\u04e7\u04e6\u0001\u0000\u0000"+
		"\u0000\u04e7\u04e8\u0001\u0000\u0000\u0000\u04e8\u04ea\u0001\u0000\u0000"+
		"\u0000\u04e9\u04e4\u0001\u0000\u0000\u0000\u04ea\u04ed\u0001\u0000\u0000"+
		"\u0000\u04eb\u04e9\u0001\u0000\u0000\u0000\u04eb\u04ec\u0001\u0000\u0000"+
		"\u0000\u04ec\u04ee\u0001\u0000\u0000\u0000\u04ed\u04eb\u0001\u0000\u0000"+
		"\u0000\u04ee\u04f0\u0005\u016b\u0000\u0000\u04ef\u04f1\u0005a\u0000\u0000"+
		"\u04f0\u04ef\u0001\u0000\u0000\u0000\u04f0\u04f1\u0001\u0000\u0000\u0000"+
		"\u04f1\u04f3\u0001\u0000\u0000\u0000\u04f2\u04f4\u0003\u00eew\u0000\u04f3"+
		"\u04f2\u0001\u0000\u0000\u0000\u04f3\u04f4\u0001\u0000\u0000\u0000\u04f4"+
		"\u0519\u0001\u0000\u0000\u0000\u04f5\u04f6\u0005t\u0000\u0000\u04f6\u04f7"+
		"\u0005\u009e\u0000\u0000\u04f7\u04f8\u0005\u0168\u0000\u0000\u04f8\u04fd"+
		"\u0003\u01b8\u00dc\u0000\u04f9\u04fa\u0005\u015a\u0000\u0000\u04fa\u04fc"+
		"\u0003\u01b8\u00dc\u0000\u04fb\u04f9\u0001\u0000\u0000\u0000\u04fc\u04ff"+
		"\u0001\u0000\u0000\u0000\u04fd\u04fb\u0001\u0000\u0000\u0000\u04fd\u04fe"+
		"\u0001\u0000\u0000\u0000\u04fe\u0500\u0001\u0000\u0000\u0000\u04ff\u04fd"+
		"\u0001\u0000\u0000\u0000\u0500\u0501\u0005\u016b\u0000\u0000\u0501\u0502"+
		"\u0005\u00e3\u0000\u0000\u0502\u0503\u0003\u014a\u00a5\u0000\u0503\u0504"+
		"\u0005\u0168\u0000\u0000\u0504\u0509\u0003\u01b8\u00dc\u0000\u0505\u0506"+
		"\u0005\u015a\u0000\u0000\u0506\u0508\u0003\u01b8\u00dc\u0000\u0507\u0505"+
		"\u0001\u0000\u0000\u0000\u0508\u050b\u0001\u0000\u0000\u0000\u0509\u0507"+
		"\u0001\u0000\u0000\u0000\u0509\u050a\u0001\u0000\u0000\u0000\u050a\u050c"+
		"\u0001\u0000\u0000\u0000\u050b\u0509\u0001\u0000\u0000\u0000\u050c\u0510"+
		"\u0005\u016b\u0000\u0000\u050d\u050f\u0003T*\u0000\u050e\u050d\u0001\u0000"+
		"\u0000\u0000\u050f\u0512\u0001\u0000\u0000\u0000\u0510\u050e\u0001\u0000"+
		"\u0000\u0000\u0510\u0511\u0001\u0000\u0000\u0000\u0511\u0519\u0001\u0000"+
		"\u0000\u0000\u0512\u0510\u0001\u0000\u0000\u0000\u0513\u0514\u0005K\u0000"+
		"\u0000\u0514\u0515\u0003\u0180\u00c0\u0000\u0515\u0516\u0005s\u0000\u0000"+
		"\u0516\u0517\u0003\u01b8\u00dc\u0000\u0517\u0519\u0001\u0000\u0000\u0000"+
		"\u0518\u04da\u0001\u0000\u0000\u0000\u0518\u04f5\u0001\u0000\u0000\u0000"+
		"\u0518\u0513\u0001\u0000\u0000\u0000\u0519w\u0001\u0000\u0000\u0000\u051a"+
		"\u0549\u0005&\u0000\u0000\u051b\u0549\u0005\'\u0000\u0000\u051c\u0549"+
		"\u0005\u0017\u0000\u0000\u051d\u0549\u0005\u0018\u0000\u0000\u051e\u0549"+
		"\u0005\u0019\u0000\u0000\u051f\u0549\u0005\u001a\u0000\u0000\u0520\u0549"+
		"\u0005\u001b\u0000\u0000\u0521\u0549\u0005D\u0000\u0000\u0522\u0549\u0005"+
		"E\u0000\u0000\u0523\u0549\u0005H\u0000\u0000\u0524\u0549\u0005I\u0000"+
		"\u0000\u0525\u0527\u0005[\u0000\u0000\u0526\u0528\u0005\u00d7\u0000\u0000"+
		"\u0527\u0526\u0001\u0000\u0000\u0000\u0527\u0528\u0001\u0000\u0000\u0000"+
		"\u0528\u0549\u0001\u0000\u0000\u0000\u0529\u0549\u0005r\u0000\u0000\u052a"+
		"\u0549\u0005\u0090\u0000\u0000\u052b\u0549\u0005\u0091\u0000\u0000\u052c"+
		"\u0549\u0005\u0092\u0000\u0000\u052d\u0549\u0005\u0093\u0000\u0000\u052e"+
		"\u0549\u0005\u0094\u0000\u0000\u052f\u0549\u0005\u00b9\u0000\u0000\u0530"+
		"\u0549\u0005\u00bb\u0000\u0000\u0531\u0549\u0005\u00c5\u0000\u0000\u0532"+
		"\u0549\u0005\u00c4\u0000\u0000\u0533\u0549\u0005\u00d6\u0000\u0000\u0534"+
		"\u0549\u0005\u00e2\u0000\u0000\u0535\u0536\u0005\u00e9\u0000\u0000\u0536"+
		"\u0549\u0005\u0135\u0000\u0000\u0537\u0549\u0005\u0107\u0000\u0000\u0538"+
		"\u0549\u0005\u0106\u0000\u0000\u0539\u0549\u0005\u0108\u0000\u0000\u053a"+
		"\u0549\u0005\u010a\u0000\u0000\u053b\u0549\u0005\u0109\u0000\u0000\u053c"+
		"\u0549\u0005\u0115\u0000\u0000\u053d\u0549\u0005\u011a\u0000\u0000\u053e"+
		"\u0549\u0005\u0121\u0000\u0000\u053f\u0549\u0005\u0122\u0000\u0000\u0540"+
		"\u0549\u0005\u0133\u0000\u0000\u0541\u0549\u0005\u0134\u0000\u0000\u0542"+
		"\u0549\u0005\u013e\u0000\u0000\u0543\u0546\u0003\u01b8\u00dc\u0000\u0544"+
		"\u0545\u0005\u0003\u0000\u0000\u0545\u0547\u0007\u000f\u0000\u0000\u0546"+
		"\u0544\u0001\u0000\u0000\u0000\u0546\u0547\u0001\u0000\u0000\u0000\u0547"+
		"\u0549\u0001\u0000\u0000\u0000\u0548\u051a\u0001\u0000\u0000\u0000\u0548"+
		"\u051b\u0001\u0000\u0000\u0000\u0548\u051c\u0001\u0000\u0000\u0000\u0548"+
		"\u051d\u0001\u0000\u0000\u0000\u0548\u051e\u0001\u0000\u0000\u0000\u0548"+
		"\u051f\u0001\u0000\u0000\u0000\u0548\u0520\u0001\u0000\u0000\u0000\u0548"+
		"\u0521\u0001\u0000\u0000\u0000\u0548\u0522\u0001\u0000\u0000\u0000\u0548"+
		"\u0523\u0001\u0000\u0000\u0000\u0548\u0524\u0001\u0000\u0000\u0000\u0548"+
		"\u0525\u0001\u0000\u0000\u0000\u0548\u0529\u0001\u0000\u0000\u0000\u0548"+
		"\u052a\u0001\u0000\u0000\u0000\u0548\u052b\u0001\u0000\u0000\u0000\u0548"+
		"\u052c\u0001\u0000\u0000\u0000\u0548\u052d\u0001\u0000\u0000\u0000\u0548"+
		"\u052e\u0001\u0000\u0000\u0000\u0548\u052f\u0001\u0000\u0000\u0000\u0548"+
		"\u0530\u0001\u0000\u0000\u0000\u0548\u0531\u0001\u0000\u0000\u0000\u0548"+
		"\u0532\u0001\u0000\u0000\u0000\u0548\u0533\u0001\u0000\u0000\u0000\u0548"+
		"\u0534\u0001\u0000\u0000\u0000\u0548\u0535\u0001\u0000\u0000\u0000\u0548"+
		"\u0537\u0001\u0000\u0000\u0000\u0548\u0538\u0001\u0000\u0000\u0000\u0548"+
		"\u0539\u0001\u0000\u0000\u0000\u0548\u053a\u0001\u0000\u0000\u0000\u0548"+
		"\u053b\u0001\u0000\u0000\u0000\u0548\u053c\u0001\u0000\u0000\u0000\u0548"+
		"\u053d\u0001\u0000\u0000\u0000\u0548\u053e\u0001\u0000\u0000\u0000\u0548"+
		"\u053f\u0001\u0000\u0000\u0000\u0548\u0540\u0001\u0000\u0000\u0000\u0548"+
		"\u0541\u0001\u0000\u0000\u0000\u0548\u0542\u0001\u0000\u0000\u0000\u0548"+
		"\u0543\u0001\u0000\u0000\u0000\u0549y\u0001\u0000\u0000\u0000\u054a\u054b"+
		"\u0005\u0168\u0000\u0000\u054b\u054d\u0007\u0010\u0000\u0000\u054c\u054e"+
		"\u0007\u0011\u0000\u0000\u054d\u054c\u0001\u0000\u0000\u0000\u054d\u054e"+
		"\u0001\u0000\u0000\u0000\u054e\u0551\u0001\u0000\u0000\u0000\u054f\u0550"+
		"\u0005\u015a\u0000\u0000\u0550\u0552\u0005\u0172\u0000\u0000\u0551\u054f"+
		"\u0001\u0000\u0000\u0000\u0551\u0552\u0001\u0000\u0000\u0000\u0552\u0553"+
		"\u0001\u0000\u0000\u0000\u0553\u0554\u0005\u016b\u0000\u0000\u0554{\u0001"+
		"\u0000\u0000\u0000\u0555\u0557\u0005\u00c1\u0000\u0000\u0556\u0555\u0001"+
		"\u0000\u0000\u0000\u0556\u0557\u0001\u0000\u0000\u0000\u0557\u0558\u0001"+
		"\u0000\u0000\u0000\u0558\u0561\u0005\u00c3\u0000\u0000\u0559\u055a\u0005"+
		"\'\u0000\u0000\u055a\u055b\u0005\u0100\u0000\u0000\u055b\u0561\u0003\u01b8"+
		"\u00dc\u0000\u055c\u055e\u0005\u00c1\u0000\u0000\u055d\u055c\u0001\u0000"+
		"\u0000\u0000\u055d\u055e\u0001\u0000\u0000\u0000\u055e\u055f\u0001\u0000"+
		"\u0000\u0000\u055f\u0561\u0007\u0012\u0000\u0000\u0560\u0556\u0001\u0000"+
		"\u0000\u0000\u0560\u0559\u0001\u0000\u0000\u0000\u0560\u055d\u0001\u0000"+
		"\u0000\u0000\u0561}\u0001\u0000\u0000\u0000\u0562\u0564\u0005\u0159\u0000"+
		"\u0000\u0563\u0562\u0001\u0000\u0000\u0000\u0563\u0564\u0001\u0000\u0000"+
		"\u0000\u0564\u0565\u0001\u0000\u0000\u0000\u0565\u0566\u0005\u015e\u0000"+
		"\u0000\u0566\u056f\u0003\u0180\u00c0\u0000\u0567\u0569\u0005\u013a\u0000"+
		"\u0000\u0568\u0567\u0001\u0000\u0000\u0000\u0568\u0569\u0001\u0000\u0000"+
		"\u0000\u0569\u056a\u0001\u0000\u0000\u0000\u056a\u056c\u0005K\u0000\u0000"+
		"\u056b\u056d\u0003\u0180\u00c0\u0000\u056c\u056b\u0001\u0000\u0000\u0000"+
		"\u056c\u056d\u0001\u0000\u0000\u0000\u056d\u056f\u0001\u0000\u0000\u0000"+
		"\u056e\u0563\u0001\u0000\u0000\u0000\u056e\u0568\u0001\u0000\u0000\u0000"+
		"\u056f\u007f\u0001\u0000\u0000\u0000\u0570\u0571\u0005;\u0000\u0000\u0571"+
		"\u0575\u0007\u0013\u0000\u0000\u0572\u0573\u0005\u0086\u0000\u0000\u0573"+
		"\u0574\u0005\u00c1\u0000\u0000\u0574\u0576\u0005j\u0000\u0000\u0575\u0572"+
		"\u0001\u0000\u0000\u0000\u0575\u0576\u0001\u0000\u0000\u0000\u0576\u0577"+
		"\u0001\u0000\u0000\u0000\u0577\u057b\u0003\u0180\u00c0\u0000\u0578\u057a"+
		"\u0003\u0082A\u0000\u0579\u0578\u0001\u0000\u0000\u0000\u057a\u057d\u0001"+
		"\u0000\u0000\u0000\u057b\u0579\u0001\u0000\u0000\u0000\u057b\u057c\u0001"+
		"\u0000\u0000\u0000\u057c\u0081\u0001\u0000\u0000\u0000\u057d\u057b\u0001"+
		"\u0000\u0000\u0000\u057e\u057f\u00050\u0000\u0000\u057f\u0583\u0003\u0180"+
		"\u00c0\u0000\u0580\u0581\u0005\u00a7\u0000\u0000\u0581\u0583\u0003\u0180"+
		"\u00c0\u0000\u0582\u057e\u0001\u0000\u0000\u0000\u0582\u0580\u0001\u0000"+
		"\u0000\u0000\u0583\u0083\u0001\u0000\u0000\u0000\u0584\u058c\u0005\n\u0000"+
		"\u0000\u0585\u0588\u0005;\u0000\u0000\u0586\u0587\u0005\u00cb\u0000\u0000"+
		"\u0587\u0589\u0005\u00e5\u0000\u0000\u0588\u0586\u0001\u0000\u0000\u0000"+
		"\u0588\u0589\u0001\u0000\u0000\u0000\u0589\u058c\u0001\u0000\u0000\u0000"+
		"\u058a\u058c\u0005\u00e5\u0000\u0000\u058b\u0584\u0001\u0000\u0000\u0000"+
		"\u058b\u0585\u0001\u0000\u0000\u0000\u058b\u058a\u0001\u0000\u0000\u0000"+
		"\u058b\u058c\u0001\u0000\u0000\u0000\u058c\u058d\u0001\u0000\u0000\u0000"+
		"\u058d\u058e\u0005y\u0000\u0000\u058e\u0590\u0003\u01b8\u00dc\u0000\u058f"+
		"\u0591\u0003\u0096K\u0000\u0590\u058f\u0001\u0000\u0000\u0000\u0590\u0591"+
		"\u0001\u0000\u0000\u0000\u0591\u0592\u0001\u0000\u0000\u0000\u0592\u0594"+
		"\u0003\u0086C\u0000\u0593\u0595\u0007\u0014\u0000\u0000\u0594\u0593\u0001"+
		"\u0000\u0000\u0000\u0594\u0595\u0001\u0000\u0000\u0000\u0595\u0597\u0001"+
		"\u0000\u0000\u0000\u0596\u0598\u00030\u0018\u0000\u0597\u0596\u0001\u0000"+
		"\u0000\u0000\u0597\u0598\u0001\u0000\u0000\u0000\u0598\u0599\u0001\u0000"+
		"\u0000\u0000\u0599\u059a\u0003\u0006\u0003\u0000\u059a\u0085\u0001\u0000"+
		"\u0000\u0000\u059b\u059c\u0007\u0015\u0000\u0000\u059c\u059e\u0003x<\u0000"+
		"\u059d\u059f\u0003z=\u0000\u059e\u059d\u0001\u0000\u0000\u0000\u059e\u059f"+
		"\u0001\u0000\u0000\u0000\u059f\u0087\u0001\u0000\u0000\u0000\u05a0\u05a8"+
		"\u0005\n\u0000\u0000\u05a1\u05a4\u0005;\u0000\u0000\u05a2\u05a3\u0005"+
		"\u00cb\u0000\u0000\u05a3\u05a5\u0005\u00e5\u0000\u0000\u05a4\u05a2\u0001"+
		"\u0000\u0000\u0000\u05a4\u05a5\u0001\u0000\u0000\u0000\u05a5\u05a8\u0001"+
		"\u0000\u0000\u0000\u05a6\u05a8\u0005\u00e5\u0000\u0000\u05a7\u05a0\u0001"+
		"\u0000\u0000\u0000\u05a7\u05a1\u0001\u0000\u0000\u0000\u05a7\u05a6\u0001"+
		"\u0000\u0000\u0000\u05a7\u05a8\u0001\u0000\u0000\u0000\u05a8\u05a9\u0001"+
		"\u0000\u0000\u0000\u05a9\u05aa\u0005\u00d2\u0000\u0000\u05aa\u05ab\u0003"+
		"\u01b8\u00dc\u0000\u05ab\u05ac\u0007\u0014\u0000\u0000\u05ac\u05ad\u0003"+
		"\u008aE\u0000\u05ad\u05b1\u0005b\u0000\u0000\u05ae\u05af\u0003\u01b8\u00dc"+
		"\u0000\u05af\u05b0\u0005\u016d\u0000\u0000\u05b0\u05b2\u0001\u0000\u0000"+
		"\u0000\u05b1\u05ae\u0001\u0000\u0000\u0000\u05b1\u05b2\u0001\u0000\u0000"+
		"\u0000\u05b2\u0089\u0001\u0000\u0000\u0000\u05b3\u05b4\u0003\u008cF\u0000"+
		"\u05b4\u05ba\u0005\u016d\u0000\u0000\u05b5\u05b6\u0003\u008cF\u0000\u05b6"+
		"\u05b7\u0005\u016d\u0000\u0000\u05b7\u05b9\u0001\u0000\u0000\u0000\u05b8"+
		"\u05b5\u0001\u0000\u0000\u0000\u05b9\u05bc\u0001\u0000\u0000\u0000\u05ba"+
		"\u05b8\u0001\u0000\u0000\u0000\u05ba\u05bb\u0001\u0000\u0000\u0000\u05bb"+
		"\u008b\u0001\u0000\u0000\u0000\u05bc\u05ba\u0001\u0000\u0000\u0000\u05bd"+
		"\u05cb\u00032\u0019\u0000\u05be\u05bf\u0005y\u0000\u0000\u05bf\u05c1\u0003"+
		"\u01b8\u00dc\u0000\u05c0\u05c2\u0003\u0096K\u0000\u05c1\u05c0\u0001\u0000"+
		"\u0000\u0000\u05c1\u05c2\u0001\u0000\u0000\u0000\u05c2\u05c3\u0001\u0000"+
		"\u0000\u0000\u05c3\u05c4\u0003\u0086C\u0000\u05c4\u05cb\u0001\u0000\u0000"+
		"\u0000\u05c5\u05c6\u0007\u0016\u0000\u0000\u05c6\u05c8\u0003\u01b8\u00dc"+
		"\u0000\u05c7\u05c9\u0003\u0096K\u0000\u05c8\u05c7\u0001\u0000\u0000\u0000"+
		"\u05c8\u05c9\u0001\u0000\u0000\u0000\u05c9\u05cb\u0001\u0000\u0000\u0000"+
		"\u05ca\u05bd\u0001\u0000\u0000\u0000\u05ca\u05be\u0001\u0000\u0000\u0000"+
		"\u05ca\u05c5\u0001\u0000\u0000\u0000\u05cb\u008d\u0001\u0000\u0000\u0000"+
		"\u05cc\u05d4\u0005\n\u0000\u0000\u05cd\u05d0\u0005;\u0000\u0000\u05ce"+
		"\u05cf\u0005\u00cb\u0000\u0000\u05cf\u05d1\u0005\u00e5\u0000\u0000\u05d0"+
		"\u05ce\u0001\u0000\u0000\u0000\u05d0\u05d1\u0001\u0000\u0000\u0000\u05d1"+
		"\u05d4\u0001\u0000\u0000\u0000\u05d2\u05d4\u0005\u00e5\u0000\u0000\u05d3"+
		"\u05cc\u0001\u0000\u0000\u0000\u05d3\u05cd\u0001\u0000\u0000\u0000\u05d3"+
		"\u05d2\u0001\u0000\u0000\u0000\u05d3\u05d4\u0001\u0000\u0000\u0000\u05d4"+
		"\u05d5\u0001\u0000\u0000\u0000\u05d5\u05d6\u0005\u00d2\u0000\u0000\u05d6"+
		"\u05d7\u0005\u001c\u0000\u0000\u05d7\u05d8\u0003\u01b8\u00dc\u0000\u05d8"+
		"\u05d9\u0007\u0014\u0000\u0000\u05d9\u05da\u0003\u0090H\u0000\u05da\u05de"+
		"\u0005b\u0000\u0000\u05db\u05dc\u0003\u01b8\u00dc\u0000\u05dc\u05dd\u0005"+
		"\u016d\u0000\u0000\u05dd\u05df\u0001\u0000\u0000\u0000\u05de\u05db\u0001"+
		"\u0000\u0000\u0000\u05de\u05df\u0001\u0000\u0000\u0000\u05df\u008f\u0001"+
		"\u0000\u0000\u0000\u05e0\u05e1\u0003\u0092I\u0000\u05e1\u05e7\u0005\u016d"+
		"\u0000\u0000\u05e2\u05e3\u0003\u0092I\u0000\u05e3\u05e4\u0005\u016d\u0000"+
		"\u0000\u05e4\u05e6\u0001\u0000\u0000\u0000\u05e5\u05e2\u0001\u0000\u0000"+
		"\u0000\u05e6\u05e9\u0001\u0000\u0000\u0000\u05e7\u05e5\u0001\u0000\u0000"+
		"\u0000\u05e7\u05e8\u0001\u0000\u0000\u0000\u05e8\u0091\u0001\u0000\u0000"+
		"\u0000\u05e9\u05e7\u0001\u0000\u0000\u0000\u05ea\u05ee\u00032\u0019\u0000"+
		"\u05eb\u05ee\u0003\u0084B\u0000\u05ec\u05ee\u0003\u0094J\u0000\u05ed\u05ea"+
		"\u0001\u0000\u0000\u0000\u05ed\u05eb\u0001\u0000\u0000\u0000\u05ed\u05ec"+
		"\u0001\u0000\u0000\u0000\u05ee\u0093\u0001\u0000\u0000\u0000\u05ef\u05f7"+
		"\u0005\n\u0000\u0000\u05f0\u05f3\u0005;\u0000\u0000\u05f1\u05f2\u0005"+
		"\u00cb\u0000\u0000\u05f2\u05f4\u0005\u00e5\u0000\u0000\u05f3\u05f1\u0001"+
		"\u0000\u0000\u0000\u05f3\u05f4\u0001\u0000\u0000\u0000\u05f4\u05f7\u0001"+
		"\u0000\u0000\u0000\u05f5\u05f7\u0005\u00e5\u0000\u0000\u05f6\u05ef\u0001"+
		"\u0000\u0000\u0000\u05f6\u05f0\u0001\u0000\u0000\u0000\u05f6\u05f5\u0001"+
		"\u0000\u0000\u0000\u05f6\u05f7\u0001\u0000\u0000\u0000\u05f7\u05f8\u0001"+
		"\u0000\u0000\u0000\u05f8\u05f9\u0007\u0016\u0000\u0000\u05f9\u05fb\u0003"+
		"\u01b8\u00dc\u0000\u05fa\u05fc\u0003\u0096K\u0000\u05fb\u05fa\u0001\u0000"+
		"\u0000\u0000\u05fb\u05fc\u0001\u0000\u0000\u0000\u05fc\u05fe\u0001\u0000"+
		"\u0000\u0000\u05fd\u05ff\u0003\u009aM\u0000\u05fe\u05fd\u0001\u0000\u0000"+
		"\u0000\u05fe\u05ff\u0001\u0000\u0000\u0000\u05ff\u0601\u0001\u0000\u0000"+
		"\u0000\u0600\u0602\u0007\u0014\u0000\u0000\u0601\u0600\u0001\u0000\u0000"+
		"\u0000\u0601\u0602\u0001\u0000\u0000\u0000\u0602\u0604\u0001\u0000\u0000"+
		"\u0000\u0603\u0605\u00030\u0018\u0000\u0604\u0603\u0001\u0000\u0000\u0000"+
		"\u0604\u0605\u0001\u0000\u0000\u0000\u0605\u0607\u0001\u0000\u0000\u0000"+
		"\u0606\u0608\u0003\u0116\u008b\u0000\u0607\u0606\u0001\u0000\u0000\u0000"+
		"\u0607\u0608\u0001\u0000\u0000\u0000\u0608\u0609\u0001\u0000\u0000\u0000"+
		"\u0609\u060d\u0003\n\u0005\u0000\u060a\u060b\u0003\u01b8\u00dc\u0000\u060b"+
		"\u060c\u0005\u016d\u0000\u0000\u060c\u060e\u0001\u0000\u0000\u0000\u060d"+
		"\u060a\u0001\u0000\u0000\u0000\u060d\u060e\u0001\u0000\u0000\u0000\u060e"+
		"\u0095\u0001\u0000\u0000\u0000\u060f\u0610\u0005\u0168\u0000\u0000\u0610"+
		"\u0626\u0005\u016b\u0000\u0000\u0611\u0612\u0005\u0168\u0000\u0000\u0612"+
		"\u0617\u0003\u0098L\u0000\u0613\u0614\u0005\u015a\u0000\u0000\u0614\u0616"+
		"\u0003\u0098L\u0000\u0615\u0613\u0001\u0000\u0000\u0000\u0616\u0619\u0001"+
		"\u0000\u0000\u0000\u0617\u0615\u0001\u0000\u0000\u0000\u0617\u0618\u0001"+
		"\u0000\u0000\u0000\u0618\u061a\u0001\u0000\u0000\u0000\u0619\u0617\u0001"+
		"\u0000\u0000\u0000\u061a\u061b\u0005\u016b\u0000\u0000\u061b\u0626\u0001"+
		"\u0000\u0000\u0000\u061c\u061d\u0004K\u0002\u0000\u061d\u0622\u0003\u0098"+
		"L\u0000\u061e\u061f\u0005\u015a\u0000\u0000\u061f\u0621\u0003\u0098L\u0000"+
		"\u0620\u061e\u0001\u0000\u0000\u0000\u0621\u0624\u0001\u0000\u0000\u0000"+
		"\u0622\u0620\u0001\u0000\u0000\u0000\u0622\u0623\u0001\u0000\u0000\u0000"+
		"\u0623\u0626\u0001\u0000\u0000\u0000\u0624\u0622\u0001\u0000\u0000\u0000"+
		"\u0625\u060f\u0001\u0000\u0000\u0000\u0625\u0611\u0001\u0000\u0000\u0000"+
		"\u0625\u061c\u0001\u0000\u0000\u0000\u0626\u0097\u0001\u0000\u0000\u0000"+
		"\u0627\u062d\u0005\u0089\u0000\u0000\u0628\u062d\u0005\u00cd\u0000\u0000"+
		"\u0629\u062d\u0005\u008e\u0000\u0000\u062a\u062b\u0005\u0089\u0000\u0000"+
		"\u062b\u062d\u0005\u00cd\u0000\u0000\u062c\u0627\u0001\u0000\u0000\u0000"+
		"\u062c\u0628\u0001\u0000\u0000\u0000\u062c\u0629\u0001\u0000\u0000\u0000"+
		"\u062c\u062a\u0001\u0000\u0000\u0000\u062c\u062d\u0001\u0000\u0000\u0000"+
		"\u062d\u062e\u0001\u0000\u0000\u0000\u062e\u062f\u0003\u01b8\u00dc\u0000"+
		"\u062f\u0631\u0003x<\u0000\u0630\u0632\u0003z=\u0000\u0631\u0630\u0001"+
		"\u0000\u0000\u0000\u0631\u0632\u0001\u0000\u0000\u0000\u0632\u0636\u0001"+
		"\u0000\u0000\u0000\u0633\u0635\u0003|>\u0000\u0634\u0633\u0001\u0000\u0000"+
		"\u0000\u0635\u0638\u0001\u0000\u0000\u0000\u0636\u0634\u0001\u0000\u0000"+
		"\u0000\u0636\u0637\u0001\u0000\u0000\u0000\u0637\u063a\u0001\u0000\u0000"+
		"\u0000\u0638\u0636\u0001\u0000\u0000\u0000\u0639\u063b\u0003~?\u0000\u063a"+
		"\u0639\u0001\u0000\u0000\u0000\u063a\u063b\u0001\u0000\u0000\u0000\u063b"+
		"\u0652\u0001\u0000\u0000\u0000\u063c\u0642\u0003\u01b8\u00dc\u0000\u063d"+
		"\u0643\u0005\u0089\u0000\u0000\u063e\u0643\u0005\u00cd\u0000\u0000\u063f"+
		"\u0643\u0005\u008e\u0000\u0000\u0640\u0641\u0005\u0089\u0000\u0000\u0641"+
		"\u0643\u0005\u00cd\u0000\u0000\u0642\u063d\u0001\u0000\u0000\u0000\u0642"+
		"\u063e\u0001\u0000\u0000\u0000\u0642\u063f\u0001\u0000\u0000\u0000\u0642"+
		"\u0640\u0001\u0000\u0000\u0000\u0642\u0643\u0001\u0000\u0000\u0000\u0643"+
		"\u0644\u0001\u0000\u0000\u0000\u0644\u0646\u0003x<\u0000\u0645\u0647\u0003"+
		"z=\u0000\u0646\u0645\u0001\u0000\u0000\u0000\u0646\u0647\u0001\u0000\u0000"+
		"\u0000\u0647\u064b\u0001\u0000\u0000\u0000\u0648\u064a\u0003|>\u0000\u0649"+
		"\u0648\u0001\u0000\u0000\u0000\u064a\u064d\u0001\u0000\u0000\u0000\u064b"+
		"\u0649\u0001\u0000\u0000\u0000\u064b\u064c\u0001\u0000\u0000\u0000\u064c"+
		"\u064f\u0001\u0000\u0000\u0000\u064d\u064b\u0001\u0000\u0000\u0000\u064e"+
		"\u0650\u0003~?\u0000\u064f\u064e\u0001\u0000\u0000\u0000\u064f\u0650\u0001"+
		"\u0000\u0000\u0000\u0650\u0652\u0001\u0000\u0000\u0000\u0651\u062c\u0001"+
		"\u0000\u0000\u0000\u0651\u063c\u0001\u0000\u0000\u0000\u0652\u0099\u0001"+
		"\u0000\u0000\u0000\u0653\u0655\u0003\u009cN\u0000\u0654\u0653\u0001\u0000"+
		"\u0000\u0000\u0655\u0656\u0001\u0000\u0000\u0000\u0656\u0654\u0001\u0000"+
		"\u0000\u0000\u0656\u0657\u0001\u0000\u0000\u0000\u0657\u009b\u0001\u0000"+
		"\u0000\u0000\u0658\u0659\u0005\u00a0\u0000\u0000\u0659\u0664\u0005\u010b"+
		"\u0000\u0000\u065a\u065b\u0005\u010b\u0000\u0000\u065b\u065c\u0005\u00fc"+
		"\u0000\u0000\u065c\u0664\u0007\u0017\u0000\u0000\u065d\u065f\u0005]\u0000"+
		"\u0000\u065e\u065d\u0001\u0000\u0000\u0000\u065e\u065f\u0001\u0000\u0000"+
		"\u0000\u065f\u0660\u0001\u0000\u0000\u0000\u0660\u0661\u0005\u00e8\u0000"+
		"\u0000\u0661\u0662\u0005\u0103\u0000\u0000\u0662\u0664\u0005\u0172\u0000"+
		"\u0000\u0663\u0658\u0001\u0000\u0000\u0000\u0663\u065a\u0001\u0000\u0000"+
		"\u0000\u0663\u065e\u0001\u0000\u0000\u0000\u0664\u009d\u0001\u0000\u0000"+
		"\u0000\u0665\u0666\u0005\\\u0000\u0000\u0666\u0669\u0005\u011b\u0000\u0000"+
		"\u0667\u0668\u0005\u0086\u0000\u0000\u0668\u066a\u0005j\u0000\u0000\u0669"+
		"\u0667\u0001\u0000\u0000\u0000\u0669\u066a\u0001\u0000\u0000\u0000\u066a"+
		"\u066b\u0001\u0000\u0000\u0000\u066b\u0682\u0003\u014a\u00a5\u0000\u066c"+
		"\u066d\u0005\\\u0000\u0000\u066d\u0670\u0005\u00d2\u0000\u0000\u066e\u066f"+
		"\u0005\u0086\u0000\u0000\u066f\u0671\u0005j\u0000\u0000\u0670\u066e\u0001"+
		"\u0000\u0000\u0000\u0670\u0671\u0001\u0000\u0000\u0000\u0671\u0672\u0001"+
		"\u0000\u0000\u0000\u0672\u0682\u0003\u01b8\u00dc\u0000\u0673\u0674\u0005"+
		"\\\u0000\u0000\u0674\u0677\u0007\u0018\u0000\u0000\u0675\u0676\u0005\u0086"+
		"\u0000\u0000\u0676\u0678\u0005j\u0000\u0000\u0677\u0675\u0001\u0000\u0000"+
		"\u0000\u0677\u0678\u0001\u0000\u0000\u0000\u0678\u0679\u0001\u0000\u0000"+
		"\u0000\u0679\u0682\u0003\u01b8\u00dc\u0000\u067a\u067b\u0005\\\u0000\u0000"+
		"\u067b\u067e\u0007\u0013\u0000\u0000\u067c\u067d\u0005\u0086\u0000\u0000"+
		"\u067d\u067f\u0005j\u0000\u0000\u067e\u067c\u0001\u0000\u0000\u0000\u067e"+
		"\u067f\u0001\u0000\u0000\u0000\u067f\u0680\u0001\u0000\u0000\u0000\u0680"+
		"\u0682\u0003\u0180\u00c0\u0000\u0681\u0665\u0001\u0000\u0000\u0000\u0681"+
		"\u066c\u0001\u0000\u0000\u0000\u0681\u0673\u0001\u0000\u0000\u0000\u0681"+
		"\u067a\u0001\u0000\u0000\u0000\u0682\u009f\u0001\u0000\u0000\u0000\u0683"+
		"\u0684\u0005b\u0000\u0000\u0684\u0685\u0005\u0126\u0000\u0000\u0685\u00a1"+
		"\u0001\u0000\u0000\u0000\u0686\u0688\u0007\u0019\u0000\u0000\u0687\u0689"+
		"\u0005\u0088\u0000\u0000\u0688\u0687\u0001\u0000\u0000\u0000\u0688\u0689"+
		"\u0001\u0000\u0000\u0000\u0689\u068a\u0001\u0000\u0000\u0000\u068a\u0690"+
		"\u0003\u0180\u00c0\u0000\u068b\u068c\u0005\u0168\u0000\u0000\u068c\u068d"+
		"\u0003\u01a0\u00d0\u0000\u068d\u068e\u0005\u016b\u0000\u0000\u068e\u0691"+
		"\u0001\u0000\u0000\u0000\u068f\u0691\u0003\u01a0\u00d0\u0000\u0690\u068b"+
		"\u0001\u0000\u0000\u0000\u0690\u068f\u0001\u0000\u0000\u0000\u0690\u0691"+
		"\u0001\u0000\u0000\u0000\u0691\u069b\u0001\u0000\u0000\u0000\u0692\u0693"+
		"\u0005\u0097\u0000\u0000\u0693\u0698\u0005\u016f\u0000\u0000\u0694\u0695"+
		"\u0005\u015a\u0000\u0000\u0695\u0697\u0005\u016f\u0000\u0000\u0696\u0694"+
		"\u0001\u0000\u0000\u0000\u0697\u069a\u0001\u0000\u0000\u0000\u0698\u0696"+
		"\u0001\u0000\u0000\u0000\u0698\u0699\u0001\u0000\u0000\u0000\u0699\u069c"+
		"\u0001\u0000\u0000\u0000\u069a\u0698\u0001\u0000\u0000\u0000\u069b\u0692"+
		"\u0001\u0000\u0000\u0000\u069b\u069c\u0001\u0000\u0000\u0000\u069c\u069e"+
		"\u0001\u0000\u0000\u0000\u069d\u069f\u0003\u0118\u008c\u0000\u069e\u069d"+
		"\u0001\u0000\u0000\u0000\u069e\u069f\u0001\u0000\u0000\u0000\u069f\u00a3"+
		"\u0001\u0000\u0000\u0000\u06a0\u06a4\u0003\u00a6S\u0000\u06a1\u06a4\u0003"+
		"\u00a8T\u0000\u06a2\u06a4\u0003\u00aaU\u0000\u06a3\u06a0\u0001\u0000\u0000"+
		"\u0000\u06a3\u06a1\u0001\u0000\u0000\u0000\u06a3\u06a2\u0001\u0000\u0000"+
		"\u0000\u06a4\u00a5\u0001\u0000\u0000\u0000\u06a5\u06a6\u0005\u0086\u0000"+
		"\u0000\u06a6\u06a7\u0003\u0170\u00b8\u0000\u06a7\u06a8\u0005\u0120\u0000"+
		"\u0000\u06a8\u06ac\u0003\u0002\u0001\u0000\u06a9\u06ab\u0003\u00acV\u0000"+
		"\u06aa\u06a9\u0001\u0000\u0000\u0000\u06ab\u06ae\u0001\u0000\u0000\u0000"+
		"\u06ac\u06aa\u0001\u0000\u0000\u0000\u06ac\u06ad\u0001\u0000\u0000\u0000"+
		"\u06ad\u06b0\u0001\u0000\u0000\u0000\u06ae\u06ac\u0001\u0000\u0000\u0000"+
		"\u06af\u06b1\u0003\u00aeW\u0000\u06b0\u06af\u0001\u0000\u0000\u0000\u06b0"+
		"\u06b1\u0001\u0000\u0000\u0000\u06b1\u06b2\u0001\u0000\u0000\u0000\u06b2"+
		"\u06b3\u0005b\u0000\u0000\u06b3\u06b4\u0005\u0086\u0000\u0000\u06b4\u00a7"+
		"\u0001\u0000\u0000\u0000\u06b5\u06b6\u0005\u0086\u0000\u0000\u06b6\u06b7"+
		"\u0003\u0170\u00b8\u0000\u06b7\u06ba\u0003\u0006\u0003\u0000\u06b8\u06b9"+
		"\u0005^\u0000\u0000\u06b9\u06bb\u0003\u0006\u0003\u0000\u06ba\u06b8\u0001"+
		"\u0000\u0000\u0000\u06ba\u06bb\u0001\u0000\u0000\u0000\u06bb\u00a9\u0001"+
		"\u0000\u0000\u0000\u06bc\u06bd\u0005\u0004\u0000\u0000\u06bd\u06be\u0005"+
		"\u0086\u0000\u0000\u06be\u06bf\u0003\u0170\u00b8\u0000\u06bf\u06c0\u0005"+
		"\u0120\u0000\u0000\u06c0\u06c1\u0003\u0006\u0003\u0000\u06c1\u00ab\u0001"+
		"\u0000\u0000\u0000\u06c2\u06c3\u0007\u001a\u0000\u0000\u06c3\u06c4\u0003"+
		"\u0170\u00b8\u0000\u06c4\u06c5\u0005\u0120\u0000\u0000\u06c5\u06c6\u0003"+
		"\u0002\u0001\u0000\u06c6\u00ad\u0001\u0000\u0000\u0000\u06c7\u06c8\u0005"+
		"^\u0000\u0000\u06c8\u06c9\u0003\u0002\u0001\u0000\u06c9\u00af\u0001\u0000"+
		"\u0000\u0000\u06ca\u06cd\u0005\u008a\u0000\u0000\u06cb\u06ce\u0003\u01b2"+
		"\u00d9\u0000\u06cc\u06ce\u0003\u0180\u00c0\u0000\u06cd\u06cb\u0001\u0000"+
		"\u0000\u0000\u06cd\u06cc\u0001\u0000\u0000\u0000\u06ce\u00b1\u0001\u0000"+
		"\u0000\u0000\u06cf\u06d6\u0005\u008f\u0000\u0000\u06d0\u06d1\u0005\u00d0"+
		"\u0000\u0000\u06d1\u06d7\u0005\u011b\u0000\u0000\u06d2\u06d4\u0005\u0097"+
		"\u0000\u0000\u06d3\u06d5\u0005\u011b\u0000\u0000\u06d4\u06d3\u0001\u0000"+
		"\u0000\u0000\u06d4\u06d5\u0001\u0000\u0000\u0000\u06d5\u06d7\u0001\u0000"+
		"\u0000\u0000\u06d6\u06d0\u0001\u0000\u0000\u0000\u06d6\u06d2\u0001\u0000"+
		"\u0000\u0000\u06d7\u06d8\u0001\u0000\u0000\u0000\u06d8\u06da\u0003\u014a"+
		"\u00a5\u0000\u06d9\u06db\u0003\u00b4Z\u0000\u06da\u06d9\u0001\u0000\u0000"+
		"\u0000\u06da\u06db\u0001\u0000\u0000\u0000\u06db\u06de\u0001\u0000\u0000"+
		"\u0000\u06dc\u06df\u0003\u011a\u008d\u0000\u06dd\u06df\u0003\u00b6[\u0000"+
		"\u06de\u06dc\u0001\u0000\u0000\u0000\u06de\u06dd\u0001\u0000\u0000\u0000"+
		"\u06df\u00b3\u0001\u0000\u0000\u0000\u06e0\u06e1\u0005\u0168\u0000\u0000"+
		"\u06e1\u06e6\u0003\u01b8\u00dc\u0000\u06e2\u06e3\u0005\u015a\u0000\u0000"+
		"\u06e3\u06e5\u0003\u01b8\u00dc\u0000\u06e4\u06e2\u0001\u0000\u0000\u0000"+
		"\u06e5\u06e8\u0001\u0000\u0000\u0000\u06e6\u06e4\u0001\u0000\u0000\u0000"+
		"\u06e6\u06e7\u0001\u0000\u0000\u0000\u06e7\u06e9\u0001\u0000\u0000\u0000"+
		"\u06e8\u06e6\u0001\u0000\u0000\u0000\u06e9\u06ea\u0005\u016b\u0000\u0000"+
		"\u06ea\u00b5\u0001\u0000\u0000\u0000\u06eb\u06ec\u0005\u0131\u0000\u0000"+
		"\u06ec\u06f1\u0003\u00b8\\\u0000\u06ed\u06ee\u0005\u015a\u0000\u0000\u06ee"+
		"\u06f0\u0003\u00b8\\\u0000\u06ef\u06ed\u0001\u0000\u0000\u0000\u06f0\u06f3"+
		"\u0001\u0000\u0000\u0000\u06f1\u06ef\u0001\u0000\u0000\u0000\u06f1\u06f2"+
		"\u0001\u0000\u0000\u0000\u06f2\u00b7\u0001\u0000\u0000\u0000\u06f3\u06f1"+
		"\u0001\u0000\u0000\u0000\u06f4\u06f5\u0005\u0168\u0000\u0000\u06f5\u06fa"+
		"\u0003\u0180\u00c0\u0000\u06f6\u06f7\u0005\u015a\u0000\u0000\u06f7\u06f9"+
		"\u0003\u0180\u00c0\u0000\u06f8\u06f6\u0001\u0000\u0000\u0000\u06f9\u06fc"+
		"\u0001\u0000\u0000\u0000\u06fa\u06f8\u0001\u0000\u0000\u0000\u06fa\u06fb"+
		"\u0001\u0000\u0000\u0000\u06fb\u06fd\u0001\u0000\u0000\u0000\u06fc\u06fa"+
		"\u0001\u0000\u0000\u0000\u06fd\u06fe\u0005\u016b\u0000\u0000\u06fe\u00b9"+
		"\u0001\u0000\u0000\u0000\u06ff\u0700\u0005\u008f\u0000\u0000\u0700\u0702"+
		"\u0005\u00d0\u0000\u0000\u0701\u0703\u0005\u00a6\u0000\u0000\u0702\u0701"+
		"\u0001\u0000\u0000\u0000\u0702\u0703\u0001\u0000\u0000\u0000\u0703\u0704"+
		"\u0001\u0000\u0000\u0000\u0704\u0705\u0005W\u0000\u0000\u0705\u0706\u0003"+
		"\u01a6\u00d3\u0000\u0706\u0707\u0003\u01a4\u00d2\u0000\u0707\u00bb\u0001"+
		"\u0000\u0000\u0000\u0708\u070a\u0005k\u0000\u0000\u0709\u070b\u0005\u016f"+
		"\u0000\u0000\u070a\u0709\u0001\u0000\u0000\u0000\u070a\u070b\u0001\u0000"+
		"\u0000\u0000\u070b\u070e\u0001\u0000\u0000\u0000\u070c\u070d\u0005\u0137"+
		"\u0000\u0000\u070d\u070f\u0003\u0170\u00b8\u0000\u070e\u070c\u0001\u0000"+
		"\u0000\u0000\u070e\u070f\u0001\u0000\u0000\u0000\u070f\u00bd\u0001\u0000"+
		"\u0000\u0000\u0710\u0711\u0005z\u0000\u0000\u0711\u0712\u0005U\u0000\u0000"+
		"\u0712\u0713\u0003\u00c0`\u0000\u0713\u00bf\u0001\u0000\u0000\u0000\u0714"+
		"\u0717\u0003\u00c2a\u0000\u0715\u0717\u0003\u00c4b\u0000\u0716\u0714\u0001"+
		"\u0000\u0000\u0000\u0716\u0715\u0001\u0000\u0000\u0000\u0717\u00c1\u0001"+
		"\u0000\u0000\u0000\u0718\u0719\u0005h\u0000\u0000\u0719\u071a\u0005\u0172"+
		"\u0000\u0000\u071a\u071b\u0003\u01b8\u00dc\u0000\u071b\u071c\u0005\u015e"+
		"\u0000\u0000\u071c\u071d\u0005\u00b4\u0000\u0000\u071d\u00c3\u0001\u0000"+
		"\u0000\u0000\u071e\u071f\u0003\u01b8\u00dc\u0000\u071f\u0720\u0005\u015e"+
		"\u0000\u0000\u0720\u0721\u0005\u00f4\u0000\u0000\u0721\u00c5\u0001\u0000"+
		"\u0000\u0000\u0722\u0723\u0005}\u0000\u0000\u0723\u0728\u0003\u00c8d\u0000"+
		"\u0724\u0725\u0005\u015a\u0000\u0000\u0725\u0727\u0003\u00c8d\u0000\u0726"+
		"\u0724\u0001\u0000\u0000\u0000\u0727\u072a\u0001\u0000\u0000\u0000\u0728"+
		"\u0726\u0001\u0000\u0000\u0000\u0728\u0729\u0001\u0000\u0000\u0000\u0729"+
		"\u072b\u0001\u0000\u0000\u0000\u072a\u0728\u0001\u0000\u0000\u0000\u072b"+
		"\u072c\u0005\u0124\u0000\u0000\u072c\u072d\u0005\u00ef\u0000\u0000\u072d"+
		"\u072e\u0003\u01b8\u00dc\u0000\u072e\u00c7\u0001\u0000\u0000\u0000\u072f"+
		"\u0730\u0005g\u0000\u0000\u0730\u0731\u0005\u00c8\u0000\u0000\u0731\u0732"+
		"\u0005\u00dc\u0000\u0000\u0732\u0733\u0003\u01b8\u00dc\u0000\u0733\u00c9"+
		"\u0001\u0000\u0000\u0000\u0734\u0736\u0005\u00a1\u0000\u0000\u0735\u0737"+
		"\u0005\u016f\u0000\u0000\u0736\u0735\u0001\u0000\u0000\u0000\u0736\u0737"+
		"\u0001\u0000\u0000\u0000\u0737\u00cb\u0001\u0000\u0000\u0000\u0738\u0739"+
		"\u0005\u00af\u0000\u0000\u0739\u073a\u0005\u00c6\u0000\u0000\u073a\u073d"+
		"\u0003\u0180\u00c0\u0000\u073b\u073c\u0005\u0124\u0000\u0000\u073c\u073e"+
		"\u0003\u0180\u00c0\u0000\u073d\u073b\u0001\u0000\u0000\u0000\u073d\u073e"+
		"\u0001\u0000\u0000\u0000\u073e\u0741\u0001\u0000\u0000\u0000\u073f\u0740"+
		"\u0005\u0011\u0000\u0000\u0740\u0742\u0003\u0180\u00c0\u0000\u0741\u073f"+
		"\u0001\u0000\u0000\u0000\u0741\u0742\u0001\u0000\u0000\u0000\u0742\u00cd"+
		"\u0001\u0000\u0000\u0000\u0743\u0744\u0005\u00ca\u0000\u0000\u0744\u074a"+
		"\u0005\u016f\u0000\u0000\u0745\u0748\u0005s\u0000\u0000\u0746\u0749\u0003"+
		"\u011a\u008d\u0000\u0747\u0749\u0003\u0180\u00c0\u0000\u0748\u0746\u0001"+
		"\u0000\u0000\u0000\u0748\u0747\u0001\u0000\u0000\u0000\u0749\u074b\u0001"+
		"\u0000\u0000\u0000\u074a\u0745\u0001\u0000\u0000\u0000\u074a\u074b\u0001"+
		"\u0000\u0000\u0000\u074b\u00cf\u0001\u0000\u0000\u0000\u074c\u074e\u0005"+
		"n\u0000\u0000\u074d\u074f\u0005w\u0000\u0000\u074e\u074d\u0001\u0000\u0000"+
		"\u0000\u074e\u074f\u0001\u0000\u0000\u0000\u074f\u0750\u0001\u0000\u0000"+
		"\u0000\u0750\u0751\u0005\u016f\u0000\u0000\u0751\u0752\u0005\u0097\u0000"+
		"\u0000\u0752\u0757\u0005\u016f\u0000\u0000\u0753\u0754\u0005\u015a\u0000"+
		"\u0000\u0754\u0756\u0005\u016f\u0000\u0000\u0755\u0753\u0001\u0000\u0000"+
		"\u0000\u0756\u0759\u0001\u0000\u0000\u0000\u0757\u0755\u0001\u0000\u0000"+
		"\u0000\u0757\u0758\u0001\u0000\u0000\u0000\u0758\u00d1\u0001\u0000\u0000"+
		"\u0000\u0759\u0757\u0001\u0000\u0000\u0000\u075a\u075b\u0005-\u0000\u0000"+
		"\u075b\u075c\u0007\u001b\u0000\u0000\u075c\u075d\u0005\u00c8\u0000\u0000"+
		"\u075d\u075f\u0003\u014a\u00a5\u0000\u075e\u0760\u0003\u00d4j\u0000\u075f"+
		"\u075e\u0001\u0000\u0000\u0000\u075f\u0760\u0001\u0000\u0000\u0000\u0760"+
		"\u00d3\u0001\u0000\u0000\u0000\u0761\u0762\u0005/\u0000\u0000\u0762\u0763"+
		"\u0005\u0168\u0000\u0000\u0763\u0768\u0003\u01b8\u00dc\u0000\u0764\u0765"+
		"\u0005\u015a\u0000\u0000\u0765\u0767\u0003\u01b8\u00dc\u0000\u0766\u0764"+
		"\u0001\u0000\u0000\u0000\u0767\u076a\u0001\u0000\u0000\u0000\u0768\u0766"+
		"\u0001\u0000\u0000\u0000\u0768\u0769\u0001\u0000\u0000\u0000\u0769\u076b"+
		"\u0001\u0000\u0000\u0000\u076a\u0768\u0001\u0000\u0000\u0000\u076b\u076c"+
		"\u0005\u016b\u0000\u0000\u076c\u00d5\u0001\u0000\u0000\u0000\u076d\u076e"+
		"\u0005*\u0000\u0000\u076e\u076f\u0005\u016f\u0000\u0000\u076f\u00d7\u0001"+
		"\u0000\u0000\u0000\u0770\u0771\u0005,\u0000\u0000\u0771\u0772\u0007\u001c"+
		"\u0000\u0000\u0772\u0773\u0003\u00dam\u0000\u0773\u0774\u0005\u015a\u0000"+
		"\u0000\u0774\u0775\u0003\u00dam\u0000\u0775\u00d9\u0001\u0000\u0000\u0000"+
		"\u0776\u0778\u0003\u014a\u00a5\u0000\u0777\u0779\u0003\u014c\u00a6\u0000"+
		"\u0778\u0777\u0001\u0000\u0000\u0000\u0778\u0779\u0001\u0000\u0000\u0000"+
		"\u0779\u077f\u0001\u0000\u0000\u0000\u077a\u077b\u0005\u0168\u0000\u0000"+
		"\u077b\u077c\u0003\u011a\u008d\u0000\u077c\u077d\u0005\u016b\u0000\u0000"+
		"\u077d\u077f\u0001\u0000\u0000\u0000\u077e\u0776\u0001\u0000\u0000\u0000"+
		"\u077e\u077a\u0001\u0000\u0000\u0000\u077f\u0782\u0001\u0000\u0000\u0000"+
		"\u0780\u0781\u0005\u0011\u0000\u0000\u0781\u0783\u0003\u01b8\u00dc\u0000"+
		"\u0782\u0780\u0001\u0000\u0000\u0000\u0782\u0783\u0001\u0000\u0000\u0000"+
		"\u0783\u00db\u0001\u0000\u0000\u0000\u0784\u0785\u00058\u0000\u0000\u0785"+
		"\u0786\u0005w\u0000\u0000\u0786\u0787\u0005\u00a6\u0000\u0000\u0787\u078c"+
		"\u0003\u00e0p\u0000\u0788\u0789\u0005\u015a\u0000\u0000\u0789\u078b\u0003"+
		"\u00e0p\u0000\u078a\u0788\u0001\u0000\u0000\u0000\u078b\u078e\u0001\u0000"+
		"\u0000\u0000\u078c\u078a\u0001\u0000\u0000\u0000\u078c\u078d\u0001\u0000"+
		"\u0000\u0000\u078d\u078f\u0001\u0000\u0000\u0000\u078e\u078c\u0001\u0000"+
		"\u0000\u0000\u078f\u0790\u0005\u0124\u0000\u0000\u0790\u0794\u0003\u00e2"+
		"q\u0000\u0791\u0793\u0003\u00e6s\u0000\u0792\u0791\u0001\u0000\u0000\u0000"+
		"\u0793\u0796\u0001\u0000\u0000\u0000\u0794\u0792\u0001\u0000\u0000\u0000"+
		"\u0794\u0795\u0001\u0000\u0000\u0000\u0795\u00dd\u0001\u0000\u0000\u0000"+
		"\u0796\u0794\u0001\u0000\u0000\u0000\u0797\u079d\u00058\u0000\u0000\u0798"+
		"\u079e\u0003\u014a\u00a5\u0000\u0799\u079a\u0005\u0168\u0000\u0000\u079a"+
		"\u079b\u0003\u011a\u008d\u0000\u079b\u079c\u0005\u016b\u0000\u0000\u079c"+
		"\u079e\u0001\u0000\u0000\u0000\u079d\u0798\u0001\u0000\u0000\u0000\u079d"+
		"\u0799\u0001\u0000\u0000\u0000\u079e\u079f\u0001\u0000\u0000\u0000\u079f"+
		"\u07a1\u0005\u0124\u0000\u0000\u07a0\u07a2\u0005\u0082\u0000\u0000\u07a1"+
		"\u07a0\u0001\u0000\u0000\u0000\u07a1\u07a2\u0001\u0000\u0000\u0000\u07a2"+
		"\u07a3\u0001\u0000\u0000\u0000\u07a3\u07a7\u0003\u00e2q\u0000\u07a4\u07a6"+
		"\u0003\u00e4r\u0000\u07a5\u07a4\u0001\u0000\u0000\u0000\u07a6\u07a9\u0001"+
		"\u0000\u0000\u0000\u07a7\u07a5\u0001\u0000\u0000\u0000\u07a7\u07a8\u0001"+
		"\u0000\u0000\u0000\u07a8\u00df\u0001\u0000\u0000\u0000\u07a9\u07a7\u0001"+
		"\u0000\u0000\u0000\u07aa\u07ad\u0003\u01b2\u00d9\u0000\u07ab\u07ad\u0003"+
		"\u0180\u00c0\u0000\u07ac\u07aa\u0001\u0000\u0000\u0000\u07ac\u07ab\u0001"+
		"\u0000\u0000\u0000\u07ad\u00e1\u0001\u0000\u0000\u0000\u07ae\u07b1\u0003"+
		"\u01b2\u00d9\u0000\u07af\u07b1\u0003\u0180\u00c0\u0000\u07b0\u07ae\u0001"+
		"\u0000\u0000\u0000\u07b0\u07af\u0001\u0000\u0000\u0000\u07b1\u00e3\u0001"+
		"\u0000\u0000\u0000\u07b2\u07b3\u0005\u0011\u0000\u0000\u07b3\u07bb\u0003"+
		"\u01b8\u00dc\u0000\u07b4\u07b5\u0005\u0014\u0000\u0000\u07b5\u07bb\u0003"+
		"\u0180\u00c0\u0000\u07b6\u07b7\u0005R\u0000\u0000\u07b7\u07bb\u0003\u0180"+
		"\u00c0\u0000\u07b8\u07b9\u0005\u010d\u0000\u0000\u07b9\u07bb\u0003\u01b8"+
		"\u00dc\u0000\u07ba\u07b2\u0001\u0000\u0000\u0000\u07ba\u07b4\u0001\u0000"+
		"\u0000\u0000\u07ba\u07b6\u0001\u0000\u0000\u0000\u07ba\u07b8\u0001\u0000"+
		"\u0000\u0000\u07bb\u00e5\u0001\u0000\u0000\u0000\u07bc\u07bd\u0007\u001d"+
		"\u0000\u0000\u07bd\u00e7\u0001\u0000\u0000\u0000\u07be\u07c0\u00052\u0000"+
		"\u0000\u07bf\u07c1\u0005\u013c\u0000\u0000\u07c0\u07bf\u0001\u0000\u0000"+
		"\u0000\u07c0\u07c1\u0001\u0000\u0000\u0000\u07c1\u00e9\u0001\u0000\u0000"+
		"\u0000\u07c2\u07c4\u0005;\u0000\u0000\u07c3\u07c5\u0005\u012b\u0000\u0000"+
		"\u07c4\u07c3\u0001\u0000\u0000\u0000\u07c4\u07c5\u0001\u0000\u0000\u0000"+
		"\u07c5\u07c6\u0001\u0000\u0000\u0000\u07c6\u07c7\u0005\u008b\u0000\u0000"+
		"\u07c7\u07c8\u0003\u01b8\u00dc\u0000\u07c8\u07c9\u0005\u00c8\u0000\u0000"+
		"\u07c9\u07ca\u0003\u014a\u00a5\u0000\u07ca\u07cb\u0005\u0168\u0000\u0000"+
		"\u07cb\u07d0\u0003\u00ecv\u0000\u07cc\u07cd\u0005\u015a\u0000\u0000\u07cd"+
		"\u07cf\u0003\u00ecv\u0000\u07ce\u07cc\u0001\u0000\u0000\u0000\u07cf\u07d2"+
		"\u0001\u0000\u0000\u0000\u07d0\u07ce\u0001\u0000\u0000\u0000\u07d0\u07d1"+
		"\u0001\u0000\u0000\u0000\u07d1\u07d3\u0001\u0000\u0000\u0000\u07d2\u07d0"+
		"\u0001\u0000\u0000\u0000\u07d3\u07d4\u0005\u016b\u0000\u0000\u07d4\u00eb"+
		"\u0001\u0000\u0000\u0000\u07d5\u07d7\u0003\u01b8\u00dc\u0000\u07d6\u07d8"+
		"\u0007\u0007\u0000\u0000\u07d7\u07d6\u0001\u0000\u0000\u0000\u07d7\u07d8"+
		"\u0001\u0000\u0000\u0000\u07d8\u00ed\u0001\u0000\u0000\u0000\u07d9\u07da"+
		"\u0003\u00f0x\u0000\u07da\u00ef\u0001\u0000\u0000\u0000\u07db\u07dc\u0005"+
		"\u013a\u0000\u0000\u07dc\u07dd\u0005\u0168\u0000\u0000\u07dd\u07de\u0003"+
		"\u01b8\u00dc\u0000\u07de\u07df\u0005\u015e\u0000\u0000\u07df\u07e7\u0003"+
		"\u01b8\u00dc\u0000\u07e0\u07e1\u0005\u015a\u0000\u0000\u07e1\u07e2\u0003"+
		"\u01b8\u00dc\u0000\u07e2\u07e3\u0005\u015e\u0000\u0000\u07e3\u07e4\u0003"+
		"\u01b8\u00dc\u0000\u07e4\u07e6\u0001\u0000\u0000\u0000\u07e5\u07e0\u0001"+
		"\u0000\u0000\u0000\u07e6\u07e9\u0001\u0000\u0000\u0000\u07e7\u07e5\u0001"+
		"\u0000\u0000\u0000\u07e7\u07e8\u0001\u0000\u0000\u0000\u07e8\u07ea\u0001"+
		"\u0000\u0000\u0000\u07e9\u07e7\u0001\u0000\u0000\u0000\u07ea\u07ee\u0005"+
		"\u016b\u0000\u0000\u07eb\u07ed\u0003l6\u0000\u07ec\u07eb\u0001\u0000\u0000"+
		"\u0000\u07ed\u07f0\u0001\u0000\u0000\u0000\u07ee\u07ec\u0001\u0000\u0000"+
		"\u0000\u07ee\u07ef\u0001\u0000\u0000\u0000\u07ef\u00f1\u0001\u0000\u0000"+
		"\u0000\u07f0\u07ee\u0001\u0000\u0000\u0000\u07f1\u07f2\u0005\u00da\u0000"+
		"\u0000\u07f2\u07f9\u0003\u0180\u00c0\u0000\u07f3\u07f4\u0005\u00da\u0000"+
		"\u0000\u07f4\u07f5\u0005\u0168\u0000\u0000\u07f5\u07f6\u0003\u0180\u00c0"+
		"\u0000\u07f6\u07f7\u0005\u016b\u0000\u0000\u07f7\u07f9\u0001\u0000\u0000"+
		"\u0000\u07f8\u07f1\u0001\u0000\u0000\u0000\u07f8\u07f3\u0001\u0000\u0000"+
		"\u0000\u07f9\u00f3\u0001\u0000\u0000\u0000\u07fa\u07fc\u0005\u0004\u0000"+
		"\u0000\u07fb\u07fa\u0001\u0000\u0000\u0000\u07fb\u07fc\u0001\u0000\u0000"+
		"\u0000\u07fc\u07fd\u0001\u0000\u0000\u0000\u07fd\u07ff\u0005\u00df\u0000"+
		"\u0000\u07fe\u0800\u0003\u0180\u00c0\u0000\u07ff\u07fe\u0001\u0000\u0000"+
		"\u0000\u07ff\u0800\u0001\u0000\u0000\u0000\u0800\u00f5\u0001\u0000\u0000"+
		"\u0000\u0801\u0802\u0005\u00e1\u0000\u0000\u0802\u00f7\u0001\u0000\u0000"+
		"\u0000\u0803\u080f\u0005\u00e6\u0000\u0000\u0804\u0806\u0005\u010e\u0000"+
		"\u0000\u0805\u0807\u0005\u0130\u0000\u0000\u0806\u0805\u0001\u0000\u0000"+
		"\u0000\u0806\u0807\u0001\u0000\u0000\u0000\u0807\u0808\u0001\u0000\u0000"+
		"\u0000\u0808\u080d\u0003\u0180\u00c0\u0000\u0809\u080a\u0005\u0100\u0000"+
		"\u0000\u080a\u080b\u0005\u00b4\u0000\u0000\u080b\u080c\u0005\u015e\u0000"+
		"\u0000\u080c\u080e\u0003\u0180\u00c0\u0000\u080d\u0809\u0001\u0000\u0000"+
		"\u0000\u080d\u080e\u0001\u0000\u0000\u0000\u080e\u0810\u0001\u0000\u0000"+
		"\u0000\u080f\u0804\u0001\u0000\u0000\u0000\u080f\u0810\u0001\u0000\u0000"+
		"\u0000\u0810\u00f9\u0001\u0000\u0000\u0000\u0811\u0813\u0005\u00ea\u0000"+
		"\u0000\u0812\u0814\u0003\u0180\u00c0\u0000\u0813\u0812\u0001\u0000\u0000"+
		"\u0000\u0813\u0814\u0001\u0000\u0000\u0000\u0814\u00fb\u0001\u0000\u0000"+
		"\u0000\u0815\u0817\u0005\u00f0\u0000\u0000\u0816\u0818\u0005\u013c\u0000"+
		"\u0000\u0817\u0816\u0001\u0000\u0000\u0000\u0817\u0818\u0001\u0000\u0000"+
		"\u0000\u0818\u00fd\u0001\u0000\u0000\u0000\u0819\u081d\u0003\u0100\u0080"+
		"\u0000\u081a\u081d\u0003\u0102\u0081\u0000\u081b\u081d\u0003\u0104\u0082"+
		"\u0000\u081c\u0819\u0001\u0000\u0000\u0000\u081c\u081a\u0001\u0000\u0000"+
		"\u0000\u081c\u081b\u0001\u0000\u0000\u0000\u081d\u00ff\u0001\u0000\u0000"+
		"\u0000\u081e\u0820\u0005?\u0000\u0000\u081f\u081e\u0001\u0000\u0000\u0000"+
		"\u081f\u0820\u0001\u0000\u0000\u0000\u0820\u0821\u0001\u0000\u0000\u0000"+
		"\u0821\u0824\u0005\u00f9\u0000\u0000\u0822\u0824\u0005@\u0000\u0000\u0823"+
		"\u081f\u0001\u0000\u0000\u0000\u0823\u0822\u0001\u0000\u0000\u0000\u0824"+
		"\u0826\u0001\u0000\u0000\u0000\u0825\u0827\u0005\u015e\u0000\u0000\u0826"+
		"\u0825\u0001\u0000\u0000\u0000\u0826\u0827\u0001\u0000\u0000\u0000\u0827"+
		"\u0828\u0001\u0000\u0000\u0000\u0828\u0829\u0003\u0180\u00c0\u0000\u0829"+
		"\u0101\u0001\u0000\u0000\u0000\u082a\u082b\u0007\u001e\u0000\u0000\u082b"+
		"\u082c\u0007\u001f\u0000\u0000\u082c\u0103\u0001\u0000\u0000\u0000\u082d"+
		"\u082e\u0005\u00de\u0000\u0000\u082e\u0831\u0005\u015e\u0000\u0000\u082f"+
		"\u0832\u0003\u0180\u00c0\u0000\u0830\u0832\u0005\u00c0\u0000\u0000\u0831"+
		"\u082f\u0001\u0000\u0000\u0000\u0831\u0830\u0001\u0000\u0000\u0000\u0832"+
		"\u0834\u0001\u0000\u0000\u0000\u0833\u0835\u0005\u012c\u0000\u0000\u0834"+
		"\u0833\u0001\u0000\u0000\u0000\u0834\u0835\u0001\u0000\u0000\u0000\u0835"+
		"\u0836\u0001\u0000\u0000\u0000\u0836\u0837\u0005s\u0000\u0000\u0837\u0838"+
		"\u0007 \u0000\u0000\u0838\u0105\u0001\u0000\u0000\u0000\u0839\u083a\u0005"+
		"\u0105\u0000\u0000\u083a\u083b\u0003\u01b8\u00dc\u0000\u083b\u0107\u0001"+
		"\u0000\u0000\u0000\u083c\u083f\u0005\u0119\u0000\u0000\u083d\u083e\u0005"+
		"\u0125\u0000\u0000\u083e\u0840\u0003\u0180\u00c0\u0000\u083f\u083d\u0001"+
		"\u0000\u0000\u0000\u083f\u0840\u0001\u0000\u0000\u0000\u0840\u0841\u0001"+
		"\u0000\u0000\u0000\u0841\u084b\u0005s\u0000\u0000\u0842\u084c\u0003\u011a"+
		"\u008d\u0000\u0843\u0845\u0003\u014a\u00a5\u0000\u0844\u0846\u0003\u014c"+
		"\u00a6\u0000\u0845\u0844\u0001\u0000\u0000\u0000\u0845\u0846\u0001\u0000"+
		"\u0000\u0000\u0846\u0849\u0001\u0000\u0000\u0000\u0847\u0848\u0005\u00a4"+
		"\u0000\u0000\u0848\u084a\u0003\u0180\u00c0\u0000\u0849\u0847\u0001\u0000"+
		"\u0000\u0000\u0849\u084a\u0001\u0000\u0000\u0000\u084a\u084c\u0001\u0000"+
		"\u0000\u0000\u084b\u0842\u0001\u0000\u0000\u0000\u084b\u0843\u0001\u0000"+
		"\u0000\u0000\u084c\u0109\u0001\u0000\u0000\u0000\u084d\u084f\u0005\u0128"+
		"\u0000\u0000\u084e\u0850\u0005\u011b\u0000\u0000\u084f\u084e\u0001\u0000"+
		"\u0000\u0000\u084f\u0850\u0001\u0000\u0000\u0000\u0850\u0851\u0001\u0000"+
		"\u0000\u0000\u0851\u0852\u0003\u014a\u00a5\u0000\u0852\u010b\u0001\u0000"+
		"\u0000\u0000\u0853\u0854\u0005\u012e\u0000\u0000\u0854\u0855\u0003\u0180"+
		"\u00c0\u0000\u0855\u010d\u0001\u0000\u0000\u0000\u0856\u0858\u0005\u0131"+
		"\u0000\u0000\u0857\u0859\u0005\u0168\u0000\u0000\u0858\u0857\u0001\u0000"+
		"\u0000\u0000\u0858\u0859\u0001\u0000\u0000\u0000\u0859\u085a\u0001\u0000"+
		"\u0000\u0000\u085a\u085f\u0003\u0180\u00c0\u0000\u085b\u085c\u0005\u015a"+
		"\u0000\u0000\u085c\u085e\u0003\u0180\u00c0\u0000\u085d\u085b\u0001\u0000"+
		"\u0000\u0000\u085e\u0861\u0001\u0000\u0000\u0000\u085f\u085d\u0001\u0000"+
		"\u0000\u0000\u085f\u0860\u0001\u0000\u0000\u0000\u0860\u0863\u0001\u0000"+
		"\u0000\u0000\u0861\u085f\u0001\u0000\u0000\u0000\u0862\u0864\u0005\u016b"+
		"\u0000\u0000\u0863\u0862\u0001\u0000\u0000\u0000\u0863\u0864\u0001\u0000"+
		"\u0000\u0000\u0864\u0865\u0001\u0000\u0000\u0000\u0865\u0867\u0005\u0097"+
		"\u0000\u0000\u0866\u0868\u0005\u0168\u0000\u0000\u0867\u0866\u0001\u0000"+
		"\u0000\u0000\u0867\u0868\u0001\u0000\u0000\u0000\u0868";
	private static final String _serializedATNSegment1 =
		"\u0869\u0001\u0000\u0000\u0000\u0869\u086e\u0003\u01b8\u00dc\u0000\u086a"+
		"\u086b\u0005\u015a\u0000\u0000\u086b\u086d\u0003\u01b8\u00dc\u0000\u086c"+
		"\u086a\u0001\u0000\u0000\u0000\u086d\u0870\u0001\u0000\u0000\u0000\u086e"+
		"\u086c\u0001\u0000\u0000\u0000\u086e\u086f\u0001\u0000\u0000\u0000\u086f"+
		"\u0872\u0001\u0000\u0000\u0000\u0870\u086e\u0001\u0000\u0000\u0000\u0871"+
		"\u0873\u0005\u016b\u0000\u0000\u0872\u0871\u0001\u0000\u0000\u0000\u0872"+
		"\u0873\u0001\u0000\u0000\u0000\u0873\u010f\u0001\u0000\u0000\u0000\u0874"+
		"\u0875\u0005\u0139\u0000\u0000\u0875\u0876\u0003\u0170\u00b8\u0000\u0876"+
		"\u0877\u0007!\u0000\u0000\u0877\u0878\u0003\u0002\u0001\u0000\u0878\u087a"+
		"\u0005b\u0000\u0000\u0879\u087b\u0007\"\u0000\u0000\u087a\u0879\u0001"+
		"\u0000\u0000\u0000\u087a\u087b\u0001\u0000\u0000\u0000\u087b\u0111\u0001"+
		"\u0000\u0000\u0000\u087c\u087d\u0005s\u0000\u0000\u087d\u087e\u0005\u016f"+
		"\u0000\u0000\u087e\u0880\u0005\u0089\u0000\u0000\u087f\u0881\u0005\u0168"+
		"\u0000\u0000\u0880\u087f\u0001\u0000\u0000\u0000\u0880\u0881\u0001\u0000"+
		"\u0000\u0000\u0881\u0882\u0001\u0000\u0000\u0000\u0882\u0884\u0003\u011a"+
		"\u008d\u0000\u0883\u0885\u0005\u016b\u0000\u0000\u0884\u0883\u0001\u0000"+
		"\u0000\u0000\u0884\u0885\u0001\u0000\u0000\u0000\u0885\u0886\u0001\u0000"+
		"\u0000\u0000\u0886\u0887\u0005\u00ae\u0000\u0000\u0887\u0888\u0003\u0002"+
		"\u0001\u0000\u0888\u0889\u0005b\u0000\u0000\u0889\u088a\u0005\u00ae\u0000"+
		"\u0000\u088a\u0113\u0001\u0000\u0000\u0000\u088b\u088c\u0005s\u0000\u0000"+
		"\u088c\u088d\u0005\u016f\u0000\u0000\u088d\u088f\u0005\u0089\u0000\u0000"+
		"\u088e\u0890\u0005\u00ec\u0000\u0000\u088f\u088e\u0001\u0000\u0000\u0000"+
		"\u088f\u0890\u0001\u0000\u0000\u0000\u0890\u0891\u0001\u0000\u0000\u0000"+
		"\u0891\u0892\u0003\u0180\u00c0\u0000\u0892\u0893\u0005\u015d\u0000\u0000"+
		"\u0893\u0896\u0003\u0180\u00c0\u0000\u0894\u0895\u0007#\u0000\u0000\u0895"+
		"\u0897\u0003\u0180\u00c0\u0000\u0896\u0894\u0001\u0000\u0000\u0000\u0896"+
		"\u0897\u0001\u0000\u0000\u0000\u0897\u0898\u0001\u0000\u0000\u0000\u0898"+
		"\u0899\u0005\u00ae\u0000\u0000\u0899\u089a\u0003\u0002\u0001\u0000\u089a"+
		"\u089b\u0005b\u0000\u0000\u089b\u089c\u0005\u00ae\u0000\u0000\u089c\u0115"+
		"\u0001\u0000\u0000\u0000\u089d\u08a4\u0005\u0178\u0000\u0000\u089e\u089f"+
		"\u0005\u0164\u0000\u0000\u089f\u08a0\u0005\u0164\u0000\u0000\u08a0\u08a1"+
		"\u0005\u016f\u0000\u0000\u08a1\u08a2\u0005\u0162\u0000\u0000\u08a2\u08a4"+
		"\u0005\u0162\u0000\u0000\u08a3\u089d\u0001\u0000\u0000\u0000\u08a3\u089e"+
		"\u0001\u0000\u0000\u0000\u08a4\u0117\u0001\u0000\u0000\u0000\u08a5\u08a6"+
		"\u0005\u012f\u0000\u0000\u08a6\u08ab\u0003\u0180\u00c0\u0000\u08a7\u08a8"+
		"\u0005\u015a\u0000\u0000\u08a8\u08aa\u0003\u0180\u00c0\u0000\u08a9\u08a7"+
		"\u0001\u0000\u0000\u0000\u08aa\u08ad\u0001\u0000\u0000\u0000\u08ab\u08a9"+
		"\u0001\u0000\u0000\u0000\u08ab\u08ac\u0001\u0000\u0000\u0000\u08ac\u0119"+
		"\u0001\u0000\u0000\u0000\u08ad\u08ab\u0001\u0000\u0000\u0000\u08ae\u08b0"+
		"\u0003\u011c\u008e\u0000\u08af\u08ae\u0001\u0000\u0000\u0000\u08af\u08b0"+
		"\u0001\u0000\u0000\u0000\u08b0\u08b1\u0001\u0000\u0000\u0000\u08b1\u08b2"+
		"\u0003\u0122\u0091\u0000\u08b2\u011b\u0001\u0000\u0000\u0000\u08b3\u08b4"+
		"\u0005\u013a\u0000\u0000\u08b4\u08b9\u0003\u011e\u008f\u0000\u08b5\u08b6"+
		"\u0005\u015a\u0000\u0000\u08b6\u08b8\u0003\u011e\u008f\u0000\u08b7\u08b5"+
		"\u0001\u0000\u0000\u0000\u08b8\u08bb\u0001\u0000\u0000\u0000\u08b9\u08b7"+
		"\u0001\u0000\u0000\u0000\u08b9\u08ba\u0001\u0000\u0000\u0000\u08ba\u011d"+
		"\u0001\u0000\u0000\u0000\u08bb\u08b9\u0001\u0000\u0000\u0000\u08bc\u08be"+
		"\u0003\u01b8\u00dc\u0000\u08bd\u08bf\u0003\u0120\u0090\u0000\u08be\u08bd"+
		"\u0001\u0000\u0000\u0000\u08be\u08bf\u0001\u0000\u0000\u0000\u08bf\u08c0"+
		"\u0001\u0000\u0000\u0000\u08c0\u08c1\u0005\u000e\u0000\u0000\u08c1\u08c2"+
		"\u0005\u0168\u0000\u0000\u08c2\u08c3\u0003\u0122\u0091\u0000\u08c3\u08c4"+
		"\u0005\u016b\u0000\u0000\u08c4\u011f\u0001\u0000\u0000\u0000\u08c5\u08c6"+
		"\u0005\u0168\u0000\u0000\u08c6\u08cb\u0003\u01b8\u00dc\u0000\u08c7\u08c8"+
		"\u0005\u015a\u0000\u0000\u08c8\u08ca\u0003\u01b8\u00dc\u0000\u08c9\u08c7"+
		"\u0001\u0000\u0000\u0000\u08ca\u08cd\u0001\u0000\u0000\u0000\u08cb\u08c9"+
		"\u0001\u0000\u0000\u0000\u08cb\u08cc\u0001\u0000\u0000\u0000\u08cc\u08ce"+
		"\u0001\u0000\u0000\u0000\u08cd\u08cb\u0001\u0000\u0000\u0000\u08ce\u08cf"+
		"\u0005\u016b\u0000\u0000\u08cf\u0121\u0001\u0000\u0000\u0000\u08d0\u08d6"+
		"\u0003\u0124\u0092\u0000\u08d1\u08d2\u0003\u0126\u0093\u0000\u08d2\u08d3"+
		"\u0003\u0124\u0092\u0000\u08d3\u08d5\u0001\u0000\u0000\u0000\u08d4\u08d1"+
		"\u0001\u0000\u0000\u0000\u08d5\u08d8\u0001\u0000\u0000\u0000\u08d6\u08d4"+
		"\u0001\u0000\u0000\u0000\u08d6\u08d7\u0001\u0000\u0000\u0000\u08d7\u0123"+
		"\u0001\u0000\u0000\u0000\u08d8\u08d6\u0001\u0000\u0000\u0000\u08d9\u08df"+
		"\u0003\u0128\u0094\u0000\u08da\u08db\u0005\u0168\u0000\u0000\u08db\u08dc"+
		"\u0003\u0122\u0091\u0000\u08dc\u08dd\u0005\u016b\u0000\u0000\u08dd\u08df"+
		"\u0001\u0000\u0000\u0000\u08de\u08d9\u0001\u0000\u0000\u0000\u08de\u08da"+
		"\u0001\u0000\u0000\u0000\u08df\u0125\u0001\u0000\u0000\u0000\u08e0\u08e2"+
		"\u0005\u012a\u0000\u0000\u08e1\u08e3\u0005\b\u0000\u0000\u08e2\u08e1\u0001"+
		"\u0000\u0000\u0000\u08e2\u08e3\u0001\u0000\u0000\u0000\u08e3\u08ed\u0001"+
		"\u0000\u0000\u0000\u08e4\u08e6\u0005e\u0000\u0000\u08e5\u08e7\u0005\b"+
		"\u0000\u0000\u08e6\u08e5\u0001\u0000\u0000\u0000\u08e6\u08e7\u0001\u0000"+
		"\u0000\u0000\u08e7\u08ed\u0001\u0000\u0000\u0000\u08e8\u08ea\u0005\u0095"+
		"\u0000\u0000\u08e9\u08eb\u0005\b\u0000\u0000\u08ea\u08e9\u0001\u0000\u0000"+
		"\u0000\u08ea\u08eb\u0001\u0000\u0000\u0000\u08eb\u08ed\u0001\u0000\u0000"+
		"\u0000\u08ec\u08e0\u0001\u0000\u0000\u0000\u08ec\u08e4\u0001\u0000\u0000"+
		"\u0000\u08ec\u08e8\u0001\u0000\u0000\u0000\u08ed\u0127\u0001\u0000\u0000"+
		"\u0000\u08ee\u08ef\u0007$\u0000\u0000\u08ef\u08f1\u0003\u012a\u0095\u0000"+
		"\u08f0\u08f2\u0003\u0136\u009b\u0000\u08f1\u08f0\u0001\u0000\u0000\u0000"+
		"\u08f1\u08f2\u0001\u0000\u0000\u0000\u08f2\u08f4\u0001\u0000\u0000\u0000"+
		"\u08f3\u08f5\u0003\u0138\u009c\u0000\u08f4\u08f3\u0001\u0000\u0000\u0000"+
		"\u08f4\u08f5\u0001\u0000\u0000\u0000\u08f5\u08f7\u0001\u0000\u0000\u0000"+
		"\u08f6\u08f8\u0003\u014c\u00a6\u0000\u08f7\u08f6\u0001\u0000\u0000\u0000"+
		"\u08f7\u08f8\u0001\u0000\u0000\u0000\u08f8\u08fa\u0001\u0000\u0000\u0000"+
		"\u08f9\u08fb\u0003\u014e\u00a7\u0000\u08fa\u08f9\u0001\u0000\u0000\u0000"+
		"\u08fa\u08fb\u0001\u0000\u0000\u0000\u08fb\u08fe\u0001\u0000\u0000\u0000"+
		"\u08fc\u08ff\u0003\u0150\u00a8\u0000\u08fd\u08ff\u0003\u0152\u00a9\u0000"+
		"\u08fe\u08fc\u0001\u0000\u0000\u0000\u08fe\u08fd\u0001\u0000\u0000\u0000"+
		"\u08fe\u08ff\u0001\u0000\u0000\u0000\u08ff\u0901\u0001\u0000\u0000\u0000"+
		"\u0900\u0902\u0003\u0154\u00aa\u0000\u0901\u0900\u0001\u0000\u0000\u0000"+
		"\u0901\u0902\u0001\u0000\u0000\u0000\u0902\u0904\u0001\u0000\u0000\u0000"+
		"\u0903\u0905\u0003\u0156\u00ab\u0000\u0904\u0903\u0001\u0000\u0000\u0000"+
		"\u0904\u0905\u0001\u0000\u0000\u0000\u0905\u0129\u0001\u0000\u0000\u0000"+
		"\u0906\u0908\u0003\u012c\u0096\u0000\u0907\u0906\u0001\u0000\u0000\u0000"+
		"\u0907\u0908\u0001\u0000\u0000\u0000\u0908\u090a\u0001\u0000\u0000\u0000"+
		"\u0909\u090b\u0003\u012e\u0097\u0000\u090a\u0909\u0001\u0000\u0000\u0000"+
		"\u090a\u090b\u0001\u0000\u0000\u0000\u090b\u090c\u0001\u0000\u0000\u0000"+
		"\u090c\u0911\u0003\u0130\u0098\u0000\u090d\u090e\u0005\u015a\u0000\u0000"+
		"\u090e\u0910\u0003\u0130\u0098\u0000\u090f\u090d\u0001\u0000\u0000\u0000"+
		"\u0910\u0913\u0001\u0000\u0000\u0000\u0911\u090f\u0001\u0000\u0000\u0000"+
		"\u0911\u0912\u0001\u0000\u0000\u0000\u0912\u012b\u0001\u0000\u0000\u0000"+
		"\u0913\u0911\u0001\u0000\u0000\u0000\u0914\u0915\u0007%\u0000\u0000\u0915"+
		"\u012d\u0001\u0000\u0000\u0000\u0916\u0917\u0005\u0125\u0000\u0000\u0917"+
		"\u0918\u0003\u0180\u00c0\u0000\u0918\u012f\u0001\u0000\u0000\u0000\u0919"+
		"\u091a\u0003\u01b8\u00dc\u0000\u091a\u091b\u0005\u015e\u0000\u0000\u091b"+
		"\u091d\u0001\u0000\u0000\u0000\u091c\u0919\u0001\u0000\u0000\u0000\u091c"+
		"\u091d\u0001\u0000\u0000\u0000\u091d\u091e\u0001\u0000\u0000\u0000\u091e"+
		"\u0920\u0003\u0180\u00c0\u0000\u091f\u0921\u0003\u0132\u0099\u0000\u0920"+
		"\u091f\u0001\u0000\u0000\u0000\u0920\u0921\u0001\u0000\u0000\u0000\u0921"+
		"\u0924\u0001\u0000\u0000\u0000\u0922\u0924\u0003\u0134\u009a\u0000\u0923"+
		"\u091c\u0001\u0000\u0000\u0000\u0923\u0922\u0001\u0000\u0000\u0000\u0924"+
		"\u0131\u0001\u0000\u0000\u0000\u0925\u0927\u0004\u0099\u0003\u0000\u0926"+
		"\u0928\u0005\u000e\u0000\u0000\u0927\u0926\u0001\u0000\u0000\u0000\u0927"+
		"\u0928\u0001\u0000\u0000\u0000\u0928\u0929\u0001\u0000\u0000\u0000\u0929"+
		"\u092f\u0003\u01b8\u00dc\u0000\u092a\u092b\u0005\u0168\u0000\u0000\u092b"+
		"\u092c\u0005\u0123\u0000\u0000\u092c\u092d\u0005\u0170\u0000\u0000\u092d"+
		"\u092f\u0005\u016b\u0000\u0000\u092e\u0925\u0001\u0000\u0000\u0000\u092e"+
		"\u092a\u0001\u0000\u0000\u0000\u092f\u0133\u0001\u0000\u0000\u0000\u0930"+
		"\u0931\u0005\u016f\u0000\u0000\u0931\u0933\u0005\u0004\u0000\u0000\u0932"+
		"\u0930\u0001\u0000\u0000\u0000\u0932\u0933\u0001\u0000\u0000\u0000\u0933"+
		"\u0934\u0001\u0000\u0000\u0000\u0934\u0935\u0005\u0166\u0000\u0000\u0935"+
		"\u0135\u0001\u0000\u0000\u0000\u0936\u0937\u0005\u0097\u0000\u0000\u0937"+
		"\u093c\u0003\u01b8\u00dc\u0000\u0938\u0939\u0005\u015a\u0000\u0000\u0939"+
		"\u093b\u0003\u01b8\u00dc\u0000\u093a\u0938\u0001\u0000\u0000\u0000\u093b"+
		"\u093e\u0001\u0000\u0000\u0000\u093c\u093a\u0001\u0000\u0000\u0000\u093c"+
		"\u093d\u0001\u0000\u0000\u0000\u093d\u0137\u0001\u0000\u0000\u0000\u093e"+
		"\u093c\u0001\u0000\u0000\u0000\u093f\u0940\u0005w\u0000\u0000\u0940\u0944"+
		"\u0003\u013a\u009d\u0000\u0941\u0943\u0003\u0140\u00a0\u0000\u0942\u0941"+
		"\u0001\u0000\u0000\u0000\u0943\u0946\u0001\u0000\u0000\u0000\u0944\u0942"+
		"\u0001\u0000\u0000\u0000\u0944\u0945\u0001\u0000\u0000\u0000\u0945\u0139"+
		"\u0001\u0000\u0000\u0000\u0946\u0944\u0001\u0000\u0000\u0000\u0947\u094b"+
		"\u0003\u013c\u009e\u0000\u0948\u094b\u0003\u013e\u009f\u0000\u0949\u094b"+
		"\u0003\u0144\u00a2\u0000\u094a\u0947\u0001\u0000\u0000\u0000\u094a\u0948"+
		"\u0001\u0000\u0000\u0000\u094a\u0949\u0001\u0000\u0000\u0000\u094b\u013b"+
		"\u0001\u0000\u0000\u0000\u094c\u094e\u0003\u014a\u00a5\u0000\u094d\u094f"+
		"\u0003\u0148\u00a4\u0000\u094e\u094d\u0001\u0000\u0000\u0000\u094e\u094f"+
		"\u0001\u0000\u0000\u0000\u094f\u013d\u0001\u0000\u0000\u0000\u0950\u0951"+
		"\u0005\u0168\u0000\u0000\u0951\u0952\u0003\u011a\u008d\u0000\u0952\u0954"+
		"\u0005\u016b\u0000\u0000\u0953\u0955\u0003\u0148\u00a4\u0000\u0954\u0953"+
		"\u0001\u0000\u0000\u0000\u0954\u0955\u0001\u0000\u0000\u0000\u0955\u013f"+
		"\u0001\u0000\u0000\u0000\u0956\u0957\u0005\u015a\u0000\u0000\u0957\u095e"+
		"\u0003\u013a\u009d\u0000\u0958\u0959\u0003\u0142\u00a1\u0000\u0959\u095a"+
		"\u0003\u013a\u009d\u0000\u095a\u095b\u0005\u00c8\u0000\u0000\u095b\u095c"+
		"\u0003\u0170\u00b8\u0000\u095c\u095e\u0001\u0000\u0000\u0000\u095d\u0956"+
		"\u0001\u0000\u0000\u0000\u095d\u0958\u0001\u0000\u0000\u0000\u095e\u0141"+
		"\u0001\u0000\u0000\u0000\u095f\u0961\u0005\u008d\u0000\u0000\u0960\u095f"+
		"\u0001\u0000\u0000\u0000\u0960\u0961\u0001\u0000\u0000\u0000\u0961\u0962"+
		"\u0001\u0000\u0000\u0000\u0962\u0969\u0005\u009c\u0000\u0000\u0963\u0965"+
		"\u0007&\u0000\u0000\u0964\u0966\u0005\u00ce\u0000\u0000\u0965\u0964\u0001"+
		"\u0000\u0000\u0000\u0965\u0966\u0001\u0000\u0000\u0000\u0966\u0967\u0001"+
		"\u0000\u0000\u0000\u0967\u0969\u0005\u009c\u0000\u0000\u0968\u0960\u0001"+
		"\u0000\u0000\u0000\u0968\u0963\u0001\u0000\u0000\u0000\u0969\u0143\u0001"+
		"\u0000\u0000\u0000\u096a\u096b\u0005\u011b\u0000\u0000\u096b\u096c\u0005"+
		"\u0168\u0000\u0000\u096c\u096d\u0005\u0131\u0000\u0000\u096d\u0972\u0003"+
		"\u0146\u00a3\u0000\u096e\u096f\u0005\u015a\u0000\u0000\u096f\u0971\u0003"+
		"\u0146\u00a3\u0000\u0970\u096e\u0001\u0000\u0000\u0000\u0971\u0974\u0001"+
		"\u0000\u0000\u0000\u0972\u0970\u0001\u0000\u0000\u0000\u0972\u0973\u0001"+
		"\u0000\u0000\u0000\u0973\u0975\u0001\u0000\u0000\u0000\u0974\u0972\u0001"+
		"\u0000\u0000\u0000\u0975\u0977\u0005\u016b\u0000\u0000\u0976\u0978\u0003"+
		"\u0148\u00a4\u0000\u0977\u0976\u0001\u0000\u0000\u0000\u0977\u0978\u0001"+
		"\u0000\u0000\u0000\u0978\u0145\u0001\u0000\u0000\u0000\u0979\u0986\u0003"+
		"\u0180\u00c0\u0000\u097a\u097b\u0005\u0168\u0000\u0000\u097b\u0980\u0003"+
		"\u0180\u00c0\u0000\u097c\u097d\u0005\u015a\u0000\u0000\u097d\u097f\u0003"+
		"\u0180\u00c0\u0000\u097e\u097c\u0001\u0000\u0000\u0000\u097f\u0982\u0001"+
		"\u0000\u0000\u0000\u0980\u097e\u0001\u0000\u0000\u0000\u0980\u0981\u0001"+
		"\u0000\u0000\u0000\u0981\u0983\u0001\u0000\u0000\u0000\u0982\u0980\u0001"+
		"\u0000\u0000\u0000\u0983\u0984\u0005\u016b\u0000\u0000\u0984\u0986\u0001"+
		"\u0000\u0000\u0000\u0985\u0979\u0001\u0000\u0000\u0000\u0985\u097a\u0001"+
		"\u0000\u0000\u0000\u0986\u0147\u0001\u0000\u0000\u0000\u0987\u0989\u0004"+
		"\u00a4\u0004\u0000\u0988\u098a\u0005\u000e\u0000\u0000\u0989\u0988\u0001"+
		"\u0000\u0000\u0000\u0989\u098a\u0001\u0000\u0000\u0000\u098a\u098b\u0001"+
		"\u0000\u0000\u0000\u098b\u0996\u0003\u01b8\u00dc\u0000\u098c\u098d\u0005"+
		"\u0168\u0000\u0000\u098d\u0992\u0005\u016f\u0000\u0000\u098e\u098f\u0005"+
		"\u015a\u0000\u0000\u098f\u0991\u0005\u016f\u0000\u0000\u0990\u098e\u0001"+
		"\u0000\u0000\u0000\u0991\u0994\u0001\u0000\u0000\u0000\u0992\u0990\u0001"+
		"\u0000\u0000\u0000\u0992\u0993\u0001\u0000\u0000\u0000\u0993\u0995\u0001"+
		"\u0000\u0000\u0000\u0994\u0992\u0001\u0000\u0000\u0000\u0995\u0997\u0005"+
		"\u016b\u0000\u0000\u0996\u098c\u0001\u0000\u0000\u0000\u0996\u0997\u0001"+
		"\u0000\u0000\u0000\u0997\u0149\u0001\u0000\u0000\u0000\u0998\u0999\u0003"+
		"\u01b8\u00dc\u0000\u0999\u014b\u0001\u0000\u0000\u0000\u099a\u099b\u0005"+
		"\u0138\u0000\u0000\u099b\u099c\u0003\u0170\u00b8\u0000\u099c\u014d\u0001"+
		"\u0000\u0000\u0000\u099d\u099e\u0005~\u0000\u0000\u099e\u099f\u0005\u001e"+
		"\u0000\u0000\u099f\u09a4\u0003\u0180\u00c0\u0000\u09a0\u09a1\u0005\u015a"+
		"\u0000\u0000\u09a1\u09a3\u0003\u0180\u00c0\u0000\u09a2\u09a0\u0001\u0000"+
		"\u0000\u0000\u09a3\u09a6\u0001\u0000\u0000\u0000\u09a4\u09a2\u0001\u0000"+
		"\u0000\u0000\u09a4\u09a5\u0001\u0000\u0000\u0000\u09a5\u014f\u0001\u0000"+
		"\u0000\u0000\u09a6\u09a4\u0001\u0000\u0000\u0000\u09a7\u09a8\u0005\u0081"+
		"\u0000\u0000\u09a8\u09a9\u0003\u0170\u00b8\u0000\u09a9\u0151\u0001\u0000"+
		"\u0000\u0000\u09aa\u09ab\u0005\u00dd\u0000\u0000\u09ab\u09ac\u0003\u0170"+
		"\u00b8\u0000\u09ac\u0153\u0001\u0000\u0000\u0000\u09ad\u09ae\u0005\u00cc"+
		"\u0000\u0000\u09ae\u09af\u0005\u001e\u0000\u0000\u09af\u09b1\u0003\u0180"+
		"\u00c0\u0000\u09b0\u09b2\u0007\u0007\u0000\u0000\u09b1\u09b0\u0001\u0000"+
		"\u0000\u0000\u09b1\u09b2\u0001\u0000\u0000\u0000\u09b2\u09ba\u0001\u0000"+
		"\u0000\u0000\u09b3\u09b4\u0005\u015a\u0000\u0000\u09b4\u09b6\u0003\u0180"+
		"\u00c0\u0000\u09b5\u09b7\u0007\u0007\u0000\u0000\u09b6\u09b5\u0001\u0000"+
		"\u0000\u0000\u09b6\u09b7\u0001\u0000\u0000\u0000\u09b7\u09b9\u0001\u0000"+
		"\u0000\u0000\u09b8\u09b3\u0001\u0000\u0000\u0000\u09b9\u09bc\u0001\u0000"+
		"\u0000\u0000\u09ba\u09b8\u0001\u0000\u0000\u0000\u09ba\u09bb\u0001\u0000"+
		"\u0000\u0000\u09bb\u0155\u0001\u0000\u0000\u0000\u09bc\u09ba\u0001\u0000"+
		"\u0000\u0000\u09bd\u09bf\u0003\u0158\u00ac\u0000\u09be\u09bd\u0001\u0000"+
		"\u0000\u0000\u09bf\u09c0\u0001\u0000\u0000\u0000\u09c0\u09be\u0001\u0000"+
		"\u0000\u0000\u09c0\u09c1\u0001\u0000\u0000\u0000\u09c1\u0157\u0001\u0000"+
		"\u0000\u0000\u09c2\u09c3\u0005\u00a4\u0000\u0000\u09c3\u09ce\u0003\u0180"+
		"\u00c0\u0000\u09c4\u09c5\u0005\u013a\u0000\u0000\u09c5\u09cb\u0007\'\u0000"+
		"\u0000\u09c6\u09c7\u0005\u012e\u0000\u0000\u09c7\u09c8\u0005\u000b\u0000"+
		"\u0000\u09c8\u09c9\u0005\u009d\u0000\u0000\u09c9\u09ca\u0007(\u0000\u0000"+
		"\u09ca\u09cc\u0005\u00aa\u0000\u0000\u09cb\u09c6\u0001\u0000\u0000\u0000"+
		"\u09cb\u09cc\u0001\u0000\u0000\u0000\u09cc\u09ce\u0001\u0000\u0000\u0000"+
		"\u09cd\u09c2\u0001\u0000\u0000\u0000\u09cd\u09c4\u0001\u0000\u0000\u0000"+
		"\u09ce\u0159\u0001\u0000\u0000\u0000\u09cf\u09d0\u0005\u012c\u0000\u0000"+
		"\u09d0\u09d1\u0003\u015e\u00af\u0000\u09d1\u09d2\u0005\u0100\u0000\u0000"+
		"\u09d2\u09d4\u0003\u015c\u00ae\u0000\u09d3\u09d5\u0003\u014c\u00a6\u0000"+
		"\u09d4\u09d3\u0001\u0000\u0000\u0000\u09d4\u09d5\u0001\u0000\u0000\u0000"+
		"\u09d5\u09d7\u0001\u0000\u0000\u0000\u09d6\u09d8\u0003\u0160\u00b0\u0000"+
		"\u09d7\u09d6\u0001\u0000\u0000\u0000\u09d7\u09d8\u0001\u0000\u0000\u0000"+
		"\u09d8\u015b\u0001\u0000\u0000\u0000\u09d9\u09de\u0003\u001a\r\u0000\u09da"+
		"\u09db\u0005\u015a\u0000\u0000\u09db\u09dd\u0003\u001a\r\u0000\u09dc\u09da"+
		"\u0001\u0000\u0000\u0000\u09dd\u09e0\u0001\u0000\u0000\u0000\u09de\u09dc"+
		"\u0001\u0000\u0000\u0000\u09de\u09df\u0001\u0000\u0000\u0000\u09df\u015d"+
		"\u0001\u0000\u0000\u0000\u09e0\u09de\u0001\u0000\u0000\u0000\u09e1\u09e3"+
		"\u0003\u014a\u00a5\u0000\u09e2\u09e4\u0003\u0138\u009c\u0000\u09e3\u09e2"+
		"\u0001\u0000\u0000\u0000\u09e3\u09e4\u0001\u0000\u0000\u0000\u09e4\u09ea"+
		"\u0001\u0000\u0000\u0000\u09e5\u09e6\u0005\u0168\u0000\u0000\u09e6\u09e7"+
		"\u0003\u011a\u008d\u0000\u09e7\u09e8\u0005\u016b\u0000\u0000\u09e8\u09ea"+
		"\u0001\u0000\u0000\u0000\u09e9\u09e1\u0001\u0000\u0000\u0000\u09e9\u09e5"+
		"\u0001\u0000\u0000\u0000\u09ea\u09ef\u0001\u0000\u0000\u0000\u09eb\u09ed"+
		"\u0005\u000e\u0000\u0000\u09ec\u09eb\u0001\u0000\u0000\u0000\u09ec\u09ed"+
		"\u0001\u0000\u0000\u0000\u09ed\u09ee\u0001\u0000\u0000\u0000\u09ee\u09f0"+
		"\u0003\u01b8\u00dc\u0000\u09ef\u09ec\u0001\u0000\u0000\u0000\u09ef\u09f0"+
		"\u0001\u0000\u0000\u0000\u09f0\u015f\u0001\u0000\u0000\u0000\u09f1\u09f2"+
		"\u0005^\u0000\u0000\u09f2\u09f3\u0003\u00b2Y\u0000\u09f3\u0161\u0001\u0000"+
		"\u0000\u0000\u09f4\u09f5\u0005\u00b3\u0000\u0000\u09f5\u09f6\u0005\u0097"+
		"\u0000\u0000\u09f6\u09f7\u0003\u0164\u00b2\u0000\u09f7\u09f8\u0005\u012f"+
		"\u0000\u0000\u09f8\u09f9\u0003\u0164\u00b2\u0000\u09f9\u09fa\u0005\u00c8"+
		"\u0000\u0000\u09fa\u09fc\u0003\u0170\u00b8\u0000\u09fb\u09fd\u0003\u0166"+
		"\u00b3\u0000\u09fc\u09fb\u0001\u0000\u0000\u0000\u09fd\u09fe\u0001\u0000"+
		"\u0000\u0000\u09fe\u09fc\u0001\u0000\u0000\u0000\u09fe\u09ff\u0001\u0000"+
		"\u0000\u0000\u09ff\u0163\u0001\u0000\u0000\u0000\u0a00\u0a06\u0003\u014a"+
		"\u00a5\u0000\u0a01\u0a02\u0005\u0168\u0000\u0000\u0a02\u0a03\u0003\u011a"+
		"\u008d\u0000\u0a03\u0a04\u0005\u016b\u0000\u0000\u0a04\u0a06\u0001\u0000"+
		"\u0000\u0000\u0a05\u0a00\u0001\u0000\u0000\u0000\u0a05\u0a01\u0001\u0000"+
		"\u0000\u0000\u0a06\u0a0b\u0001\u0000\u0000\u0000\u0a07\u0a09\u0005\u000e"+
		"\u0000\u0000\u0a08\u0a07\u0001\u0000\u0000\u0000\u0a08\u0a09\u0001\u0000"+
		"\u0000\u0000\u0a09\u0a0a\u0001\u0000\u0000\u0000\u0a0a\u0a0c\u0003\u01b8"+
		"\u00dc\u0000\u0a0b\u0a08\u0001\u0000\u0000\u0000\u0a0b\u0a0c\u0001\u0000"+
		"\u0000\u0000\u0a0c\u0165\u0001\u0000\u0000\u0000\u0a0d\u0a0f\u0005\u0137"+
		"\u0000\u0000\u0a0e\u0a10\u0005\u00c1\u0000\u0000\u0a0f\u0a0e\u0001\u0000"+
		"\u0000\u0000\u0a0f\u0a10\u0001\u0000\u0000\u0000\u0a10\u0a11\u0001\u0000"+
		"\u0000\u0000\u0a11\u0a14\u0005\u00b0\u0000\u0000\u0a12\u0a13\u0005\u000b"+
		"\u0000\u0000\u0a13\u0a15\u0003\u0170\u00b8\u0000\u0a14\u0a12\u0001\u0000"+
		"\u0000\u0000\u0a14\u0a15\u0001\u0000\u0000\u0000\u0a15\u0a16\u0001\u0000"+
		"\u0000\u0000\u0a16\u0a17\u0005\u0120\u0000\u0000\u0a17\u0a1b\u0003\u0168"+
		"\u00b4\u0000\u0a18\u0a19\u0005^\u0000\u0000\u0a19\u0a1b\u0005\u0087\u0000"+
		"\u0000\u0a1a\u0a0d\u0001\u0000\u0000\u0000\u0a1a\u0a18\u0001\u0000\u0000"+
		"\u0000\u0a1b\u0167\u0001\u0000\u0000\u0000\u0a1c\u0a1e\u0005\u008f\u0000"+
		"\u0000\u0a1d\u0a1f\u0003\u00b4Z\u0000\u0a1e\u0a1d\u0001\u0000\u0000\u0000"+
		"\u0a1e\u0a1f\u0001\u0000\u0000\u0000\u0a1f\u0a20\u0001\u0000\u0000\u0000"+
		"\u0a20\u0a21\u0005\u0131\u0000\u0000\u0a21\u0a31\u0003\u00b8\\\u0000\u0a22"+
		"\u0a23\u0005\u012c\u0000\u0000\u0a23\u0a24\u0005\u0100\u0000\u0000\u0a24"+
		"\u0a29\u0003\u001a\r\u0000\u0a25\u0a26\u0005\u015a\u0000\u0000\u0a26\u0a28"+
		"\u0003\u001a\r\u0000\u0a27\u0a25\u0001\u0000\u0000\u0000\u0a28\u0a2b\u0001"+
		"\u0000\u0000\u0000\u0a29\u0a27\u0001\u0000\u0000\u0000\u0a29\u0a2a\u0001"+
		"\u0000\u0000\u0000\u0a2a\u0a2d\u0001\u0000\u0000\u0000\u0a2b\u0a29\u0001"+
		"\u0000\u0000\u0000\u0a2c\u0a2e\u0003\u014c\u00a6\u0000\u0a2d\u0a2c\u0001"+
		"\u0000\u0000\u0000\u0a2d\u0a2e\u0001\u0000\u0000\u0000\u0a2e\u0a31\u0001"+
		"\u0000\u0000\u0000\u0a2f\u0a31\u0005P\u0000\u0000\u0a30\u0a1c\u0001\u0000"+
		"\u0000\u0000\u0a30\u0a22\u0001\u0000\u0000\u0000\u0a30\u0a2f\u0001\u0000"+
		"\u0000\u0000\u0a31\u0169\u0001\u0000\u0000\u0000\u0a32\u0a34\u0005P\u0000"+
		"\u0000\u0a33\u0a35\u0005w\u0000\u0000\u0a34\u0a33\u0001\u0000\u0000\u0000"+
		"\u0a34\u0a35\u0001\u0000\u0000\u0000\u0a35\u0a36\u0001\u0000\u0000\u0000"+
		"\u0a36\u0a38\u0003\u014a\u00a5\u0000\u0a37\u0a39\u0003\u016c\u00b6\u0000"+
		"\u0a38\u0a37\u0001\u0000\u0000\u0000\u0a38\u0a39\u0001\u0000\u0000\u0000"+
		"\u0a39\u0a3c\u0001\u0000\u0000\u0000\u0a3a\u0a3d\u0003\u014c\u00a6\u0000"+
		"\u0a3b\u0a3d\u0005\b\u0000\u0000\u0a3c\u0a3a\u0001\u0000\u0000\u0000\u0a3c"+
		"\u0a3b\u0001\u0000\u0000\u0000\u0a3c\u0a3d\u0001\u0000\u0000\u0000\u0a3d"+
		"\u016b\u0001\u0000\u0000\u0000\u0a3e\u0a40\u0004\u00b6\u0005\u0000\u0a3f"+
		"\u0a41\u0005\u000e\u0000\u0000\u0a40\u0a3f\u0001\u0000\u0000\u0000\u0a40"+
		"\u0a41\u0001\u0000\u0000\u0000\u0a41\u0a42\u0001\u0000\u0000\u0000\u0a42"+
		"\u0a43\u0003\u01b8\u00dc\u0000\u0a43\u016d\u0001\u0000\u0000\u0000\u0a44"+
		"\u0a46\u0007)\u0000\u0000\u0a45\u0a47\u0005\u011b\u0000\u0000\u0a46\u0a45"+
		"\u0001\u0000\u0000\u0000\u0a46\u0a47\u0001\u0000\u0000\u0000\u0a47\u0a48"+
		"\u0001\u0000\u0000\u0000\u0a48\u0a49\u0003\u014a\u00a5\u0000\u0a49\u016f"+
		"\u0001\u0000\u0000\u0000\u0a4a\u0a4c\u0006\u00b8\uffff\uffff\u0000\u0a4b"+
		"\u0a4d\u0005\u00c1\u0000\u0000\u0a4c\u0a4b\u0001\u0000\u0000\u0000\u0a4c"+
		"\u0a4d\u0001\u0000\u0000\u0000\u0a4d\u0a4e\u0001\u0000\u0000\u0000\u0a4e"+
		"\u0a4f\u0005\u0168\u0000\u0000\u0a4f\u0a50\u0003\u0170\u00b8\u0000\u0a50"+
		"\u0a51\u0005\u016b\u0000\u0000\u0a51\u0a54\u0001\u0000\u0000\u0000\u0a52"+
		"\u0a54\u0003\u0172\u00b9\u0000\u0a53\u0a4a\u0001\u0000\u0000\u0000\u0a53"+
		"\u0a52\u0001\u0000\u0000\u0000\u0a54\u0a5b\u0001\u0000\u0000\u0000\u0a55"+
		"\u0a56\n\u0002\u0000\u0000\u0a56\u0a57\u0003\u017c\u00be\u0000\u0a57\u0a58"+
		"\u0003\u0170\u00b8\u0003\u0a58\u0a5a\u0001\u0000\u0000\u0000\u0a59\u0a55"+
		"\u0001\u0000\u0000\u0000\u0a5a\u0a5d\u0001\u0000\u0000\u0000\u0a5b\u0a59"+
		"\u0001\u0000\u0000\u0000\u0a5b\u0a5c\u0001\u0000\u0000\u0000\u0a5c\u0171"+
		"\u0001\u0000\u0000\u0000\u0a5d\u0a5b\u0001\u0000\u0000\u0000\u0a5e\u0a62"+
		"\u0003\u0174\u00ba\u0000\u0a5f\u0a62\u0003\u017a\u00bd\u0000\u0a60\u0a62"+
		"\u0003\u0180\u00c0\u0000\u0a61\u0a5e\u0001\u0000\u0000\u0000\u0a61\u0a5f"+
		"\u0001\u0000\u0000\u0000\u0a61\u0a60\u0001\u0000\u0000\u0000\u0a62\u0173"+
		"\u0001\u0000\u0000\u0000\u0a63\u0a64\u0003\u0180\u00c0\u0000\u0a64\u0a66"+
		"\u0005\u0099\u0000\u0000\u0a65\u0a67\u0005\u00c1\u0000\u0000\u0a66\u0a65"+
		"\u0001\u0000\u0000\u0000\u0a66\u0a67\u0001\u0000\u0000\u0000\u0a67\u0a68"+
		"\u0001\u0000\u0000\u0000\u0a68\u0a69\u0005\u00c3\u0000\u0000\u0a69\u0a7b"+
		"\u0001\u0000\u0000\u0000\u0a6a\u0a6b\u0003\u0180\u00c0\u0000\u0a6b\u0a6c"+
		"\u0005\u0016\u0000\u0000\u0a6c\u0a6d\u0003\u0180\u00c0\u0000\u0a6d\u0a6e"+
		"\u0005\u000b\u0000\u0000\u0a6e\u0a6f\u0003\u0180\u00c0\u0000\u0a6f\u0a7b"+
		"\u0001\u0000\u0000\u0000\u0a70\u0a72\u0005\u00c1\u0000\u0000\u0a71\u0a70"+
		"\u0001\u0000\u0000\u0000\u0a71\u0a72\u0001\u0000\u0000\u0000\u0a72\u0a73"+
		"\u0001\u0000\u0000\u0000\u0a73\u0a74\u0005j\u0000\u0000\u0a74\u0a75\u0005"+
		"\u0168\u0000\u0000\u0a75\u0a76\u0003\u011a\u008d\u0000\u0a76\u0a77\u0005"+
		"\u016b\u0000\u0000\u0a77\u0a7b\u0001\u0000\u0000\u0000\u0a78\u0a7b\u0003"+
		"\u0176\u00bb\u0000\u0a79\u0a7b\u0003\u0178\u00bc\u0000\u0a7a\u0a63\u0001"+
		"\u0000\u0000\u0000\u0a7a\u0a6a\u0001\u0000\u0000\u0000\u0a7a\u0a71\u0001"+
		"\u0000\u0000\u0000\u0a7a\u0a78\u0001\u0000\u0000\u0000\u0a7a\u0a79\u0001"+
		"\u0000\u0000\u0000\u0a7b\u0175\u0001\u0000\u0000\u0000\u0a7c\u0a7e\u0003"+
		"\u0180\u00c0\u0000\u0a7d\u0a7f\u0005\u00c1\u0000\u0000\u0a7e\u0a7d\u0001"+
		"\u0000\u0000\u0000\u0a7e\u0a7f\u0001\u0000\u0000\u0000\u0a7f\u0a80\u0001"+
		"\u0000\u0000\u0000\u0a80\u0a81\u0005\u0089\u0000\u0000\u0a81\u0a8b\u0005"+
		"\u0168\u0000\u0000\u0a82\u0a87\u0003\u0180\u00c0\u0000\u0a83\u0a84\u0005"+
		"\u015a\u0000\u0000\u0a84\u0a86\u0003\u0180\u00c0\u0000\u0a85\u0a83\u0001"+
		"\u0000\u0000\u0000\u0a86\u0a89\u0001\u0000\u0000\u0000\u0a87\u0a85\u0001"+
		"\u0000\u0000\u0000\u0a87\u0a88\u0001\u0000\u0000\u0000\u0a88\u0a8c\u0001"+
		"\u0000\u0000\u0000\u0a89\u0a87\u0001\u0000\u0000\u0000\u0a8a\u0a8c\u0003"+
		"\u011a\u008d\u0000\u0a8b\u0a82\u0001\u0000\u0000\u0000\u0a8b\u0a8a\u0001"+
		"\u0000\u0000\u0000\u0a8c\u0a8d\u0001\u0000\u0000\u0000\u0a8d\u0a8e\u0005"+
		"\u016b\u0000\u0000\u0a8e\u0177\u0001\u0000\u0000\u0000\u0a8f\u0a90\u0005"+
		"\u0168\u0000\u0000\u0a90\u0a95\u0003\u0180\u00c0\u0000\u0a91\u0a92\u0005"+
		"\u015a\u0000\u0000\u0a92\u0a94\u0003\u0180\u00c0\u0000\u0a93\u0a91\u0001"+
		"\u0000\u0000\u0000\u0a94\u0a97\u0001\u0000\u0000\u0000\u0a95\u0a93\u0001"+
		"\u0000\u0000\u0000\u0a95\u0a96\u0001\u0000\u0000\u0000\u0a96\u0a98\u0001"+
		"\u0000\u0000\u0000\u0a97\u0a95\u0001\u0000\u0000\u0000\u0a98\u0a9a\u0005"+
		"\u016b\u0000\u0000\u0a99\u0a9b\u0005\u00c1\u0000\u0000\u0a9a\u0a99\u0001"+
		"\u0000\u0000\u0000\u0a9a\u0a9b\u0001\u0000\u0000\u0000\u0a9b\u0a9c\u0001"+
		"\u0000\u0000\u0000\u0a9c\u0a9d\u0005\u0089\u0000\u0000\u0a9d\u0a9e\u0005"+
		"\u0168\u0000\u0000\u0a9e\u0a9f\u0003\u011a\u008d\u0000\u0a9f\u0aa0\u0005"+
		"\u016b\u0000\u0000\u0aa0\u0179\u0001\u0000\u0000\u0000\u0aa1\u0aa2\u0003"+
		"\u0180\u00c0\u0000\u0aa2\u0aa3\u0003\u017e\u00bf\u0000\u0aa3\u0aa4\u0003"+
		"\u0180\u00c0\u0000\u0aa4\u017b\u0001\u0000\u0000\u0000\u0aa5\u0aa6\u0007"+
		"*\u0000\u0000\u0aa6\u017d\u0001\u0000\u0000\u0000\u0aa7\u0ab4\u0005\u015e"+
		"\u0000\u0000\u0aa8\u0ab4\u0005\u015f\u0000\u0000\u0aa9\u0ab4\u0005\u0160"+
		"\u0000\u0000\u0aaa\u0ab4\u0005\u0161\u0000\u0000\u0aab\u0ab4\u0005\u0164"+
		"\u0000\u0000\u0aac\u0ab4\u0005\u0165\u0000\u0000\u0aad\u0ab4\u0005\u0162"+
		"\u0000\u0000\u0aae\u0ab4\u0005\u0163\u0000\u0000\u0aaf\u0ab1\u0005\u00c1"+
		"\u0000\u0000\u0ab0\u0aaf\u0001\u0000\u0000\u0000\u0ab0\u0ab1\u0001\u0000"+
		"\u0000\u0000\u0ab1\u0ab2\u0001\u0000\u0000\u0000\u0ab2\u0ab4\u0007+\u0000"+
		"\u0000\u0ab3\u0aa7\u0001\u0000\u0000\u0000\u0ab3\u0aa8\u0001\u0000\u0000"+
		"\u0000\u0ab3\u0aa9\u0001\u0000\u0000\u0000\u0ab3\u0aaa\u0001\u0000\u0000"+
		"\u0000\u0ab3\u0aab\u0001\u0000\u0000\u0000\u0ab3\u0aac\u0001\u0000\u0000"+
		"\u0000\u0ab3\u0aad\u0001\u0000\u0000\u0000\u0ab3\u0aae\u0001\u0000\u0000"+
		"\u0000\u0ab3\u0ab0\u0001\u0000\u0000\u0000\u0ab4\u017f\u0001\u0000\u0000"+
		"\u0000\u0ab5\u0ab6\u0006\u00c0\uffff\uffff\u0000\u0ab6\u0ab7\u0005\u0168"+
		"\u0000\u0000\u0ab7\u0ab8\u0003\u011a\u008d\u0000\u0ab8\u0ab9\u0005\u016b"+
		"\u0000\u0000\u0ab9\u0ac7\u0001\u0000\u0000\u0000\u0aba\u0abb\u0005\u0168"+
		"\u0000\u0000\u0abb\u0abc\u0003\u0180\u00c0\u0000\u0abc\u0abd\u0005\u016b"+
		"\u0000\u0000\u0abd\u0ac7\u0001\u0000\u0000\u0000\u0abe\u0ac7\u0003\u0184"+
		"\u00c2\u0000\u0abf\u0ac7\u0003\u0188\u00c4\u0000\u0ac0\u0ac7\u0003\u018c"+
		"\u00c6\u0000\u0ac1\u0ac7\u0003\u0192\u00c9\u0000\u0ac2\u0ac7\u0003\u0194"+
		"\u00ca\u0000\u0ac3\u0ac7\u0003\u019c\u00ce\u0000\u0ac4\u0ac7\u0003\u019e"+
		"\u00cf\u0000\u0ac5\u0ac7\u0003\u0182\u00c1\u0000\u0ac6\u0ab5\u0001\u0000"+
		"\u0000\u0000\u0ac6\u0aba\u0001\u0000\u0000\u0000\u0ac6\u0abe\u0001\u0000"+
		"\u0000\u0000\u0ac6\u0abf\u0001\u0000\u0000\u0000\u0ac6\u0ac0\u0001\u0000"+
		"\u0000\u0000\u0ac6\u0ac1\u0001\u0000\u0000\u0000\u0ac6\u0ac2\u0001\u0000"+
		"\u0000\u0000\u0ac6\u0ac3\u0001\u0000\u0000\u0000\u0ac6\u0ac4\u0001\u0000"+
		"\u0000\u0000\u0ac6\u0ac5\u0001\u0000\u0000\u0000\u0ac7\u0ad8\u0001\u0000"+
		"\u0000\u0000\u0ac8\u0ac9\n\u000e\u0000\u0000\u0ac9\u0aca\u0005\u0166\u0000"+
		"\u0000\u0aca\u0ad7\u0003\u0180\u00c0\u000f\u0acb\u0acc\n\r\u0000\u0000"+
		"\u0acc\u0acd\u0005\u015c\u0000\u0000\u0acd\u0ad7\u0003\u0180\u00c0\u000e"+
		"\u0ace\u0acf\n\f\u0000\u0000\u0acf\u0ad0\u0005\u0158\u0000\u0000\u0ad0"+
		"\u0ad7\u0003\u0180\u00c0\r\u0ad1\u0ad2\n\u000b\u0000\u0000\u0ad2\u0ad3"+
		"\u0005\u016e\u0000\u0000\u0ad3\u0ad7\u0003\u0180\u00c0\f\u0ad4\u0ad5\n"+
		"\u000f\u0000\u0000\u0ad5\u0ad7\u0003\u0186\u00c3\u0000\u0ad6\u0ac8\u0001"+
		"\u0000\u0000\u0000\u0ad6\u0acb\u0001\u0000\u0000\u0000\u0ad6\u0ace\u0001"+
		"\u0000\u0000\u0000\u0ad6\u0ad1\u0001\u0000\u0000\u0000\u0ad6\u0ad4\u0001"+
		"\u0000\u0000\u0000\u0ad7\u0ada\u0001\u0000\u0000\u0000\u0ad8\u0ad6\u0001"+
		"\u0000\u0000\u0000\u0ad8\u0ad9\u0001\u0000\u0000\u0000\u0ad9\u0181\u0001"+
		"\u0000\u0000\u0000\u0ada\u0ad8\u0001\u0000\u0000\u0000\u0adb\u0ae4\u0003"+
		"\u01b4\u00da\u0000\u0adc\u0ae4\u0003\u01b6\u00db\u0000\u0add\u0ae4\u0003"+
		"\u01c0\u00e0\u0000\u0ade\u0ae4\u0003\u01b8\u00dc\u0000\u0adf\u0ae4\u0003"+
		"\u01ba\u00dd\u0000\u0ae0\u0ae4\u0003\u01be\u00df\u0000\u0ae1\u0ae4\u0003"+
		"\u01bc\u00de\u0000\u0ae2\u0ae4\u0003\u01c2\u00e1\u0000\u0ae3\u0adb\u0001"+
		"\u0000\u0000\u0000\u0ae3\u0adc\u0001\u0000\u0000\u0000\u0ae3\u0add\u0001"+
		"\u0000\u0000\u0000\u0ae3\u0ade\u0001\u0000\u0000\u0000\u0ae3\u0adf\u0001"+
		"\u0000\u0000\u0000\u0ae3\u0ae0\u0001\u0000\u0000\u0000\u0ae3\u0ae1\u0001"+
		"\u0000\u0000\u0000\u0ae3\u0ae2\u0001\u0000\u0000\u0000\u0ae4\u0183\u0001"+
		"\u0000\u0000\u0000\u0ae5\u0ae6\u0005\u0096\u0000\u0000\u0ae6\u0ae7\u0003"+
		"\u0180\u00c0\u0000\u0ae7\u0ae8\u0003\u0186\u00c3\u0000\u0ae8\u0185\u0001"+
		"\u0000\u0000\u0000\u0ae9\u0aea\u0007,\u0000\u0000\u0aea\u0187\u0001\u0000"+
		"\u0000\u0000\u0aeb\u0aec\u0003\u018a\u00c5\u0000\u0aec\u0aed\u0007-\u0000"+
		"\u0000\u0aed\u0af2\u0003\u018a\u00c5\u0000\u0aee\u0aef\u0007-\u0000\u0000"+
		"\u0aef\u0af1\u0003\u018a\u00c5\u0000\u0af0\u0aee\u0001\u0000\u0000\u0000"+
		"\u0af1\u0af4\u0001\u0000\u0000\u0000\u0af2\u0af0\u0001\u0000\u0000\u0000"+
		"\u0af2\u0af3\u0001\u0000\u0000\u0000\u0af3\u0189\u0001\u0000\u0000\u0000"+
		"\u0af4\u0af2\u0001\u0000\u0000\u0000\u0af5\u0af6\u0005\u0168\u0000\u0000"+
		"\u0af6\u0af7\u0003\u0180\u00c0\u0000\u0af7\u0af8\u0005\u016b\u0000\u0000"+
		"\u0af8\u0aff\u0001\u0000\u0000\u0000\u0af9\u0aff\u0003\u018c\u00c6\u0000"+
		"\u0afa\u0aff\u0003\u0194\u00ca\u0000\u0afb\u0aff\u0003\u019c\u00ce\u0000"+
		"\u0afc\u0aff\u0003\u019e\u00cf\u0000\u0afd\u0aff\u0003\u0182\u00c1\u0000"+
		"\u0afe\u0af5\u0001\u0000\u0000\u0000\u0afe\u0af9\u0001\u0000\u0000\u0000"+
		"\u0afe\u0afa\u0001\u0000\u0000\u0000\u0afe\u0afb\u0001\u0000\u0000\u0000"+
		"\u0afe\u0afc\u0001\u0000\u0000\u0000\u0afe\u0afd\u0001\u0000\u0000\u0000"+
		"\u0aff\u018b\u0001\u0000\u0000\u0000\u0b00\u0b03\u0003\u018e\u00c7\u0000"+
		"\u0b01\u0b03\u0003\u0190\u00c8\u0000\u0b02\u0b00\u0001\u0000\u0000\u0000"+
		"\u0b02\u0b01\u0001\u0000\u0000\u0000\u0b03\u018d\u0001\u0000\u0000\u0000"+
		"\u0b04\u0b05\u0005#\u0000\u0000\u0b05\u0b0b\u0003\u0180\u00c0\u0000\u0b06"+
		"\u0b07\u0005\u0137\u0000\u0000\u0b07\u0b08\u0003\u0180\u00c0\u0000\u0b08"+
		"\u0b09\u0005\u0120\u0000\u0000\u0b09\u0b0a\u0003\u0180\u00c0\u0000\u0b0a"+
		"\u0b0c\u0001\u0000\u0000\u0000\u0b0b\u0b06\u0001\u0000\u0000\u0000\u0b0c"+
		"\u0b0d\u0001\u0000\u0000\u0000\u0b0d\u0b0b\u0001\u0000\u0000\u0000\u0b0d"+
		"\u0b0e\u0001\u0000\u0000\u0000\u0b0e\u0b11\u0001\u0000\u0000\u0000\u0b0f"+
		"\u0b10\u0005^\u0000\u0000\u0b10\u0b12\u0003\u0180\u00c0\u0000\u0b11\u0b0f"+
		"\u0001\u0000\u0000\u0000\u0b11\u0b12\u0001\u0000\u0000\u0000\u0b12\u0b13"+
		"\u0001\u0000\u0000\u0000\u0b13\u0b14\u0005b\u0000\u0000\u0b14\u018f\u0001"+
		"\u0000\u0000\u0000\u0b15\u0b1b\u0005#\u0000\u0000\u0b16\u0b17\u0005\u0137"+
		"\u0000\u0000\u0b17\u0b18\u0003\u0170\u00b8\u0000\u0b18\u0b19\u0005\u0120"+
		"\u0000\u0000\u0b19\u0b1a\u0003\u0180\u00c0\u0000\u0b1a\u0b1c\u0001\u0000"+
		"\u0000\u0000\u0b1b\u0b16\u0001\u0000\u0000\u0000\u0b1c\u0b1d\u0001\u0000"+
		"\u0000\u0000\u0b1d\u0b1b\u0001\u0000\u0000\u0000\u0b1d\u0b1e\u0001\u0000"+
		"\u0000\u0000\u0b1e\u0b21\u0001\u0000\u0000\u0000\u0b1f\u0b20\u0005^\u0000"+
		"\u0000\u0b20\u0b22\u0003\u0180\u00c0\u0000\u0b21\u0b1f\u0001\u0000\u0000"+
		"\u0000\u0b21\u0b22\u0001\u0000\u0000\u0000\u0b22\u0b23\u0001\u0000\u0000"+
		"\u0000\u0b23\u0b24\u0005b\u0000\u0000\u0b24\u0191\u0001\u0000\u0000\u0000"+
		"\u0b25\u0b26\u0003\u01b8\u00dc\u0000\u0b26\u0b27\u0005\u0003\u0000\u0000"+
		"\u0b27\u0b28\u0007.\u0000\u0000\u0b28\u0193\u0001\u0000\u0000\u0000\u0b29"+
		"\u0b2a\u0005\u0013\u0000\u0000\u0b2a\u0b2c\u0005\u0168\u0000\u0000\u0b2b"+
		"\u0b2d\u0003\u0196\u00cb\u0000\u0b2c\u0b2b\u0001\u0000\u0000\u0000\u0b2c"+
		"\u0b2d\u0001\u0000\u0000\u0000\u0b2d\u0b2e\u0001\u0000\u0000\u0000\u0b2e"+
		"\u0b2f\u0003\u0180\u00c0\u0000\u0b2f\u0b31\u0005\u016b\u0000\u0000\u0b30"+
		"\u0b32\u0003\u0198\u00cc\u0000\u0b31\u0b30\u0001\u0000\u0000\u0000\u0b31"+
		"\u0b32\u0001\u0000\u0000\u0000\u0b32\u0bc2\u0001\u0000\u0000\u0000\u0b33"+
		"\u0b34\u00059\u0000\u0000\u0b34\u0b3a\u0005\u0168\u0000\u0000\u0b35\u0b37"+
		"\u0003\u0196\u00cb\u0000\u0b36\u0b35\u0001\u0000\u0000\u0000\u0b36\u0b37"+
		"\u0001\u0000\u0000\u0000\u0b37\u0b38\u0001\u0000\u0000\u0000\u0b38\u0b3b"+
		"\u0003\u0180\u00c0\u0000\u0b39\u0b3b\u0005\u0166\u0000\u0000\u0b3a\u0b36"+
		"\u0001\u0000\u0000\u0000\u0b3a\u0b39\u0001\u0000\u0000\u0000\u0b3b\u0b3c"+
		"\u0001\u0000\u0000\u0000\u0b3c\u0b3e\u0005\u016b\u0000\u0000\u0b3d\u0b3f"+
		"\u0003\u0198\u00cc\u0000\u0b3e\u0b3d\u0001\u0000\u0000\u0000\u0b3e\u0b3f"+
		"\u0001\u0000\u0000\u0000\u0b3f\u0bc2\u0001\u0000\u0000\u0000\u0b40\u0b41"+
		"\u0005:\u0000\u0000\u0b41\u0b47\u0005\u0168\u0000\u0000\u0b42\u0b44\u0003"+
		"\u0196\u00cb\u0000\u0b43\u0b42\u0001\u0000\u0000\u0000\u0b43\u0b44\u0001"+
		"\u0000\u0000\u0000\u0b44\u0b45\u0001\u0000\u0000\u0000\u0b45\u0b48\u0003"+
		"\u0180\u00c0\u0000\u0b46\u0b48\u0005\u0166\u0000\u0000\u0b47\u0b43\u0001"+
		"\u0000\u0000\u0000\u0b47\u0b46\u0001\u0000\u0000\u0000\u0b48\u0b49\u0001"+
		"\u0000\u0000\u0000\u0b49\u0b4b\u0005\u016b\u0000\u0000\u0b4a\u0b4c\u0003"+
		"\u0198\u00cc\u0000\u0b4b\u0b4a\u0001\u0000\u0000\u0000\u0b4b\u0b4c\u0001"+
		"\u0000\u0000\u0000\u0b4c\u0bc2\u0001\u0000\u0000\u0000\u0b4d\u0b4e\u0005"+
		"\u0141\u0000\u0000\u0b4e\u0b4f\u0005\u0168\u0000\u0000\u0b4f\u0b50\u0005"+
		"\u016b\u0000\u0000\u0b50\u0bc2\u0003\u0198\u00cc\u0000\u0b51\u0b52\u0005"+
		"\u0145\u0000\u0000\u0b52\u0b53\u0005\u0168\u0000\u0000\u0b53\u0b54\u0005"+
		"\u016b\u0000\u0000\u0b54\u0bc2\u0003\u0198\u00cc\u0000\u0b55\u0b56\u0005"+
		"\u0146\u0000\u0000\u0b56\u0b57\u0005\u0168\u0000\u0000\u0b57\u0b58\u0003"+
		"\u0180\u00c0\u0000\u0b58\u0b59\u0005\u016b\u0000\u0000\u0b59\u0b5a\u0003"+
		"\u0198\u00cc\u0000\u0b5a\u0bc2\u0001\u0000\u0000\u0000\u0b5b\u0b5c\u0005"+
		"\u0147\u0000\u0000\u0b5c\u0b5d\u0005\u0168\u0000\u0000\u0b5d\u0b64\u0003"+
		"\u0180\u00c0\u0000\u0b5e\u0b5f\u0005\u015a\u0000\u0000\u0b5f\u0b62\u0003"+
		"\u0180\u00c0\u0000\u0b60\u0b61\u0005\u015a\u0000\u0000\u0b61\u0b63\u0003"+
		"\u0180\u00c0\u0000\u0b62\u0b60\u0001\u0000\u0000\u0000\u0b62\u0b63\u0001"+
		"\u0000\u0000\u0000\u0b63\u0b65\u0001\u0000\u0000\u0000\u0b64\u0b5e\u0001"+
		"\u0000\u0000\u0000\u0b64\u0b65\u0001\u0000\u0000\u0000\u0b65\u0b66\u0001"+
		"\u0000\u0000\u0000\u0b66\u0b67\u0005\u016b\u0000\u0000\u0b67\u0b68\u0003"+
		"\u0198\u00cc\u0000\u0b68\u0bc2\u0001\u0000\u0000\u0000\u0b69\u0b6a\u0005"+
		"\u0148\u0000\u0000\u0b6a\u0b6b\u0005\u0168\u0000\u0000\u0b6b\u0b6c\u0003"+
		"\u0180\u00c0\u0000\u0b6c\u0b6d\u0005\u016b\u0000\u0000\u0b6d\u0b6e\u0003"+
		"\u0198\u00cc\u0000\u0b6e\u0bc2\u0001\u0000\u0000\u0000\u0b6f\u0b70\u0005"+
		"\u0149\u0000\u0000\u0b70\u0b71\u0005\u0168\u0000\u0000\u0b71\u0b78\u0003"+
		"\u0180\u00c0\u0000\u0b72\u0b73\u0005\u015a\u0000\u0000\u0b73\u0b76\u0003"+
		"\u0180\u00c0\u0000\u0b74\u0b75\u0005\u015a\u0000\u0000\u0b75\u0b77\u0003"+
		"\u0180\u00c0\u0000\u0b76\u0b74\u0001\u0000\u0000\u0000\u0b76\u0b77\u0001"+
		"\u0000\u0000\u0000\u0b77\u0b79\u0001\u0000\u0000\u0000\u0b78\u0b72\u0001"+
		"\u0000\u0000\u0000\u0b78\u0b79\u0001\u0000\u0000\u0000\u0b79\u0b7a\u0001"+
		"\u0000\u0000\u0000\u0b7a\u0b7b\u0005\u016b\u0000\u0000\u0b7b\u0b7c\u0003"+
		"\u0198\u00cc\u0000\u0b7c\u0bc2\u0001\u0000\u0000\u0000\u0b7d\u0b7e\u0005"+
		"\u00b1\u0000\u0000\u0b7e\u0b80\u0005\u0168\u0000\u0000\u0b7f\u0b81\u0003"+
		"\u0196\u00cb\u0000\u0b80\u0b7f\u0001\u0000\u0000\u0000\u0b80\u0b81\u0001"+
		"\u0000\u0000\u0000\u0b81\u0b82\u0001\u0000\u0000\u0000\u0b82\u0b83\u0003"+
		"\u0180\u00c0\u0000\u0b83\u0b85\u0005\u016b\u0000\u0000\u0b84\u0b86\u0003"+
		"\u0198\u00cc\u0000\u0b85\u0b84\u0001\u0000\u0000\u0000\u0b85\u0b86\u0001"+
		"\u0000\u0000\u0000\u0b86\u0bc2\u0001\u0000\u0000\u0000\u0b87\u0b88\u0005"+
		"\u00b7\u0000\u0000\u0b88\u0b8a\u0005\u0168\u0000\u0000\u0b89\u0b8b\u0003"+
		"\u0196\u00cb\u0000\u0b8a\u0b89\u0001\u0000\u0000\u0000\u0b8a\u0b8b\u0001"+
		"\u0000\u0000\u0000\u0b8b\u0b8c\u0001\u0000\u0000\u0000\u0b8c\u0b8d\u0003"+
		"\u0180\u00c0\u0000\u0b8d\u0b8f\u0005\u016b\u0000\u0000\u0b8e\u0b90\u0003"+
		"\u0198\u00cc\u0000\u0b8f\u0b8e\u0001\u0000\u0000\u0000\u0b8f\u0b90\u0001"+
		"\u0000\u0000\u0000\u0b90\u0bc2\u0001\u0000\u0000\u0000\u0b91\u0b92\u0005"+
		"\u0152\u0000\u0000\u0b92\u0b93\u0005\u0168\u0000\u0000\u0b93\u0b94\u0005"+
		"\u016b\u0000\u0000\u0b94\u0bc2\u0003\u0198\u00cc\u0000\u0b95\u0b96\u0005"+
		"\u0153\u0000\u0000\u0b96\u0b97\u0005\u0168\u0000\u0000\u0b97\u0b98\u0005"+
		"\u016b\u0000\u0000\u0b98\u0bc2\u0003\u0198\u00cc\u0000\u0b99\u0b9a\u0005"+
		"\u0154\u0000\u0000\u0b9a\u0b9c\u0005\u0168\u0000\u0000\u0b9b\u0b9d\u0003"+
		"\u0196\u00cb\u0000\u0b9c\u0b9b\u0001\u0000\u0000\u0000\u0b9c\u0b9d\u0001"+
		"\u0000\u0000\u0000\u0b9d\u0b9e\u0001\u0000\u0000\u0000\u0b9e\u0b9f\u0003"+
		"\u0180\u00c0\u0000\u0b9f\u0ba1\u0005\u016b\u0000\u0000\u0ba0\u0ba2\u0003"+
		"\u0198\u00cc\u0000\u0ba1\u0ba0\u0001\u0000\u0000\u0000\u0ba1\u0ba2\u0001"+
		"\u0000\u0000\u0000\u0ba2\u0bc2\u0001\u0000\u0000\u0000\u0ba3\u0ba4\u0005"+
		"\u0118\u0000\u0000\u0ba4\u0ba6\u0005\u0168\u0000\u0000\u0ba5\u0ba7\u0003"+
		"\u0196\u00cb\u0000\u0ba6\u0ba5\u0001\u0000\u0000\u0000\u0ba6\u0ba7\u0001"+
		"\u0000\u0000\u0000\u0ba7\u0ba8\u0001\u0000\u0000\u0000\u0ba8\u0ba9\u0003"+
		"\u0180\u00c0\u0000\u0ba9\u0bab\u0005\u016b\u0000\u0000\u0baa\u0bac\u0003"+
		"\u0198\u00cc\u0000\u0bab\u0baa\u0001\u0000\u0000\u0000\u0bab\u0bac\u0001"+
		"\u0000\u0000\u0000\u0bac\u0bc2\u0001\u0000\u0000\u0000\u0bad\u0bae\u0005"+
		"\u0132\u0000\u0000\u0bae\u0bb0\u0005\u0168\u0000\u0000\u0baf\u0bb1\u0003"+
		"\u0196\u00cb\u0000\u0bb0\u0baf\u0001\u0000\u0000\u0000\u0bb0\u0bb1\u0001"+
		"\u0000\u0000\u0000\u0bb1\u0bb2\u0001\u0000\u0000\u0000\u0bb2\u0bb3\u0003"+
		"\u0180\u00c0\u0000\u0bb3\u0bb5\u0005\u016b\u0000\u0000\u0bb4\u0bb6\u0003"+
		"\u0198\u00cc\u0000\u0bb5\u0bb4\u0001\u0000\u0000\u0000\u0bb5\u0bb6\u0001"+
		"\u0000\u0000\u0000\u0bb6\u0bc2\u0001\u0000\u0000\u0000\u0bb7\u0bb8\u0005"+
		"\u0156\u0000\u0000\u0bb8\u0bba\u0005\u0168\u0000\u0000\u0bb9\u0bbb\u0003"+
		"\u0196\u00cb\u0000\u0bba\u0bb9\u0001\u0000\u0000\u0000\u0bba\u0bbb\u0001"+
		"\u0000\u0000\u0000\u0bbb\u0bbc\u0001\u0000\u0000\u0000\u0bbc\u0bbd\u0003"+
		"\u0180\u00c0\u0000\u0bbd\u0bbf\u0005\u016b\u0000\u0000\u0bbe\u0bc0\u0003"+
		"\u0198\u00cc\u0000\u0bbf\u0bbe\u0001\u0000\u0000\u0000\u0bbf\u0bc0\u0001"+
		"\u0000\u0000\u0000\u0bc0\u0bc2\u0001\u0000\u0000\u0000\u0bc1\u0b29\u0001"+
		"\u0000\u0000\u0000\u0bc1\u0b33\u0001\u0000\u0000\u0000\u0bc1\u0b40\u0001"+
		"\u0000\u0000\u0000\u0bc1\u0b4d\u0001\u0000\u0000\u0000\u0bc1\u0b51\u0001"+
		"\u0000\u0000\u0000\u0bc1\u0b55\u0001\u0000\u0000\u0000\u0bc1\u0b5b\u0001"+
		"\u0000\u0000\u0000\u0bc1\u0b69\u0001\u0000\u0000\u0000\u0bc1\u0b6f\u0001"+
		"\u0000\u0000\u0000\u0bc1\u0b7d\u0001\u0000\u0000\u0000\u0bc1\u0b87\u0001"+
		"\u0000\u0000\u0000\u0bc1\u0b91\u0001\u0000\u0000\u0000\u0bc1\u0b95\u0001"+
		"\u0000\u0000\u0000\u0bc1\u0b99\u0001\u0000\u0000\u0000\u0bc1\u0ba3\u0001"+
		"\u0000\u0000\u0000\u0bc1\u0bad\u0001\u0000\u0000\u0000\u0bc1\u0bb7\u0001"+
		"\u0000\u0000\u0000\u0bc2\u0195\u0001\u0000\u0000\u0000\u0bc3\u0bc4\u0007"+
		"%\u0000\u0000\u0bc4\u0197\u0001\u0000\u0000\u0000\u0bc5\u0bc6\u0005\u00cf"+
		"\u0000\u0000\u0bc6\u0bc8\u0005\u0168\u0000\u0000\u0bc7\u0bc9\u0003\u019a"+
		"\u00cd\u0000\u0bc8\u0bc7\u0001\u0000\u0000\u0000\u0bc8\u0bc9\u0001\u0000"+
		"\u0000\u0000\u0bc9\u0bcb\u0001\u0000\u0000\u0000\u0bca\u0bcc\u0003\u0154"+
		"\u00aa\u0000\u0bcb\u0bca\u0001\u0000\u0000\u0000\u0bcb\u0bcc\u0001\u0000"+
		"\u0000\u0000\u0bcc\u0bcd\u0001\u0000\u0000\u0000\u0bcd\u0bce\u0005\u016b"+
		"\u0000\u0000\u0bce\u0199\u0001\u0000\u0000\u0000\u0bcf\u0bd0\u0005\u00d3"+
		"\u0000\u0000\u0bd0\u0bd1\u0005\u001e\u0000\u0000\u0bd1\u0bd6\u0003\u0180"+
		"\u00c0\u0000\u0bd2\u0bd3\u0005\u015a\u0000\u0000\u0bd3\u0bd5\u0003\u0180"+
		"\u00c0\u0000\u0bd4\u0bd2\u0001\u0000\u0000\u0000\u0bd5\u0bd8\u0001\u0000"+
		"\u0000\u0000\u0bd6\u0bd4\u0001\u0000\u0000\u0000\u0bd6\u0bd7\u0001\u0000"+
		"\u0000\u0000\u0bd7\u019b\u0001\u0000\u0000\u0000\u0bd8\u0bd6\u0001\u0000"+
		"\u0000\u0000\u0bd9\u0ca2\u0005\u0140\u0000\u0000\u0bda\u0bdb\u0005%\u0000"+
		"\u0000\u0bdb\u0bdc\u0005\u0168\u0000\u0000\u0bdc\u0bdd\u0003\u0180\u00c0"+
		"\u0000\u0bdd\u0bde\u0005\u000e\u0000\u0000\u0bde\u0be0\u0003x<\u0000\u0bdf"+
		"\u0be1\u0003z=\u0000\u0be0\u0bdf\u0001\u0000\u0000\u0000\u0be0\u0be1\u0001"+
		"\u0000\u0000\u0000\u0be1\u0be2\u0001\u0000\u0000\u0000\u0be2\u0be3\u0005"+
		"\u016b\u0000\u0000\u0be3\u0ca2\u0001\u0000\u0000\u0000\u0be4\u0be5\u0005"+
		"9\u0000\u0000\u0be5\u0be8\u0005\u0168\u0000\u0000\u0be6\u0be9\u0003\u0180"+
		"\u00c0\u0000\u0be7\u0be9\u0005\u0166\u0000\u0000\u0be8\u0be6\u0001\u0000"+
		"\u0000\u0000\u0be8\u0be7\u0001\u0000\u0000\u0000\u0be9\u0bea\u0001\u0000"+
		"\u0000\u0000\u0bea\u0ca2\u0005\u016b\u0000\u0000\u0beb\u0ca2\u0005\u0142"+
		"\u0000\u0000\u0bec\u0bed\u0005?\u0000\u0000\u0bed\u0ca2\u0005D\u0000\u0000"+
		"\u0bee\u0bf2\u0005\u0143\u0000\u0000\u0bef\u0bf0\u0005?\u0000\u0000\u0bf0"+
		"\u0bf2\u0005\u0121\u0000\u0000\u0bf1\u0bee\u0001\u0000\u0000\u0000\u0bf1"+
		"\u0bef\u0001\u0000\u0000\u0000\u0bf2\u0bf7\u0001\u0000\u0000\u0000\u0bf3"+
		"\u0bf4\u0005\u0168\u0000\u0000\u0bf4\u0bf5\u0003\u0180\u00c0\u0000\u0bf5"+
		"\u0bf6\u0005\u016b\u0000\u0000\u0bf6\u0bf8\u0001\u0000\u0000\u0000\u0bf7"+
		"\u0bf3\u0001\u0000\u0000\u0000\u0bf7\u0bf8\u0001\u0000\u0000\u0000\u0bf8"+
		"\u0ca2\u0001\u0000\u0000\u0000\u0bf9\u0ca2\u0005\u0144\u0000\u0000\u0bfa"+
		"\u0bfb\u0005?\u0000\u0000\u0bfb\u0ca2\u0005\u0157\u0000\u0000\u0bfc\u0bfd"+
		"\u0005\u014a\u0000\u0000\u0bfd\u0bfe\u0005\u0168\u0000\u0000\u0bfe\u0c0b"+
		"\u0003\u0180\u00c0\u0000\u0bff\u0c00\u0005\u015a\u0000\u0000\u0c00\u0c08"+
		"\u0003\u0180\u00c0\u0000\u0c01\u0c02\u0005\u015a\u0000\u0000\u0c02\u0c03"+
		"\u0003\u0180\u00c0\u0000\u0c03\u0c04\u0005\u015e\u0000\u0000\u0c04\u0c05"+
		"\u0003\u0180\u00c0\u0000\u0c05\u0c07\u0001\u0000\u0000\u0000\u0c06\u0c01"+
		"\u0001\u0000\u0000\u0000\u0c07\u0c0a\u0001\u0000\u0000\u0000\u0c08\u0c06"+
		"\u0001\u0000\u0000\u0000\u0c08\u0c09\u0001\u0000\u0000\u0000\u0c09\u0c0c"+
		"\u0001\u0000\u0000\u0000\u0c0a\u0c08\u0001\u0000\u0000\u0000\u0c0b\u0bff"+
		"\u0001\u0000\u0000\u0000\u0c0b\u0c0c\u0001\u0000\u0000\u0000\u0c0c\u0c0d"+
		"\u0001\u0000\u0000\u0000\u0c0d\u0c0e\u0005\u016b\u0000\u0000\u0c0e\u0ca2"+
		"\u0001\u0000\u0000\u0000\u0c0f\u0c10\u0005\u014b\u0000\u0000\u0c10\u0c11"+
		"\u0005\u0168\u0000\u0000\u0c11\u0c1e\u0003\u0180\u00c0\u0000\u0c12\u0c13"+
		"\u0005\u015a\u0000\u0000\u0c13\u0c1b\u0003\u0180\u00c0\u0000\u0c14\u0c15"+
		"\u0005\u015a\u0000\u0000\u0c15\u0c16\u0003\u0180\u00c0\u0000\u0c16\u0c17"+
		"\u0005\u015e\u0000\u0000\u0c17\u0c18\u0003\u0180\u00c0\u0000\u0c18\u0c1a"+
		"\u0001\u0000\u0000\u0000\u0c19\u0c14\u0001\u0000\u0000\u0000\u0c1a\u0c1d"+
		"\u0001\u0000\u0000\u0000\u0c1b\u0c19\u0001\u0000\u0000\u0000\u0c1b\u0c1c"+
		"\u0001\u0000\u0000\u0000\u0c1c\u0c1f\u0001\u0000\u0000\u0000\u0c1d\u0c1b"+
		"\u0001\u0000\u0000\u0000\u0c1e\u0c12\u0001\u0000\u0000\u0000\u0c1e\u0c1f"+
		"\u0001\u0000\u0000\u0000\u0c1f\u0c20\u0001\u0000\u0000\u0000\u0c20\u0c21"+
		"\u0005\u016b\u0000\u0000\u0c21\u0ca2\u0001\u0000\u0000\u0000\u0c22\u0c23"+
		"\u0005\u014c\u0000\u0000\u0c23\u0c24\u0005\u0168\u0000\u0000\u0c24\u0c31"+
		"\u0003\u0180\u00c0\u0000\u0c25\u0c26\u0005\u015a\u0000\u0000\u0c26\u0c2e"+
		"\u0003\u0180\u00c0\u0000\u0c27\u0c28\u0005\u015a\u0000\u0000\u0c28\u0c29"+
		"\u0003\u0180\u00c0\u0000\u0c29\u0c2a\u0005\u015e\u0000\u0000\u0c2a\u0c2b"+
		"\u0003\u0180\u00c0\u0000\u0c2b\u0c2d\u0001\u0000\u0000\u0000\u0c2c\u0c27"+
		"\u0001\u0000\u0000\u0000\u0c2d\u0c30\u0001\u0000\u0000\u0000\u0c2e\u0c2c"+
		"\u0001\u0000\u0000\u0000\u0c2e\u0c2f\u0001\u0000\u0000\u0000\u0c2f\u0c32"+
		"\u0001\u0000\u0000\u0000\u0c30\u0c2e\u0001\u0000\u0000\u0000\u0c31\u0c25"+
		"\u0001\u0000\u0000\u0000\u0c31\u0c32\u0001\u0000\u0000\u0000\u0c32\u0c33"+
		"\u0001\u0000\u0000\u0000\u0c33\u0c34\u0005\u016b\u0000\u0000\u0c34\u0ca2"+
		"\u0001\u0000\u0000\u0000\u0c35\u0c36\u0005\u014d\u0000\u0000\u0c36\u0c37"+
		"\u0005\u0168\u0000\u0000\u0c37\u0c44\u0003\u0180\u00c0\u0000\u0c38\u0c39"+
		"\u0005\u015a\u0000\u0000\u0c39\u0c41\u0003\u0180\u00c0\u0000\u0c3a\u0c3b"+
		"\u0005\u015a\u0000\u0000\u0c3b\u0c3c\u0003\u0180\u00c0\u0000\u0c3c\u0c3d"+
		"\u0005\u015e\u0000\u0000\u0c3d\u0c3e\u0003\u0180\u00c0\u0000\u0c3e\u0c40"+
		"\u0001\u0000\u0000\u0000\u0c3f\u0c3a\u0001\u0000\u0000\u0000\u0c40\u0c43"+
		"\u0001\u0000\u0000\u0000\u0c41\u0c3f\u0001\u0000\u0000\u0000\u0c41\u0c42"+
		"\u0001\u0000\u0000\u0000\u0c42\u0c45\u0001\u0000\u0000\u0000\u0c43\u0c41"+
		"\u0001\u0000\u0000\u0000\u0c44\u0c38\u0001\u0000\u0000\u0000\u0c44\u0c45"+
		"\u0001\u0000\u0000\u0000\u0c45\u0c46\u0001\u0000\u0000\u0000\u0c46\u0c47"+
		"\u0005\u016b\u0000\u0000\u0c47\u0ca2\u0001\u0000\u0000\u0000\u0c48\u0c49"+
		"\u0005\u014e\u0000\u0000\u0c49\u0c4a\u0005\u0168\u0000\u0000\u0c4a\u0c57"+
		"\u0003\u0180\u00c0\u0000\u0c4b\u0c4c\u0005\u015a\u0000\u0000\u0c4c\u0c54"+
		"\u0003\u0180\u00c0\u0000\u0c4d\u0c4e\u0005\u015a\u0000\u0000\u0c4e\u0c4f"+
		"\u0003\u0180\u00c0\u0000\u0c4f\u0c50\u0005\u015e\u0000\u0000\u0c50\u0c51"+
		"\u0003\u0180\u00c0\u0000\u0c51\u0c53\u0001\u0000\u0000\u0000\u0c52\u0c4d"+
		"\u0001\u0000\u0000\u0000\u0c53\u0c56\u0001\u0000\u0000\u0000\u0c54\u0c52"+
		"\u0001\u0000\u0000\u0000\u0c54\u0c55\u0001\u0000\u0000\u0000\u0c55\u0c58"+
		"\u0001\u0000\u0000\u0000\u0c56\u0c54\u0001\u0000\u0000\u0000\u0c57\u0c4b"+
		"\u0001\u0000\u0000\u0000\u0c57\u0c58\u0001\u0000\u0000\u0000\u0c58\u0c59"+
		"\u0001\u0000\u0000\u0000\u0c59\u0c5a\u0005\u016b\u0000\u0000\u0c5a\u0ca2"+
		"\u0001\u0000\u0000\u0000\u0c5b\u0c5c\u0005\u014f\u0000\u0000\u0c5c\u0c5d"+
		"\u0005\u0168\u0000\u0000\u0c5d\u0c6a\u0003\u0180\u00c0\u0000\u0c5e\u0c5f"+
		"\u0005\u015a\u0000\u0000\u0c5f\u0c67\u0003\u0180\u00c0\u0000\u0c60\u0c61"+
		"\u0005\u015a\u0000\u0000\u0c61\u0c62\u0003\u0180\u00c0\u0000\u0c62\u0c63"+
		"\u0005\u015e\u0000\u0000\u0c63\u0c64\u0003\u0180\u00c0\u0000\u0c64\u0c66"+
		"\u0001\u0000\u0000\u0000\u0c65\u0c60\u0001\u0000\u0000\u0000\u0c66\u0c69"+
		"\u0001\u0000\u0000\u0000\u0c67\u0c65\u0001\u0000\u0000\u0000\u0c67\u0c68"+
		"\u0001\u0000\u0000\u0000\u0c68\u0c6b\u0001\u0000\u0000\u0000\u0c69\u0c67"+
		"\u0001\u0000\u0000\u0000\u0c6a\u0c5e\u0001\u0000\u0000\u0000\u0c6a\u0c6b"+
		"\u0001\u0000\u0000\u0000\u0c6b\u0c6c\u0001\u0000\u0000\u0000\u0c6c\u0c6d"+
		"\u0005\u016b\u0000\u0000\u0c6d\u0ca2\u0001\u0000\u0000\u0000\u0c6e\u0c6f"+
		"\u0005\u0150\u0000\u0000\u0c6f\u0c70\u0005\u0168\u0000\u0000\u0c70\u0c78"+
		"\u0003\u0180\u00c0\u0000\u0c71\u0c72\u0005\u015a\u0000\u0000\u0c72\u0c73"+
		"\u0003\u0180\u00c0\u0000\u0c73\u0c74\u0005\u015e\u0000\u0000\u0c74\u0c75"+
		"\u0003\u0180\u00c0\u0000\u0c75\u0c77\u0001\u0000\u0000\u0000\u0c76\u0c71"+
		"\u0001\u0000\u0000\u0000\u0c77\u0c7a\u0001\u0000\u0000\u0000\u0c78\u0c76"+
		"\u0001\u0000\u0000\u0000\u0c78\u0c79\u0001\u0000\u0000\u0000\u0c79\u0c7b"+
		"\u0001\u0000\u0000\u0000\u0c7a\u0c78\u0001\u0000\u0000\u0000\u0c7b\u0c7c"+
		"\u0005\u016b\u0000\u0000\u0c7c\u0ca2\u0001\u0000\u0000\u0000\u0c7d\u0c7e"+
		"\u0005\u0151\u0000\u0000\u0c7e\u0c7f\u0005\u0168\u0000\u0000\u0c7f\u0c85"+
		"\u0003\u0180\u00c0\u0000\u0c80\u0c81\u0005\u015a\u0000\u0000\u0c81\u0c82"+
		"\u0003\u0180\u00c0\u0000\u0c82\u0c83\u0005\u015e\u0000\u0000\u0c83\u0c84"+
		"\u0003\u0180\u00c0\u0000\u0c84\u0c86\u0001\u0000\u0000\u0000\u0c85\u0c80"+
		"\u0001\u0000\u0000\u0000\u0c86\u0c87\u0001\u0000\u0000\u0000\u0c87\u0c85"+
		"\u0001\u0000\u0000\u0000\u0c87\u0c88\u0001\u0000\u0000\u0000\u0c88\u0c8b"+
		"\u0001\u0000\u0000\u0000\u0c89\u0c8a\u0005\u015a\u0000\u0000\u0c8a\u0c8c"+
		"\u0003\u0180\u00c0\u0000\u0c8b\u0c89\u0001\u0000\u0000\u0000\u0c8b\u0c8c"+
		"\u0001\u0000\u0000\u0000\u0c8c\u0c8d\u0001\u0000\u0000\u0000\u0c8d\u0c8e"+
		"\u0005\u016b\u0000\u0000\u0c8e\u0ca2\u0001\u0000\u0000\u0000\u0c8f\u0c90"+
		"\u0005\u00f8\u0000\u0000\u0c90\u0c91\u0005\u0168\u0000\u0000\u0c91\u0c92"+
		"\u0003\u0180\u00c0\u0000\u0c92\u0c93\u0005\u016b\u0000\u0000\u0c93\u0ca2"+
		"\u0001\u0000\u0000\u0000\u0c94\u0c95\u0005\u0117\u0000\u0000\u0c95\u0c96"+
		"\u0005\u0168\u0000\u0000\u0c96\u0c97\u0003\u0180\u00c0\u0000\u0c97\u0c98"+
		"\u0005w\u0000\u0000\u0c98\u0c9b\u0003\u0180\u00c0\u0000\u0c99\u0c9a\u0005"+
		"s\u0000\u0000\u0c9a\u0c9c\u0003\u0180\u00c0\u0000\u0c9b\u0c99\u0001\u0000"+
		"\u0000\u0000\u0c9b\u0c9c\u0001\u0000\u0000\u0000\u0c9c\u0c9d\u0001\u0000"+
		"\u0000\u0000\u0c9d\u0c9e\u0005\u016b\u0000\u0000\u0c9e\u0ca2\u0001\u0000"+
		"\u0000\u0000\u0c9f\u0ca2\u0005\u0155\u0000\u0000\u0ca0\u0ca2\u0005\u0157"+
		"\u0000\u0000\u0ca1\u0bd9\u0001\u0000\u0000\u0000\u0ca1\u0bda\u0001\u0000"+
		"\u0000\u0000\u0ca1\u0be4\u0001\u0000\u0000\u0000\u0ca1\u0beb\u0001\u0000"+
		"\u0000\u0000\u0ca1\u0bec\u0001\u0000\u0000\u0000\u0ca1\u0bf1\u0001\u0000"+
		"\u0000\u0000\u0ca1\u0bf9\u0001\u0000\u0000\u0000\u0ca1\u0bfa\u0001\u0000"+
		"\u0000\u0000\u0ca1\u0bfc\u0001\u0000\u0000\u0000\u0ca1\u0c0f\u0001\u0000"+
		"\u0000\u0000\u0ca1\u0c22\u0001\u0000\u0000\u0000\u0ca1\u0c35\u0001\u0000"+
		"\u0000\u0000\u0ca1\u0c48\u0001\u0000\u0000\u0000\u0ca1\u0c5b\u0001\u0000"+
		"\u0000\u0000\u0ca1\u0c6e\u0001\u0000\u0000\u0000\u0ca1\u0c7d\u0001\u0000"+
		"\u0000\u0000\u0ca1\u0c8f\u0001\u0000\u0000\u0000\u0ca1\u0c94\u0001\u0000"+
		"\u0000\u0000\u0ca1\u0c9f\u0001\u0000\u0000\u0000\u0ca1\u0ca0\u0001\u0000"+
		"\u0000\u0000\u0ca2\u019d\u0001\u0000\u0000\u0000\u0ca3\u0ca4\u0003\u01b8"+
		"\u00dc\u0000\u0ca4\u0ca6\u0005\u0168\u0000\u0000\u0ca5\u0ca7\u0003\u01a0"+
		"\u00d0\u0000\u0ca6\u0ca5\u0001\u0000\u0000\u0000\u0ca6\u0ca7\u0001\u0000"+
		"\u0000\u0000\u0ca7\u0ca8\u0001\u0000\u0000\u0000\u0ca8\u0ca9\u0005\u016b"+
		"\u0000\u0000\u0ca9\u019f\u0001\u0000\u0000\u0000\u0caa\u0caf\u0003\u01a2"+
		"\u00d1\u0000\u0cab\u0cac\u0005\u015a\u0000\u0000\u0cac\u0cae\u0003\u01a2"+
		"\u00d1\u0000\u0cad\u0cab\u0001\u0000\u0000\u0000\u0cae\u0cb1\u0001\u0000"+
		"\u0000\u0000\u0caf\u0cad\u0001\u0000\u0000\u0000\u0caf\u0cb0\u0001\u0000"+
		"\u0000\u0000\u0cb0\u01a1\u0001\u0000\u0000\u0000\u0cb1\u0caf\u0001\u0000"+
		"\u0000\u0000\u0cb2\u0cb8\u0004\u00d1\f\u0000\u0cb3\u0cb4\u0003\u01b8\u00dc"+
		"\u0000\u0cb4\u0cb6\u0005\u015e\u0000\u0000\u0cb5\u0cb7\u0005\u0162\u0000"+
		"\u0000\u0cb6\u0cb5\u0001\u0000\u0000\u0000\u0cb6\u0cb7\u0001\u0000\u0000"+
		"\u0000\u0cb7\u0cb9\u0001\u0000\u0000\u0000\u0cb8\u0cb3\u0001\u0000\u0000"+
		"\u0000\u0cb8\u0cb9\u0001\u0000\u0000\u0000\u0cb9\u0cba\u0001\u0000\u0000"+
		"\u0000\u0cba\u0cbb\u0003\u0180\u00c0\u0000\u0cbb\u01a3\u0001\u0000\u0000"+
		"\u0000\u0cbc\u0cbf\u0003\u011a\u008d\u0000\u0cbd\u0cbf\u0003\u0180\u00c0"+
		"\u0000\u0cbe\u0cbc\u0001\u0000\u0000\u0000\u0cbe\u0cbd\u0001\u0000\u0000"+
		"\u0000\u0cbf\u01a5\u0001\u0000\u0000\u0000\u0cc0\u0cc3\u0003\u01b2\u00d9"+
		"\u0000\u0cc1\u0cc3\u0003\u0180\u00c0\u0000\u0cc2\u0cc0\u0001\u0000\u0000"+
		"\u0000\u0cc2\u0cc1\u0001\u0000\u0000\u0000\u0cc3\u01a7\u0001\u0000\u0000"+
		"\u0000\u0cc4\u0cc8\u0005\u0083\u0000\u0000\u0cc5\u0cc7\u0003\u01aa\u00d5"+
		"\u0000\u0cc6\u0cc5\u0001\u0000\u0000\u0000\u0cc7\u0cca\u0001\u0000\u0000"+
		"\u0000\u0cc8\u0cc6\u0001\u0000\u0000\u0000\u0cc8\u0cc9\u0001\u0000\u0000"+
		"\u0000\u0cc9\u01a9\u0001\u0000\u0000\u0000\u0cca\u0cc8\u0001\u0000\u0000"+
		"\u0000\u0ccb\u0ccc\u0005\u016e\u0000\u0000\u0ccc\u0ccd\u0003\u01b8\u00dc"+
		"\u0000\u0ccd\u0cce\u0003\u0180\u00c0\u0000\u0cce\u0cd8\u0001\u0000\u0000"+
		"\u0000\u0ccf\u0cd0\u0005\u016e\u0000\u0000\u0cd0\u0cd1\u0003\u01b8\u00dc"+
		"\u0000\u0cd1\u0cd2\u0005\u016f\u0000\u0000\u0cd2\u0cd3\u0005\u015e\u0000"+
		"\u0000\u0cd3\u0cd4\u0003\u0180\u00c0\u0000\u0cd4\u0cd8\u0001\u0000\u0000"+
		"\u0000\u0cd5\u0cd6\u0005\u016e\u0000\u0000\u0cd6\u0cd8\u0003\u01b8\u00dc"+
		"\u0000\u0cd7\u0ccb\u0001\u0000\u0000\u0000\u0cd7\u0ccf\u0001\u0000\u0000"+
		"\u0000\u0cd7\u0cd5\u0001\u0000\u0000\u0000\u0cd8\u01ab\u0001\u0000\u0000"+
		"\u0000\u0cd9\u0cda\u0005\u0005\u0000\u0000\u0cda\u0cdb\u0003\u01ae\u00d7"+
		"\u0000\u0cdb\u0cdc\u0005\u016d\u0000\u0000\u0cdc\u0cdf\u0001\u0000\u0000"+
		"\u0000\u0cdd\u0cdf\u0003\u01b0\u00d8\u0000\u0cde\u0cd9\u0001\u0000\u0000"+
		"\u0000\u0cde\u0cdd\u0001\u0000\u0000\u0000\u0cdf\u01ad\u0001\u0000\u0000"+
		"\u0000\u0ce0\u0ce2\t\u0000\u0000\u0000\u0ce1\u0ce0\u0001\u0000\u0000\u0000"+
		"\u0ce2\u0ce5\u0001\u0000\u0000\u0000\u0ce3\u0ce4\u0001\u0000\u0000\u0000"+
		"\u0ce3\u0ce1\u0001\u0000\u0000\u0000\u0ce4\u01af\u0001\u0000\u0000\u0000"+
		"\u0ce5\u0ce3\u0001\u0000\u0000\u0000\u0ce6\u0ce7\u0005\u0084\u0000\u0000"+
		"\u0ce7\u0ce8\u0003\u0180\u00c0\u0000\u0ce8\u01b1\u0001\u0000\u0000\u0000"+
		"\u0ce9\u0cf8\u0005\u0177\u0000\u0000\u0cea\u0cee\u0005\u015c\u0000\u0000"+
		"\u0ceb\u0cec\u0005\u0004\u0000\u0000\u0cec\u0cee\u0005\u015c\u0000\u0000"+
		"\u0ced\u0cea\u0001\u0000\u0000\u0000\u0ced\u0ceb\u0001\u0000\u0000\u0000"+
		"\u0ced\u0cee\u0001\u0000\u0000\u0000\u0cee\u0cef\u0001\u0000\u0000\u0000"+
		"\u0cef\u0cf4\u0003\u01b8\u00dc\u0000\u0cf0\u0cf1\u0005\u015c\u0000\u0000"+
		"\u0cf1\u0cf3\u0003\u01b8\u00dc\u0000\u0cf2\u0cf0\u0001\u0000\u0000\u0000"+
		"\u0cf3\u0cf6\u0001\u0000\u0000\u0000\u0cf4\u0cf2\u0001\u0000\u0000\u0000"+
		"\u0cf4\u0cf5\u0001\u0000\u0000\u0000\u0cf5\u0cf8\u0001\u0000\u0000\u0000"+
		"\u0cf6\u0cf4\u0001\u0000\u0000\u0000\u0cf7\u0ce9\u0001\u0000\u0000\u0000"+
		"\u0cf7\u0ced\u0001\u0000\u0000\u0000\u0cf8\u01b3\u0001\u0000\u0000\u0000"+
		"\u0cf9\u0cfa\u0005D\u0000\u0000\u0cfa\u0cfb\u0003\u01ba\u00dd\u0000\u0cfb"+
		"\u01b5\u0001\u0000\u0000\u0000\u0cfc\u0cfd\u0005\u0121\u0000\u0000\u0cfd"+
		"\u0cfe\u0003\u01ba\u00dd\u0000\u0cfe\u01b7\u0001\u0000\u0000\u0000\u0cff"+
		"\u0d01\u0005\u016e\u0000\u0000\u0d00\u0cff\u0001\u0000\u0000\u0000\u0d00"+
		"\u0d01\u0001\u0000\u0000\u0000\u0d01\u0d04\u0001\u0000\u0000\u0000\u0d02"+
		"\u0d05\u0005\u016f\u0000\u0000\u0d03\u0d05\u0003\u01c4\u00e2\u0000\u0d04"+
		"\u0d02\u0001\u0000\u0000\u0000\u0d04\u0d03\u0001\u0000\u0000\u0000\u0d05"+
		"\u0d0d\u0001\u0000\u0000\u0000\u0d06\u0d09\u0005\u0004\u0000\u0000\u0d07"+
		"\u0d0a\u0005\u016f\u0000\u0000\u0d08\u0d0a\u0003\u01c4\u00e2\u0000\u0d09"+
		"\u0d07\u0001\u0000\u0000\u0000\u0d09\u0d08\u0001\u0000\u0000\u0000\u0d0a"+
		"\u0d0c\u0001\u0000\u0000\u0000\u0d0b\u0d06\u0001\u0000\u0000\u0000\u0d0c"+
		"\u0d0f\u0001\u0000\u0000\u0000\u0d0d\u0d0b\u0001\u0000\u0000\u0000\u0d0d"+
		"\u0d0e\u0001\u0000\u0000\u0000\u0d0e\u01b9\u0001\u0000\u0000\u0000\u0d0f"+
		"\u0d0d\u0001\u0000\u0000\u0000\u0d10\u0d13\u0005\u0170\u0000\u0000\u0d11"+
		"\u0d13\u0005\u0171\u0000\u0000\u0d12\u0d10\u0001\u0000\u0000\u0000\u0d12"+
		"\u0d11\u0001\u0000\u0000\u0000\u0d13\u01bb\u0001\u0000\u0000\u0000\u0d14"+
		"\u0d16\u0007/\u0000\u0000\u0d15\u0d14\u0001\u0000\u0000\u0000\u0d15\u0d16"+
		"\u0001\u0000\u0000\u0000\u0d16\u0d17\u0001\u0000\u0000\u0000\u0d17\u0d18"+
		"\u0005\u0172\u0000\u0000\u0d18\u01bd\u0001\u0000\u0000\u0000\u0d19\u0d1b"+
		"\u0007/\u0000\u0000\u0d1a\u0d19\u0001\u0000\u0000\u0000\u0d1a\u0d1b\u0001"+
		"\u0000\u0000\u0000\u0d1b\u0d1c\u0001\u0000\u0000\u0000\u0d1c\u0d1d\u0005"+
		"\u0173\u0000\u0000\u0d1d\u01bf\u0001\u0000\u0000\u0000\u0d1e\u0d1f\u0007"+
		"0\u0000\u0000\u0d1f\u01c1\u0001\u0000\u0000\u0000\u0d20\u0d21\u0005\u00c3"+
		"\u0000\u0000\u0d21\u01c3\u0001\u0000\u0000\u0000\u0d22\u0d23\u00071\u0000"+
		"\u0000\u0d23\u01c5\u0001\u0000\u0000\u0000\u01ab\u01cb\u01ce\u01d2\u01d5"+
		"\u01da\u01e1\u01e7\u01e9\u01f2\u01f5\u01f7\u0236\u023e\u024e\u0255\u0258"+
		"\u025d\u0261\u026a\u026f\u0277\u027c\u0285\u0291\u0296\u0299\u02a7\u02ae"+
		"\u02b7\u02c8\u02cc\u02d4\u02df\u02e9\u02f1\u02f8\u02fc\u0300\u0305\u0309"+
		"\u030e\u0312\u0316\u0320\u0324\u0329\u032e\u0332\u033f\u0344\u034a\u0353"+
		"\u0357\u035f\u0362\u0367\u036c\u0373\u037c\u037f\u0386\u038c\u0391\u0397"+
		"\u039c\u03a0\u03a3\u03ab\u03b9\u03c3\u03c9\u03ce\u03d3\u03d8\u03dc\u03e1"+
		"\u03e4\u03ee\u03fa\u0401\u0404\u0410\u0415\u041a\u041d\u0424\u0430\u043d"+
		"\u043f\u0444\u0447\u0456\u045c\u0467\u046a\u0474\u047b\u0481\u0489\u0493"+
		"\u04a7\u04ad\u04b1\u04b6\u04ba\u04bf\u04c2\u04c7\u04ca\u04d6\u04dd\u04e2"+
		"\u04e7\u04eb\u04f0\u04f3\u04fd\u0509\u0510\u0518\u0527\u0546\u0548\u054d"+
		"\u0551\u0556\u055d\u0560\u0563\u0568\u056c\u056e\u0575\u057b\u0582\u0588"+
		"\u058b\u0590\u0594\u0597\u059e\u05a4\u05a7\u05b1\u05ba\u05c1\u05c8\u05ca"+
		"\u05d0\u05d3\u05de\u05e7\u05ed\u05f3\u05f6\u05fb\u05fe\u0601\u0604\u0607"+
		"\u060d\u0617\u0622\u0625\u062c\u0631\u0636\u063a\u0642\u0646\u064b\u064f"+
		"\u0651\u0656\u065e\u0663\u0669\u0670\u0677\u067e\u0681\u0688\u0690\u0698"+
		"\u069b\u069e\u06a3\u06ac\u06b0\u06ba\u06cd\u06d4\u06d6\u06da\u06de\u06e6"+
		"\u06f1\u06fa\u0702\u070a\u070e\u0716\u0728\u0736\u073d\u0741\u0748\u074a"+
		"\u074e\u0757\u075f\u0768\u0778\u077e\u0782\u078c\u0794\u079d\u07a1\u07a7"+
		"\u07ac\u07b0\u07ba\u07c0\u07c4\u07d0\u07d7\u07e7\u07ee\u07f8\u07fb\u07ff"+
		"\u0806\u080d\u080f\u0813\u0817\u081c\u081f\u0823\u0826\u0831\u0834\u083f"+
		"\u0845\u0849\u084b\u084f\u0858\u085f\u0863\u0867\u086e\u0872\u087a\u0880"+
		"\u0884\u088f\u0896\u08a3\u08ab\u08af\u08b9\u08be\u08cb\u08d6\u08de\u08e2"+
		"\u08e6\u08ea\u08ec\u08f1\u08f4\u08f7\u08fa\u08fe\u0901\u0904\u0907\u090a"+
		"\u0911\u091c\u0920\u0923\u0927\u092e\u0932\u093c\u0944\u094a\u094e\u0954"+
		"\u095d\u0960\u0965\u0968\u0972\u0977\u0980\u0985\u0989\u0992\u0996\u09a4"+
		"\u09b1\u09b6\u09ba\u09c0\u09cb\u09cd\u09d4\u09d7\u09de\u09e3\u09e9\u09ec"+
		"\u09ef\u09fe\u0a05\u0a08\u0a0b\u0a0f\u0a14\u0a1a\u0a1e\u0a29\u0a2d\u0a30"+
		"\u0a34\u0a38\u0a3c\u0a40\u0a46\u0a4c\u0a53\u0a5b\u0a61\u0a66\u0a71\u0a7a"+
		"\u0a7e\u0a87\u0a8b\u0a95\u0a9a\u0ab0\u0ab3\u0ac6\u0ad6\u0ad8\u0ae3\u0af2"+
		"\u0afe\u0b02\u0b0d\u0b11\u0b1d\u0b21\u0b2c\u0b31\u0b36\u0b3a\u0b3e\u0b43"+
		"\u0b47\u0b4b\u0b62\u0b64\u0b76\u0b78\u0b80\u0b85\u0b8a\u0b8f\u0b9c\u0ba1"+
		"\u0ba6\u0bab\u0bb0\u0bb5\u0bba\u0bbf\u0bc1\u0bc8\u0bcb\u0bd6\u0be0\u0be8"+
		"\u0bf1\u0bf7\u0c08\u0c0b\u0c1b\u0c1e\u0c2e\u0c31\u0c41\u0c44\u0c54\u0c57"+
		"\u0c67\u0c6a\u0c78\u0c87\u0c8b\u0c9b\u0ca1\u0ca6\u0caf\u0cb6\u0cb8\u0cbe"+
		"\u0cc2\u0cc8\u0cd7\u0cde\u0ce3\u0ced\u0cf4\u0cf7\u0d00\u0d04\u0d09\u0d0d"+
		"\u0d12\u0d15\u0d1a";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}