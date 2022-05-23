import { Link } from "react-router-dom";

function Move() {
    return (
        <div className="container-form-container">
            <div className="container-card-bottom-container">
                <h3>Movimentar Container</h3>
                <form className="container-form">
                    <div className="form-group container-form-group">
                        <label htmlFor="idContainer">ID do Container:</label>
                        <input type="text" className="form-control" id="idContainer" />
                    </div>
                    <div className="form-group container-form-group">
                        <label htmlFor="movimentation">Tipo de Movimentação:</label>
                        <select className="form-control" id="movimentation">
                            <option>Embarque</option>
                            <option>Descarga</option>
                            <option>Gate In</option>
                            <option>Gate Out</option>
                            <option>Reposicionamento</option>
                            <option>Pesagem</option>
                            <option>Scanner</option>
                        </select>
                    </div>
                    <div className="container-form-btn-container">
                        <button type="submit" className="btn btn-primary container-btn">Movimentar</button>
                    </div>
                </form >
                <Link to="/">
                    <button className="btn btn-primary container-btn mt-3">Cancelar</button>
                </Link>
            </div >
        </div >
    );
}

export default Move;