import React, {Component} from 'react';
import '../CSS/Card.css'

class Card extends Component {

    constructor() {
        super();
        this.state ={
            status : true,
            co :0
        }
    }

    componentDidMount() {
        this.setState({
            // eslint-disable-next-line no-undef
            status:this.props.k,



        })
    }




    render() {

        return (
            <div>
                <div className='card cardText'>
                    <div className='card-header cardheader'>{this.props.floorNumber}F-{this.props.roomNumber}R</div>
                    <div className='card-body '>
                        <table>
                            <tbody>
                            <tr><td><h6>CO2 Level :{this.props.CO2}</h6></td>
                            </tr>
                            <tr><td> <h6>Smoke Level :</h6></td>
                                <td><h6>{this.props.Smoke}</h6></td>
                            </tr>
                            <tr><td><h6>Room Number :</h6></td>
                                <td><h6>{this.props.roomNumber}</h6></td>
                            </tr>
                            <tr><td><h6>Floor Number :</h6></td>
                                <td><h6>{this.props.floorNumber}</h6></td>
                            </tr>
                            </tbody>
                        </table>




                    </div>
                    <div className="card-footer footerText">
                        Status:<span className={this.props.k ? "text-danger":"text-success"} >{this.props.k ? " Active":" Deactivate"}</span>
                    </div>

                </div>
            </div>
        );
    }


}

export default Card;
