import React from 'react'
import logo from '../assets/images/logo.png'
import '../assets/css/Header.css'
import {FontAwesomeIcon} from '@fortawesome/react-fontawesome'
import {faSearch} from '@fortawesome/free-solid-svg-icons'

function Header() {
    return (
        <div>
            <nav className='navbar bg-dark menu'>
                <div className='container-fluid'>
                    <div className='text-center'>
                        <a href='https://empleo.chaco.gob.ar/informatorio#/' className='navbar-brand text-light'>
                        <img src={logo} alt='' width='60' height='54' className='d-inline-block align-text-top' />
                        <h1>Informatorio 2022</h1>
                        </a>
                    </div>
                    <span className='navbar-text text-light'>
                    Lo mejor de estudiar un curso del futuro es encontrar un trabajo en el presente.
                    </span>
                </div>
            </nav>
            <div class='row d-flex justify-content-center align-items-center mt-5'>
                <div class='col-md-8'>
                    <div class='search'>
                        <input type='text' class='form-control' placeholder='Buscar curso...' />
                        <button class='btn btn-primary'><FontAwesomeIcon icon={faSearch} /></button>
                    </div>  
                </div>
            </div>
        </div>
    )
}

export default Header;
