import React, {Component} from 'react';
import {Container, CardGroup} from 'react-bootstrap';
import Contacto from './Contacto';
import Bloque from './Bloque';

class Contenido extends Component {

    render(){
        
        return(
            <>
            <Container>
                <br />
                <CardGroup>
                    <Bloque />
                    <Bloque />
                    <Bloque />
                </CardGroup>
                <br />
                <hr />
                <br />
                <Contacto />
                <br />
            </Container>
            </>
        );
    }
}
export default Contenido;