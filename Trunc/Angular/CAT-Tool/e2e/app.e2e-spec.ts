import { CATToolPage } from './app.po';

describe('cat-tool App', function() {
  let page: CATToolPage;

  beforeEach(() => {
    page = new CATToolPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
