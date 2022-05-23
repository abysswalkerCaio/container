import { Link } from "react-router-dom";

function Report() {
    return (
        <div className="container-form-container">
            <div className="container-card-bottom-container">
                <h3>Gerar Relatório</h3>
                <form className="container-form">
                    <div className="form-group container-form-group">
                        <label htmlFor="idContainer">ID do Container:</label>
                        <input type="text" className="form-control" id="id" />
                    </div>
                    <div className="form-group container-form-group">
                        <label htmlFor="idContainer">ID da Movimentação:</label>
                        <input type="text" className="form-control" id="id" />
                    </div>
                    <div className="container-form-btn-container">
                        <button type="submit" className="btn btn-primary container-btn">Gerar</button>
                    </div>
                </form >
                <Link to="/">
                    <button className="btn btn-primary container-btn mt-3">Cancelar</button>
                </Link>
            </div >
        </div >
    );
}

export default Report;