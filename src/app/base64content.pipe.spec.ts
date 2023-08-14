import { Base64contentPipe } from './base64content.pipe';

describe('Base64contentPipe', () => {
  it('create an instance', () => {
    const pipe = new Base64contentPipe();
    expect(pipe).toBeTruthy();
  });
});
