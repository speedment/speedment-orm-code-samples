package com.speedment.examples.generated.socialnetwork.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.application.AbstractApplicationMetadata;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * A {@link com.speedment.runtime.core.ApplicationMetadata} class for the {@link
 * com.speedment.runtime.config.Project} named socialnetwork. This class
 * contains the meta data present at code generation time.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public class GeneratedSocialnetworkMetadata extends AbstractApplicationMetadata {
    
    private final static String METADATA = init();
    
    private static String init() {
        final StringBuilder sb = new StringBuilder();
        initPart0(sb);
        initPart1(sb);
        initPart2(sb);
        initPart3(sb);
        return sb.toString();
    }
    
    @Override
    protected Optional<String> getMetadata() {
        return Optional.of(METADATA);
    }
    
    private static void initPart0(StringBuilder sb) {
        Stream.of(
            "{",
            "  \"config\" : {",
            "    \"appId\" : \"6431bac0-0d10-4579-ab08-8f6e14f1cd02\",",
            "    \"companyName\" : \"speedment\",",
            "    \"dbmses\" : [",
            "      {",
            "        \"enabled\" : true,",
            "        \"expanded\" : true,",
            "        \"ipAddress\" : \"127.0.0.1\",",
            "        \"name\" : \"db0\",",
            "        \"port\" : 3306,",
            "        \"schemas\" : [",
            "          {",
            "            \"enabled\" : true,",
            "            \"expanded\" : true,",
            "            \"name\" : \"socialnetwork\",",
            "            \"tables\" : [",
            "              {",
            "                \"columns\" : [",
            "                  {",
            "                    \"autoIncrement\" : true,",
            "                    \"databaseType\" : \"java.lang.Long\",",
            "                    \"enabled\" : true,",
            "                    \"expanded\" : true,",
            "                    \"name\" : \"id\",",
            "                    \"nullable\" : false,",
            "                    \"nullableImplementation\" : \"OPTIONAL\",",
            "                    \"ordinalPosition\" : 1,",
            "                    \"typeMapper\" : \"com.speedment.runtime.typemapper.primitive.PrimitiveTypeMapper\"",
            "                  },",
            "                  {",
            "                    \"autoIncrement\" : false,",
            "                    \"databaseType\" : \"java.lang.Long\",",
            "                    \"enabled\" : true,",
            "                    \"expanded\" : true,",
            "                    \"name\" : \"uploader\",",
            "                    \"nullable\" : false,",
            "                    \"nullableImplementation\" : \"OPTIONAL\",",
            "                    \"ordinalPosition\" : 2,",
            "                    \"typeMapper\" : \"com.speedment.runtime.typemapper.primitive.PrimitiveTypeMapper\"",
            "                  },",
            "                  {",
            "                    \"autoIncrement\" : false,",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"enabled\" : true,",
            "                    \"expanded\" : true,",
            "                    \"name\" : \"title\",",
            "                    \"nullable\" : false,",
            "                    \"nullableImplementation\" : \"OPTIONAL\",",
            "                    \"ordinalPosition\" : 3",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"enabled\" : true,",
            "                    \"expanded\" : true,",
            "                    \"name\" : \"description\",",
            "                    \"nullable\" : false,",
            "                    \"ordinalPosition\" : 4",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"enabled\" : true,",
            "                    \"expanded\" : true,",
            "                    \"name\" : \"img_data\",",
            "                    \"nullable\" : false,",
            "                    \"ordinalPosition\" : 5",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.sql.Timestamp\",",
            "                    \"enabled\" : true,",
            "                    \"expanded\" : true,",
            "                    \"name\" : \"uploaded\",",
            "                    \"nullable\" : false,",
            "                    \"ordinalPosition\" : 6",
            "                  }",
            "                ],",
            "                \"enabled\" : true,",
            "                \"expanded\" : true,",
            "                \"foreignKeys\" : [",
            "                  {",
            "                    \"enabled\" : true,",
            "                    \"expanded\" : false,",
            "                    \"foreignKeyColumns\" : [",
            "                      {",
            "                        \"expanded\" : true,",
            "                        \"foreignColumnName\" : \"id\",",
            "                        \"foreignDatabaseName\" : \"db0\",",
            "                        \"foreignSchemaName\" : \"socialnetwork\",",
            "                        \"foreignTableName\" : \"user\",",
            "                        \"name\" : \"uploader\",",
            "                        \"ordinalPosition\" : 1",
            "                      }",
            "                    ],",
            "                    \"name\" : \"image_uploader_to_user_id\"",
            "                  }",
            "                ],",
            "                \"indexes\" : [",
            "                  {",
            "                    \"enabled\" : true,",
            "                    \"expanded\" : false,",
            "                    \"indexColumns\" : ["
        ).forEachOrdered(sb::append);
    }
    
    private static void initPart1(StringBuilder sb) {
        Stream.of(
            "                      {",
            "                        \"expanded\" : true,",
            "                        \"name\" : \"id\",",
            "                        \"orderType\" : \"ASC\",",
            "                        \"ordinalPosition\" : 1",
            "                      }",
            "                    ],",
            "                    \"name\" : \"PRIMARY\",",
            "                    \"unique\" : true",
            "                  },",
            "                  {",
            "                    \"enabled\" : true,",
            "                    \"expanded\" : false,",
            "                    \"indexColumns\" : [",
            "                      {",
            "                        \"expanded\" : true,",
            "                        \"name\" : \"uploader\",",
            "                        \"orderType\" : \"ASC\",",
            "                        \"ordinalPosition\" : 1",
            "                      }",
            "                    ],",
            "                    \"name\" : \"image_uploader_to_user_id\",",
            "                    \"unique\" : false",
            "                  }",
            "                ],",
            "                \"name\" : \"image\",",
            "                \"primaryKeyColumns\" : [",
            "                  {",
            "                    \"expanded\" : true,",
            "                    \"name\" : \"id\",",
            "                    \"ordinalPosition\" : 1",
            "                  }",
            "                ]",
            "              },",
            "              {",
            "                \"columns\" : [",
            "                  {",
            "                    \"databaseType\" : \"java.lang.Long\",",
            "                    \"enabled\" : true,",
            "                    \"expanded\" : true,",
            "                    \"name\" : \"follower\",",
            "                    \"nullable\" : false,",
            "                    \"ordinalPosition\" : 1,",
            "                    \"typeMapper\" : \"com.speedment.runtime.typemapper.primitive.PrimitiveTypeMapper\"",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.Long\",",
            "                    \"enabled\" : true,",
            "                    \"expanded\" : true,",
            "                    \"name\" : \"follows\",",
            "                    \"nullable\" : false,",
            "                    \"ordinalPosition\" : 2,",
            "                    \"typeMapper\" : \"com.speedment.runtime.typemapper.primitive.PrimitiveTypeMapper\"",
            "                  }",
            "                ],",
            "                \"enabled\" : true,",
            "                \"expanded\" : true,",
            "                \"foreignKeys\" : [",
            "                  {",
            "                    \"enabled\" : true,",
            "                    \"expanded\" : false,",
            "                    \"foreignKeyColumns\" : [",
            "                      {",
            "                        \"expanded\" : true,",
            "                        \"foreignColumnName\" : \"id\",",
            "                        \"foreignDatabaseName\" : \"db0\",",
            "                        \"foreignSchemaName\" : \"socialnetwork\",",
            "                        \"foreignTableName\" : \"user\",",
            "                        \"name\" : \"follower\",",
            "                        \"ordinalPosition\" : 1",
            "                      }",
            "                    ],",
            "                    \"name\" : \"follow_follower_to_user_id\"",
            "                  },",
            "                  {",
            "                    \"enabled\" : true,",
            "                    \"expanded\" : false,",
            "                    \"foreignKeyColumns\" : [",
            "                      {",
            "                        \"expanded\" : true,",
            "                        \"foreignColumnName\" : \"id\",",
            "                        \"foreignDatabaseName\" : \"db0\",",
            "                        \"foreignSchemaName\" : \"socialnetwork\",",
            "                        \"foreignTableName\" : \"user\",",
            "                        \"name\" : \"follows\",",
            "                        \"ordinalPosition\" : 1",
            "                      }",
            "                    ],",
            "                    \"name\" : \"follow_follows_to_user_id\"",
            "                  }",
            "                ],",
            "                \"indexes\" : [",
            "                  {",
            "                    \"enabled\" : true,",
            "                    \"expanded\" : false,",
            "                    \"indexColumns\" : [",
            "                      {",
            "                        \"expanded\" : true,",
            "                        \"name\" : \"follower\",",
            "                        \"orderType\" : \"ASC\",",
            "                        \"ordinalPosition\" : 1"
        ).forEachOrdered(sb::append);
    }
    
    private static void initPart2(StringBuilder sb) {
        Stream.of(
            "                      },",
            "                      {",
            "                        \"expanded\" : true,",
            "                        \"name\" : \"follows\",",
            "                        \"orderType\" : \"ASC\",",
            "                        \"ordinalPosition\" : 2",
            "                      }",
            "                    ],",
            "                    \"name\" : \"PRIMARY\",",
            "                    \"unique\" : true",
            "                  },",
            "                  {",
            "                    \"enabled\" : true,",
            "                    \"expanded\" : false,",
            "                    \"indexColumns\" : [",
            "                      {",
            "                        \"expanded\" : true,",
            "                        \"name\" : \"follows\",",
            "                        \"orderType\" : \"ASC\",",
            "                        \"ordinalPosition\" : 1",
            "                      }",
            "                    ],",
            "                    \"name\" : \"follow_follows_to_user_id\",",
            "                    \"unique\" : false",
            "                  }",
            "                ],",
            "                \"name\" : \"link\",",
            "                \"primaryKeyColumns\" : [",
            "                  {",
            "                    \"expanded\" : true,",
            "                    \"name\" : \"follower\",",
            "                    \"ordinalPosition\" : 1",
            "                  },",
            "                  {",
            "                    \"expanded\" : true,",
            "                    \"name\" : \"follows\",",
            "                    \"ordinalPosition\" : 2",
            "                  }",
            "                ]",
            "              },",
            "              {",
            "                \"columns\" : [",
            "                  {",
            "                    \"autoIncrement\" : true,",
            "                    \"databaseType\" : \"java.lang.Long\",",
            "                    \"enabled\" : true,",
            "                    \"expanded\" : true,",
            "                    \"name\" : \"id\",",
            "                    \"nullable\" : false,",
            "                    \"ordinalPosition\" : 1,",
            "                    \"typeMapper\" : \"com.speedment.runtime.typemapper.primitive.PrimitiveTypeMapper\"",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"enabled\" : true,",
            "                    \"expanded\" : true,",
            "                    \"name\" : \"mail\",",
            "                    \"nullable\" : false,",
            "                    \"ordinalPosition\" : 2",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"enabled\" : true,",
            "                    \"expanded\" : true,",
            "                    \"name\" : \"password\",",
            "                    \"nullable\" : false,",
            "                    \"ordinalPosition\" : 3",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"enabled\" : true,",
            "                    \"expanded\" : true,",
            "                    \"name\" : \"first_name\",",
            "                    \"nullable\" : true,",
            "                    \"ordinalPosition\" : 4",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"enabled\" : true,",
            "                    \"expanded\" : true,",
            "                    \"name\" : \"last_name\",",
            "                    \"nullable\" : true,",
            "                    \"ordinalPosition\" : 5",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"enabled\" : true,",
            "                    \"expanded\" : true,",
            "                    \"name\" : \"avatar\",",
            "                    \"nullable\" : true,",
            "                    \"ordinalPosition\" : 6",
            "                  }",
            "                ],",
            "                \"enabled\" : true,",
            "                \"expanded\" : true,",
            "                \"indexes\" : [",
            "                  {",
            "                    \"enabled\" : true,",
            "                    \"expanded\" : false,",
            "                    \"indexColumns\" : [",
            "                      {"
        ).forEachOrdered(sb::append);
    }
    
    private static void initPart3(StringBuilder sb) {
        Stream.of(
            "                        \"expanded\" : true,",
            "                        \"name\" : \"id\",",
            "                        \"orderType\" : \"ASC\",",
            "                        \"ordinalPosition\" : 1",
            "                      }",
            "                    ],",
            "                    \"name\" : \"PRIMARY\",",
            "                    \"unique\" : true",
            "                  }",
            "                ],",
            "                \"name\" : \"user\",",
            "                \"primaryKeyColumns\" : [",
            "                  {",
            "                    \"expanded\" : true,",
            "                    \"name\" : \"id\",",
            "                    \"ordinalPosition\" : 1",
            "                  }",
            "                ]",
            "              }",
            "            ]",
            "          }",
            "        ],",
            "        \"typeName\" : \"MySQL\",",
            "        \"username\" : \"root\"",
            "      }",
            "    ],",
            "    \"enabled\" : true,",
            "    \"expanded\" : true,",
            "    \"name\" : \"socialnetwork\",",
            "    \"packageLocation\" : \"src/main/java/\",",
            "    \"packageName\" : \"com.speedment.examples.generated.socialnetwork\",",
            "    \"speedmentVersion\" : \"Speedment:3.2.1\"",
            "  }",
            "}"
        ).forEachOrdered(sb::append);
    }
}