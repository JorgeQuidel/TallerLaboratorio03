# Taller03

Desarrollador: Jorge Quidel

<h2>Análisis Clases</h2>

<ul>
<li>Caso 1: Jugador, Partido, Goles</li>
<li>Caso 2: EmpresaNaviera, Buque, Partes, Astillero </li>
<li>Caso 3: Pedido, Mesero</li>
<li>Caso 4: Jugador, Equipo</li>
<li>Caso 5: Evento, OtroEvento</li>
</ul>

<h2>Análisis relaciones</h2>

<h3>Caso 1</h3>

<ul>
<li>Jugador (Asociación/Bidireccional/Varios a Varios) Partido</li>
<li>Partido (Agregación/Unidireccional/Uno es a Varios) Gol</li>
<li>Jugador (Agregación/Unidireccional/Uno es a Varios) Gol</li>
</ul>

<h3>Caso 2</h3>

<ul>
<li>EmpresaNaviera (Agregación/Unidireccional/Uno es a Varios) Buque</li>
<li>Buque (Composición/Unidireccional/Uno es a Varios) Partes</li>
<li>Astillero (Agregación/Unidireccional/Uno es a Varios) Partes</li>
</ul>

<h3>Caso 3</h3>

<ul>
<li>Pedido (Asociación/Unidireccional/Uno es a Uno) Mesero</li>
<li>Mesero (Agregación/Unidireccional/Uno es a Varios) Pedido</li>
</ul>

<h3>Caso 4</h3>

<ul>
<li>Equipo (Asociación/Unidireccional/Uno es a Uno o Varios) Jugador</li>
<li>Juagdor (Agregación/Unidireccional/Uno es a Uno) Equipo</li>
</ul>

<h3>Caso 5</h3>

<ul>
<li>Evento (Asociación/Unidireccional/Uno es a Cero o Varios) OtroEvento</li>
</ul>