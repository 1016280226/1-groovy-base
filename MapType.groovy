Map map = [1:2,3:4,5:6,7:8]
println("map 定义：" + map.toString())
println("map[key] 获取value：" + map[1])
println("keySet方法：" + map.keySet())
println("values方法：" + map.values())
map += [9:10]
println("+ 元素方法：" + map.toString())


