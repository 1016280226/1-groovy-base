name = "张三"
name1 = "张三,李四,王五"
name2 = "zhangsan"
println("单引号输出结果：" + '${name}')
println("双引号输出结果：" + "${name}")
println("contains方法使用结果：" + "${name}".contains("张"))
println("size方法使用结果：" + "${name}".size())
println("length方法使用结果：" + "${name}".length())
println("toString方法使用结果：" + "${name}".toString())
println("indexOf方法使用结果：" + "${name}".indexOf("三"))
println("endsWith方法使用结果：" + "${name}".endsWith("三"))
println("minus方法使用结果：" + "${name}".minus("三"))
println("plus方法使用结果：" + "${name}".plus("大烧饼"))
println("reverse方法使用结果：" + "${name}".reverse())
println("substring方法使用结果：" + "${name}".substring(0,1))
println("toUpperCase方法使用结果：" + "${name2}".toUpperCase())
List<String> splitArrays =  "${name1}".split(",");
for (i in splitArrays) {
    println("split方法使用结果：" + i)
}
