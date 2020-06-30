
List arrays  = [1,2,3]
println("定义一个列表:" + arrays.toString())
arrays = arrays + 4
println("使用 + 添加元素:" + arrays.toString())
arrays = arrays << 5
println("使用 << 添加元素:" + arrays.toString())
arrays.add(6)
println("使用 add 方法:" + arrays.toString())

List arrays1 = [[9,10,11],[11,12,13]]
println("使用 flatten 方法:" + arrays1.flatten())
arrays1 = arrays1.flatten()
println("使用 unique 方法:" + arrays1.unique())
println("使用 reverse 方法:" + arrays1.reverse())
println("使用 join 方法:" + arrays1.join("-"))
println("使用 sum 方法:" + arrays1.sum())
println("使用 remove 方法:" + arrays1.remove(0))
arrays1.each{
    println("使用 each 方法:" + it)
}











