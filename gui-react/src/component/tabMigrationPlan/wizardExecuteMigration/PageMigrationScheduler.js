import React, { Component } from "react";
import Datetime from "react-datetime";
import validator from "validator";
import moment from "moment";

export default class PageMigrationScheduler extends Component {
  constructor(props) {
    super(props);
    //this.disableScheduleTime();
    this.state = {
      dateTimeInput: true,
      validationMessage: ""
    };
  }

  setCallbackUrl = event => {
    const inputUrl = event.target.value;
    //user validator to set only the valid URL.
    if (validator.isURL(inputUrl)) {
      //console.log("input is valid URL: " + inputUrl);
      this.props.setCallbackUrl(inputUrl);
      this.setState({
        validationMessage: ""
      });
    } else if (inputUrl == "") {
      this.setState({
        validationMessage: ""
      });
    } else {
      //console.log("input is not valid URL: " + inputUrl);
      this.props.setCallbackUrl("");
      this.setState({
        validationMessage: "Error: Callback input is not a valid URL."
      });
    }
  };

  disableScheduleTime = () => {
    console.log("disable scheduleTime");
    //        var scheduleTime = document.getElementById("PageMigrationScheduler_scheduleTime")
    //        console.log('disable scheduleTime' + scheduleTime.value);
    //        scheduleTime.disabled = true;
    //        scheduleTime.value='';

    this.setState({
      dateTimeInput: false
    });
    this.props.setScheduleStartTime("");
  };

  enableScheduleTime = () => {
    console.log("enable scheduleTime");
    //document.getElementById("PageMigrationScheduler_scheduleTime").disabled = false;
    this.setState({
      dateTimeInput: true
    });
  };

  handleDateTimeInput = inputMoment => {
    if (moment(inputMoment, "YYYY-MM-DDTHH:mm:ss", true).isValid()) {
      console.log("handleDateTimeInput, valid moment: " + inputMoment.toDate());
      //        this.props.setScheduleStartTime(inputMoment.format("YYYY/MM/DD hh:mm:ss a"));
      //2019-01-30T13:00:00-05:00        this.props.setScheduleStartTime(inputMoment.format(moment.ISO_DATE_TIME));
      //2019-01-30T18:00:00.000Z         this.props.setScheduleStartTime(inputMoment.toISOString());
      //2019-01-30T18:00:00.000Z            this.props.setScheduleStartTime(inputMoment.toDate());
      this.props.setScheduleStartTime(inputMoment.toDate());
    } else {
      //just ignore the user input
      console.log("handleDateTimeInput, not valid moment: " + inputMoment);
    }
  };

  validDate = current => {
    var yesterday = Datetime.moment().subtract(1, "day");
    return current.isAfter(yesterday);
  };

  render() {
    return (
      <div className="form-horizontal">
        <div className="form-group">
          <label
            className="col-md-4 control-label"
            data-testid="testid_callback"
          >
            Callback URL:
          </label>
          <div className="col-md-8">
            <input
              type="text"
              name="callbackUrl"
              onChange={this.setCallbackUrl}
              value={this.props.callbackUrl}
            />
          </div>
        </div>
        <div className="form-group">
          <label className="col-md-4 control-label">Run migration:</label>
          <div className="col-md-8">
            <div className="radio">
              <label data-testid="testid_syncMode">
                <input
                  type="radio"
                  name="timeType"
                  value="1"
                  onClick={this.disableScheduleTime}
                />
                Now
              </label>
            </div>
            <div className="radio">
              <label data-testid="testid_asyncMode">
                <input
                  type="radio"
                  name="timeType"
                  value="2"
                  onClick={this.enableScheduleTime}
                />
                Schedule
                <Datetime
                  id="PageMigrationScheduler_scheduleTime"
                  input={this.state.dateTimeInput}
                  onChange={this.handleDateTimeInput}
                  isValidDate={this.validDate}
                />
              </label>
            </div>
          </div>
        </div>

        <div className="form-group" />

        <div className="form-group" />

        <div className="form-group" />

        <div className="form-group">
          <b>
            <div className="col-md-8">{this.state.validationMessage}</div>
          </b>
        </div>
      </div>
    );
  }
}
