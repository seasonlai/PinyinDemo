cmake_minimum_required(VERSION 3.4.1)

add_library(
             jni_pinyinime

             SHARED

             android/com_android_inputmethod_pinyin_PinyinDecoderService.cpp
             share/dictbuilder.cpp
             share/dictlist.cpp
             share/dicttrie.cpp
             share/lpicache.cpp
             share/matrixsearch.cpp
             share/mystdlib.cpp
             share/ngram.cpp
             share/pinyinime.cpp
             share/searchutility.cpp
             share/spellingtable.cpp
             share/spellingtrie.cpp
             share/splparser.cpp
             share/sync.cpp
             share/userdict.cpp
             share/utf16char.cpp
             share/utf16reader.cpp
            )

find_library(
              log-lib

              log )


target_link_libraries(
                       jni_pinyinime

                       ${log-lib} )
