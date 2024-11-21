// Versión 1
// Problema 1
val ListCiclistas = List(
  ("Andres", "Rapidos", 120),
  ("Beatriz", "Aguilas", 95),
  ("Carlos", "Relampagos", 140),
  ("Diana", "Rapidos", 110),
  ("Eduardo", "Tornados", 130),
  ("Fernanda", "Aguilas", 85),
  ("Gabriela", "Relampagos", 75),
  ("Hugo", "Tornados", 150),
  ("Isabel", "Rapidos", 90)
)

// 1. Contar cuantos ciclistas recorrieron más de 100km
val CiclistasMas = ListCiclistas.filter(_._3 > 100).length
// Alternativa con ayuda del IDE
val CiclistasMas1 = ListCiclistas.count(_._3 > 100)

// 2. Calcular la distancia promedio recorrida por los ciclistas
val CiclistasAVG = ListCiclistas.map(_._3).sum.toDouble / ListCiclistas.length

// 3. Identificar cual es la distancia máxima recorrida
val CiclistaMayor = ListCiclistas.maxBy(_._3)

// 4. Listar los nombres de los ciclistas del equipo "Aguilas"
val CiclistasAgui = ListCiclistas.filter(row => row._2 == "Aguilas")

// 5. Calcular la distancia total recorrida por todos los ciclistas del equipo "Rapidos"
val CiclistasRap = ListCiclistas.filter(row => row._2 == "Rapidos").map(_._3).sum


// Problema 2
def limite_diferencias_centradas(f : (Double) => Double, x: Double, h: Double)
  = (f(x + h) + f(x - h)) / 2

val func1 = (x: Double) => Math.pow(x, 2)
val func2 = (x: Double) => ((Math.pow(x, 2)) - 4) / (x - 2)

limite_diferencias_centradas(func1, 2, 0.001)
limite_diferencias_centradas(func2, 2, 0.0001)