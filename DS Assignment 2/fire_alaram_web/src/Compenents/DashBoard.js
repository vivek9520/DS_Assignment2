import React, {Component} from 'react';
import '../CSS/DashBoard.css'
import Card from "./Card";

class DashBoard extends Component {

    constructor(props) {
        super(props);
        this.state ={
                sensors : [],
                isLoaded: false

        }
    }

    componentDidMount() {
        try {
            setInterval(async () =>{
                fetch('http://localhost:8080/rest/api/AllDetails')
                    .then(res => res.json())
                    .then(json =>{
                        this.setState({

                            sensors : json,

                        })
                    })
            },3000)

        }
        catch (e) {
            
        }
        

    }

    render() {

        var { sensors} = this.state;



            return (
                <div>
                    <div className='jumbotron '>
                        <div className="heading">FIRE ALARM DASHBOARD</div>
                    </div>
                    <hr/>
                    <div className="container">
                        <div className="row">

                            {console.log(sensors)}
                            {sensors.map(s =>(

                                <div className="col-3 cardGap">
                                    <Card CO2 ={s.co2}
                                          Smoke ={s.smoke}
                                          k ={s.alarm_Status}
                                          key ={s.sensorID}
                                          roomNumber ={s.room_Number}
                                          floorNumber ={s.floor_Number}

                                    ></Card>
                                </div>
                            ))}




                        </div>
                    </div>
                </div>
            );
        }


}

export default DashBoard;
