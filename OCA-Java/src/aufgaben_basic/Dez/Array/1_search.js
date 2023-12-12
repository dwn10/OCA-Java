/* El código crea una lista de 10000 objetos,
cada uno con un ID, un nombre aleatorio y
un ID de creador aleatorio. Luego, crea un índice de los usuarios,
mapeando cada ID de usuario a su objeto correspondiente.
Finalmente, crea una nueva lista que contiene los
objetos originales de la lista, pero también el
nombre del usuario que creó cada objeto.

En general, el código demuestra cómo utilizar un índice
de datos para mejorar el rendimiento de una operación de mapeo.
Al crear un índice explícito de los datos, se puede evitar
la necesidad de recorrer la lista original varias veces,
lo que puede mejorar significativamente la velocidad de la operación. */

let user = [];

for (let i = 9999; i >= 0; i--){
    users[i] = {
        id: i,
        name: Math.random().toString(),
    }
}

console.log(users);

const lista = [];

for(let i = 0; i < 10000; i++){
    lista[i] = {
        id: i,
        name: Math.random(),
        created_by: Math.floor(Math.random() * 10000),
    }
}

const userIndexado = users.reduce((acc, el) => {
    acc[el.id] = el
    return acc
},{})


console.time('usando index')
const conUser = lista.map(elemento => {
    return {
        ...elemento,
        created_by_user: usersIndexado[elemento.created_by]
    }
})

console.timeEnd('usando index')