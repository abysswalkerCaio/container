import { Link } from "react-router-dom";

function Move() {
    return (
        <div className="container-form-container">
            <div className="container-card-bottom-container">
                <h3>Movimentar Container</h3>
                <form className="container-form">
                    <div className="form-group container-form-group">
                        <label htmlFor="idContainer">ID do Container:</label>
                        <input type="text" className="form-control" id="id" />
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
                    <div className="form-group container-form-group">
                        <label htmlFor="idContainer">Data de Início:</label>
                        <input type="date" className="form-control" id="startDate" />
                    </div>
                    <div className="form-group container-form-group">
                        <label htmlFor="idContainer">Data de Fim:</label>
                        <input type="date" className="form-control" id="finalDate" />
                    </div>
                    <div className="form-group container-form-group">
                        <label htmlFor="idContainer">Hora de Início:</label>
                        <input type="date" className="form-control" id="startHour" />
                    </div>
                    <div className="form-group container-form-group">
                        <label htmlFor="idContainer">Hora de Fim:</label>
                        <input type="date" className="form-control" id="finalHour" />
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