import React, {Component} from 'react';
import {Card} from 'react-bootstrap'

class Footer extends Component {
    render(){
        return(
            <>
                <Card className="text-center">
                    <Card.Footer className="text-muted">Clase React Grupo 1</Card.Footer>
                </Card>
            </>
        );
    }
}
export default Footer;