;1. Haga una función que reciba los coeficientes de una función líneal (m y b), el valor de X y retorne el valor de y Recuerde y = mx + b

(defn funcionLineal [m b x]
       (str "La variable y es: ", (+ (* m x) b)))

(funcionLineal 3 -2 3)

;2. Haga una función que reciba 4 valores, correspondientes a 2 puntos en el plano cartesiano en forma (x1, y1, x2, y2) y retorne si la pendiente de la recta es creciente o decreciente
;Recuerde = m = (y2 – y1)/(x2-x1) donde
;- Si m es menor que cero la pendiente es decreciente
;- Si m es mayor que cero, la pendiente es creciente
;- Si m es cero, es constante.


(defn pendiente [x1 y1 x2 y2]
      (def m (float(/ (- y2 y1) (- x2 x1)))) 
      (cond 
          (> m 0) "La pendiente es creciente"
          (> 0 m) "La pendiente es decreciente" 
          :else "La pendiente es constante"))

(defn pendiente2 [x1 y1 x2 y2]
      (def m (float(/ (- y2 y1) (- x2 x1)))) 
      m)

(pendiente 4 5 2 3)


;3. Haga una función que recibe los valores m y b de una función líneal junto con los valores de x1, y1 correspondientes a un punto del plano cartesiano. La función dice si el punto (x1, y1) está en la recta dada.

(defn funcionLineal2 [m b x1 y1]
      (def y (+ (* m x1) b))
      (if (= y y1)
      "Los puntos estan en la recta dada"
      "Los puntos NO estan en la recta dada"
      )
)

(funcionLineal2 9 6 4 42)

;4. Haga una función que recibe la pendiente m de una recta, un punto (x1, y1) y retorna el valor de b de una función lineal.

(defn funcionLineal3 [m x1 y1]
      (def auxiliar (* -1 (* m x1)))
      (def b (+ y1 auxiliar))
      b
)

(funcionLineal3 3 -5 1)

;5. Usando la función creada en 2, y la función creada en 4, haga una función nueva que llame ambas y reciba 2 puntos (x1,y1, x2,y2) y retorne los valores de m y b.

(defn funcionLineal4 [x_1 y_1 x_2 y_2] 

(def m (pendiente2 x_1 y_1 x_2 y_2))
(def b (funcionLineal3 m x_1 y_1))
(str "El valor m: ", m (str " y el valor b es: ", b)))

(funcionLineal4 3 4 1 5)
