<!--
 * @Description: 
 * @Version: 1.0
 * @Autor: x-one
 * @Date: 2020-11-12 10:22:45
 * @LastEditors: x-one
 * @LastEditTime: 2020-11-19 17:07:06
-->
# 工具集项目

## 一、项目配置管理

### 1.1 Git管理

    .gitignore设置忽略目录或文件规则

symbol|description|demo 
 -|-|-
 # | 用于注释 |
 *|匹配除'\'之外的多个所有字符|*.txt ： 所有的txt文件
 /test/ | 代表不管理 test目录下的所有文件，不包含test目录 |
 /test | 代表不管test 此目录，包含test目录文件 |
 ! | 代表取反，需要管理因为gitignore是用于排除的git 文件管理，当你在一个目录下要排除的文件远远大于管理的文件时，你可以搭配文件排除和！ | /root/test/：!/root/test/except.txt 注：在父级目录（root）没有被全部排除下，except.txt 才会被管理
 ?|匹配除'\'之外的一个所有字符|test?.txt：可以匹配到 testa.txt、testk.txt等文件
 []|匹配数组中指定指定的字符 #例：test[k,l] 可以匹配到 testk.txt、testl.txt， 之外都不行
 **|用于匹配多层目录|root/**/test 可以匹配到 root/a/b/c/test 、root/fd/gg/test等目录

## 二、Itext 操作PDF

    需要注意 itextpdf 有开源协议，itext没有

### 2.1 文档对象

    设置基本属性：版本、标题、作者、主题、关键字、创建者等等

### 2.2 页面对象

### 2.3 内容对象

### 2.4 四层结构
