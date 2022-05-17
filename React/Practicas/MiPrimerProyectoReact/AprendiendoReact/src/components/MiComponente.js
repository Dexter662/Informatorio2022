import React, {Component} from 'react';

class MiComponente extends Component {
    render() {
        let receta = {
            nombre: 'Pizza',
            ingredientes: ['Tomate', 'Queso', 'Salame de Milan'],
            calorias: 400
        };
        return(
            <>
                <h1>{ 'Receta: ' + receta.nombre }</h1>
                <h2>{ 'Calorias: ' + receta.calorias }</h2>
                <ol>
                    {
                        receta.ingredientes.map((ingredientes, i) => {
                            return(
                                <li key={i}>
                                    {ingredientes}
                                </li>
                            )
                        })
                    }
                </ol>
            </>
        );
    }
}

export default MiComponente;