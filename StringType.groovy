name = "����"
name1 = "����,����,����"
name2 = "zhangsan"
println("��������������" + '${name}')
println("˫������������" + "${name}")
println("contains����ʹ�ý����" + "${name}".contains("��"))
println("size����ʹ�ý����" + "${name}".size())
println("length����ʹ�ý����" + "${name}".length())
println("toString����ʹ�ý����" + "${name}".toString())
println("indexOf����ʹ�ý����" + "${name}".indexOf("��"))
println("endsWith����ʹ�ý����" + "${name}".endsWith("��"))
println("minus����ʹ�ý����" + "${name}".minus("��"))
println("plus����ʹ�ý����" + "${name}".plus("���ձ�"))
println("reverse����ʹ�ý����" + "${name}".reverse())
println("substring����ʹ�ý����" + "${name}".substring(0,1))
println("toUpperCase����ʹ�ý����" + "${name2}".toUpperCase())
List<String> splitArrays =  "${name1}".split(",");
for (i in splitArrays) {
    println("split����ʹ�ý����" + i)
}
