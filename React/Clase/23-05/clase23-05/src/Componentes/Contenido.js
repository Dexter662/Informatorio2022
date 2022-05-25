import React, {Component} from 'react';
import {Container, CardGroup, Card, Button} from 'react-bootstrap';
import Contacto from './Contacto';
import img from '../Assets/images/intro.jpg';
import img2 from '../Assets/images/desarrollo.jpg';
import img3 from '../Assets/images/especializacion.jpeg';

class Contenido extends Component {

    state = {
        titulo: "Introduccion a la programación",
        texto: "Informatorio 2022",
        titulo2: "Programacion y Desarrollo Web",
        texto2: "Informatorio 2022",
        titulo3: "Especialización en Tecnologías de Desarrollo",
        texto3: "Informatorio 2022"
    };

    render(){
        
        return(
            <>
            <Container>
                <br />
                <CardGroup>
                    <Card style={{ width: '18rem', margin: '10px', border: 'solid 1px' }}>
                    <Card.Img style={{ width: '380px', height: '300px', margin: '15px'}} variant="top" src={img} />
                    <Card.Body>
                        <Card.Title>{this.state.titulo}</Card.Title>
                        <Card.Text>{this.state.texto}</Card.Text>
                        <Button variant="primary">Leer Mas ...</Button>
                    </Card.Body>
                    </Card>
                    <Card style={{ width: '18rem', margin: '10px', border: 'solid 1px' }}>
                    <Card.Img style={{ width: '380px', height: '300px', margin: '15px' }} variant="top" src={img2} />
                    <Card.Body>
                        <Card.Title>{this.state.titulo2}</Card.Title>
                        <Card.Text>{this.state.texto2}</Card.Text>
                        <Button variant="primary">Leer Mas ...</Button>
                    </Card.Body>
                    </Card>
                    <Card style={{ width: '18rem', margin: '10px', border: 'solid 1px' }}>
                    <Card.Img style={{ width: '380px', height: '300px', margin: '15px' }} variant="top" src={img3} />
                    <Card.Body>
                        <Card.Title>{this.state.titulo3}</Card.Title>
                        <Card.Text>{this.state.texto3}</Card.Text>
                        <Button variant="primary">Leer Mas ...</Button>
                    </Card.Body>
                    </Card>
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