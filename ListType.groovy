
List arrays  = [1,2,3]
println("����һ���б�:" + arrays.toString())
arrays = arrays + 4
println("ʹ�� + ���Ԫ��:" + arrays.toString())
arrays = arrays << 5
println("ʹ�� << ���Ԫ��:" + arrays.toString())
arrays.add(6)
println("ʹ�� add ����:" + arrays.toString())

List arrays1 = [[9,10,11],[11,12,13]]
println("ʹ�� flatten ����:" + arrays1.flatten())
arrays1 = arrays1.flatten()
println("ʹ�� unique ����:" + arrays1.unique())
println("ʹ�� reverse ����:" + arrays1.reverse())
println("ʹ�� join ����:" + arrays1.join("-"))
println("ʹ�� sum ����:" + arrays1.sum())
println("ʹ�� remove ����:" + arrays1.remove(0))
arrays1.each{
    println("ʹ�� each ����:" + it)
}











