import React, {Component} from 'react';
import {Card, Button} from 'react-bootstrap';
import img from '../Assets/images/intro.jpg'

class Bloque extends Component {
    render(){
        let titulo = "Mi primer App React";
        let texto = "Informatorio 2022";
        return(
            <>
                <Card style={{ width: '18rem' }}>
                <Card.Img variant="top" src={img} />
                <Card.Body>
                    <Card.Title>{titulo}</Card.Title>
                    <Card.Text>{texto}</Card.Text>
                    <Button variant="primary">Leer Mas ...</Button>
                </Card.Body>
                </Card>
            </>
        );
    }
}
export default Bloque;