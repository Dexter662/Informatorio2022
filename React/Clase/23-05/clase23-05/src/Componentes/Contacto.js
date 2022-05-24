import React, {Component} from 'react';
import {Form} from 'react-bootstrap';

class Contacto extends Component {
    render(){
        return(
            <>
                <Form>
                    <Form.Group className="mb-3">
                        <Form.Label>Introdusca su email</Form.Label>
                        <Form.Control type="email" placeholder="name@example.com" />
                    </Form.Group>
                    <Form.Group className="mb-3">
                        <Form.Label>Dejenos su mensaje</Form.Label>
                        <Form.Control as="textarea" rows={3} />
                    </Form.Group>
                </Form>
            </>
        );
    }
}
export default Contacto;