# Taller03

Desarrollador: Jorge Quidel

<h2>Análisis Clases</h2>

<ul>
<li>Caso 1: JugadorFutbol, Partido, Goles</li>
<li>Caso 2: EmpresaNaviera, Buque, PartesBuque, Astillero </li>
<li>Caso 3: Pedido, Mesero</li>
<li>Caso 4: Jugador, Equipo</li>
<li>Caso 5: Evento, OtroEvento</li>
</ul>

<h2>Análisis relaciones</h2>

<h3>Caso 1</h3>

<ul>
<li>JugadorFutbol (Asociación/Bidireccional/*jugadores, *partidos) Partido</li>
<li>Partido (Agregación/Unidireccional/*goles) Gol</li>
<li>JugadorFutbol (Agregación/Unidireccional/*goles) Gol</li>
</ul>

<h3>Caso 2</h3>

<ul>
<li>EmpresaNaviera (Agregación/Unidireccional/*buques) Buque</li>
<li>Buque (Composición/Unidireccional/1..*partes) PartesBuque</li>
<li>Astillero (Agregación/Unidireccional/*partes) PartesBuque</li>
</ul>

<h3>Caso 3</h3>

<ul>
<li>Pedido (Asociación/Bidireccional/*pedidos, 1mesero) Mesero</li>
</ul>

<h3>Caso 4</h3>

<ul>
<li>Equipo (Asociación/Bidireccional/1equipo, 1..*jugadores) Jugador</li>
<li>Jugador (Asociación/Bidireccional/1equipo, 1capitan) Equipo</li>
</ul>

<h3>Caso 5</h3>

<ul>
<li>Evento (Asociación/Unidireccional/0..1evento) OtroEvento</li>
</ul>