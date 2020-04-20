
class Graph: 
  
    def __init__(self,vertices): 
        self.vertices= vertices 
        self.graph = [] 
    def add_edge(self,u,v,w): 
        self.graph.append([u, v, w]) 

    def printArr(self, dist): 
        print("Vertex   Distance from Source") 
        for i in range(self.vertices): 
            print("%d \t\t %d" % (i, dist[i])) 

    def BellmanFord(self, src): 
  
        # Inicializar las distancias de src a los otros vértices como infinitos
        dist = [float("Inf")] * self.vertices
        dist[src] = 0 
  
  
       

        for i in range(self.vertices - 1): 
            # Actualizar la distancia
            for u, v, w in self.graph: 
                if dist[u] != float("Inf") and dist[u] + w < dist[v]: 
                        dist[v] = dist[u] + w 
  
        #Ciclos de peso negativo
        for u, v, w in self.graph: 
                if dist[u] != float("Inf") and dist[u] + w < dist[v]: 
                        print ("Graph contains negative weight cycle")
                        return
                          
        # Imprimir las distancias
        self.printArr(dist)



class Vertex:
    def __init__(self):
       self.key = key 
       self.neighbours = {}
    
    def add_neighbour(self, a,w):
        self.neighbours[a]=w


g = Graph(5) 
g.add_edge(0, 1, -1) 
g.add_edge(0, 2, 4) 
g.add_edge(1, 2, 3) 
g.add_edge(1, 3, 2) 
g.add_edge(1, 4, 2) 
g.add_edge(3, 2, 5) 
g.add_edge(3, 1, 1) 
g.add_edge(4, 3, -3) 
  
g.BellmanFord(0)



