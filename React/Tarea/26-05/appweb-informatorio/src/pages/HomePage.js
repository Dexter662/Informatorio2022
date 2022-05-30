import React from 'react'
import Card from '../components/Card'

import imagen1 from '../assets/images/imagen1.jpg'
import imagen2 from '../assets/images/imagen2.jpg'
import imagen3 from '../assets/images/imagen3.jpg'

const cards = [
    {
        id: 1,
        title: 'Introducción a la Programación',
        image: imagen1,
        resumen: 'Para conocer de qué se trata el mundo de la programación e iniciarte en sus lenguajes, darás tus primeros pasos en Gobstones y JavaScript. Modalidad: Online. Duración: 1 mes. Requisitos: Ser mayor de edad y residir en Chaco.',
        url: 'https://docs.google.com/forms/d/1GjCuUdOFzF_igv8bLd86pVk2PzpYwO5RZ0Ch51dn4JY/viewform?edit_requested=true'
    },
    {
        id: 2,
        title: 'Programación y Desarrollo Web',
        image: imagen2,
        resumen: 'Podrás profundizar en herramientas básicas para desarrollar aplicaciones web con bases de datos, y adquirir conocimientos que te permitan seguir construyendo tu perﬁl profesional para el sector Software y Servicios Informáticos. Modalidad: Online. Duración: 4 meses. Requisitos: Haber aprobado curso de Introducción a la Programación y residir en Chaco',
        url: 'https://docs.google.com/forms/d/1GjCuUdOFzF_igv8bLd86pVk2PzpYwO5RZ0Ch51dn4JY/viewform?edit_requested=true'
    },
    {
        id: 3,
        title: 'Especialización en Lenguajes de Programación',
        image: imagen3,
        resumen: 'Podrás continuar con tu perfeccionamiento en lenguajes especíﬁcos, y orientar tu fomación hacia los perﬁles laborales requeridos por las empresas locales. Modalidad: Online. Duración: 4 meses. Requisitos: Haber aprobado curso Programación y Desarrollo Web y residir en Chaco.',
        url: 'https://docs.google.com/forms/d/1GjCuUdOFzF_igv8bLd86pVk2PzpYwO5RZ0Ch51dn4JY/viewform?edit_requested=true'
    }
]

function HomePage() {
  return (
    <div className='container d-flex justify-content-center align-items-center mt-5'>
        <div className='row mb-5'>
            {
                cards.map(({id, title, image, resumen, url}) => (
                    <div className='col-md-4' key={id}>
                        <Card title={title} image={image} resumen={resumen} url={url}/>
                    </div>
                ))
            }
        </div>
    </div>
  )
}

export default HomePage;
