import logo from '../Assets/images/logo.png';
import React, {Component} from 'react';
import {Navbar, Container, Nav} from 'react-bootstrap';

class Header extends Component {
    render(){
        return(
            <>
                <Navbar bg="dark" variant="dark">
                    <Container>
                        <Navbar.Brand href="#home">
                            <img
                            alt=""
                            src={logo}
                            width="30"
                            height="30"
                            className="d-inline-block align-top"
                            />{' '}
                            Informatorio 2022
                        </Navbar.Brand>
                        <Nav className="me-auto">
                            <Nav.Link href="#home">Inicio</Nav.Link>
                            <Nav.Link href="#features">Quienes Somos</Nav.Link>
                            <Nav.Link href="#pricing">Contacto</Nav.Link>
                        </Nav>
                    </Container>
                </Navbar>
            </>
        );
    }
}
export default Header;