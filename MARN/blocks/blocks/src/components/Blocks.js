import React, { Component } from 'react'

export default class Blocks extends Component {
    constructor(props) {
          super(props)
          this.state = {
              items: [
              { text: ["Learn JavaScript"] },
              { text: ["Learn react"] },
              { text: ["Learn node"]},
              { text: ["Learn vue"] }
            ]
          }
          }
  render() {
    return (
      <div>Blocks
          <h2>Todos:</h2>
      <ol>
      {this.state.items.map(item => (
        <li key={item.id}>
            <span>{item.text}</span>
        </li>
      ))}
      </ol>
      </div>

    )
  }
}
