function Noticia() {
    const noticia = {
        titulo: "Mi primer App React",
        descripcion:"Informatorio 2022"
    };
    const { titulo, descripcion } = noticia;

    return(
        <div className="">
            <h1 className="tittle">{titulo}</h1>
            <p className="body">{descripcion}</p>
        </div>
    )
}

export default Noticia