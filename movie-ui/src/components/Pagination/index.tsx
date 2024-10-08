import {ReactComponent as Arrow} from 'assets/img/arrow.svg';
import './styles.css';

function Pagination() {
    return (
        <div className="mtmovie-pagination-container">
            <div className="mtmovie-pagination-box">
                <button className="mtmovie-pagination-button" disabled={true} >
                    <Arrow />
                </button>
                <p>{`${1} de ${3}`}</p>
                <button className="mtmovie-pagination-button" disabled={false} >
                    <Arrow className="mtmovie-flip-horizontal" />
                </button>
            </div>
        </div>

    );
}
export default Pagination;