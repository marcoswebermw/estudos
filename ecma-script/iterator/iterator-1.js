let times = ['Warriors', 'Cavs', 'Spurs','Celtics'];

let timesIterator = times[Symbol.iterator]();

timesIterator.next(); // { value: 'Warriors', done: false }
timesIterator.next(); // { value: 'Cavs', done: false }
timesIterator.next(); // { value: 'Spurs', done: false }
timesIterator.next(); // { value: 'Celtics', done: false }
timesIterator.next(); // { value: undefined, done: true }
