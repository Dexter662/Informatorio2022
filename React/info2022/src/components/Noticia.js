function Noticia() {
    const noticia = {
        titulo: "Mi primer App React",
        descripcion:"Informatorio 2022"
    };
    const { titulo, descripcion } = noticia;

    return(
        <div className="card">
            <h1 className="card-tittle">{titulo}</h1>
            <p className="card-content">{descripcion}</p>
        </div>
    )
}

export default Noticia