
aux_source_directory(. demo01)

include_directories(../include)

add_library(
        demo01-lib
        SHARED
        ${demo01})

target_link_libraries(demo01-lib
        log)
