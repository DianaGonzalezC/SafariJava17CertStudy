/*open*/ module mod.one {
//  requires java.base; // implicitly required

  exports service to mod.two, bad;
//  opens service to mod.two, bad;
  opens service;
}
