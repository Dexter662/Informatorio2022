import React from 'react'
import PropTypes from 'prop-types'
import '../assets/css/Cards.css'

function Card({title, image, resumen, url}) {
  return (
    <div className='card text-center bg-light animate__animated animate__fadeInUp'>
      <div className='overflow'>
        <img src={image} alt='' className='card-img-top card-img-tm'/>
      </div>
      <div className='card-body text-dark'>
        <h4 className='card-title'>{title}</h4>
        <p className='card-text text-secondary'>
          {
            resumen ? resumen : 'Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido usó una galería de textos y los mezcló de tal manera que logró hacer un libro de textos especimen.'
          }
        </p>
        <a href={url} className='btn btn-outline-primary' target='_blank' rel="noreferrer">Preincribete acá</a>
      </div>
    </div>
  )
}

Card.propTypes = {
  title: PropTypes.string.isRequired,
  url: PropTypes.string,
  image: PropTypes.string,
  resumen: PropTypes.string
}

export default Card;